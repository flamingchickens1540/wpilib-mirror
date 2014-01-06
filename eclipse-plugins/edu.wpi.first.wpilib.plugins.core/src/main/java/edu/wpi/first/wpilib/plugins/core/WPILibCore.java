package edu.wpi.first.wpilib.plugins.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import edu.wpi.first.wpilib.plugins.core.ant.AntPropertiesParser;
import edu.wpi.first.wpilib.plugins.core.installer.ToolsInstaller;
import edu.wpi.first.wpilib.plugins.core.preferences.PreferenceConstants;

/**
 * The activator class controls the plug-in life cycle
 */
public class WPILibCore extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "edu.wpi.first.wpilib.plugins.core"; //$NON-NLS-1$

	// The shared instance
	private static WPILibCore plugin;
	
	/**
	 * The constructor
	 */
	public WPILibCore() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		
		new ToolsInstaller(getDefaultVersion()).installIfNecessary();
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static WPILibCore getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
	
	public Properties getProjectProperties(IProject project) {
		List<InputStream> streams = new ArrayList<InputStream>();
		try {
			if (project != null) {
				try {
					streams.add(project.getFile("build.properties").getContents());
				} catch (CoreException e) {} // No properties file
			}
			File file = new File(getWPILibBaseDir()+"/wpilib.properties");
			streams.add(new FileInputStream(file));
			return new AntPropertiesParser(streams).getProperties();
		} catch (Exception e) {
			e.printStackTrace();
			return new Properties();
		}
	}
    
    public void saveGlobalProperties(Properties props) {
    	try {
			props.store(new FileOutputStream(new File(WPILibCore.getDefault().getWPILibBaseDir()+"/wpilib.properties")),
					"Don't add new properties, they will be deleted by the eclipse plugin.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
	public int getTeamNumber(IProject project) {
		return Integer.parseInt(getProjectProperties(project).getProperty("team-number", "0"));
	}
	
	public String getTargetIP(IProject project) {
		String target = getProjectProperties(project).getProperty("target");
		if (target != null) return target;
		else {
			int teamNumber = getTeamNumber(project);
			return "10."+(teamNumber/100)+"."+(teamNumber%100)+".2";
		}
	}

	public String getWPILibBaseDir() {
		return System.getProperty("user.home")+"/wpilib";
	}

	public String getDefaultVersion() {
		return "2013-test-0.4";
	}

	public String getCurrentVersion() {
		return getPreferenceStore().getString(PreferenceConstants.TOOLS_VERSION);
	}
}