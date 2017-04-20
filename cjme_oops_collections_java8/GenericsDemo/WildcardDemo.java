import java.util.*;

public class WildcardDemo{
	public static void main(String[] args){
		WildcardDemo wildCardObj = new WildcardDemo();
		//wildCardObj.wildCardMethod(new ArrayList<Thread>());
		wildCardObj.wildCardSuperMethod(new ArrayList<A>());
	}
	
	public void wildCardMethod(ArrayList<? extends Runnable> arrayLst){
		arrayLst.add(null);
		//arrayLst.add(123);
		//arrayLst.add(new Thread());
	}
	
	public void wildCardSuperMethod(ArrayList<? super B> superList){
		superList.add(null);
		superList.add(new B());
		//superList.add(new A());
	}
}