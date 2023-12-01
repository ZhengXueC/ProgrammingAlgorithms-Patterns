package collectionExamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class TestLinkedListCollection {

	public static void main(String[] args) {
		//using system-defined collection from JCF
		//LinkedList<String> nameList = new LinkedList<>();
		//nameList is polymorphic object
		List<String> nameList = new LinkedList<>();
		//processing of object of LinkedList class
		
//		nameList = new ArrayList<>();
//		nameList = new Vector<>();
		
		String[] names= {"Ann","Bob","Carol"};
		//reading my array String and populate the LinkedList
		for(int index=0;index<names.length;index++) {
			nameList.add(names[index]);
		}
		System.out.println("nameList elements of linkedlist");
		for(int index=0;index<nameList.size();index++) {
		System.out.println(nameList.get(index));
		}
		//traverse the linkedlist using iterator
		System.out.println("nameList elements of LinkedList using Iterator");
		ListIterator<String> it=nameList.listIterator();
		String strElm;
		while (it.hasNext()) {
			strElm=it.next();
			System.out.println(strElm);
			if(strElm.equals("Bob")) {
				
				it.set("Lee");
			}
		}
		System.out.println("After Changing Traversing Linked list in Forward");
		while (it.hasPrevious()) {
			strElm=it.previous();
			
		}
		while (it.hasNext()) {
			strElm=it.next();
			System.out.println(strElm);
		}
		System.out.println("Printing nameList LinkedList in Backward manner");
		//it object is pointing to the last node
		while (it.hasPrevious()) {
			strElm=it.previous();
			System.out.println(strElm);
		}
		
		
	}

}
