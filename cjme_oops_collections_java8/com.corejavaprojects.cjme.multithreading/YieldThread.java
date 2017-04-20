public class YieldThread extends Thread{
	public void run(){
		System.out.println("Before for loop which has yield");
		for(int i=1;i<=10;i++){
			System.out.println("Inside run");
			//Thread.yield();
		}
	}
}