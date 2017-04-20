public class AssigmentThreadOdd implements Runnable{
	public void run(){
		synchronized(this){
		System.out.println("Odd numbers from AssigmentThreadOdd thread");
		for(int i=0;i<=10;i++){
			if(i%2!=0){
				System.out.println(i);
			}
		}
			notify();
		}
	}
}