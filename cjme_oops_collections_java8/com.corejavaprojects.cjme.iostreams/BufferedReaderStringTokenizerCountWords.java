import java.io.*;
import java.util.*;

public class BufferedReaderStringTokenizerCountWords{
	public static void  main(String[] args){
		BufferedReader br = null;
		try{
		br = new BufferedReader(new FileReader("/Users/sonir/Dropbox/Study/Java/CoreJavaMadeEasyBharat/IOStreams/BufferedReaderDoc.txt"));		
		String line=null;
		int count=0;
		while((line=br.readLine())!=null){
			StringTokenizer st = new StringTokenizer(line);
			while(st.hasMoreTokens()){
				System.out.println(st.nextToken());
				++count;
			}			
		}
		br.close();
		System.out.println("Total no of words: " +count);
		}catch(FileNotFoundException fileExc){
			fileExc.printStackTrace();
		}catch(IOException ioExc){
			ioExc.printStackTrace();
		}finally{
			//if(br!=null){
			//br.close(); //BufferedReaderStringTokenizerCountWords.java:26: error: unreported exception IOException; must be caught or declared to be thrown
                        //br.close();
			//}
		}
	}
}