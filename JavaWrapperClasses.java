package corejava;

public class JavaWrapperClasses {
	
//Number Super Class
	void numberClassMethods() {
		Float f1=Float.valueOf(5.5f); // create Float wrapper class object
		System.out.println("Float Object : "+f1);
		byte byteVar=f1.byteValue();
		System.out.println("Float Object converted in byte primitive type: "+byteVar);
		short shortVar=f1.shortValue();
		System.out.println("Float Object converted in short primitive type: "+shortVar);
		int intVar=f1.intValue();
		System.out.println("Float Object converted in int primitive type: "+intVar);
		long longVar=f1.longValue();
		System.out.println("Float Object converted in long primitive type: "+longVar);
		float floatVar=f1.floatValue();
		System.out.println("Float Object converted in float primitive type: "+floatVar);
		double doubleVar=f1.doubleValue();
		System.out.println("Float Object converted in double primitive type: "+doubleVar);
	}
	
//Integer Wrapper Class
	void intergerWrapperClassMethods() {
		Integer obj=Integer.valueOf(5); // create wrapper class object
		int x=obj.intValue();
		System.out.println("toString(x) : "+Integer.toString(x));
		System.out.println("toHexString(x) : "+Integer.toHexString(x));
		System.out.println("toOctalString(x) : "+Integer.toOctalString(x));
		System.out.println("toBinaryString(x) : "+Integer.toBinaryString(x));
		String y="65";
		Integer obj1=Integer.parseInt(y);
		System.out.println("obj1=Integer.parseInt(y) : "+obj1);
		Integer obj2=Integer.decode(y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer iobj=new Integer(55);
		Integer iObj=Integer.valueOf(55);
		System.out.println("Old Value :"+iObj);
        changeValue(iObj);
        System.out.println("New Value : "+iObj);
        
        JavaWrapperClasses obj=new JavaWrapperClasses();
        obj.numberClassMethods();
        obj.intergerWrapperClassMethods();
	}
	
	private static void changeValue(Integer iObj) {
		/*
		 * All primitive wrapper classes are immutable ,when new object is created
		 * the old object is not modified.
		 */
		iObj=iObj+15;
	}//changeValue

}
