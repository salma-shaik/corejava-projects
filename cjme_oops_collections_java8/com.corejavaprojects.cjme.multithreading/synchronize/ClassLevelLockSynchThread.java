public class ClassLevelLockSynchThread extends Thread{
	String name;
	ClassLevelLockSynchThread(String name){
		this.name=name;
	}
	public void run(){
		ClassLevelLockSynch.displayNames(this.name);
		ClassLevelLockSynch.displayNumbers(Thread.currentThread().getName());
	}
}