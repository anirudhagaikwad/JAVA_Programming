package corejava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JavaExceptionHandling {
/*
 * Exception Handler
 * Try: It used to enclose the risky code
 * Catch : It acts as exception handler
 * Finally : It is used to execute necessary code
 * Throw : It Throw the exception Explicitly
 * Throws : It Informs for the possible Exceptions
 */
	void uncaughtException() {
		Scanner scObj=new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int x=scObj.nextInt();
		System.out.println("Enter Second Number : ");
		int y=scObj.nextInt();
		int result=x/y;
		System.out.println("The result of Division ");
		System.out.println(x+"/"+y+"="+result);
	}
	
	void caughtException() {
		Scanner scObj=new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int x=scObj.nextInt();
		System.out.println("Enter Second Number : ");
		int y=scObj.nextInt();
		int result=0; 
		try{result=x/y;}
		catch(ArithmeticException e) {e.printStackTrace();}
		System.out.println("The result of Division ");
		System.out.println(x+"/"+y+"="+result);
	}
	
	void multipleCatchBlocks() {
		try {
			int[] intArr=new int[10];
			System.out.println(intArr[15]);
		}
		catch(ArithmeticException e) {e.printStackTrace();}
		catch(ArrayIndexOutOfBoundsException e) {e.printStackTrace();}
		catch(Exception e) {e.printStackTrace();}
		System.out.println("Multiple Catch Block are End Here....");
	}
	
	void unreachableCatchBlock() {
		try {
			int[] arr= {11,22};
			arr[2]=arr[0]/arr[1];
		}
		catch(Exception e) {e.printStackTrace();}
		//catch(ArrayIndexOutOfBoundsException e) {e.printStackTrace();}
	}
	
	void nestedTry() {
		try{ int[] intArr= {8,0,7,6,5,4};
		try {
			int z=intArr[3]/intArr[1];
		}//inner try
		catch(ArithmeticException e) {e.printStackTrace();}
		intArr[6]=54;
		}//outer try
		catch(ArrayIndexOutOfBoundsException e) {e.printStackTrace();}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaExceptionHandling obj=new JavaExceptionHandling();
		//obj.uncaughtException();
		//obj.caughtException();
		//obj.multipleCatchBlocks();
		//obj.nestedTry();
		//obj.with_tryWithResources();
		//obj.votingEligiblity(9);
		try {
		obj.throwsMethod();}
		catch(ArithmeticException e) {e.printStackTrace();}

		int[] arr= {55,66,77,88,99,44};
		try {
			obj.findKey(arr, 100);
		} catch (ItemNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void without_tryWithResources() {
		try {
			String str;
			BufferedReader br=new BufferedReader(new FileReader("//home//anirudha//eclipse-workspace//LPU_Java//src//HAS_A.java"));
			while((str=br.readLine()) !=null) {
				System.out.println(str);
			}
			br.close();
		}
		catch(IOException e) {e.printStackTrace();}
	}
	
	void with_tryWithResources() {
		try(BufferedReader br=new BufferedReader(new FileReader("//home//anirudha//eclipse-workspace//LPU_Java//src//HAS_A.java"));){
			String str;
			while((str=br.readLine()) !=null) {
				System.out.println(str);
			}
		}
		catch(IOException e) {e.printStackTrace();}
	}
	
// Throw
	void votingEligiblity(int age) {
		try 
		{
			if(age>18) {System.out.println("You are eligible for Voting...");}
		    else {throw new ArithmeticException(age+" Not eligible for Voting...");}
	    } //try
		catch(ArithmeticException e) {e.printStackTrace();}
		finally {
			System.out.println("Finally Block must be execute before terminate program");
		}
}
	
//Throws
	
	void throwsMethod() throws ArithmeticException{
		int[] arr= {55,44,66,88,0,77};
		//arr[1]=arr[arr.length-1]/arr[arr.length-2];
		throw new ArithmeticException("Exception occured.......");
		//System.out.println("Result = "+arr[1]);
		
	}
	
//User-define Exception
	void findKey(int[] arr,int key) throws ItemNotFound {
		int i;
		boolean foundIt=false;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				foundIt=true;
				break; //Unlabeled break
			}//if
		}//for
		if(foundIt) {System.out.println(key+" Found in Array at index "+i);}
		else {throw new ItemNotFound(key+" Not Found ");}
		
	}
	
	
}// JavaEcxeptionHandling

//Custom Exception Class
class ItemNotFound extends Exception{

	public ItemNotFound(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}