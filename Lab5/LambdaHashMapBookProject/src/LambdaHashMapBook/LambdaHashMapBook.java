package LambdaHashMapBook;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import lambdaExpr.Car;


public class LambdaHashMapBook {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner inFile = new Scanner(new FileReader("Book.in"));
		Map<Integer, Book> bookMap = new HashMap<>();
		while(inFile.hasNextLine()) {
			String line=inFile.nextLine();
			String[] record=line.split("\t");
			int ID = Integer.parseInt(record[0]);
			String AUTHOR = record[1];
			String TITLE = record[2];
			String ISBN =record[3];
			String TYPE = record[4];
			double PRICE = Double.parseDouble(record[5]);
			Book b=new Book();
			b.setB_author(AUTHOR);
			b.setB_id(ID);
			b.setB_isbn(ISBN);
			b.setB_price(PRICE);
			b.setB_title(TITLE);
			b.setB_type(TYPE);
			bookMap.put(ID, b);
		}
		System.out.println("The Book you enterred in the Map are:"+bookMap.size());
		
		System.out.println("\nPrint Book Keys collection using Lambda Expression");
		bookMap.keySet().forEach(n -> System.out.println( n));
		
		System.out.println("Print Book info V collection using Lambda Expression");
		bookMap.values().forEach(n ->  {System.out.println( n.toString());System.out.printf("Book Price Euro=%.2f",n.calculate_Price_Euro());
		
		System.out.printf(", Book Price Discount=%.2f$]\n",n.doBookDiscount());});
		
		System.out.println("\n--- Sorted Book Map (Sorted by key) ---");
		bookMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e ->  {System.out.println( e.getKey()+"="+e.getValue().toString());System.out.printf("Book Price Euro=%.2f",e.getValue().calculate_Price_Euro());
		
		System.out.printf(", Book Price Discount=%.2f$]\n",e.getValue().doBookDiscount());});
		
		System.out.println("\n--- Sorted Book Map (Sorted by Value doBookDiscount) ---");
		bookMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Book::doBookDiscount))).forEach(e ->  {System.out.println( e.getKey()+"="+e.getValue().toString());System.out.printf("Book Price Euro=%.2f",e.getValue().calculate_Price_Euro());
		
		System.out.printf(", Book Price Discount=%.2f$]\n",e.getValue().doBookDiscount());});
		
		System.out.println("\n--- Sorted Book Map (Sorted by Value of book price in Euro) ---");
		bookMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Book::calculate_Price_Euro))).forEach(e ->  {System.out.println( e.getKey()+"="+e.getValue().toString());System.out.printf("Book Price Euro=%.2f",e.getValue().calculate_Price_Euro());
		
		System.out.printf(", Book Price Discount=%.2f$]\n",e.getValue().doBookDiscount());});
		
		System.out.println("\n--- Sorted Book Map (Sorted by Value of book price) ---");
		bookMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Book::getB_price))).forEach(e ->  {System.out.println( e.getKey()+"="+e.getValue().toString());System.out.printf("Book Price Euro=%.2f",e.getValue().calculate_Price_Euro());
		System.out.printf(", Book Price Discount=%.2f$]\n",e.getValue().doBookDiscount());});
		
		System.out.println("\n--- Sorted Book Map (Sorted by Value getB_Title) ---");
		bookMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Book::getB_title))).forEach(e ->  {System.out.println( e.getKey()+"="+e.getValue().toString());System.out.printf("Book Price Euro=%.2f",e.getValue().calculate_Price_Euro());
		System.out.printf(", Book Price Discount=%.2f$]\n",e.getValue().doBookDiscount());});
		
		System.out.println("\n--- Sorted Book Map (Sorted by Value getB_Author)reversed ---");
		bookMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Book::getB_author).reversed())).forEach(e ->  {System.out.println( e.getKey()+"="+e.getValue().toString());
		System.out.printf("Book Price Euro=%.2f",e.getValue().calculate_Price_Euro());
		System.out.printf(", Book Price Discount=%.2f$]\n",e.getValue().doBookDiscount());});
		
		System.out.println("\nUsing Stream Processing max Method");
		System.out.println("Display Max Book Discount in the HashMap:");
		System.out.println(
		bookMap.entrySet().stream().max(Map.Entry.comparingByValue(Comparator.comparing(Book::doBookDiscount))).get().getValue());
		System.out.printf("Book Price Euro=%.2f",bookMap.entrySet().stream().max(Map.Entry.comparingByValue(Comparator.comparing(Book::doBookDiscount))).get().getValue().calculate_Price_Euro());
		System.out.printf(", Book Price Discount=%.2f$]\n",bookMap.entrySet().stream().max(Map.Entry.comparingByValue(Comparator.comparing(Book::doBookDiscount))).get().getValue().doBookDiscount());
		
		System.out.println("\nUsing filter() to search for any matching of Book Type of \"EX\" in HashMap");
		//bookMap.entrySet().stream().filter(e -> e.getValue().getB_type().equals("EX")).forEach(n->System.out.print(n.getKey()+" "));
		System.out.println(bookMap.entrySet().stream().filter(e -> e.getValue().getB_type().equals("EX")).map(Map.Entry::getKey)
		        .collect(Collectors.toList()));
		System.out.println();
		bookMap.entrySet().stream().filter(e -> e.getValue().getB_type().equals("EX")).forEach(e->{System.out.println(e.getValue().toString());System.out.printf("Book Price Euro=%.2f",e.getValue().calculate_Price_Euro());System.out.printf(", Book Price Discount=%.2f$]\n",e.getValue().doBookDiscount());});
		
		//System.out.println(bookMap.entrySet().stream().filter(e -> e.getValue().getB_type().equals("EX")).map(Map.Entry::getValue)
		        //.collect(Collectors.toList()));
		
	}

}
