package QueueStructure;

import java.util.Arrays;

public class QueueClass {
	
	public int QueueFront;  //track the front of the queue by index
	public int QueueRear;  //track the rear of the queue by index
	public int maxQueueSize; //specifies the size of the queue
	public int count;  //track the number of elements in the queue
	public Integer[] list; //maintain elements of the queue into an array
	
	public QueueClass() {
		maxQueueSize=10;
		QueueFront=0;
		QueueRear=maxQueueSize-1;
		list= new Integer[maxQueueSize];
		count=0;
		
	}
	
	public void deleteQueue() {
		count--;
		list[QueueFront]=null;
		QueueFront=(QueueFront +1)%maxQueueSize;
	}
	
	public void addQueue(Integer num) {
		QueueRear = (QueueRear +1)%maxQueueSize;
		count++;
		list[QueueRear]=num;
		
	}

	
	
	
	
}
