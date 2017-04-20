import java.util.*;

public class ArraysSortDemo{
	public static void main(String[] args){
		int[] intArray = {34,23,546,213,5};
		for(int i:intArray){
			System.out.println(i);
		}	
		Arrays.sort(intArray);
		 
		System.out.println("After sorting");
		 
		for(int i:intArray){
			System.out.println(i);
		}
		
		String[] strArray = {"sdf","fwe","we","eqw","wea"};
		System.out.println("strArray before sorting");
		 
		for(String str:strArray){
			System.out.println(str);
		}
		Arrays.sort(strArray, new CollectionsSortCustomComparator());
		System.out.println("After sorting with custom comparator");
		for(String str:strArray){
			System.out.println(str);
		}
		
		//arrays binary search
		Arrays.sort(strArray);
		int index = Arrays.binarySearch(strArray,"sdf");
		System.out.println("index of \"we\": " +index);
		
		//Arrays to List
		List<String> listFromArray = Arrays.asList(strArray);
		System.out.println("List from array: " +listFromArray);
		//listFromArray.add("test123");
		listFromArray.set(1,"fff");
		System.out.println("Modified List: " +listFromArray);
		strArray[1] = "ggg";
		System.out.println("Modified List after array modification: " +listFromArray);
		//listFromArray.remove("ggg"); - unsupported operation exception
		//System.out.println("Modified List after element removal: " +listFromArray);
	}
}