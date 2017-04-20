public class SingleThreadExecutionTest{
	public static void main(String args[]){
		System.out.println("From main method");
		for(int j=0;j<5;j++){
			System.out.println("j: " +j); 
		}
		
		SingleThreadExecutionTest singleThreadObj = new SingleThreadExecutionTest();
		singleThreadObj.method1();	
	}
	void method1(){
		System.out.println("From method1()");
		for(int i=0;i<5;i++){
			System.out.println("i: " +i);
		}
	}
}