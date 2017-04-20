import java.util.concurrent.*;

public class CallableInterfaceImpl implements Callable<Integer>{
	int num,sum=0;
	CallableInterfaceImpl(int num){
		this.num=num;
	}	
	public Integer call(){
		System.out.println("Current Thread: " +Thread.currentThread().getName());
		for(int i=0;i<10;i++){
			sum += i;
		}
		return sum;
	}
}