package corejava;

public class JavaInharitance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleShape obj1=new CircleShape();
		obj1.displayPI(); // call parent class method using child class object
		
		Coin obj2=new Coin();
		obj2.displayPI();
		obj2.area(5.9);
		obj2.area();
		obj2.superClassMethodCall();
		
		RectangleShape obj3=new RectangleShape();
		obj3.displayPI();
		
		TriangleShape obj4=new TriangleShape();
		obj4.displayPI();

	}

}//JavaInharitance

class Shape{
double PI_VAL=3.14;
void displayPI() {
	System.out.println("Method from Base Class : PI="+PI_VAL);
}
public Shape() {
	System.out.println("Constructor from Shape class");
}
}//Parent Class

//Single Inheritance
class CircleShape extends Shape{
	void area(double radius) {
		double a=PI_VAL*(radius*radius);
		System.out.println("Circle Area form CircleShape Class : "+a);
	}
	
	public CircleShape() {
		super(); // call super class constructor using super()
	}
}//CircleShape Class

//Multilevel Inheritance
class Coin extends CircleShape{
	void area() {
		double radius=1.15; //in cm
		double a=PI_VAL*(radius*radius);
		System.out.println("Coin Area form Coin Class : "+a);
	}
	void superClassMethodCall() {
		super.area(5.6); // using super call parent method
	}
}//Coin

//Hierarchical Inheritance
class RectangleShape extends Shape{
	public RectangleShape() {
		super();
		System.out.println("Constructor from RectangleShape class");
	}
}//RectangleShape

class TriangleShape extends Shape {
	public TriangleShape() {
		super();
		System.out.println("Constructor from TriangleShape Class");
	}
}//TriangleShape






