package LinkeddStack;

public class TestLinkedStack {

	public static void main(String[] args) {
		//create linked list
		LinkedListClass myList = new LinkedListClass();
		
		LinkedStackClass myStack = new LinkedStackClass();
		
		myList.add(10);
		myList.add(15);
		myList.add(20);
		myList.add(25);
		
		//print linkedlist
		myList.print();
		System.out.println("\nStack Values \n");
		
		myStack.push(40);
		myStack.push(50);
		myStack.push(60);
		myStack.push(70);
		
		myStack.print();
		
		//System.out.println(myStack.peek());
	}

}
