public class CallableInterfaceImplDemo{
	public static void main(String args[]){
		CallableInterfaceImpl callableObj = new CallableInterfaceImpl(4);
		Integer totalSum = callableObj.call();
		System.out.println("totalSum: " +totalSum);
	}
}