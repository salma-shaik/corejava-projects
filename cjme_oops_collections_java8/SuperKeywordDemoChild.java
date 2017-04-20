public class SuperKeywordDemoChild extends SuperKeywordDemoParent{
	int c,d;
	
	SuperKeywordDemoChild(int p1, int p2, int c1, int c2){
		super(p1,p2);
		this.c=c1;
		this.d=c2;
	}
	
	void displayNumbers(){
		System.out.println("p1: " +super.a);
		System.out.println("p2: " +super.b);
		System.out.println("c1 Parent: " +this.a);
		System.out.println("c2 Parent: " +this.b);
		System.out.println("c1: " +this.c);
		System.out.println("c2: " +this.d);
	}
}