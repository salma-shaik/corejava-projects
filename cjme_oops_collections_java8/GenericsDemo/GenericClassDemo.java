public class GenericClassDemo{
	public static void main(String[] args){
		GenericClass<String> genStr = new GenericClass("test");
		genStr.getObjectDetails();
		
		GenericClass<Integer> genInt = new GenericClass(24323);
		genInt.getObjectDetails();
		
		GenericClass<Double> genDbl = new GenericClass(234.24324);
		genDbl.getObjectDetails();
		
		GenericTypeRange<Thread> typeRangeObj= new GenericTypeRange<>(new Thread());
		typeRangeObj.printHello();
	}
}