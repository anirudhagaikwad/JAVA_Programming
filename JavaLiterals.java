package corejava;
/* Literals are numbers,text or anything that represent value
 * Types of Literal : Integral,Floating-Point,Character,Boolean,String */
public class JavaLiterals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Integral Literals		
		int binVar=0b1111; // Binary Literal - base 2 ,Digits from 0-1 are allowed,It should always have prefix 0b
		int octVar=0146;// Octal Literal - base 8, Digits from 0-7 are allowed,It should always have prefix 0
		int decVar=101; //Decimal Literal - base 10 , Digits from 0-9 are allowed
		int hexVar=0x123FACE;//Hexadecimal Literal - base 16,Digits from 0-9 are allowed and also characters from 'a' to 'f',t should always have prefix 0x
//Floating-Point Literals
		float floatVar=5.5f; //Float Literal : Every floating point type is double type in Java ,so thats why we need to explicitly write floating number using 'f' postfix
		double doubleVar=5.8; // Double Literal
//Character Literal
		char charVar='A'; // Character Literal 0 to 65535 Unicode
		char uniChar='\u0061'; // Char literal can specify in unicode representation : \u0061 here 0061 represent hexadecimal number
		char escChar='\n'; 
//Boolean Literal
		boolean boolFalse=false;
		boolean boolTrue=true;
//String 
		String strVar="Hello Java";
		

	}

}
