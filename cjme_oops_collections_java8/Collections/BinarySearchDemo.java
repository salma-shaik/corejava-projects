import java.util.*;

public class BinarySearchDemo{
	public static void main(String[] args){
		List<Integer> intList = new ArrayList<Integer>();
		Random randomObj = new Random();
		for(int i=0; i<10; i++){
			intList.add(randomObj.nextInt(50));
		}
		System.out.println("intList: " +intList);
		
		//sorting before binary search
		Collections.sort(intList);
		System.out.println("intList after sorting: " +intList);
		
		Collections.reverse(intList);
		System.out.println("intList after reverse sorting: " +intList);
		
		System.out.println("Index of 48: " +Collections.binarySearch(intList, 48));
	}
}