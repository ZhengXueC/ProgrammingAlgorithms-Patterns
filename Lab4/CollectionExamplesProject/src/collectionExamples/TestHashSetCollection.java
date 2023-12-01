package collectionExamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestHashSetCollection {

	public static void main(String[] args) {
		//using  HashSet system-defined collection from JCF
		Set <String> mySet = new HashSet<>();
		
		mySet.add("Pear");//hashcode f("Pear")=XX SEARCH Has O(1)
		mySet.add("Apple");
		mySet.add("Banana");
		mySet.add("Strawberry");
		
		System.out.println("Printing mySet elements from HashSet collection");
		for(String strEle:mySet) {
			
			System.out.println(strEle);
		}
		
		
       mySet = new LinkedHashSet<>();
		
		mySet.add("Pear");
		mySet.add("Apple");
		mySet.add("Banana");
		mySet.add("Strawberry");
		
		
		String s="Banana";
		mySet.add(s);
		
		System.out.println("Printing mySet elements from LinkedHashSet collection following the order of insertion");
		for(String strEle:mySet) {
			
			System.out.println(strEle);
		}
		
	}

}
