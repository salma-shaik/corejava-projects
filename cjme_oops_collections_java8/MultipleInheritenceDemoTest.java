public class MultipleInheritenceDemoTest extends MultipleInheritenceDemoChild{
	MultipleInheritenceDemoTest(){
		System.out.println("Inside MultipleInheritenceDemoTest constructor");
	}
	public static void main(String args[]){
		MultipleInheritenceDemoTest testObj = new MultipleInheritenceDemoTest();
		testObj.f1();
		testObj.f2();
		testObj.hashCode();
		System.out.println(testObj.toString());
	}
}