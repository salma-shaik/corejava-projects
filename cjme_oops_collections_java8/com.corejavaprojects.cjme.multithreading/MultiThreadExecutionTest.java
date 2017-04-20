public class MultiThreadExecutionTest extends Thread{
	public static void main(String[] args) throws InterruptedException{
		MultiThreadExecutionTest multiObj = new MultiThreadExecutionTest();
		multiObj.start();
		for(int j=0;j<5;j++){
			Thread.sleep(2000);
			System.out.println("From main(), j: " +j);
		}
	}
	public void run(){
		for(int i=0;i<5;i++){ 
		try{
			Thread.sleep(1000);
		}catch(InterruptedException exc){
			System.out.println("Uninterrupted Exception is thrown");
		}
			System.out.println("From run(), i: " +i);
		}
	}
}