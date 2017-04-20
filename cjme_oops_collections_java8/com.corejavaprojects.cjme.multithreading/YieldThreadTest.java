public class YieldThreadTest{
	public static void main(String ags[]){
		YieldThread yieldObj = new YieldThread();
		yieldObj.start();
		for(int i=1;i<=10;i++){
			System.out.println("Inside main");
		}
	}
}