import java.util.*;

public class SortingObjectsDemo{
	public static void main(String[] args){
		//Set<Employee> empSet = new TreeSet<Employee>(); EmployeeComparator
		Set<Employee> empSet = new TreeSet<Employee>(new EmployeeComparator());
		empSet.add(new Employee(23,"john"));
		empSet.add(new Employee(19,"wick"));
		
		System.out.println(empSet);
	}
}