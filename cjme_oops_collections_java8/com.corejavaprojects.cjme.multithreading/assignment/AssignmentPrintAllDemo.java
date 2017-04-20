public class AssignmentPrintAllDemo{
	
	public static void main(String args[]) throws InterruptedException{		
		AssigmentThreadEven evenObj = new AssigmentThreadEven();
		synchronized(evenObj){
		evenObj.start();
		evenObj.wait();
		}
		
		AssigmentThreadOdd oddObj = new AssigmentThreadOdd();
		Thread oddObjThread = new Thread(oddObj);
		synchronized(oddObjThread){
		oddObjThread.start();
		oddObjThread.wait();
		}
		
		System.out.println("All numbers from main thread");
		for(int i=0;i<=10;i++){
			System.out.println(i);
		}
	}
}