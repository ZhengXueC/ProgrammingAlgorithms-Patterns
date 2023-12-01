package QueueStructure;

public class TestQueueDemo {

	public static void main(String[] args) {
		QueueClass myQueue=new QueueClass();
		
		myQueue.addQueue(6);
		myQueue.addQueue(16);
		myQueue.addQueue(63);
		myQueue.addQueue(61);
		myQueue.addQueue(18);//QF=0  QR=4   count=5 VQF=6  VQR=18

		System.out.println("The number of Elements in the Queue is :"+myQueue.count);
		System.out.println("The index of Queue Front is: "+myQueue.QueueFront+", The Queue Front  value is: "+myQueue.list[myQueue.QueueFront]);
		
		System.out.println("The index of QueueRear is: "+myQueue.QueueRear+", The Queue Rear value is: "+myQueue.list[myQueue.QueueRear]);
		
		
		myQueue.deleteQueue();//INDEX: QF=1  QR=4 count=4
		System.out.println("The number of Elements in the Queue is :"+myQueue.count);
		System.out.println("The index of Queue Front is: "+myQueue.QueueFront+", The Queue Front  value is: "+myQueue.list[myQueue.QueueFront]);
		
		System.out.println("The index of QueueRear is: "+myQueue.QueueRear+", The Queue Rear value is: "+myQueue.list[myQueue.QueueRear]);
//		System.out.println("t=t2: The number of Elements in the Queue: "+myQueue.count);
//		System.out.println("The index of QueueFront is: "+myQueue.QueueFront);
//		System.out.println("The value at QueueFront is: "+myQueue.list[myQueue.QueueFront]);
//		System.out.println("The index of QueueRear is: "+myQueue.QueueRear);
//		System.out.println("The value at QueueRear is: "+myQueue.list[myQueue.QueueRear]);
		
		myQueue.addQueue(19);//INDEX: QF=1  QR=5 count=5
		System.out.println("The number of Elements in the Queue is :"+myQueue.count);
		System.out.println("The index of Queue Front is: "+myQueue.QueueFront+", The Queue Front  value is: "+myQueue.list[myQueue.QueueFront]);
		
		System.out.println("The index of QueueRear is: "+myQueue.QueueRear+", The Queue Rear value is: "+myQueue.list[myQueue.QueueRear]);
//		System.out.println("t=t3: The number of Elements in the Queue: "+myQueue.count);
//		System.out.println("The index of QueueFront is: "+myQueue.QueueFront);
//		System.out.println("The value at QueueFront is: "+myQueue.list[myQueue.QueueFront]);
//		System.out.println("The index of QueueRear is: "+myQueue.QueueRear);
//		System.out.println("The value at QueueRear is: "+myQueue.list[myQueue.QueueRear]);
	}

}
