public class ThisKeywordTest{
	int a=10;
	
	void printNumber(){
		System.out.println("a: " +this.a);
	}
	
	public static void main(String args[]){
		//non-static variable this cannot be referenced from a static context
		//System.out.println("a: " +this.a);
		ThisKeywordTest testObj = new ThisKeywordTest();
		testObj.printNumber();
	}
}