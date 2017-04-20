public class GenericTypeRange<T extends Thread & Runnable>{
	Runnable obj;
	
	GenericTypeRange(Runnable obj){
		this.obj = obj;
	}
	
	public void printHello(){
		System.out.println("Hello");
	}
	
	public void run(){
		System.out.println("From run");
	}
}