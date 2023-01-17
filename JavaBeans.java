package corejava;

public class JavaBeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee();
		obj.setEmpName("Anirudha");
		obj.setEmpId(2);
		obj.setEmpLocation("Pune");
		
		System.out.println("Employee Name : "+obj.getEmpName());
		System.out.println("Employee Id : "+obj.getEmpId());
		System.out.println("Employee Location : "+obj.getEmpLocation());

	}

}

class Employee implements java.io.Serializable{
	private String empName;
	private int empID;
	private String empLocation;
	
	//getter methods
	public String getEmpName() {
		return empName;
	}
	public int getEmpId() {
		return empID;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	
	//setter methods
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	public void setEmpId(int empId) {
		this.empID=empId;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation=empLocation;
	}
	
}
