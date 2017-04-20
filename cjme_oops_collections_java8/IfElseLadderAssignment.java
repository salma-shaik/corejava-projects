public class IfElseLadderAssignment{
	public static void main(String args[]){
		//1st Method
		int sum=0;
		int count=0;
		int average=0;
		if(args.length==0){
			System.out.println("Empty Args List");
		}else if(args.length<3){
			System.out.println("Please enter 3 values");
		}else{
			for(int i=0;i<args.length;i++){
				if(Integer.parseInt(args[i]) >= 35){
					++count;
				}
			}
			if(count>2){
				for(int i=0;i<args.length;i++){
				sum += Integer.parseInt(args[i]);
				}
				average=sum/args.length;
				if(average<=59){
					System.out.println("Grade C");
				}else if(average<=69){
					System.out.println("Grade B");
				}else{
					System.out.println("Grade A");
				}
			}else{
				System.out.println("Fail");
			}
		}
	}
}