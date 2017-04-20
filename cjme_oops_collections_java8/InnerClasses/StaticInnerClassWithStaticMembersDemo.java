public class StaticInnerClassWithStaticMembersDemo{
	static void outerStatic(){
		System.out.println("Inside outer class's static method");
	}
	
	static class Inner{
		static void innerStatic(){
			System.out.println("Inside inner class's static method");
		}
		
		void innerNonStatic(){
			System.out.println("Inside inner class's non static method");
		}
	}
	
	public static void main(String args[]){
		StaticInnerClassWithStaticMembersDemo.outerStatic();
		StaticInnerClassWithStaticMembersDemo.Inner.innerStatic();
		
		StaticInnerClassWithStaticMembersDemo.Inner innerObj = new StaticInnerClassWithStaticMembersDemo.Inner();
		innerObj.innerNonStatic();
	}	
}