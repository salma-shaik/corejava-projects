import java.util.*;

public class RandomClassDemo{
	public static void main(String[] args){
		Random randomObj = new Random();
		System.out.println(randomObj.nextInt(10));
		System.out.println(randomObj.nextFloat());
	}
}