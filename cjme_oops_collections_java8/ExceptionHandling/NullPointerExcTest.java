public class NullPointerExcTest{
	static NumberFormatDemoExceptionTest excTestObj;
	public static void main(String args[]){
		try{
		NullPointerExcTest.excTestObj.method1();
		}catch(Exception ex){
			System.out.println("excTestObj has not been initialized");
		}
		System.out.println("After handling exception");
	}
}