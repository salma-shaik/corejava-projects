import java.util.*;

public class NavigableMapDemo{
	public static void main(String[] args){
		TreeMap<Integer,String> naviMapObj = new TreeMap<Integer,String>();
		naviMapObj.put(1,"abc");
		naviMapObj.put(123,"sdfsd");
		naviMapObj.put(2,"abc23");
		naviMapObj.put(23,"131");
		naviMapObj.put(12,"fdgf");
		naviMapObj.put(4,"fsdf");
		
		System.out.println("Map before manipulations: " +naviMapObj);
		System.out.println("ceiling: " +naviMapObj.ceilingKey(13)); //23
		System.out.println("higher: " +naviMapObj.higherKey(13));//23
		System.out.println("floor: " +naviMapObj.floorKey(87));//23
		System.out.println("lower: " +naviMapObj.lowerKey(87));//23
		System.out.println("pollFirst: " +naviMapObj.pollFirstEntry());//1
		System.out.println("pollLast: " +naviMapObj.pollLastEntry());//4
		System.out.println("set after changes: " +naviMapObj);
		System.out.println("descending set: " +naviMapObj.descendingMap());
	}
}