import java.util.*;

class CustomClassIterable implements Iterable<Integer>{
	List<Integer> intList = new ArrayList<>();
	public CustomClassIterable(){
		intList.add(34);
		intList.add(56);
		intList.add(235);
		intList.add(8);
		intList.add(45);		
	}
	
	public Iterator<Integer> iterator(){
		//retuning an iterator on the list that is created when a new CustomClassIterable object is instantiated
		return intList.iterator();
	}
}


public class CustomClassIterableDemo{
	public static void main(String[] args){
		CustomClassIterable custObj = new CustomClassIterable(); 
		//iterating over a list of integers since we have declared the returned iterator from custom  class
		//to be capable of iterating through a list of integers.
		for(Integer listElem : custObj){
			System.out.println(listElem);
		}
	}
}