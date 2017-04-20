public class SynchronizeMethodDemo{
	public static void main(String args[]){
		
		SynchronizeMethod syncMethod = new SynchronizeMethod();
		
		SynchronizeMethodThread syncMethodThread1 = new SynchronizeMethodThread(syncMethod, "Steve");
		syncMethodThread1.start();
		
		SynchronizeMethodThread syncMethodThread2 = new SynchronizeMethodThread(syncMethod, "Jobs");
		syncMethodThread2.start();
	}
}