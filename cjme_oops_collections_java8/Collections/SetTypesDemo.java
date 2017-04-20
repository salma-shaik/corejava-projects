//hashset,linkedhashset,treeset
import java.util.*;

public class SetTypesDemo{
	public static void main(String[] args){
		List<Integer> intList = new ArrayList<Integer>();
		Random randomObj = new Random();
		
		for(int i=0;i<20;i++){
			intList.add(randomObj.nextInt(10));
		}
		
		System.out.println("intList: " +intList);
		
		Set<Integer> setRef = new HashSet<Integer>(intList);
		System.out.println("hashSet: " +setRef);
		
		setRef = new LinkedHashSet<Integer>(intList);
		System.out.println("linkedHashSet: " +setRef);
		
		setRef = new TreeSet<Integer>(intList);
		System.out.println("treeSet: " +setRef);
	}
}