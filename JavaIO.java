package corejava;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

/*
 * Byte Stream Classes : BufferedInputStream,BufferedOutputStream,DataInputStream,DataOutputStream 
 * 						 FileInputStream,FileOutputStream,InputStream,OutputStram,PrintStream
 * Character Stream Classes : BufferedReader,BufferedWriter,FileReader,FileWriter,InputStreamReader
 * 							  OutputStreamReader,PrintWriter,Reader,Writer
 */


public class JavaIO {
void readConsoleInput() {
	BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
	try {
		System.out.println("Enter Line : ");
		String str=obj.readLine();
		System.out.println("enter by user : "+str);
		System.out.println("Enter Number : ");
		int num=obj.read();
		System.out.println("enter by user : "+num);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

void copyByte() {
	/* Copy bytes */
	FileInputStream in=null;
	FileOutputStream out=null;
	try {
	in=new FileInputStream("/home/anirudha/eclipse-workspace/LPU_Java/src/corejava/JavaBlocks.java");
	out=new FileOutputStream("/home/anirudha/eclipse-workspace/LPU_Java/src/corejava/JavaCopy.java");
	int c;
	while((c=in.read())!=-1) { // c holds byte value 8bit
		out.write(c);
	}
	}
	catch(IOException e) {e.printStackTrace();}
	finally {if(in!=null) {try {
		in.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}} if(out!=null) {try {
		out.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}}
}//copyBytes()

void copyCharacters() {
	//FileReader in=null;
	//FileWriter out=null;
	try(FileReader in=new FileReader("/home/anirudha/eclipse-workspace/LPU_Java/src/corejava/JavaBlocks.java");FileWriter out=new FileWriter("/home/anirudha/eclipse-workspace/LPU_Java/src/corejava/JavaCopy.java");){
		int c;
		while((c=in.read())!=-1) { // c hold character value 16bit
			out.write(c);
		}
	}
	catch(IOException e) {e.printStackTrace();}
}//copyCharacters()

void copyLines() {
	try(BufferedReader in=new BufferedReader(new FileReader("/home/anirudha/eclipse-workspace/LPU_Java/src/corejava/JavaBlocks.java"));PrintWriter out=new PrintWriter(new FileWriter("/home/anirudha/eclipse-workspace/LPU_Java/src/corejava/JavaCopy.java"));){
		String str;
		while((str=in.readLine())!=null) {
			out.println(str);
		}
	}catch(IOException e) {e.printStackTrace();}
}//copyLines()

void scannerTokens() throws FileNotFoundException {
	Scanner scObj=null;
			try{
			scObj=new Scanner(new BufferedReader(new FileReader("/home/anirudha/eclipse-workspace/LPU_Java/src/corejava/JavaCopy.java")));
			while(scObj.hasNext()) {System.out.println(scObj.next());}
			}finally {
				if(scObj!=null) {scObj.close();}
			}
}//scannerTokens()

void scannerSum() throws FileNotFoundException {
	Scanner scObj=null;
	double sum=0;
	try {
		scObj=new Scanner(new BufferedReader(new FileReader("/home/anirudha/eclipse-workspace/LPU_Java/src/corejava/sum.txt")));
		scObj.useLocale(Locale.US);
		while(scObj.hasNext()) {
			if(scObj.hasNextDouble()) {
				sum +=scObj.nextDouble();
			}
			else {scObj.next();}
		}
	}finally {
		scObj.close();
	}
	System.out.println("Sum = "+sum);
}//scannerSum()

	public static void main(String[] args) {
		JavaIO obj=new JavaIO();
		//obj.readConsoleInput();
		//obj.copyByte();
		//obj.copyCharacters();
		//obj.copyLines();
		/*try {
			obj.scannerTokens();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		try {
			obj.scannerSum();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}//main()

}//JavaIO
