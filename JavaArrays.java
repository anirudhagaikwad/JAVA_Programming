package corejava;

import java.util.Arrays;

public class JavaArrays {
/*
 * datataype[]	arrayName;
 * datatype arrayName[];
 */
	void arrayDemo1() {
		int[] arrInt; // Array Deceleration
		arrInt=new int[5]; // allocate memory for array
		// Initialize array elements
		arrInt[0]=101;
		arrInt[1]=102;
		arrInt[2]=103;
		arrInt[3]=104;
		arrInt[4]=105;
		System.out.println("Access Array Element : "+arrInt[2]);
		arrInt[4]=106; // update array element
		//Array traversing 
		for(int i:arrInt) {System.out.println("Array Element : "+i);}
	}
	
	void arrayDemo2() {
		//int[] arrInt=new int[5]; // declare and allocate memory
		int[] arrInt= {55,33,44,99,77};
		System.out.println("Array size is : "+arrInt.length);
		for(int i=0;i<arrInt.length;i++) {
			System.out.println("Array Element "+arrInt[i]);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  JavaArrays obj=new JavaArrays();
  obj.arrayDemo1();
  obj.arrayDemo2();
  obj.arrayDemo3();
	}
	
	/*
	 * datatype[][] arrayName=new datatype[no_of_rows][no_of_cols];
	 * datatype[][] arrayName={{no_of_rows_elements},{no_of_cols_element}};
	 */
	void arrayDemo3() {
		String[][] names= {{"Mr.","Mrs.","Miss."},{"Shukla","Joshi","Patil"}};
		System.out.println(names[0][0]+names[1][0]);
		System.out.println(names[0][2]+names[1][1]);
		System.out.println(names[0][1]+names[1][2]);
		// update element
		names[1][2]="Anirudha";
		//traversing array
		for(int n=0;n<names.length;n++) {
			System.out.println(Arrays.toString(names[n]));
		}
	}

}
