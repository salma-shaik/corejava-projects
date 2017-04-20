import java.util.*;

public class TreeSetOfStringBuffers{
	public static void main(String args[]){
		Set<StringBuffer> strBuffSet = new TreeSet<StringBuffer>(new StringBufferComparator());
		strBuffSet.add(new StringBuffer("fdfds"));
		strBuffSet.add(new StringBuffer("dsed"));
		strBuffSet.add(new StringBuffer("sded"));
		strBuffSet.add(new StringBuffer("eded"));
		strBuffSet.add(new StringBuffer("wweasds"));
		strBuffSet.add(new StringBuffer("asdswdd"));
		
		System.out.println(strBuffSet);
	}
}