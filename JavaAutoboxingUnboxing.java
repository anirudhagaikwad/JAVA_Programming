package corejava;

import java.util.ArrayList;

public class JavaAutoboxingUnboxing {
/*
 * Autoboxing :It is reference to the auto conversion of primitive type to its correspondence object type
 * Unboxing : It is reference to the auto conversion of correspondence object type to its primitive type
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void autoboxingPrimitive() {
		Integer i=200; // autoboxing of int i.e. converting int to wrapper class Integer object
		Character ch='A';
	}
	void unboxingObject() {
		ArrayList arrayList=new ArrayList();
		arrayList.add(100);  //autoboxing
		arrayList.add(200);
		arrayList.add(300);
		//Unboxing Integer to int type
		int first=(int)arrayList.get(0);
		int second=(int)arrayList.get(1);
		int third=(int)arrayList.get(2);
	}
	
	

}
