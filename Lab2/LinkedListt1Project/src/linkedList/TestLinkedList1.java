package linkedList;

public class TestLinkedList1 {

	public static void main(String[] args) {
		// process to create linkedlist data structure that stores 8,4,0,-1
		//in theory:every element in linkedlist is called node
		LinkedListNode head,newNode;
		
		head = new LinkedListNode();
		head.info=24;
		head.link=null;
		
		//creating new Node using reference object newNode
		newNode =new LinkedListNode();
		newNode.info=56;
		newNode.link=null;
		head.link= newNode; //my first node is linked to second node
		
		newNode= new LinkedListNode();
		newNode.info = 285;
		newNode.link=null;
		head.link.link=newNode; //my second node is linked to third node
		
		newNode= new LinkedListNode();
		newNode.info = 3;
		newNode.link=null;
		head.link.link.link=newNode; //linked to forth node
		
		newNode= new LinkedListNode();
		newNode.info = 9;
		newNode.link=null;
		head.link.link.link.link=newNode;
		
		newNode= new LinkedListNode();
		newNode.info = 77;
		newNode.link=null;
		head.link.link.link.link.link=newNode;
		
		
		
//		System.out.println("Value: "+head.info);
//		System.out.println("Value: "head.link.info);
//		System.out.println("Value: "head.link.link.info);
//		System.out.println("Value: "head.link.link.link.info);
//		
//		System.out.println("printing data of linkedlist by traversing the linkedlist");
		//printing data of linkedlist by traversing the linkedlist
		LinkedListNode current;
		current = head;
		System.out.println("Displaying the components of the linked list");
		System.out.println();
		System.out.println();
		while(current!=null) {
		System.out.println("Value: "+current.info);
		current = current.link;
		}	
		
		//processing:access linkedlist using head
		
		
	}

}
