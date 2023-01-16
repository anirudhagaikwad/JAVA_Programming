package corejava;

import java.util.Scanner;
/*
 * Abstract Class : A class which is declared using abstract keyword is known abstract class
 * 					Abstract class have abstract method and non-abstract method,variables,constructor
 * 					We can not create instance of abstract class 
 * Abstract Method : The method declared without any body within abstract class are called abstract method
 * 					 Any Class that extends abstract class must implement all abstract methods
 * 					 by default its public	
 */
public class JavaAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TyerAirPressureConvertor obj=new TyerAirPressureConvertor();
       Scanner scObj=new Scanner(System.in);
       System.out.println("Enter PSI Value : ");
       int psi=scObj.nextInt();
       System.out.println("Enter BAR Value : ");
       int bar=scObj.nextInt();
       
       obj.convertor_BAR_TO_PSI(bar);// call implemented abstract method
       obj.convertor_PSI_TO_BAR(psi); // call implemented abstract method
       obj.convertor_PSI_TO_KPA(psi); // call from abstract class
       
      // ConvoterTyreAirPressure obj1=new ConvoterTyreAirPressure();
	}

}//JavaAbstract

abstract class ConvoterTyreAirPressure{
	abstract void convertor_BAR_TO_PSI(int bar);
	abstract void convertor_PSI_TO_BAR(int psi);
	void convertor_PSI_TO_KPA(int psi) {
		// 1PSI=6.8947572932 KPA
		double kpa=psi*6.8947572932;
		System.out.println(psi+"PSI = "+kpa+"KPA");
	}
}//ConvoterTyreAirPressure

class TyerAirPressureConvertor extends ConvoterTyreAirPressure{
	public void convertor_BAR_TO_PSI(int bar) {
		//1 bar = 14.503773773 psi
		double psi=bar*14.503773773;
		System.out.println(bar+"BAR = "+psi+"PSI");
	}
	public void convertor_PSI_TO_BAR(int psi) {
		// 1psi=0.689475729 bar
		double bar=psi*0.689475729;
		System.out.println(psi+"PSI = "+bar+"BAR");
	}
}
