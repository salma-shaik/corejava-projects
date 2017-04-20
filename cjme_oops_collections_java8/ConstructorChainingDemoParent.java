public class ConstructorChainingDemoParent{
	ConstructorChainingDemoParent(){
		System.out.println("Inside parent's No Args Constructor");
	}		
	
	ConstructorChainingDemoParent(int x){
		this();
		System.out.println("Inside parent Cls's explicit constructor: " +x);
	}
}