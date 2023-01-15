package corejava;

import corejava.MathOperation.Addition;

/*
 * OOP : Object Oriented Programming is approach which provides solution to real life problems with help of algorithms
 * OOP is paradigm : A Programming paradigm is the classification,style or way of programming,
 * 					 It is an approach to solve problems by using programming language
 * Class : Class defined as template that describe the behaviors(method) and states(variable) of particular entity.
 * Object : Object is instance of class  
 */
public class ClassesTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation objMath=new MathOperation();
		objMath.mathOperationMethod();
		//objMath.addNum();
		MathOperation.Addition objAddition=objMath.new Addition();
		MathOperation.Addition.Add objAdd=objAddition.new Add();
		objAdd.addNum();
		
		AnonymousDemo objAnonymousDemo=new AnonymousDemo();
		objAnonymousDemo.anonymousDemoMethod();
		LocalClassDemo objLocalClassDemo=new LocalClassDemo();
		objLocalClassDemo.validatePhoneNymber("12356","9158888608");
	}

}//ClassesTypes


/* Nested Class
 * A Class defined within another class is known nested class
 * Its enables you to logically group classes that are use in only one place
 * Its increases the use of encapsulation and create more readable and maintainable code
 */
class MathOperation{
	int a=10;
	void mathOperationMethod() {
		System.out.println("Its Method from MathOperation Class");
	}
	class Addition{
		int b=6,c=8,d=5;
		class Add{
			int e=4;
			void addNum() {
				int result=a+b+e;
				System.out.println("Addition result of variable values from classes MathOperation+Addition+Add ="+result);
				mathOperationMethod(); // calling method from outer class
			}
		}//Add
	}//Addition
}//MathOperation

/* Anonymous class : A class without any name is called Anonymous class
 *                   Anonymous class enables you to make your code more concise
 */

interface CalOperation{
	void mathOperationType();
}

class AnonymousDemo{
	void anonymousDemoMethod() {
		CalOperation cObj=new CalOperation() { //Anonymous class create
			
			@Override
			public void mathOperationType() {
				// TODO Auto-generated method stub
			System.out.println("Implemented method from interface in Anonymous Class");	
			}
		};
	}
}//AnonymousDemo

// Local class defined inside any block ... inside method
class LocalClassDemo{
	String regExp="[^0-9]";
	public void validatePhoneNymber(String phoneNum1,String phoneNum2) {
		final int numLenght=10;
		class PhoneNumber{
			String formattedPhoneNum=null;

			public PhoneNumber(String phoneNum) {
				String currentNum=phoneNum.replaceAll(regExp," ");
				if(currentNum.length()==numLenght) {
					this.formattedPhoneNum = currentNum;
				}
				else {this.formattedPhoneNum = null;}
			}//constructor
			public String getNumber() {
				return formattedPhoneNum;
			}
			public void printOriginalNum() {
				System.out.println("Original Number are : "+phoneNum1+" AND "+phoneNum2);
			}
		}//PhoneNumber
		PhoneNumber obj1=new PhoneNumber(phoneNum1); // create local class object
		PhoneNumber obj2=new PhoneNumber(phoneNum2);
		obj1.printOriginalNum();
		if(obj1.getNumber()==null) {System.out.println(phoneNum1+" Phone Number is invalid ");}
		else {System.out.println(phoneNum1+" Phone Number is Valid ");}
		if(obj2.getNumber()==null) {System.out.println(phoneNum2+" Phone Number is invalid ");}
		else {System.out.println(phoneNum2+" Phone Number is Valid ");}
	}//validatePhoneNymber() 
}//LocalClassDemo

/*1) Alter findKey and findKey_multiDimArray method to count repetition of key 
	 int[] x={55,44,66,11,22,77,88,55,66,88,55,7,9,4,6,77,55}; int key=55;
	 int[][] y={{44,77,66,77,88,44,77,44},{88,55,66,44,58,88,25,4400}}; int key=77;
	 
  2) Create local class for PasswordValidation
  
  3) Create nested class for perform arithmetic operation ,sample structure as per below
  class Math{class Add{ class TwoNumAdd{} class ThreeNumAdd{} } class Sub{} class Mul{} class Div{}}	 

*/








