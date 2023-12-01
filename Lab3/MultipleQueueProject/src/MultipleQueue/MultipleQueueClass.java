package MultipleQueue;

import java.util.Arrays;

public class MultipleQueueClass {
	public int queueFrontA;
	public int queueRearA;
	public int queueFrontB;
	public int queueRearB;
	public int maxQueueSize;
	public int countA;
	public int countB;
	public Integer [][] list;
	
	public MultipleQueueClass(int maxQueueSize) {
		this.maxQueueSize = maxQueueSize;
		queueFrontA=queueFrontB=0;
		queueRearA=queueRearB=maxQueueSize-1;
		list= new Integer[maxQueueSize][2];
		countA=0;
		countB=0;
	}
	public void addQueue(Integer num) {
		
		if (countA == 0) {
            queueFrontA = queueRearA = 0;
            list[queueRearA][0] = num;
            countA++;
            System.out.println("The Element named "+num+" is queued in queueA system");
        } else if (countA == 1 && countB == 0) {
            queueFrontB = queueRearB = 0;
            list[queueRearB][1] = num;
            countB++;
            System.out.println("The Element named "+num+" is queued in queueB system");
        } else if (countA <= countB) {
            queueRearA = (queueRearA + 1) % maxQueueSize;
            list[queueRearA][0] = num;
            countA++;
            System.out.println("The Element named "+num+" is queued in queueA system");
        } else {
            queueRearB = (queueRearB + 1) % maxQueueSize;
            list[queueRearB][1] = num;
            countB++;
            System.out.println("The Element named "+num+" is queued in queueB system");
        }
		
	}
	public void deleteQueue() {
		if (countA == 0 && countB == 0) {
            System.out.println("Both queues are empty.");
            return;
        }

        if (countA >= countB) {
        	System.out.println(list[queueFrontA][0]+" has withdrawn from the queueA\n");
            queueFrontA = (queueFrontA + 1) % maxQueueSize;
            countA--;
            
            
        } else {
        	System.out.println(list[queueFrontB][1]+" has withdrawn from the queueB\n");
        	
            queueFrontB = (queueFrontB + 1) % maxQueueSize;
            countB--;
        }
		
	}
	@Override
	public String toString() {
		return "The front of the queue A is : "+list[queueFrontA][0]+"\n"+"The back of the queue A is : "+list[queueRearA][0]+"\n"+"The number of elements in the Queue A is :"+countA+"\n\n"
				+ "The front of the queue B is : "+list[queueFrontB][1]+"\n"+"The back of the queue B is : "+list[queueRearB][1]+"\n"+"The number of elements in the Queue B is :"+countB+"\n"
				;
	}
	
}
