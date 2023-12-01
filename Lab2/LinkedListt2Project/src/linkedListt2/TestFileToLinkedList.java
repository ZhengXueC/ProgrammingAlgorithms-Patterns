package linkedListt2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class TestFileToLinkedList {
	public static void main(String[] args) throws FileNotFoundException {
		//construct LinkedList to be populated from reading input file divide.in
		
		Scanner inFile = new Scanner(new FileReader("divide.in"));
		LinkedListNode head=null,newNode,current=null;
		int size=0;
		
		//loading data into linked list referenced by head 
		while(inFile.hasNextLine()) {
			
			double x = inFile.nextDouble();
			double y= inFile.nextDouble();
			Divide d=new Divide();
			d.setX(x);
			d.setY(y);
			
			newNode = new LinkedListNode();
			newNode.divideInfo = d;
			newNode.link=null;
			
			if(head == null) {
				
				head=newNode;
				current = newNode;//to newNode or head
				
			}
			else {
				
				current.link=newNode;//establish the link to creat newly node
				current=current.link;//or=newNode
				
			}
			size++;
			
		}
		
		current = head;
		//System.out.println("Printing data of linkedlist by Traversing the linked list");
		//System.out.println("size of constructed linkedlist:" +size);
		System.out.println("Displaying the components of the linked list stored from input file divide.in");
		System.out.println();
		System.out.println();
		
		while(current!=null) {
		//System.out.println(current.divideInfo +" Division is: "+ current.divideInfo.doDivide());
			System.out.println("X: "+current.divideInfo.getX()+" Y: "+current.divideInfo.getY());
		current = current.link;
		}	
		
		
		
	}
}
