public class MultipleInheritenceDemoChild extends MultipleInheritenceDemoParent{
	MultipleInheritenceDemoChild(){
		System.out.println("Inside MultipleInheritenceDemoChild constructor");
	}
	void f1(){
		super.f1();
		System.out.println("Inside child's f1");
	}
}