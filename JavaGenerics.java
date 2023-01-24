package corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class JavaGenerics {
/*
 * Generic programming enables the programmer to create classes,interfaces and methods in which type of data is specified as a parameter.
 * It Provides a facility to write an algorithm independent of any specify type of data.
 * Generic Provide type safety
 * Type safety means ensuring that an operation is being performed on the right type of data before executing that operation
 * Generic Works with only Objects
 * T x[] =new T[20]; its not allowed in generic
 * T x[]; Its allowed
 * E,K,N,T,V
 */
	public static void main(String[] args) {
		GenericTypeDemo1<Integer> obj1=new GenericTypeDemo1<>(); // create generic object
		GenericTypeDemo1<String> obj2=new GenericTypeDemo1<String>();// create generic object
		obj1.setT(10);
		obj2.setT("Java");
		System.out.println("Get value from obj1 = "+obj1.getT()+"\n Its Belongs to : "+obj1.getT().getClass().getName());
		System.out.println("Get value from obj2 = "+obj2.getT()+"\n Its Belongs to : "+obj2.getT().getClass().getName());
        GenericTypeDemo2<Integer,String> obj3=new GenericTypeDemo2<>(105,"Rust");
        GenMethodDemo obj4=new GenMethodDemo(10);
        obj4.display("Hello",5.5f);
        obj4.display('A',123);
        List<Integer> ints=new ArrayList<Integer>();
        ints.add(5);ints.add(6);
        double sum=obj4.sum(ints);
        
        Collection<Integer> objC=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
        int count = Algoritham.count(objC,new OddPredicate());
        System.out.println("Number of odd Integers : "+count);
	}//main
	
	
}//JavaGenerics

//Generic Class
class GenericTypeDemo1<T>{
	private T t;
	public T getT() {
		return this.t;
	}
	public void setT(T t1) {
		this.t=t1;
	}
}//GenericTypeDemo1

//Generic class 
class GenericTypeDemo2<T1,T2>{
	T1 name;
	T2 value;
	public GenericTypeDemo2(T1 name,T2 value) {
		this.name=name;
		this.value=value;
	}
	public T1 getName() {
		return this.name;
	}
	public T2 getValue() {
		return this.value;
	}

}//GenericTypeDemo2

class GenMethodDemo{
private int x;
	<V,T> void display(V v,T t) {
	System.out.println(v.getClass().getName()+" = "+v);
	System.out.println(t.getClass().getName()+" = "+t);
}

	<T extends Number> GenMethodDemo(T obj){
		this.x=obj.intValue();
		System.out.println(obj.getClass().getName());
	}
	
	public double sum(List<? extends Number> list) {
		double sum=0;
		for(Number n:list) {
			sum+=n.doubleValue();
		}
		return sum;
	}

}//GenMethodDemo

interface UnaryPredicate<T>{
	public boolean test(T obj);
}

class Algoritham{
	
	/*
	 * Generic method to count the number of element in collection
	 */
	static public <T> int count(Collection<T> c,UnaryPredicate<T> p) {
		int count =0;
		for(T element:c) {
			if(p.test(element)) {
				++count;
			}
		}
		return count;
	}
	
/*
 * Exchange the position of two different elements in an array	
 */
	static public <T> void swap(T[] a,int i,int j) {
		T temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
/*
 * generic method to find maximal element in range[begin,end] of list	
 */
	public static <T extends Object & Comparable<? super T>> T max(List<? extends T> list,int begin,int end) {
		T maxElement=list.get(begin);
		for(++begin;begin<end;++begin) {
			if(maxElement.compareTo(list.get(begin))<0) {
				maxElement=list.get(begin);
			}
		}
		return maxElement;
	}
}//Algoritham

class OddPredicate implements UnaryPredicate<Integer>{
	public boolean test(Integer i) {return i%2 !=0;}
}

