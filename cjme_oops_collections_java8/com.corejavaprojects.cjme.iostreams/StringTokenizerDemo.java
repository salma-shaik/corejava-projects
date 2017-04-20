import java.util.*;

public class StringTokenizerDemo{
	public static void main(String [] args){
		String s = "You, are, the, master, of, your, destiny";
		StringTokenizer st = new StringTokenizer(s,",",true);
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}