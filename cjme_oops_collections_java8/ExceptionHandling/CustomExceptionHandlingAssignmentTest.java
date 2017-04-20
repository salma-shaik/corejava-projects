public class CustomExceptionHandlingAssignmentTest{
	public static void main(String args[]){
		try{
		System.out.println("Inside main before sleep");
		Thread.sleep(2000);
		System.out.println("After sleep");
		}catch(InterruptedException exc){
			throw new MyThreadException("Inside CustomExceptionHandlingAssignmentTest catch");
		}
	}
}