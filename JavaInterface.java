package corejava;
/*
 * Interface support multiple inheritance
 * Interface can be used to achieve loose coupling and abstraction
 * All methods declared inside interface are implicitly public and abstract
 * All variables declared inside interface are implicitly public,final and static
 * Interface can not be initiate
 * To implement interface in class use implements keyword
 * Interface have private,default ,static methods with body
 * private method : from java version 9
 * default,static method : from java version 8
 */
public class JavaInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XYZBANK obj=new XYZBANK();
		obj.simpleIntrest(50000,18,5);
		ABCBANK obj1=new ABCBANK();
		obj1.simpleIntrest(50000,10,3);
		obj1.compundIntrst(50000,5, 3);
		obj1.defaultMethod(); // call default method from interface
		obj1.simpleIntrest_ForHOMELOAN(600000, 8);
		
	}

}//JavaInterface

interface SimpleInterest{
	double HOME_LOAN_INTREST_RATE=5;
	double PERSONAL_LOAN_INTREST_RATE=10;
	void simpleIntrest(double p ,double r,double t); // implicitly public and abstract
}//SimpleInterest

interface CompundIntrest{
	void compundIntrst(double p,double t,int n); // implicitly public and abstract
}

interface Intrest extends SimpleInterest,CompundIntrest{
	//private method
	private void privateMethod() {
		System.out.println("Private method from Interface...");
	}
	static void staticMethod() {
		System.out.println("Static method from Interface .. ");
	}
	default void defaultMethod() {
		System.out.println("Default Method from Interface...");
		privateMethod();
	}
	
}

class XYZBANK implements SimpleInterest{
	public void simpleIntrest(double p,double r,double t) {
		double simpleIntr=(p*r*t)/100;
		System.out.println("Principal Amount : "+p);
		System.out.println("Intrest Rate : "+r);
		System.out.println("Duration in year : "+t);
		System.out.println("Simple Intrest : "+simpleIntr);
	}
}

class ABCBANK implements Intrest{
	public void simpleIntrest(double p,double r,double t) {
		double simpleIntr=(p*r*t)/100;
		System.out.println("Principal Amount : "+p);
		System.out.println("Intrest Rate : "+r);
		System.out.println("Duration in year : "+t);
		System.out.println("Simple Intrest : "+simpleIntr);
	}// implemented method from simpleIntr Interface
	public void compundIntrst(double p,double t,int n) {
		double compIntr=(p*Math.pow(1+(PERSONAL_LOAN_INTREST_RATE/n),n*t));
		System.out.println("Compound Intreast = "+compIntr);
		
	}// implemented method from CompIntrest interface
	
	public void simpleIntrest_ForHOMELOAN(double p,double t) {
		double simpleIntr=(p*HOME_LOAN_INTREST_RATE*t)/100;
		System.out.println("Principal Amount : "+p);
		System.out.println("Intrest Rate : "+HOME_LOAN_INTREST_RATE);
		System.out.println("Duration in year : "+t);
		System.out.println("Simple Intrest for Home Loan : "+simpleIntr);
		//HOME_LOAN_INTREST_RATE=15.5;
		Intrest.staticMethod(); // call static method
	}
	
}