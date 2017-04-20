public class ClassCompileTestThread extends Thread{
	ClassCompileTestMethod methodObj;
	ClassCompileTestThread(ClassCompileTestMethod methodObj){
		this.methodObj = methodObj;
	}	
	public void run(){
		methodObj.printName();
	}
}