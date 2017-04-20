public class CustomCheckedExceptionTest{
	//public static void main(String args[])throws CustomCheckedException{
	//	throw new CustomCheckedException("Throwing a CustomCheckedException from Test class");
	//}
	
	public static void main(String args[]){
		try{
		throw new CustomCheckedException("Throwing a CustomCheckedException from Test class");
		}catch(Exception exc){
			System.out.println(exc.getMessage());
		}
	}
}