public class BreakLabelDemo{
	public static void main(String args[]){
		int x =20;
		l1:
		{
		System.out.println("block begins");
		if(x==21){
			break l1;
		}
		System.out.println("block ends");
		}
		System.out.println("outside the block");
	}
}