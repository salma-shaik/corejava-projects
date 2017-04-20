import java.util.*;

public class StringSortingByLength implements Comparator<String>{
	public int compare(String s1, String s2){
		//return Integer.compare(s1.length(),s2.length());
		
		if(s1.length()<s2.length()){
			return -1;
		}else if(s1.length()>s2.length()){
			return 1;
		}else{
			return 1;
		}
		
	}
}