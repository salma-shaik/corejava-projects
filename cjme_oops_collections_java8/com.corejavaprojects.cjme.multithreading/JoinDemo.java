import java.util.*;

public class JoinDemo extends Thread{	
	static int num, sum=0;
	public static void main(String args[]){
		System.out.println("Inside main, thread name: " +Thread.currentThread().getName());
		System.out.println("Enter a number");
		Scanner scannerObj= new Scanner(System.in);
		num = scannerObj.nextInt();
		JoinDemo joinObj = new JoinDemo();
		joinObj.start();
		try{
		joinObj.join();
		}catch(InterruptedException exc){
			System.out.println("InterruptedException thrown");
		}
		System.out.println("Sum: " +JoinDemo.sum);
	}
	public void run(){
		System.out.println("Inside run, thread old name: " +Thread.currentThread().getName());
		Thread.currentThread().setName("Sum of Numbers");
		System.out.println("Inside run, thread new name: " +Thread.currentThread().getName());
		for(int i=1;i<=JoinDemo.num;i++){
			JoinDemo.sum += i;
		}
	}
}