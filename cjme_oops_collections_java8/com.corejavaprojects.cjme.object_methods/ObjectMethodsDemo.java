public class ObjectMethodsDemo{
	public static void main(String[] args){
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("John");
		System.out.println("1st emp: " +emp1);
		
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("Wick");
		System.out.println("2nd emp: " +emp2);
		
		Employee emp3 = new Employee();
		emp3.setId(1);
		emp3.setName("John");
		System.out.println("3rd emp: " +emp3);
		
		System.out.println(emp1==emp2);
		System.out.println(emp1==emp3);
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.equals(emp3));
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
	}
}