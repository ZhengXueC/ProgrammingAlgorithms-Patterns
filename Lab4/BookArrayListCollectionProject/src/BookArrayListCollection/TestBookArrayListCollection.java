package BookArrayListCollection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import arrayListProcess.Divide;



public class TestBookArrayListCollection {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile = new Scanner(new FileReader("Book.in"));
		
		List<Book> bookArrList = new ArrayList<>();
		while(inFile.hasNextLine()) {
			String line=inFile.nextLine();
			String[] record= line.split("\t");
			int ID = Integer.parseInt(record[0]);
			String AUTHOR = record[1];
			String TITLE = record[2];;
			String ISBN = record[3];;
			String TYPE = record[4];;
			double PRICE = Double.parseDouble(record[5]);
			Book b=new Book();
			b.setB_author(AUTHOR);
			b.setB_id(ID);
			b.setB_isbn(ISBN);
			b.setB_price(PRICE);
			b.setB_title(TITLE);
			b.setB_type(TYPE);
			bookArrList.add(b);
		}
		System.out.println("The Books you enterred are:"+bookArrList.size());
		for(int i=0;i<bookArrList.size();i++) {
			System.out.println("Book"+(i+1));
			System.out.println(bookArrList.get(i));
		}
		System.out.println("\nBooks List using ListIterator with method next():\n");
		ListIterator<Book> iterBook=bookArrList.listIterator();
		Book strElm;
		while (iterBook.hasNext()) {
			strElm=iterBook.next();
			System.out.println(strElm+"\n");
		}
		System.out.println("\nNow in reverse order\n");
		while (iterBook.hasPrevious()) {
			strElm=iterBook.previous();
			System.out.println(strElm+"\n");
		}
		Book wrecord=new Book(13,"Joshawa Pierre","Python","1209845","BG",99.99);
		bookArrList.add(2,wrecord);
		System.out.println("The new added Book is:\n");
		System.out.println(bookArrList.get(2));
	}

}
