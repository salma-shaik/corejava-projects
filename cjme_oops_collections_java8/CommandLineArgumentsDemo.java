public class CommandLineArgumentsDemo
{
	public static void main(String args[]){
		if(args.length == 0){
			System.out.println("Empty Args array");
		}else{
			for(int i=0;i<args.length;i++){
				System.out.println(args[i]);
			}
		}
	}
}