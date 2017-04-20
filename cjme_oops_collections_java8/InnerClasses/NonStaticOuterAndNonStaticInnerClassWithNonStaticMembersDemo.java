public class NonStaticOuterAndNonStaticInnerClassWithNonStaticMembersDemo{
	void outerNonStatic(){
		System.out.println("Inside outer class's non static method");
	}
	
	class Inner{		
		void innerNonStatic(){
			System.out.println("Inside inner class's non static method");
		}
	}
	
	public static void main(String args[]){
		NonStaticOuterAndNonStaticInnerClassWithNonStaticMembersDemo outerObj = new NonStaticOuterAndNonStaticInnerClassWithNonStaticMembersDemo();
		NonStaticOuterAndNonStaticInnerClassWithNonStaticMembersDemo.Inner inner = outerObj.new Inner();
		outerObj.outerNonStatic();
		inner.innerNonStatic();
	}	
}