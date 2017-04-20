public class ConcreteAnonymousInnerClassWithConstructorDemo{
	public void demoPrint(){
		System.out.println("Inside ConcreteAnonymousInnerClassWithConstructorDemo's demoPrint");
		ConcreteClass concreteClsObj = new ConcreteClass(5){
			int x;
			ConcreteClass(int i){
				this.x=i;
			}
			public void printHello(){
				System.out.println("int value inside anony inner cls: " +i);
			}
		};
		concreteClsObj.printHello();
	}
	
	public static void main(String args[]){
		ConcreteAnonymousInnerClassWithConstructorDemo demoObj = new ConcreteAnonymousInnerClassWithConstructorDemo();
		demoObj.demoPrint();
	}
	
}