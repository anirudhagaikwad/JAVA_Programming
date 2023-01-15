package corejava;

public class Polymorphisam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MethodOverloading obj1=new MethodOverloading();
       obj1.addition();
       obj1.addition(5);
       obj1.addition(5.5f, 8.5f);
       obj1.addition(8, 5);
       
       MethodOverriding obj2=new MethodOverriding();
       obj2.addition(9.5f,6.3f);
	}

}//Polymorphisam

/*
 * Method Overloading is concept that allows to declare multiple method with same name but different type and list of parameters.
 * Method Overloading possible within class
 * Method Overloading not depend on method return type
 */

class MethodOverloading{
	void addition() {
		System.out.println("10+20="+(10+20));
	}
	void addition(int x) {
		System.out.println(x+"+ 20 ="+(x+20));
	}
	void addition(int x,int y) {
		System.out.println(x+"+"+y+"="+(x+y));
	}
	void addition(float x,float y) {
		System.out.println(x+"+"+y+"="+(x+y));
	}
}//MethodOverloading

/*
 * Method Overriding : Its in Inheritance
 *                     both class method have same signature
*                     Its also refer to runtime polymorphisam because calling method decided by JVM during runtime
*                     Private,Final and Static methods can not Override
 */
class MethodOverriding extends MethodOverloading{
	void addition(float x,float y) {
		System.out.println(x+"+"+y+"="+(x+y));
		System.out.println("Overriding Parent Class Method");
	}
}
