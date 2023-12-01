package collectionExamples;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestTreeSetCollection {

	public static void main(String[] args) {
		//using  TreeSet system-defined collection from JCF
		SortedSet <String> mySet = new TreeSet<>();
		
		mySet.add("Pear");
		mySet.add("Apple");
		mySet.add("Banana");
		mySet.add("Strawberry");
		
		System.out.println("Printing mySet elements from TreeSet collection");
		for(String strEle:mySet) {
			
			System.out.println(strEle);
		}
	}

}
