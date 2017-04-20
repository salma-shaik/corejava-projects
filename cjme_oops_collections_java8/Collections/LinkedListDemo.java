import java.util.*;

public class LinkedListDemo{
	public static void main(String[] args){
		List<Object> linkedList = new LinkedList<Object>();
		Object[] objArray = new Object[1000000];
		long startTime = System.currentTimeMillis();
		for(int i=0;i<objArray.length;i++){
			linkedList.add(new Object());
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time Taken: " +(endTime-startTime));
	}
}