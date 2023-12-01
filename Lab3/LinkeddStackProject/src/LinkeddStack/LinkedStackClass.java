package LinkeddStack;

public class LinkedStackClass {
	//Data attributes
	public LinkedListNode stackTop;
	
	//concrete methods
	//inset an element to the stack
	
	public LinkedStackClass() {
		
		stackTop=null;
		
	}
	public void push(int num){
		
LinkedListNode newNode = new LinkedListNode();
		
		newNode.info = num;
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
			
			System.out.println("Value: "+current.info);
			 current=current.link ;
			}	
	}
	public int peek() {
		
		return stackTop.info;
	}
	public void pop() {
		
		stackTop=stackTop.link;
	}
	public int search(int num) {
		
		    int position = 1;
		    LinkedListNode current = stackTop;
		    
		    while (current != null) {
		        if (current.info == num) {
		            return position; // Element found at this position
		        }
		        current = current.link;
		        position++;
		    }
		    
		    return -1; // Element not found in the stack
		
	}
}
