public class ConstructorChainingDemoChild extends ConstructorChainingDemoParent{
	ConstructorChainingDemoChild(){
		//this(10);
		System.out.println("Inside child's No Args Constructor");
	}		
	
	ConstructorChainingDemoChild(int x){
		super(x);
		System.out.println("Inside child Cls's explicit constructor: " +x);
	}
}