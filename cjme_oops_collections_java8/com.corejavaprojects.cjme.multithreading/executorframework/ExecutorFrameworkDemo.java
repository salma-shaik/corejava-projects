import java.util.concurrent.*;

public class ExecutorFrameworkDemo{
	
	public static void main(String args[]){		
		ExecutorFrameworkThreadClass exeTaskArray[] = { new ExecutorFrameworkThreadClass("ATM"), 
													    new ExecutorFrameworkThreadClass("Cash"),
													    new ExecutorFrameworkThreadClass("Deposit"),
													    new ExecutorFrameworkThreadClass("Credit")};
														 
		ExecutorService execService = Executors.newFixedThreadPool(2);
		
		for(ExecutorFrameworkThreadClass exeTask:exeTaskArray){
			execService.submit(exeTask);
		}
		execService.shutdown();
	}
}