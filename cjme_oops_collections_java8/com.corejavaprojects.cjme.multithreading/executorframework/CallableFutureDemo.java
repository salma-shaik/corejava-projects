import java.util.concurrent.*;

public class CallableFutureDemo{
	public static void main(String args[]){
		CallableInterfaceImpl callableObjArray []= {new CallableInterfaceImpl(4),
											   new CallableInterfaceImpl(4),
											   new CallableInterfaceImpl(4),
											   new CallableInterfaceImpl(4),
											   new CallableInterfaceImpl(4),
											   new CallableInterfaceImpl(4)};
											   
	    ExecutorService exeService = Executors.newFixedThreadPool(3);
		for(CallableInterfaceImpl callableTask : callableObjArray){
			Future<Integer> future = exeService.submit(callableTask);
			try{
			System.out.println("totalSum: " +future.get());
			}catch(InterruptedException | ExecutionException exc){
				System.out.println("Interrupted");
			}
		}	
			exeService.shutdown();
	}
}