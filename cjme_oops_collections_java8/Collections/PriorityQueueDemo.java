import java.util.*;

public class PriorityQueueDemo{
	public static void main(String[] argss){
		Queue<Integer> prioQue = new PriorityQueue<Integer>();
		System.out.println("Peek should return null on empty queue: " +prioQue.peek());
		System.out.println("element should throw nsee on empty queue: " +prioQue.element());
		prioQue.offer(11);
		prioQue.offer(222);
		prioQue.offer(0000);
		prioQue.offer(33);
		prioQue.offer(432432);
		prioQue.offer(2432);
		System.out.println("Before manipulation: " +prioQue);
		System.out.println("Removing: " +prioQue.poll());
		//System.out.println(prioQue.peek());
		System.out.println("After poll: " +prioQue);
	}
}