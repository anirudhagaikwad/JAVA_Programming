package corejava;
/*
 * if ,if-else,if-else-if ladder,nested if
 */
public class JavaDecisionMaking {

	void simpleIf(int x) {
		if(x>0) {System.out.println("Number is positive");}
	}
	void ifElseStatement(int age) {
		if(age>18) {System.out.println("Your eligible for voting..");}
		else {System.out.println("Not eligible for voting");}
	}
	void nestedIf(int h,int w) {
		if(h>5) {
			if(w>65 && w<80) {
				System.out.println("Your eligible to join force");
			}
			else {System.out.println("your weight is not as per rule...");}
		}
		else {System.out.println("Your not eligible to join force due to height");}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaDecisionMaking obj=new JavaDecisionMaking();
		obj.simpleIf(-5);
		obj.ifElseStatement(15);
		obj.nestedIf(6,75);
		obj.ifelseLadder(75);

	}
	void ifelseLadder(int percentage) {
		char grade;
		if(percentage>=90) {grade='A';}
		else if(percentage>=80 && percentage<90) {grade='B';}
		else if(percentage>=70 && percentage<80) {grade='C';}
		else if(percentage>=60 && percentage<70) {grade='D';}
		else if(percentage>=50 && percentage<60) {grade='D';}
		else {grade='F';}
		System.out.println("Grade = "+grade);
	}

}
