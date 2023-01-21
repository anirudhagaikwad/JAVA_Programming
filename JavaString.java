package corejava;

public class JavaString {
	public static void main(String[] args) {
	// create object of string
		String str1="Hello";
		String str2=new String("Hello");
		System.out.println("str1 = "+str1+"   &   str2 = "+str2);
//concat()
		String str3=str1.concat(str2);
		System.out.println("str3=str1.concat(str2) = "+str3);
//concat using + operator
		String str4=str3+123+str2;	
		System.out.println("str4 = str3+123+str2 = "+str4);
//equal
		boolean bool=str1.equals(str2);
		System.out.println("str1.equals(str2) : "+str1.equals(str2));
//== 
		bool=str1==str2;
		System.out.println("str1==str2 : "+str1==str2);
//compareTo
		int x=str1.compareTo(str2);
		System.out.println("str1.compareTo(str2) : "+str1.compareTo(str2));
//charAt()
		char ch=str1.charAt(2);
		System.out.println("str1.charAt(2) : "+ch);
//equalsIgnoreCase()
		String str5="helLO";
		System.out.println("str5 = "+str5);
		bool=str1.equalsIgnoreCase(str5);
		System.out.println("str1.equalsIgnoreCase(str5) : "+bool);
//indexOf
		int index=str1.indexOf(ch);
		System.out.println("str1.indexOf('l') : "+index);
//length()
		int lenght=str1.length();
		System.out.println("str1.length() : "+lenght);
//replace()
		System.out.println("str2.replace('H','L') : "+str2.replace('H','L'));
//subString()
		String str6=str4.substring(4);
		String str7=str4.substring(4,8);
		System.out.println("str4.substring(4) : "+str6);
		System.out.println("str4.substring(4,8) : "+str7);
//toUpperCase()
		System.out.println("str5.toUpperCase() : "+str5.toUpperCase());
//toLowerCase()
		System.out.println("str5.toLowerCase() : "+str5.toLowerCase());
//valueOf 
		String str8=String.valueOf(bool);
		String str9=String.valueOf(456);
		System.out.println("str8 = "+str8+" & str9 = "+str9);
//contains()
		bool=str8.contains("true");
		System.out.println("str8.contains(\"true\") : "+bool);
		bool=str9.contains("56");
		System.out.println("str9.contains(\"56\") : "+bool);
//endWith()
		System.out.println("str8.endsWith(\"e\") : "+str8.endsWith("e"));
//startWith()
		System.out.println("str9.startsWith(\"4\") : "+str9.startsWith("4"));
//isEmpty()
		String str10="";
		String str11 = new String(" ");
		System.out.println("without white space string "+str10.isEmpty()); //true
		System.out.println("with white space string "+str11.isEmpty()); // false
//isBlank
		System.out.println("without white space string "+str11.isBlank());//true
		System.out.println("with white space string "+str11.isBlank()); //true
//getChar()
		String str12="abcderfghijklnopqrs";
		System.out.println("str12 = "+str12);
		System.out.println("str12.lenght() : "+str12.length());
		System.out.println("character at index 2 : "+str12.charAt(2));
		System.out.println("character at index 8 : "+str12.charAt(8));
		char[] chArray=new char[12];
		str12.getChars(2,8, chArray,0); // destination-1 = 7
		for(char c : chArray) {
		System.out.println("chArray element : "+c);}
//getBytes()
		byte[] byteArray=str4.getBytes();
		for(int i=0;i<byteArray.length;i++) {
			System.out.println("Byte Array Elements : "+byteArray[i]);
		}		
	}//main
}//JavaString
