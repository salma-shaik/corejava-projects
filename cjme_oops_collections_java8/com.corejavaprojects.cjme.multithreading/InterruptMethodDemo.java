public class InterruptMethodDemo extends Thread{
	public void run(){
		try{
		for(int i=1;i<=10;i++){
			System.out.println("Inside run; not yet interrupted");
			Thread.sleep(1000);
		}
		}catch(InterruptedException exc){
			System.out.println("Got interrupted");
		}
	}
}