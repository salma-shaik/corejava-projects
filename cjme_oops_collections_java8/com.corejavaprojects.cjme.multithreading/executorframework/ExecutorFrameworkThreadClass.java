public class ExecutorFrameworkThreadClass implements Runnable{
	String name;
	ExecutorFrameworkThreadClass(String name){
		this.name=name;
	}
	public void run(){
		System.out.println("Beginning execution of task: " +name);
		try{
		Thread.sleep(1000);
		}catch(InterruptedException exc){
			System.out.println("Interrupted");
		}
		System.out.println("Finished execution of task: " +name);
	}
}