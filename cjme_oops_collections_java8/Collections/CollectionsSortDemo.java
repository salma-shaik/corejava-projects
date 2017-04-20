import java.util.*;

public class CollectionsSortDemo{
	public static void main(String[] args){
		//sorting intgers
		List<Integer> intList = new ArrayList<Integer>();
		Random randomObj = new Random();
		for(int i=0; i<10; i++){
			intList.add(randomObj.nextInt(50));
		}
		
		System.out.println("intList before sorting: " +intList);
		Collections.sort(intList);
		System.out.println("intList after sorting: " +intList);
		Collections.sort(intList, Collections.reverseOrder());
		System.out.println("intList after reverese sorting: " +intList);
		
		//sorting strings
		List<String> stringList = new ArrayList<String>();
		stringList.add("test");
		stringList.add("fsdf");
		stringList.add("yjhjd");
		stringList.add("dhdh");
		stringList.add("htjfd");
		stringList.add("sdfgsdf");
		stringList.add("dfghdf");
		stringList.add("were");
		stringList.add("rwe");
		System.out.println();
		Collections.sort(stringList);
		System.out.println("stringList before sorting: " +stringList);
		Collections.sort(stringList);
		System.out.println("stringList after sorting: " +stringList);
		Collections.sort(stringList, Collections.reverseOrder());
		System.out.println("stringList after reverese sorting: " +stringList);
		
		//usimg custom comparator to sort strings by length
		Collections.sort(stringList, new CollectionsSortCustomComparator());
		System.out.println("stringList after sorting on length basis: " +stringList);
	}
}