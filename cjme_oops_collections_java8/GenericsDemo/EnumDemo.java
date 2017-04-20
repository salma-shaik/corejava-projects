public class EnumDemo{
	public static void main(String[] args){
		EnumClass pt = EnumClass.CREDIT;
		System.out.println(pt);
		
		System.out.println(pt.ordinal());
		for(EnumClass enum1:EnumClass.values()){
			System.out.println(enum1);		
			System.out.println(enum1.ordinal());
			System.out.println(enum1.getFee());
			System.out.println(enum1.getAmount());
		}
	}
}