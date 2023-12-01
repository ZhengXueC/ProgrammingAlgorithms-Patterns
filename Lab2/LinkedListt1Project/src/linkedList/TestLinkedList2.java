package linkedList;

import java.util.Scanner;

public class TestLinkedList2 {
	public static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		
		// process to create linkedlist data structure that stores allows end user to enter data from console until encountering flag sentinel -999
		//8 4 0 -1 20 12 100 -999
		
//		int num=8;
//		
//		System.out.println("please enter data until -999");
//		
//		LinkedListNode current,head;
//		head = new LinkedListNode();
//		current=head;
//		head.info=8;
//		head.link=null;
//		
//		//creating new Node using reference object newNode
//		LinkedListNode newNode =new LinkedListNode();
//		newNode.info=num;
//		newNode.link=null;
//		head.link= newNode;
		
//		int num=0;
//		System.out.println("please enter data until -999");
//		while(num !=-999) {
//			//
//			Scanner scanner = new Scanner(System.in);
//			num=scanner.nextInt();
//			newNode =new LinkedListNode();
//			newNode.info=num;
//			newNode.link=null;
//			current.link= newNode; 
//			current=current.link;
//		}
		
		LinkedListNode head=null,newNode,current=null;
		System.out.println("Line 1: Enter the data for processing ending with -999");
		int num=0 ,size=0;
		while(num!=-999) {
			num = console.nextInt();
			System.out.println("Number: "+num);
			if(num!=-999) {
				
				//yourlinkedlist.add(num);
			newNode = new LinkedListNode();
			
			newNode.info = num;
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
		}//constructing linkedlist data structure
		console.close();
        current = head;
		//System.out.println("Printing data of linkedlist by Traversing the linked list");
		//System.out.println("size of constructed linkedlist:" +size);
        System.out.println("Displaying the components of the linked list stored from user input");
        System.out.println();
        System.out.println();
        
		while(current!=null) {
		System.out.println("Value: "+current.info);
		current = current.link;
		}	
		
		
		
		
	}

}
