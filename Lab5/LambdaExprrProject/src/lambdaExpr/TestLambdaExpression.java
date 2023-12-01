package lambdaExpr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestLambdaExpression {

	public static void main(String[] args) {
//		Set <String> mySet = new HashSet<>();
//
//		mySet.add("Pear");//hashcode f("Pear")=XX SEARCH Has O(1)
//		mySet.add("Apple");
//		mySet.add("Banana");
//		mySet.add("Strawberry");
//
//		System.out.println("Printing mySet elements from HashSet collection");
//		for(String strEle:mySet) {
//
//			System.out.println(strEle);
//		}
//
//		//introduce new method & new operator to optimize code for better readability
//		System.out.println("Printing set collection using Lambda Expression");
//		
//		//Collection.forEach(Input->Output)
//		mySet.forEach(n ->{System.out.println(n);});//Lambda Expression
//		System.out.println("Printing set collection using reference method::");
//		//collection.foreach(class::method)
//		mySet.forEach(System.out::println);
		List <Integer>numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		System.out.println("Printing ArrayList using Lambda Expression");
		numbers.forEach(n -> {System.out.println(n);});
	}

}
