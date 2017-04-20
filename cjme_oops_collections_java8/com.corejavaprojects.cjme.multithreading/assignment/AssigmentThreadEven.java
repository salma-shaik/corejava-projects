public class AssigmentThreadEven extends Thread{
	public void run(){
		synchronized(this){
		System.out.println("Even numbers from AssigmentThreadEven thread");
		for(int i=0;i<=10;i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
			notify();
		}
	}
}