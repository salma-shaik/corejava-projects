public class AccessOuterMembersInInnerClass{
	static int x = 50;
	private int y = 20;
	
	void outerMethod(){
		//System.out.println("Inner static var in outer method: " +Inner.xInner);
	}
	
	class Inner{
		//static int xInner = 51; //ilegal static declaration in inner class
		private int y=21;
		private void innerMethod(){
			System.out.println("Outer static var in inner method: " +AccessOuterMembersInInnerClass.x);
			System.out.println("Outer private in inner method: " +AccessOuterMembersInInnerClass.this.y);
		}
	}
	public static void main(String args[]){
		AccessOuterMembersInInnerClass outerObj = new AccessOuterMembersInInnerClass();
		AccessOuterMembersInInnerClass.Inner innerObj = outerObj.new Inner();
		outerObj.outerMethod();
		innerObj.innerMethod();
		System.out.println("Inner private in outer method: " +innerObj.y);
	}
	
}