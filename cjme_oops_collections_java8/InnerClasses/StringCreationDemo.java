public class StringCreationDemo{
	public static void main(String args[]){
		String s1 = "abc";
		String s2 = new  String("def");
		char c[] = {'g','h','i'};
		String s3 = new String(c);
		byte b[] = {65,66,67};
		String s4 = new String(b);
		System.out.println("String Literal: " +s1);
		System.out.println("String Object: " +s2);
		System.out.println("String from Characters: " +s3);
		System.out.println("String from Bytes: " +s4);
	}	
}