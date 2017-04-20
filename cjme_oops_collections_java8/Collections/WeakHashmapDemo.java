import java.util.*;

public class WeakHashmapDemo{
	public static void main(String[] args)throws InterruptedException{
		UserForWeakHashMap userObj = new UserForWeakHashMap(10);
		UserForWeakHashMap userObj2 = new UserForWeakHashMap(11);
		//Map<UserForWeakHashMap, String> weakHashMapDemo = new HashMap<UserForWeakHashMap, String>();
		Map<UserForWeakHashMap, String> weakHashMapDemo = new WeakHashMap<>();
		weakHashMapDemo.put(userObj, "john");
		weakHashMapDemo.put(userObj2, 11);
		System.out.println(weakHashMapDemo);
		userObj = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(weakHashMapDemo);
	}
}