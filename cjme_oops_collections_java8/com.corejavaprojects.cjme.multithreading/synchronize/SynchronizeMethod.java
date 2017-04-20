public class SynchronizeMethod{
	public synchronized void displayNames(String name){
		try{
		for(int i=0;i<10;i++){
			System.out.println("Hello " +name);
			Thread.sleep(1000);
		}
		}catch(InterruptedException exc){
			System.out.println("Interrupted");
		}
	}
}