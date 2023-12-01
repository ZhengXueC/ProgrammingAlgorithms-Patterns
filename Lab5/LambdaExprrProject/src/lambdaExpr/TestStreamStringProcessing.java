package lambdaExpr;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class TestStreamStringProcessing {

	public static void main(String[] args) {
		Set <String> myFruitSet = new HashSet<>();

		myFruitSet.add("Pear");
		myFruitSet.add("Apple");
		myFruitSet.add("Banana");
		myFruitSet.add("Strawberry");
		myFruitSet.add("Orange");
		myFruitSet.add("blackberry");
		
		System.out.println("Printing element of the set using reference method::");
		myFruitSet.forEach(System.out::println);
		
		System.out.println("Sorting myFruitSet using sorted()");
		myFruitSet.stream().sorted().forEach(System.out::println);
		
		System.out.println("reverse Sorting myFruitSet using sorted()");
		myFruitSet.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println(" Sorting myFruitSet using sorted() ignoring the case");
		myFruitSet.stream().sorted(String::compareToIgnoreCase)
		.forEach(System.out::println);

		System.out.println(" Filter myFruitSet using filter length()>5");
		myFruitSet.stream().filter(e -> e.length()>5)
		.forEach(System.out::println);
		
		Predicate<String> p1=s -> s.contains("Banana");
		//Predicate<String> p1=s -> s.charAt(0)>'b';
		
		System.out.println(" using contains if Banana exists: "+
		myFruitSet.stream().anyMatch(p1));
		
		System.out.println("Searching if element starts with St: "+
		myFruitSet.stream().anyMatch(s->s.startsWith("St")));
		
		System.out.println("Using map to convert to uppercase: ");
		myFruitSet.stream().map(e -> e.toUpperCase()).forEach(System.out::println);
		
		System.out.println("Using map to convert to lowercase: ");
		myFruitSet.stream().map(e -> e.toLowerCase()).forEach(System.out::println);
		
		System.out.println("Using set of condition in the Predicate ");
		p1=s -> s.contains("Banana")||s.startsWith("St");
		System.out.println(" using contains if Banana exists: "+
				myFruitSet.stream().anyMatch(p1));
	}

}
