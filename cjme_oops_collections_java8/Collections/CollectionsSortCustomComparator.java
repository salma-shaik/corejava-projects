import java.util.*;

public class CollectionsSortCustomComparator implements Comparator<String>{
	public int compare(String s1, String s2){
	int l1= s1.length();
	int l2= s2.length();
		if (l1<l2){
			return -1;
		}else if(l1>l2){
			return 1;
		}else{
			return 0;
		}
	}
}