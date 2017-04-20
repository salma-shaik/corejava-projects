public class NumberFormatDemoExceptionTest{
	public static void main(String args[]){
		try{
		String s = "test";
		int a = Integer.parseInt(s);
		}catch(Exception ex){
			System.out.println("Integer can't be cast to int. Please use explicit casting");
		}
		System.out.println("After exception handling");
	}
	
	void method1(){
		System.out.println("Inside method1");
	}
}