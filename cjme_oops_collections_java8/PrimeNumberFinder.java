import java.util.*;
public class PrimeNumberFinder{
	public static void main(String args[]){
		System.out.println("Please enter a number");
		Scanner scannerObj = new Scanner(System.in);
		int num = scannerObj.nextInt();
		boolean isPrime=true;
		for(int i=2; i<num-1; i++){
			if(num%i==0){
				System.out.println("Not a Prime");
				isPrime = false;				
				break;				
			}
		}
		if(isPrime){
			System.out.println("Prime");
		}
	}
}