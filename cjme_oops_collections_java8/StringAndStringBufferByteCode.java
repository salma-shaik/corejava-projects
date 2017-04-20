public class StringAndStringBufferByteCode{
	public static void main(String args[]){
		StringAndStringBufferByteCode obj1 = new StringAndStringBufferByteCode();
		obj1.stringConcatTest("Hello", "World");
		StringBuffer sbTest = new StringBuffer("Hello");
		obj1.stringBufferConcatTest(sbTest, "World");
	}
	public String stringConcatTest(String s1, String s2){
		return s1+s2;
	}
	public StringBuffer stringBufferConcatTest(StringBuffer sb1, String s2){
		return sb1.append(s2);
	}
}