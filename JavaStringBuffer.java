package corejava;
/*
 * Its Thread Safe : multiple threads can not access it simultaneously
 * Its Synchronized : in java it is capability to control the access of multiple threads to any shared resources.
 * Its Mutable
 */
public class JavaStringBuffer {
	public static void main(String[] args) {
		StringBuffer sbObj1=new StringBuffer();
		StringBuffer sbObj2=new StringBuffer("Java");
		System.out.println("sbObj1 = "+sbObj1+" Length : "+sbObj1.length());
		System.out.println("sbObj2 = "+sbObj2+" Length : "+sbObj2.length());
//append()
		sbObj2.append(" and Rust");
		System.out.println("sbObj2.append(\" and Rust\") : "+sbObj2);
//insert()
		sbObj2.insert(4," HI \n");
		System.out.println("sbObj2.insert(4,\" HI \\n\") : "+sbObj2);
//reverse()
		sbObj2.reverse();
		System.out.println("sbObj2.reverse() : "+sbObj2);
//capacity()
		System.out.println("Length : "+sbObj1.length());
		System.out.println("Length : "+sbObj2.length());
		System.out.println("sbObj1.capacity() : "+sbObj1.capacity());//Empty Constructor reserve space for 16 characters in default 
		System.out.println("sbObj2.capacity() : "+sbObj2.capacity()); // 20 
//ensureCapacity()
		sbObj1.ensureCapacity(15);
		//if the argument of ensure capacity is less than the existing capacity ,then there will be no change in existing capacity
		System.out.println("sbObj1.capacity() : "+sbObj1.capacity());//16 default
		//if the argument of ensure capacity is greater than the existing capacity,then there will be change in existing capacity 
		//using rule -> newCapacity=(oldCapacity*2)+2
		sbObj2.ensureCapacity(25); // (20*2)+2 = 42
		System.out.println("sbObj2.capacity() : "+sbObj2.capacity()); // 42
	}
}
