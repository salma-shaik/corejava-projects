import java.util.*;

public class NavigableSetDemo{
	public static void main(String[] args){
		TreeSet<Integer> navigableSet = new TreeSet<Integer>();
		navigableSet.add(3);
		navigableSet.add(34);
		navigableSet.add(5);
		navigableSet.add(534);
		navigableSet.add(123);
		navigableSet.add(233);
		
		System.out.println("ceiling: " +navigableSet.ceiling(53));
		System.out.println("higher: " +navigableSet.higher(53));
		System.out.println("floor: " +navigableSet.floor(87));
		System.out.println("lower: " +navigableSet.lower(87));
		System.out.println("pollFirst: " +navigableSet.pollFirst());
		System.out.println("pollLast: " +navigableSet.pollLast());
		System.out.println("set after changes: " +navigableSet);
		System.out.println("descending set: " +navigableSet.descendingSet());
	}
}