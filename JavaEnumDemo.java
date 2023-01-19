package corejava;

public class JavaEnumDemo {
 Day day;
 public JavaEnumDemo(Day day) {
	 this.day=day;
 }//Constructor
 
 public void tellLikeItIs() {
	 switch(day) {
	 case MONDAY : System.out.println("Its bad ...i dnont want to wakeup early"); break;
	 case TUESDAY: case WEDNESDAY: case THURSDAY: System.out.println("oh ...its meedel days"); break;
	 case SATURDAY: case SUNDAY : System.out.println("Its very Good .... Holiday...."); break;
	 default:System.out.println("Not a Day"); break;
	 }
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     JavaEnumDemo obj1=new JavaEnumDemo(Day.MONDAY);
     obj1.tellLikeItIs();
     JavaEnumDemo obj2=new JavaEnumDemo(Day.FRIDAY);
     obj2.tellLikeItIs();
     JavaEnumDemo obj3=new JavaEnumDemo(Day.SUNDAY);
     obj3.tellLikeItIs();
	}

}
