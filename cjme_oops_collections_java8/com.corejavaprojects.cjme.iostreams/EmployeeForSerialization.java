import java.io.*;

public class EmployeeForSerialization implements Serializable{
	int id;
	String name;
	long salary;
	transient String ssn;
	
	EmployeeForSerialization(int id, String name, long salary, String ssn){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.ssn=ssn;
	}
	
}