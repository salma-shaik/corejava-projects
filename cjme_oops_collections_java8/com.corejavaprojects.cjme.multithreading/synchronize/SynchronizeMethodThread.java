public class SynchronizeMethodThread extends Thread{
	String name;
	SynchronizeMethod syncMethod;
	SynchronizeMethodThread(SynchronizeMethod syncMethod, String name){
		this.name = name;
		this.syncMethod = syncMethod;
	}
	public void run(){
		syncMethod.displayNames(this.name);
	}
}