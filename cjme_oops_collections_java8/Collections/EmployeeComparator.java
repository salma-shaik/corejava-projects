 import java.util.*;
 public class EmployeeComparator implements Comparator<Employee>{
	
		public int compare(Employee emp1, Employee emp2){
			String s1 = emp1.name;
			String s2 = emp2.name;
			return s1.compareTo(s2);
		}
	
 }