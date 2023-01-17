package corejava;

public class JavaGarbageCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaGarbageCollection obj=new JavaGarbageCollection();
		obj=null; //ready to garbage collect
		JavaGarbageCollection obj1=new JavaGarbageCollection();
		JavaGarbageCollection obj2=new JavaGarbageCollection();
		obj1=obj2; //non-reference
		System.out.println("before explicitly call gc()...");
		System.gc(); // request to collect garbage
		
	}
	
	public void finalize() {
		/*
		 * finalize method is called by garbage collection thread before collecting object
		 * finalize method is used to perform specific task before object destroy.
		 * finalize method is defined in java.lang.Object
		 * finalize method is declared as protected modifier inside Object class
		 * finalize method is gets called only once by garbage collector thread
		 */
		System.out.println("Execute Before Collect Garbage...");
	}

}
