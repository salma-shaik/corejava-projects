import java.util.*;

public class HashMapDemo{
	public static void main(String[] args){
		HashMap<Integer,String> hashMapObj = new HashMap<>();
		hashMapObj.put(4,"dsasd");
		hashMapObj.put(37,"ff");
		hashMapObj.put(87,"cas");
		hashMapObj.put(9,"ggdf");
		hashMapObj.put(3,"khk");
		
		//using entry set to iterate over map
		System.out.println("using entry set to iterate over map");
		for(Map.Entry<Integer,String> mapEntry : hashMapObj.entrySet()){
			System.out.println(mapEntry.getKey() + ", " +mapEntry.getValue());
		}		

		//using keyset to iterate over map
		System.out.println("using keyset to iterate over map");
		for(Integer key : hashMapObj.keySet()){
			System.out.println(key + " : " + hashMapObj.get(key));
		}
	}
}