import java.util.*;

public class HashMapDemo{
	public static void main(String[] args){
		Map<String,Integer> mapObj = new HashMap<String,Integer>();
		mapObj.put("John",100);
		mapObj.put("Wick", 29);
		
		System.out.println(mapObj);
		
		//enumerate hashmap using keySet
		System.out.println("enumerate hashmap using keySet");
		for(String key:mapObj.keySet()){
			System.out.println("Key:" +key+ ", Value:" +mapObj.get(key));
		}
		
		//enumerate hashmap using entrySet
		System.out.println("enumerate hashmap using entrySet");
		for(Map.Entry<String,Integer> mapEntry:mapObj.entrySet()){
			System.out.println("Key:" +mapEntry.getKey()+ ", Value:" +mapEntry.getValue());
	}
	}
}