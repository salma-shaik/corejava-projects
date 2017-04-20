public class StaticMethodsDemo{
	
	public static void main(String args[]){
		System.out.println("Inside main method");
		StaticMethodsDemo.testMethod();
	}
	
	static void testMethod(){
		System.out.println("Inside static testMethod");
	}
	
	static{
		System.out.println("Inside static block 2");
	}
	
	static{
		System.out.println("Inside static block 1");
	}
	
}