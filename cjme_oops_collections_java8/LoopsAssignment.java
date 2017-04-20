/**
Ask user to enter a number.
Display all the numbers upto that number.
Skip the multiples of 10.
Stop if the number is greater than 100
**/
import java.util.*;
public class LoopsAssignment{
	public static void main(String args[]){
		System.out.println("Please enter a number below 100");
		Scanner ipScanner = new Scanner(System.in);
		int ipNumber = ipScanner.nextInt();		
		System.out.println("Entered number is: " +ipNumber);
		for(int i=0;i<=ipNumber;i++){
			 if(i%10 == 0){
				continue;
			 }else if(i>100){
				break;
			 }else{
				System.out.println(i);
			 }					 
		}
	}
}