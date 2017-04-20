public class InitializationExample {
 
	//instance variable initializer
	String s = "abc";
 
	//constructor
	public InitializationExample() {
		System.out.println("constructor called");
	}
 
	//static initializere
	static {
		System.out.println("static initializer called");
	}
 
	//instance initializer
	
		System.out.println("instance initializer called");
	
 
	public static void main(String[] args) {
		new InitializationExample();
		new InitializationExample();
	}
}
