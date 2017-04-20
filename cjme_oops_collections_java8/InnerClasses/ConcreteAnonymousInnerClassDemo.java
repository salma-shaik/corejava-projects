public class ConcreteAnonymousInnerClassDemo{
	public void demoPrint(){
		System.out.println("Inside ConcreteAnonymousInnerClassDemo's demoPrint");
		ConcreteClass concreteClsObj = new ConcreteClass(){
			public void printHello(){
				System.out.println("Inside ConcreteClass's i.e anonymous inner class printHello");
			}
		};
		concreteClsObj.printHello();
	}
	
	public static void main(String args[]){
		ConcreteAnonymousInnerClassDemo demoObj = new ConcreteAnonymousInnerClassDemo();
		demoObj.demoPrint();
	}
	
}