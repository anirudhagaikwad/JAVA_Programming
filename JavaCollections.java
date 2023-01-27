package corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * --------------------------------------------------------------------------------------------------------------------------------
 * 		Collection         Ordering		RandomAccess	 Key-Value		Duplicate-Elements		Null-Element		Thread-Safety
 * --------------------------------------------------------------------------------------------------------------------------------
 * 		ArrayList			Yes				Yes				No					Yes					Yes					No
 * 
 * 		LinkedList			Yes				No				No					Yes					Yes					No
 * 
 * 		HashSet				No				No				No					No					Yes					No
 * 
 * 		Treeset				Yes				No				No					No					No					No
 * 
 * 		HashMap				No				Yes				Yes					NO					Yes					NO
 * 
 * 		TreeMap				Yes				Yes				Yes					NO					No					No	
 * 
 * 		Hashtable			No				Yes				Yes					NO 					No					Yes
 *----------------------------------------------------------------------------------------------------------------------------------- 
 *
 */



public class JavaCollections {

	void arrayListCollection() {
	ArrayList<String> obj=new ArrayList<>(); // Its emptyArrayList
	ArrayList<Integer> obj1=new ArrayList<>(1);//with elements
	ArrayList<Double> obj2=new ArrayList<>(32);//initial capacity
	obj.add("abc");
	obj.add(null);
	obj.add("abc");
	for(int i=10;i>1;i--) {
		obj.add("abc"+i);
	}
	System.out.println("ArrayList Elements : "+obj);
	obj.remove(0);
	obj.remove("abc1");
	System.out.println("ArrayList Elements after Remove : "+obj);
	for(String element : obj) {
		System.out.println("Traversing ArrayList : "+element);
	}
	System.out.println("ArrayList Size : "+obj.size());
	//Sorting
	Collections.sort(obj);
	System.out.println("ArrayList Elements after Sort : "+obj);
	obj.clear();
	System.out.println("ArrayList Elements after Clear : "+obj);
	}
	
	void linkedListCollection(){
	LinkedList<Integer> obj=new LinkedList<Integer>();
	obj.add(100);
	obj.add(100);
	obj.add(null);
	for(int i=10;i>1;i--) {
		obj.add(100+i);
	}
	System.out.println("LinkedList : "+obj);
	System.out.println("Size of LinkedList : "+obj.size());
	//Collections.sort(obj);
	System.out.println("After Sort : "+obj);
	obj.remove(0);
	obj.remove(null);
	for(Integer i : obj) {
		System.out.println("LinkedList : "+i);
	}
	obj.removeFirst();
	obj.removeLast();
	System.out.println("After remove first and Last element : "+obj+"\n end");
	//convert it into stream
	obj.stream().forEach(System.out::println);
	}
	
	void hasSetCollection() {
		HashSet<String> obj=new HashSet<>();
		obj.add("abc");
		obj.add("abc");
		obj.add(null);
		System.out.println("HasSet : "+obj);
		obj.remove(null);
		for(String elem:obj) {
			System.out.println(elem);
		}
		System.out.println("Size : "+obj.size());
	}
	void treeSetCollection() {
		TreeSet<String> obj=new TreeSet<>();
		//obj.add(null);
		obj.add("abc");
		//obj.add("abc");
		for(int i=10;i>2;i--) {
			obj.add("abc"+i);
		}
		System.out.println("TreeSet : "+obj);
		Iterator itr=obj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		obj.remove("abc4");
		System.out.println("After Remove : "+obj);
		boolean isAvilable=obj.contains("abc8");
		System.out.println("contains abc8 is "+isAvilable);
	}
	void hashMapCollection() {
		HashMap<Integer,String> obj=new HashMap<>();
		obj.put(1,"abc");
		for(int i=2;i<=10;i++) {
			obj.put(i,"abc"+i);
		}
		System.out.println("HashMap : "+obj);
		obj.remove(1);
		obj.remove(2,"abc2");
		
		for(Map.Entry<Integer,String> entry:obj.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		obj.replace(5,"aaa5");
		System.out.println(obj);
	}

	void treeMapCollection() {
		TreeMap<String,Integer> obj=new TreeMap<>();
		obj.put("abc", null);
		for(int i=2;i<=10;i++) {
			obj.put("abc"+i,1+i);
		}
		System.out.println("TreeMap : "+obj);
		System.out.println("First Key : "+obj.firstKey());
		System.out.println("Last Key : "+obj.lastKey());
		System.out.println("values : "+obj.values());
		System.out.println("First Element : "+obj.firstEntry());
		System.out.println("Last Element : "+obj.lastEntry());
		System.out.println("Head Map : "+obj.headMap("abc10"));
		System.out.println("Tail Map : "+obj.tailMap("abc10"));
		
		Set<Map.Entry<String,Integer>> stObj=obj.entrySet();
		for(Map.Entry<String,Integer> m :stObj) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
	}
	void hashTableCollection() {
		Hashtable<String,Integer> obj=new Hashtable<>();
		obj.put("abc", 1);
		for(int i=2;i<=10;i++) {
			obj.put("abc"+i,i+1);
		}
		System.out.println("hashTable : "+obj);
		boolean flag=obj.contains(9);
		System.out.println("obj.contains(9) : "+flag);
		flag=obj.containsKey("abc10");
		System.out.println("containsKey(\"abc10\") : "+flag);
		for(Map.Entry<String,Integer> m : obj.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
	}	
	public static void main(String[] args) {  
		JavaCollections obj=new JavaCollections();
		//obj.arrayListCollection();
		//obj.linkedListCollection();
		//obj.hasSetCollection();
		//obj.treeSetCollection();
		//obj.hashMapCollection();
		//obj.treeMapCollection();
		obj.hashTableCollection();
	}
	

}
