public class GenericClass<T>{
	T obj;
	
	GenericClass(T obj){
		this.obj = obj;
	}
	
	public void getObjectDetails(){
		System.out.println(obj.getClass().getName());
	}
	
	public T getObj(){
		return obj;
	}
}		

	