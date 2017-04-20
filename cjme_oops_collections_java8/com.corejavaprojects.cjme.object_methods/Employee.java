public class Employee{
	int id;
	String name;
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id=id;
	}
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String toString(){
		return "Emp ID: " +this.id+ ", Name: " +this.name;
	}
	
	public boolean equals(Employee emp){
		Employee employee=emp;
		if(employee.id==this.id&&((employee.getName()).equals(this.getName()))){
			return true;
		}else{
			return false;
		}
	}
	
	public int hashCode(){
		return id+name.length();
	}
	
}