import java.util.*;

public class TreeSetOfStrings{
	public static void main(String[] args){
		Set<String> strSet = new TreeSet<String>(new StringSortingByLength());
		strSet.add("sdslkn9009809o");
		strSet.add("sds");
		
		
		strSet.add("wwed12");
		strSet.add("ab");
		strSet.add("67890");
		strSet.add("12345");
		strSet.add("ddqw123");
		strSet.add("ewqe1");
		
		System.out.println(strSet);
	}
}