package corejava;

public class JavaControlStatements {

	void switchDemo1(int monthNum) {
		/* Display name of month based on value of month */
		String monthName;
		switch(monthNum) {
		case 1 : monthName="Jan";break;
		case 2 : monthName="Feb";break;
		case 3 : monthName="Mar";break;
		case 4 : monthName="Apr";break;
		case 5 : monthName="May";break;
		case 6 : monthName="Jun";break;
		case 7 : monthName="Jul";break;
		case 8 : monthName="Aug";break;
		case 9 : monthName="Sept";break;
		case 10 : monthName="Oct";break;
		case 11 : monthName="Nov";break;
		case 12 : monthName="Dec";break;
		default : monthName="Invalid";break;
		}//switch
		System.out.println("According to month number Month name is : "+monthName);
	}//switchDemo1
	
	void switchDemo2(int year,int monthNum) {
		/* calculate number of days in particular month */
		int numDays=0;
		switch(monthNum) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: numDays=31;break;
		case 4: case 6: case 9: case 11: numDays=30;break;
		case 2: if(((year%4==0)&& !(year%100==0))||(year%400==0)) {numDays=29;}
		else {numDays=28;}break;
		default: System.out.println("Invalid Month..");
		}//switch
		System.out.println("In year "+year+" Number of days in "+monthNum+" Month is "+numDays);
	}//switchDemo2()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     JavaControlStatements obj=new JavaControlStatements();
     obj.switchDemo1(5);
     obj.switchDemo2(2000, 2);
     obj.forLoop(5);
     int[] arr= {55,33,44,66};
     obj.forEachLoop(arr);
     obj.whileLoop(6);
     obj.doWhileLoop(7);
	}
	
// Loops	
	void forLoop(int a) {
		for(int i=1;i<10;i++) {
			System.out.println(i+"X"+a+"="+(i*a));
		}
	}
	
	void forEachLoop(int[] arr) {
		for(int i:arr) {
			System.out.println("Array Element is : "+i);
		}
	}
	
	void whileLoop(int a) {
		int i =1;
		while(i<10) {
			System.out.println(i+"X"+a+"="+(i*a));
			i++;
		}
	}
	
	void doWhileLoop(int a) {
		int i=1;
		do {
			System.out.println(i+"X"+a+"="+(i*a));
			i++;
		}while(i<10);
	}

}
