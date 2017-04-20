public class ClassCompileTestThreadDemo{
	public static void main(String args[]){
		ClassCompileTestMethod testMethObj = new ClassCompileTestMethod();
		ClassCompileTestThread clsThreadObj = new ClassCompileTestThread(testMethObj);
		clsThreadObj.start();
	}
}