package access;

import corejava.JavaAccessModifiers;

public class AccessClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaAccessModifiers obj=new JavaAccessModifiers();
		System.out.println("Public Access : "+obj.publicVar);
		//System.out.println("Protected Access : "+obj.protectedVar);
		//System.out.println("Private Access : "+obj.privateVar);
		//System.out.println("Default Access : "+obj.defaultVar);


	}

}


class SubClass extends JavaAccessModifiers{
	void methodAccess() {
		System.out.println("Public Access : "+publicVar);
		System.out.println("Protected Access : "+protectedVar);
		//System.out.println("Private Access : "+privateVar);
		//System.out.println("Default Access : "+defaultVar);
	}
}
