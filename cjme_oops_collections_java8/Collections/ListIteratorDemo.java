import java.util.*;

public class ListIteratorDemo{
	public static void main(String[] args){
		List<Integer> intList = new ArrayList<Integer>();
		Random randomObj = new Random();
		
		for(int i=0;i<5;i++){
			intList.add(randomObj.nextInt(5));
		}
		
		ListIterator iteObj = intList.listIterator();
	
		while(iteObj.hasNext()){
			System.out.println("next: " +iteObj.next());			
		}	
			
		while(iteObj.hasPrevious()){
			System.out.println("previous: " +iteObj.previous());			
		}
	}
}