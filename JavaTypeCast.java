package corejava;
/*
 * Casting is process of changing one type value to another type
 * 1) Implicit casting (widening casting) : This casting is possible when the two type are compatible or 
 *                                          the target type is larger than the source
 *          byte->short->int->long->float->double                                 
 * 2) Explicit casting (narrowing casting) : This casting is possible when assign larger type value to smaller type
 *          double->float->long->int->short->byte
 * 
 * 
 */
public class JavaTypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intVar=100;
		long longVar=intVar;//Implicit type casting
		float floatVar=longVar;
		double doubleVar=floatVar;
		
		// Explicit type casting
		intVar=(int)longVar;
		longVar=(long)floatVar;
		floatVar=(float)doubleVar;
		byte x=5,y=3;
        floatVar=multiplication(x,y); 
	}
	
	static float multiplication(byte x,byte y) {
		return (float)x*y;
	}

}
