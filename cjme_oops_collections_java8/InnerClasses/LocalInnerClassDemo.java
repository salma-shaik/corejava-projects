public class LocalInnerClassDemo{
	public void f1(){
		System.out.println("Inside f1, before local inner class");
		class Inner{
		public void f2(){
				System.out.println("Inside f2 from local inner class"); 
			}
		}
		Inner inner = new Inner();
		inner.f2();
	}
	
	public static void main(String args[]){
		LocalInnerClassDemo demoObj = new LocalInnerClassDemo();
		demoObj.f1();
	}
}