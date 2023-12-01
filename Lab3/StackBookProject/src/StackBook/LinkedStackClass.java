package StackBook;

public class LinkedStackClass {
	//Data attributes
	public LinkedListNode stackTop;
	
	//concrete methods
	//inset an element to the stack
	
	public LinkedStackClass() {
		
		stackTop=null;
		
	}
	public void push(Book newBook){
		
LinkedListNode newNode = new LinkedListNode();
		
		newNode.info = newBook;
//		newNode.link=null;
//		
//		if(stackTop == null) {
//			
//			stackTop=newNode;
//			
//		}
//		else {
			
			newNode.link=stackTop;
			stackTop=newNode;
		
		
		
	}
	public void print() {
		LinkedListNode current=stackTop;
		while(current!=null) {
			
			System.out.println(current.info);
			System.out.printf(" -> Book CAN Price:  %.2f$",current.info.getB_price());
			System.out.printf(" -> Book EUR Price:  %.2f$\n\n",current.info.calculate_Price_Euro());
			 current=current.link ;
			}	
	}
	public Book peek() {
		
		return stackTop.info;
	}
	public void pop() {
		
		stackTop=stackTop.link;
	}
	//public int search(int num) {
		
		
		//return 
	
}
