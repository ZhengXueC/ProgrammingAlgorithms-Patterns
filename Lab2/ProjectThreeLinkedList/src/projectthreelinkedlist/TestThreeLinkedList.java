package projectthreelinkedlist;

import java.util.Scanner;

public class TestThreeLinkedList {
	public static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		LinkedListNode headNode1=null,headNode2=null,headNode3=null,newNode1,newNode2,newNode3,current1=null,current2=null,current3=null;
		System.out.println("Line 1: Enter the data for processing ending with -999");
		int num=0 ;
		while(num!=-999) {
			num = console.nextInt();
			//System.out.println("Number: "+num);
			if(num!=-999) {
			newNode1 = new LinkedListNode();
			newNode2 = new LinkedListNode();
			newNode1.info = num;
			newNode1.link=null;
			newNode2.info = num*2;
			newNode2.link=null;
			
			if(headNode1 == null) {	
				headNode1=newNode1;
				current1 = newNode1;//to newNode or head	
				headNode2=newNode2;
				current2=newNode2;
				
			}
			else {
				
				current1.link=newNode1;//establish the link to creat newly node
				current1=current1.link;//or=newNode
				newNode2.link=current2;
				current2=newNode2;
				headNode2=current2;
			}
			
		  }
		}
		console.close();
		System.out.println("Displaying the components ofthe the First and Second linked list");
		System.out.println("stored from user inut in forward and Backward manners\n\n");
		current1 = headNode1;
		while(current1!=null) {
			System.out.print("Value in the First Linked List :  "+current1.info);
			current1 = current1.link;
			System.out.print(" ,  Value in the Second Linked List : "+current2.info+"\n");
			
			current2 =current2.link;
			}	
		current1 = headNode1;
		current2 = headNode2;
		while(current1!=null) {
			newNode3 = new LinkedListNode();
			newNode3.info = current1.info - current2.info;
			newNode3.link=null;
			if(headNode3 == null) {
				headNode3=newNode3;
				current3 = newNode3;}
			else {
				current3.link=newNode3;
				current3=current3.link;
				}
			current1=current1.link;
			current2=current2.link;
		}
		current1 = headNode1;
		current2 = headNode2;
		current3 = headNode3;
		System.out.println("\nDisplaying the components of the First Linked list in forward manner \n");
		while(current1!=null) {
			
			System.out.println("Value :  "+current1.info);
			current1 = current1.link;
			}	
		System.out.println("\nDisplaying the components of the Second Linked list in backward manner \n");
		while(current2!=null) {
			
			System.out.println("Value :  "+current2.info);
			current2 = current2.link;
			}	
		
		System.out.println("\nDisplaying the components of the Third Linked list in forward manner \n");
		while(current3!=null) {
			
			System.out.println("Value :  "+current3.info);
			current3 = current3.link;
			}	
		
		
	}

}
