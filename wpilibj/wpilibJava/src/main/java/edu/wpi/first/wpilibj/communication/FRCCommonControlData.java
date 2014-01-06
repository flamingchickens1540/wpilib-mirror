package edu.wpi.first.wpilibj.communication;
import com.ochafik.lang.jnaerator.runtime.Structure;
import com.ochafik.lang.jnaerator.runtime.Union;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : /home/alex/Projects/WPILib-Development/WPILibC/WPILib/src/main/include/NetworkCommunication/FRCComm.h:29</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class FRCCommonControlData extends Structure<FRCCommonControlData, FRCCommonControlData.ByValue, FRCCommonControlData.ByReference > {
	public short packetIndex;
	/** C type : field1_union */
	public field1_union field1;
	public byte dsDigitalIn;
	public short teamID;
	public byte dsID_Alliance;
	public byte dsID_Position;
	/** C type : field2_union */
	public field2_union field2;
	/** Left-most 4 bits are unused */
	public short stick0Buttons;
	/** C type : field3_union */
	public field3_union field3;
	/** Left-most 4 bits are unused */
	public short stick1Buttons;
	/** C type : field4_union */
	public field4_union field4;
	/** Left-most 4 bits are unused */
	public short stick2Buttons;
	/** C type : field5_union */
	public field5_union field5;
	/** Left-most 4 bits are unused */
	public short stick3Buttons;
	/** Analog inputs are 10 bit right-justified */
	public short analog1;
	public short analog2;
	public short analog3;
	public short analog4;
	public long cRIOChecksum;
	public int FPGAChecksum0;
	public int FPGAChecksum1;
	public int FPGAChecksum2;
	public int FPGAChecksum3;
	/** C type : char[8] */
	public byte[] versionData = new byte[8];
	/** <i>native declaration : /home/alex/Projects/WPILib-Development/WPILibC/WPILib/src/main/include/NetworkCommunication/FRCComm.h:31</i> */
	public static class field1_union extends Union<field1_union, field1_union.ByValue, field1_union.ByReference > {
		public byte control;
		public field1_union() {
			super();
		}
		public field1_union(byte control) {
			super();
			this.control = control;
			setType(Byte.TYPE);
		}
		protected ByReference newByReference() { return new ByReference(); }
		protected ByValue newByValue() { return new ByValue(); }
		protected field1_union newInstance() { return new field1_union(); }
		public static field1_union[] newArray(int arrayLength) {
			return Union.newArray(field1_union.class, arrayLength);
		}
		public static class ByReference extends field1_union implements Structure.ByReference {
			
		};
		public static class ByValue extends field1_union implements Structure.ByValue {
			
		};
	};
	/** <i>native declaration : /home/alex/Projects/WPILib-Development/WPILibC/WPILib/src/main/include/NetworkCommunication/FRCComm.h:63</i> */
	public static class field2_union extends Union<field2_union, field2_union.ByValue, field2_union.ByReference > {
		/** C type : int8_t[6] */
		public byte[] stick0Axes = new byte[6];
		/** C type : field1_struct */
		public field1_struct field1;
		/** <i>native declaration : /home/alex/Projects/WPILib-Development/WPILibC/WPILib/src/main/include/NetworkCommunication/FRCComm.h:65</i> */
		public static class field1_struct extends Structure<field1_struct, field1_struct.ByValue, field1_struct.ByReference > {
			public byte stick0Axis1;
			public byte stick0Axis2;
			public byte stick0Axis3;
			public byte stick0Axis4;
			public byte stick0Axis5;
			public byte stick0Axis6;
			public field1_struct() {
				super();
			}
			protected List<? > getFieldOrder() {
				return Arrays.asList("stick0Axis1", "stick0Axis2", "stick0Axis3", "stick0Axis4", "stick0Axis5", "stick0Axis6");
			}
			public field1_struct(byte stick0Axis1, byte stick0Axis2, byte stick0Axis3, byte stick0Axis4, byte stick0Axis5, byte stick0Axis6) {
				super();
				this.stick0Axis1 = stick0Axis1;
				this.stick0Axis2 = stick0Axis2;
				this.stick0Axis3 = stick0Axis3;
				this.stick0Axis4 = stick0Axis4;
				this.stick0Axis5 = stick0Axis5;
				this.stick0Axis6 = stick0Axis6;
			}
			protected ByReference newByReference() { return new ByReference(); }
			protected ByValue newByValue() { return new ByValue(); }
			protected field1_struct newInstance() { return new field1_struct(); }
			public static field1_struct[] newArray(int arrayLength) {
				return Structure.newArray(field1_struct.class, arrayLength);
			}
			public static class ByReference extends field1_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends field1_struct implements Structure.ByValue {
				
			};
		};
		public field2_union() {
			super();
		}
		/** @param field1 C type : field1_struct */
		public field2_union(field1_struct field1) {
			super();
			this.field1 = field1;
			setType(field1_struct.class);
		}
		/** @param stick0Axes C type : int8_t[6] */
		public field2_union(byte stick0Axes[]) {
			super();
			if ((stick0Axes.length != this.stick0Axes.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.stick0Axes = stick0Axes;
			setType(byte[].class);
		}
		protected ByReference newByReference() { return new ByReference(); }
		protected ByValue newByValue() { return new ByValue(); }
		protected field2_union newInstance() { return new field2_union(); }
		public static field2_union[] newArray(int arrayLength) {
			return Union.newArray(field2_union.class, arrayLength);
		}
		public static class ByReference extends field2_union implements Structure.ByReference {
			
		};
		public static class ByValue extends field2_union implements Structure.ByValue {
			
		};
	};
	/** <i>native declaration : /home/alex/Projects/WPILib-Development/WPILibC/WPILib/src/main/include/NetworkCommunication/FRCComm.h:76</i> */
	public static class field3_union extends Union<field3_union, field3_union.ByValue, field3_union.ByReference > {
		/** C type : int8_t[6] */
		public byte[] stick1Axes = new byte[6];
		/** C type : field1_struct */
		public field1_struct field1;
		/** <i>native declaration : /home/alex/Projects/WPILib-Development/WPILibC/WPILib/src/main/include/NetworkCommunication/FRCComm.h:78</i> */
		public static class field1_struct extends Structure<field1_struct, field1_struct.ByValue, field1_struct.ByReference > {
			public byte stick1Axis1;
			public byte stick1Axis2;
			public byte stick1Axis3;
			public byte stick1Axis4;
			public byte stick1Axis5;
			public byte stick1Axis6;
			public field1_struct() {
				super();
			}
			protected List<? > getFieldOrder() {
				return Arrays.asList("stick1Axis1", "stick1Axis2", "stick1Axis3", "stick1Axis4", "stick1Axis5", "stick1Axis6");
			}
			public field1_struct(byte stick1Axis1, byte stick1Axis2, byte stick1Axis3, byte stick1Axis4, byte stick1Axis5, byte stick1Axis6) {
				super();
				this.stick1Axis1 = stick1Axis1;
				this.stick1Axis2 = stick1Axis2;
				this.stick1Axis3 = stick1Axis3;
				this.stick1Axis4 = stick1Axis4;
				this.stick1Axis5 = stick1Axis5;
				this.stick1Axis6 = stick1Axis6;
			}
			protected ByReference newByReference() { return new ByReference(); }
			protected ByValue newByValue() { return new ByValue(); }
			protected field1_struct newInstance() { return new field1_struct(); }
			public static field1_struct[] newArray(int arrayLength) {
				return Structure.newArray(field1_struct.class, arrayLength);
			}
			public static class ByReference extends field1_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends field1_struct implements Structure.ByValue {
				
			};
		};
		public field3_union() {
			super();
		}
		/** @param field1 C type : field1_struct */
		public field3_union(field1_struct field1) {
			super();
			this.field1 = field1;
			setType(field1_struct.class);
		}
		/** @param stick1Axes C type : int8_t[6] */
		public field3_union(byte stick1Axes[]) {
			super();
			if ((stick1Axes.length != this.stick1Axes.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.stick1Axes = stick1Axes;
			setType(byte[].class);
		}
		protected ByReference newByReference() { return new ByReference(); }
		protected ByValue newByValue() { return new ByValue(); }
		protected field3_union newInstance() { return new field3_union(); }
		public static field3_union[] newArray(int arrayLength) {
			return Union.newArray(field3_union.class, arrayLength);
		}
		public static class ByReference extends field3_union implements Structure.ByReference {
			
		};
		public static class ByValue extends field3_union implements Structure.ByValue {
			
		};
	};
	/** <i>native declaration : /home/alex/Projects/WPILib-Development/WPILibC/WPILib/src/main/include/NetworkCommunication/FRCComm.h:89</i> */
	public static class field4_union extends Union<field4_union, field4_union.ByValue, field4_union.ByReference > {
		/** C type : int8_t[6] */
		public byte[] stick2Axes = new byte[6];
		/** C type : field1_struct */
		public field1_struct field1;
		/** <i>native declaration : /home/alex/Projects/WPILib-Development/WPILibC/WPILib/src/main/include/NetworkCommunication/FRCComm.h:91</i> */
		public static class field1_struct extends Structure<field1_struct, field1_struct.ByValue, field1_struct.ByReference > {
			public byte stick2Axis1;
			public byte stick2Axis2;
			public byte stick2Axis3;
			public byte stick2Axis4;
			public byte stick2Axis5;
			public byte stick2Axis6;
			public field1_struct() {
				super();
			}
			protected List<? > getFieldOrder() {
				return Arrays.asList("stick2Axis1", "stick2Axis2", "stick2Axis3", "stick2Axis4", "stick2Axis5", "stick2Axis6");
			}
			public field1_struct(byte stick2Axis1, byte stick2Axis2, byte stick2Axis3, byte stick2Axis4, byte stick2Axis5, byte stick2Axis6) {
				super();
				this.stick2Axis1 = stick2Axis1;
				this.stick2Axis2 = stick2Axis2;
				this.stick2Axis3 = stick2Axis3;
				this.stick2Axis4 = stick2Axis4;
				this.stick2Axis5 = stick2Axis5;
				this.stick2Axis6 = stick2Axis6;
			}
			protected ByReference newByReference() { return new ByReference(); }
			protected ByValue newByValue() { return new ByValue(); }
			protected field1_struct newInstance() { return new field1_struct(); }
			public static field1_struct[] newArray(int arrayLength) {
				return Structure.newArray(field1_struct.class, arrayLength);
			}
			public static class ByReference extends field1_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends field1_struct implements Structure.ByValue {
				
			};
		};
		public field4_union() {
			super();
		}
		/** @param field1 C type : field1_struct */
		public field4_union(field1_struct field1) {
			super();
			this.field1 = field1;
			setType(field1_struct.class);
		}
		/** @param stick2Axes C type : int8_t[6] */
		public field4_union(byte stick2Axes[]) {
			super();
			if ((stick2Axes.length != this.stick2Axes.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.stick2Axes = stick2Axes;
			setType(byte[].class);
		}
		protected ByReference newByReference() { return new ByReference(); }
		protected ByValue newByValue() { return new ByValue(); }
		protected field4_union newInstance() { return new field4_union(); }
		public static field4_union[] newArray(int arrayLength) {
			return Union.newArray(field4_union.class, arrayLength);
		}
		public static class ByReference extends field4_union implements Structure.ByReference {
			
		};
		public static class ByValue extends field4_union implements Structure.ByValue {
			
		};
	};
	/** <i>native declaration : /home/alex/Projects/WPILib-Development/WPILibC/WPILib/src/main/include/NetworkCommunication/FRCComm.h:102</i> */
	public static class field5_union extends Union<field5_union, field5_union.ByValue, field5_union.ByReference > {
		/** C type : int8_t[6] */
		public byte[] stick3Axes = new byte[6];
		/** C type : field1_struct */
		public field1_struct field1;
		/** <i>native declaration : /home/alex/Projects/WPILib-Development/WPILibC/WPILib/src/main/include/NetworkCommunication/FRCComm.h:104</i> */
		public static class field1_struct extends Structure<field1_struct, field1_struct.ByValue, field1_struct.ByReference > {
			public byte stick3Axis1;
			public byte stick3Axis2;
			public byte stick3Axis3;
			public byte stick3Axis4;
			public byte stick3Axis5;
			public byte stick3Axis6;
			public field1_struct() {
				super();
			}
			protected List<? > getFieldOrder() {
				return Arrays.asList("stick3Axis1", "stick3Axis2", "stick3Axis3", "stick3Axis4", "stick3Axis5", "stick3Axis6");
			}
			public field1_struct(byte stick3Axis1, byte stick3Axis2, byte stick3Axis3, byte stick3Axis4, byte stick3Axis5, byte stick3Axis6) {
				super();
				this.stick3Axis1 = stick3Axis1;
				this.stick3Axis2 = stick3Axis2;
				this.stick3Axis3 = stick3Axis3;
				this.stick3Axis4 = stick3Axis4;
				this.stick3Axis5 = stick3Axis5;
				this.stick3Axis6 = stick3Axis6;
			}
			protected ByReference newByReference() { return new ByReference(); }
			protected ByValue newByValue() { return new ByValue(); }
			protected field1_struct newInstance() { return new field1_struct(); }
			public static field1_struct[] newArray(int arrayLength) {
				return Structure.newArray(field1_struct.class, arrayLength);
			}
			public static class ByReference extends field1_struct implements Structure.ByReference {
				
			};
			public static class ByValue extends field1_struct implements Structure.ByValue {
				
			};
		};
		public field5_union() {
			super();
		}
		/** @param field1 C type : field1_struct */
		public field5_union(field1_struct field1) {
			super();
			this.field1 = field1;
			setType(field1_struct.class);
		}
		/** @param stick3Axes C type : int8_t[6] */
		public field5_union(byte stick3Axes[]) {
			super();
			if ((stick3Axes.length != this.stick3Axes.length)) 
				throw new IllegalArgumentException("Wrong array size !");
			this.stick3Axes = stick3Axes;
			setType(byte[].class);
		}
		protected ByReference newByReference() { return new ByReference(); }
		protected ByValue newByValue() { return new ByValue(); }
		protected field5_union newInstance() { return new field5_union(); }
		public static field5_union[] newArray(int arrayLength) {
			return Union.newArray(field5_union.class, arrayLength);
		}
		public static class ByReference extends field5_union implements Structure.ByReference {
			
		};
		public static class ByValue extends field5_union implements Structure.ByValue {
			
		};
	};
	public FRCCommonControlData() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("packetIndex", "field1", "dsDigitalIn", "teamID", "dsID_Alliance", "dsID_Position", "field2", "stick0Buttons", "field3", "stick1Buttons", "field4", "stick2Buttons", "field5", "stick3Buttons", "analog1", "analog2", "analog3", "analog4", "cRIOChecksum", "FPGAChecksum0", "FPGAChecksum1", "FPGAChecksum2", "FPGAChecksum3", "versionData");
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected FRCCommonControlData newInstance() { return new FRCCommonControlData(); }
	public static FRCCommonControlData[] newArray(int arrayLength) {
		return Structure.newArray(FRCCommonControlData.class, arrayLength);
	}
	public static class ByReference extends FRCCommonControlData implements Structure.ByReference {
		
	};
	public static class ByValue extends FRCCommonControlData implements Structure.ByValue {
		
	};
}