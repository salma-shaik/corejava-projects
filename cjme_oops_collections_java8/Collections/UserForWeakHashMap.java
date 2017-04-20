public class UserForWeakHashMap{
	int id;
	UserForWeakHashMap(int id){
		this.id=id;
	}
	
	protected void finalize() throws Throwable{
		System.out.println("finalize called");
	}
	
	public String toString(){
		return "User ID: " +this.id;
	}
}
