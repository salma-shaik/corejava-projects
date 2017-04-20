public class RunnableDemo implements Runnable{
	public static void main(String args[]){
		
		RunnableDemo runnableDemoObj = new RunnableDemo();		
		RunnableDemo runnableDemoObj1 = new RunnableDemo();	
		
		Thread t1 = new Thread(runnableDemoObj);
		t1.setName("runnableDemoObj");
		t1.start();
		
		Thread t2 = new Thread(runnableDemoObj);
		t2.setName("runnableDemoObj1");
		t2.start();
	}
	public void run(){
		System.out.println("Current executing thread: " +Thread.currentThread().getName());
	}
}