public class ClassLevelLockSynchDemo{
	public static void main(String args[]){
		ClassLevelLockSynchThread clsLockThread1 = new ClassLevelLockSynchThread("Steve");
		ClassLevelLockSynchThread clsLockThread2 = new ClassLevelLockSynchThread("Jobs");
		
		clsLockThread1.setName("clsLockThread1");
		clsLockThread1.start();
		
		clsLockThread2.setName("clsLockThread2");
		clsLockThread2.start();
	}
}