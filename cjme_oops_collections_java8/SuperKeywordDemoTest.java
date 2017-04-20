public class SuperKeywordDemoTest{
	public static void main(String args[]){
		SuperKeywordDemoChild childObj = new SuperKeywordDemoChild(70,80,7,8);
		childObj.displayNumbers();
		System.out.println("Parent's variable a through childObj: " +childObj.a);
		System.out.println("Parent's variable b through childObj: " +childObj.b);
	}
}