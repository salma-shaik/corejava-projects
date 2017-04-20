import java.util.*;

public class Employee {//implements Comparable<Employee> {
	int id;
	String name;
	
	Employee(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	/**
	public int compareTo(Employee emp1){
		if(this.id<emp1.id){
			return -1;
	}else if(this.id>emp1.id){
		return 1;
	}else{
		return 0;
	}
	}
	**/
	
	public String toString(){
		return "Employee Id:" +this.id+ " ,Employee Name:" +this.name;
	}
}