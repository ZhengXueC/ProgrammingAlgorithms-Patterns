package LinkeddStack;



public class LinkedListClass {
	//data attribute
	LinkedListNode first;
	LinkedListNode last;
	
	public LinkedListClass() {
		first=null;
		last=null;
	}
	
	
	//concrete method
	//add an element to linked list
	public void add(int num) {
		
		LinkedListNode newNode = new LinkedListNode();
		
		newNode.info = num;
		newNode.link=null;
		
		if(last == null) {
			
			first=newNode;
			last = newNode;//to newNode or head
			
		}
		else {
			
			last.link=newNode;//establish the link to creat newly node
			last=last.link;//or=newNode
		
		}
	}
	
	
	//print linkedList
	public void print() {
		LinkedListNode current=first;
		while(current!=null) {
			
			System.out.println("Value: "+current.info);
			current = current.link;
			}	
		
	}

}
