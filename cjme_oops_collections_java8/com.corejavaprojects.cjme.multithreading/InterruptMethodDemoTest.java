public class InterruptMethodDemoTest{
	public static void main(String args[]){
		InterruptMethodDemo interruptObj = new InterruptMethodDemo();
		interruptObj.start();
		interruptObj.interrupt();
	}
}