import java.util.*;

public class HashSetDemo{
	public static void main(String[] args){
		Random randomObj = new Random();
		List<Integer> intList = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			intList.add(randomObj.nextInt(5));
		}
		System.out.println(intList);
		
		Set<Integer> intSet = new HashSet<Integer>(intList);
		System.out.println(intSet);
		
		Iterator iteObj = intSet.iterator();
		while(iteObj.hasNext()){
			System.out.println(iteObj.next());
			iteObj.remove();
		}	
		
		System.out.println(intSet);

	}
}