import java.util.*;

public class IteratorDemo{
	public static void main(String[] args){
		List<Integer> intList = new ArrayList<Integer>();
		Random randomObj = new Random();
		
		for(int i=0;i<5;i++){
			intList.add(randomObj.nextInt(5));
		}
		
		//System.out.println("intList: " +intList);
		
		//iterator
		Iterator iteObj = intList.iterator();
		while(iteObj.hasNext()){
			System.out.println(iteObj.next());
		}	
		
		for(Integer int1:intList){
			System.out.println(int1);
		}

		}
}