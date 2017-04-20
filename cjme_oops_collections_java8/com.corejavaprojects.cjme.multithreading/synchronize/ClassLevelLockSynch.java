public class ClassLevelLockSynch{
	public synchronized static void displayNames(String name){
		for(int i=0;i<4;i++){
			System.out.println("Hello " +name);
			try{
		Thread.sleep(1000);
		}catch(InterruptedException exc){
			System.out.println("Interrupted");
		}
		}
	}
	
	public synchronized static void displayNumbers(String threadName){
		System.out.println("From thread: " +threadName);
		for(int i=0;i<4;i++){
			System.out.println("Number " +i);
			try{
		Thread.sleep(1000);
		}catch(InterruptedException exc){
			System.out.println("Interrupted");
		}
		}
	}
}