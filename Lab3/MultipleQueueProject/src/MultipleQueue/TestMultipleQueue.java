package MultipleQueue;

public class TestMultipleQueue {

	public static void main(String[] args) {
		MultipleQueueClass multipleQueue = new MultipleQueueClass(3);

        multipleQueue.addQueue(6);
        multipleQueue.addQueue(17);
        multipleQueue.addQueue(5);
        multipleQueue.addQueue(20);
        multipleQueue.addQueue(15);
        
        System.out.println(multipleQueue.toString());
        
        
        multipleQueue.deleteQueue();
        System.out.println("After dequeue:");
        System.out.println(multipleQueue.toString());
        multipleQueue.addQueue(30);
        System.out.println("After Adding in the queue:");
        System.out.println(multipleQueue.toString());
        multipleQueue.deleteQueue();
        System.out.println("After dequeue:");
        System.out.println(multipleQueue.toString());
        multipleQueue.deleteQueue();
        System.out.println("After dequeue:");
        System.out.println(multipleQueue.toString());

	}

}
