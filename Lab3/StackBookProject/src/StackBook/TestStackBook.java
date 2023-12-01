package StackBook;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;





public class TestStackBook {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile = new Scanner(new FileReader("Book.in"));
		
		LinkedStackClass myStack = new LinkedStackClass();
		int size=0;
		while(inFile.hasNextLine()) {
			
			int ID = inFile.nextInt();
			String AUTHOR = inFile.next()+" "+inFile.next();
			
			StringBuilder titleBuilder = new StringBuilder();
			while(!inFile.hasNextInt()) {
				
				titleBuilder.append(inFile.next()).append(" ");
			}
			
			String TITLE = titleBuilder.toString().trim();
			
			String ISBN = inFile.next();
			String TYPE = inFile.next();
			double PRICE = inFile.nextDouble();
			Book b=new Book();
			b.setB_author(AUTHOR);
			b.setB_id(ID);
			b.setB_isbn(ISBN);
			b.setB_price(PRICE);
			b.setB_title(TITLE);
			b.setB_type(TYPE);
			
			myStack.push(b);
			size++;
		
		}
		myStack.print();
		System.out.println("\nThe size of stack is:"+size+"\n");
		System.out.println("StackTop is:");
		System.out.println("The Book Information is : "+myStack.stackTop.info);
		
	}

}
