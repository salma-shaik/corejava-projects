public class ThreadCommunicationDemo{
	public static void main(String args[]) throws InterruptedException{
		ThreadCommunicationMethodThread threadCommObj = new ThreadCommunicationMethodThread();
		threadCommObj.start();
		
		synchronized(threadCommObj){
			threadCommObj.wait();
			System.out.println("Total: " +threadCommObj.total);
		}
	}
}