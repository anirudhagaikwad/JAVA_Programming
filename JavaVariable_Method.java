package corejava;
/*
 * Instance Variable : Declare inside class but outside any method and declare without static keyword
 * 					   Instance variable is also called object variable
 * 					   Each object has its own copy of instance variable
 * 					   It doesn't effect the instance variable if any object changes value of variable.		
 * 	
 * Static Variable / Class Variable  : Declare inside class but outside any method and Its allocate memory once and its declare with static keyword
 * 
 * Local Variable : Its declare inside method,constructor and block
 *                  Scope of local variable is limited , within that block 
 */
public class JavaVariable_Method {
//Instance Variable	
	byte byteVar;
	short shortVar;
	int intVar=0;
	long longVar;
	float floatVar;
	double doubleVar;
	char charVar;
	boolean boolVar;
	
//Static Variable
	static int intStaticVar=0;
	
//Method without returntype and without parameter
	void method1() {
		System.out.println("Access Instance Variable inside Instance Method : "+intVar);
		System.out.println("Access Static Variable inside Instance Method : "+intStaticVar);
		System.out.println("Access Static Variable inside Instance Method : "+JavaVariable_Method.intStaticVar);
		int x=5; //local variable
		}
//Method with returntype and without parameter
	int method2() {
		System.out.println("Method with return type and without argument");
		return 2;
	}
//Method with returntype and with parameter
	float method3(float x,float y) {
		System.out.println("Method with return type and with argument");
		return x+y;
	}
//Method without returntype and with parameter
	void method4(int i) {
		System.out.println("Method without return type and with argument : i="+i);
		staticMethod(); // directly call static method inside instance method
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaVariable_Method obj=new JavaVariable_Method(); // create object
		obj.method1(); // method call
		int a=obj.method2();
		float b=obj.method3(5.5f, 6.8f);
		obj.method4(a);
        System.out.println("Access Instance Variable inside Static Method : "+obj.byteVar);
        System.out.println("Access Static Variable inside Static Method : "+intStaticVar);
		System.out.println("Access Static Variable inside Static Method : "+JavaVariable_Method.intStaticVar);
		staticMethod();// directly call static method inside static method
		JavaVariable_Method.staticMethod(); // call static method using class name
	}
	
	static void staticMethod() {
		System.out.println("Its Static method...");
	}

}
