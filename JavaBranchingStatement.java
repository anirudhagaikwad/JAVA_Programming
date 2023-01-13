package corejava;

import java.util.Arrays;
import java.util.Scanner;

public class JavaBranchingStatement {

	void findKey(int[] arr,int key) {
		int i;
		boolean foundIt=false;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				foundIt=true;
				break; //Unlabeled break
			}//if
		}//for
		if(foundIt) {System.out.println(key+" Found in Array at index "+i);}
		else {System.out.println(key+" Not found in Array");}
	}
	
	void findKey_MultiDimArray(int[][] arr,int key) {
		int i,j=0;
		boolean foundIt=false;
		found: 
			for(i=0;i<arr.length;i++) {
				for(j=0;j<arr[i].length;j++) {
					if(arr[i][j]==key) {
						foundIt=true;
						break found; // labeled break
					}
				}//inner for
			}//outer for
		if(foundIt) {System.out.println(key+" Found in Array at index ["+i+"]["+j+"]");}
		else {System.out.println(key+" Not found in Array");}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaBranchingStatement obj=new JavaBranchingStatement();
		Scanner scObj=new Scanner(System.in);
		System.out.println("Enter Key : ");
		int key=scObj.nextInt();
		int[] arr= {55,33,77,88,99,44,555,66,11,2,22,774,333,662,881,101};
		obj.findKey(arr, key);
		int[][] arrInt= {{55,66,44,77,88,99,11},{111,222,444,888,666,458,720}};
		obj.findKey_MultiDimArray(arrInt, key);
		String s="Rust is blazingly fast and memory-efficient: with no runtime or garbage collector, it can power performance-critical services, run on embedded devices, and easily integrate with other languages.";
        obj.findChar(s,'r');
        obj.findSubString(s, "fast");
        int[] arry=new int[2];
        arry=obj.returnMultipleValue(key,5);
        System.out.println("arry elements are : "+Arrays.toString(arry));
	}//main()
	
	void findChar(String str,char ch) {
		int max=str.length();
		int countCh=0;
		for(int i=0;i<max;i++) {
			if(str.charAt(i) !=ch) {
				continue; // unlabeled continue
			}//if
			countCh++;
		}//for
		
		System.out.println(ch+" found in string "+countCh+" number of time");
	}
	
	void findSubString(String str,String subStr) {
		boolean foundIt=false;
		int max=str.length()-subStr.length();
		found:
			for(int i=0;i<max;i++) {
				int n=subStr.length();
				int j=i;int k=0;
				while(n-- !=0) {
					if(str.charAt(j++) !=subStr.charAt(k++)) {
						continue found; //labeled continue
					}//if
				}//inner loop
				foundIt=true;
				break found; // labeled break
			}//outer for
		System.out.println(foundIt?"Found It":"Not Found"); //ternary
	}
	
	
	int[] returnMultipleValue(int a,int b) {
		int[] arr=new int[2];
		arr[0]=a+b;
		arr[1]=a-b;
		return arr;
	}

}//Class
