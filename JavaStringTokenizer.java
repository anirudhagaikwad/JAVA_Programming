package corejava;

import java.util.StringTokenizer;

public class JavaStringTokenizer {
void token1() {
	StringTokenizer obj=new StringTokenizer("Rust is blazingly fast and memory-efficient: with no runtime or garbage collector, it can power performance-critical services, run on embedded devices, and easily integrate with other languages.");
	while(obj.hasMoreTokens()) {
		System.out.println(obj.nextToken());
	}
}//token1()
void token2() {
	String str2 ="Rust is blazingly fast : and memory-efficient: with no runtime or garbage collector: it can power performance-critical services: run on embedded devices, and easily integrate with other languages.";
	String str1=":";
	StringTokenizer obj=new StringTokenizer(str2,str1);
	int count=obj.countTokens();
	for(int i=0;i<count;i++) {
		System.out.println("token ["+i+"] : "+obj.nextToken());
	}
}
	public static void main(String[] args) {
		JavaStringTokenizer obj=new JavaStringTokenizer();
		obj.token1();
		obj.token2();
		obj.stringSplit_Token();
	}
	//Its recommended by oracle use String.split or java.util.regex instead StringTokenizer
	void stringSplit_Token() {
		String[] str="Rust is blazingly fast and memory-efficient: with no runtime or garbage collector".split("\\s");
		for(int x=0;x<str.length;x++) {
			System.out.println(str[x]);
		}
	}
}
