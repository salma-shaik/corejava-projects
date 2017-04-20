import java.util.*;
public class ArrayListDemo{
	public static void main(String[] args){
	List<String> demoList = new ArrayList<String>();
	demoList.add("abc");
	demoList.add("xyz");
	demoList.add("123");
	System.out.println(demoList);
	
	//insert a new element
	demoList.add(2,"insert");
	System.out.println(demoList);
	
	//reassign
	demoList.set(0,"abc-reassigned");
	System.out.println(demoList);
	
	//list size
	System.out.println(demoList.size());
	
	//get
	System.out.println(demoList.get(2));
	
	//remove
	demoList.remove(2);
	System.out.println(demoList);
	
	//addAll
	List<String> demoList2 = new ArrayList<String>();
	demoList2.addAll(demoList);
	System.out.println("demoList2: " +demoList2);
	
	System.out.println(demoList2.contains("123"));
	
	demoList2.add(3,"demo1");
	demoList2.add(4,"demo2");
	
	
	demoList2.addAll(5,demoList);
	
	System.out.println("After adding 1st list again: "+demoList2);
	}	
}
