package corejava;

public class JavaOperators {

	void arithmeticOperator() {
		int addResult=1+2; // + Additive operator
		int subResult=5-2; // - Subtraction operator
		int divResult=5/2; // / Division operator
		int mulResult=5*2; // * Multiplication operator
		int remRedult=addResult%subResult; // % Reminder operator
	}//arithmeticOperator()
	
	void unaryOperator() {
		int result= +1; // + unary plus operator
		result= -1; // - unary minus operator
		result++;  // ++ Increment operator
		result--;  // -- Decrement operator
	}//unaryOperator()
	
	void assignmentOperator() {
	 int a=5; // Assignment operator
	 int b=2;
	 a+=b; // a=a+b
	 a-=b; // a=a-b
	 a*=b; // a=a*b 
	 a/=b; // a=a/b
	 a%=b; // a=a%b
	}//assignmentOperator()
	
	void equality_relational_operator() {
		int a=1 , b=2;
		if(a==b) {System.out.println("a==b");} // == equal to operator
		if(a!=b) {System.out.println("a!=b");} // != not equal to operator
		if(a>b) {System.out.println("a>b");} // > greater than operator
		if(a<b) {System.out.println("a<b");} // < less than operator
		if(a>=b) {System.out.println("a>=b");} // >= greater than or equal to operator
		if(a<=b) {System.out.println("a<=b");} // <= less than or equal to operator
		
		
		boolean sucess=false;
		System.out.println(!sucess); //  Logical complement operator
		
	}//equality_relational_operator()
	
	void conditionalOperator() {
	int x=1,y=2;
	if((x==1)&&(y==2)) {System.out.println("x=1 AND y=2");} // && Conditional AND operator
	if((x==1)||(y==1)) {System.out.println("x=1 OR y=1");} // || Conditional OR  operator
	if(!(x==1)) {System.out.println("x=1 AND y=2");} // ! Conditional  NOT operator
	boolean boolVar=true;
	int result=boolVar?x:y; // ? : ternary Conditional operator
	
	}//conditionalOperator()
	
	void typeComparisonOperator() {
		Integer iObj=Integer.valueOf(5);
		System.out.println(iObj instanceof Integer);
	}//typeComparisonOperator()
	
	void bitwiseOperator() {
		/*    
		 * Operator       Description
		 * ----------------------------------------------
		 *   &			Bitwise AND
		 *   |			Bitwise OR
		 *   ^			Bitwise exclusive OR
		 *   <<			Left shift
		 *   >>			Right Shift
		 *   ~			Unary Bitwise complement operator
		 */
		
		/*
		 * Truth Table
		 * ------------------------------------------------
		 *   a	b	a&b	a|b	a^b
		 *   0	0	 0	 0	 0
		 *   0	1	 0	 1	 1
		 *   1	0 	 0	 1	 1
		 *   1	1	 1	 1	 0	
		 */
		int a=50,b=25,c=0;
		c=a&b;System.out.println("a&b="+c);
		c=a|b;System.out.println("a|b="+c);
		c=a^b;System.out.println("a^b="+c);
		c=a<<2;System.out.println("a<<2 = "+c);
		c=a>>2;System.out.println("a>>2 = "+c);
		c=~a;System.out.println("~a = "+c);
	}//bitwiseOperator()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 JavaOperators obj=new JavaOperators();
 obj.arithmeticOperator();
 obj.assignmentOperator();
 obj.bitwiseOperator();
 obj.conditionalOperator();
 obj.equality_relational_operator();
	}

}
