public class ThreadPriorityDemo extends Thread{
	public static void main(String args[]){
		
		ThreadPriorityDemo priorityObj = new ThreadPriorityDemo();
		priorityObj.setPriority(7);
		priorityObj.setName("priorityObj");
		
		ThreadPriorityDemo priorityObj1 = new ThreadPriorityDemo();
		priorityObj1.setPriority(MAX_PRIORITY);
		priorityObj1.setName("priorityObj1");
		
		ThreadPriorityDemo priorityObj2 = new ThreadPriorityDemo();
		priorityObj1.setPriority(NORM_PRIORITY);
		priorityObj2.setName("priorityObj2");
		Thread.currentThread().setName("main");
		System.out.println("Current executing thread: Main? " +Thread.currentThread().getName());
		
		priorityObj1.start();
		priorityObj.start();
		
		priorityObj2.start();
		
	}
	public void run(){
		System.out.println("Current executing thread: " +Thread.currentThread().getName());
	}
}