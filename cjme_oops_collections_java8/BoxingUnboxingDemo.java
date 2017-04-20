public class BoxingUnboxingDemo{
	public static void main (String args[]){
		//Primitive to Object
		int i1 = 300;
		Integer intObj = Integer.valueOf(i1);
		System.out.println("int object " +intObj);
		
		//Object to Primitive
		int i2 = intObj.intValue();
		System.out.println("int primitive: " +i2);	

		//Primitive to String
		byte b1 = 2;
		String s1 = Byte.toString(b1);
		
		System.out.println("byte to string: " +s1);
		
		//String to Primitive
		byte b2 = Byte.parseByte(s1);
		System.out.println("string to byte: " +b2);
		
		//Object to String
		long l1 = 234;
		Long longObj = Long.valueOf(l1);
		System.out.println("longObj: " +longObj);
		
		String longString = longObj.toString();
		System.out.println("longString: " +longString);
		
		Integer intObj1 = new Integer(19);
		String intString = intObj1.toString();
		System.out.println("intString for 19: " +intString);
		
		//String to Object
		Long strLong = Long.valueOf(longString);
		System.out.println("strLong: " +strLong);
		
		
	}
}