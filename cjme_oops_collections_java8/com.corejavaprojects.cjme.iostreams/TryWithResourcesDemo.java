import java.io.*;

public class TryWithResourcesDemo{
	public static void main(String[] args){
		try(FileInputStream fis = new FileInputStream("/Users/sonir/Dropbox/Study/Java/CoreJavaMadeEasyBharat/IOStreams/BufferedReaderDoc.txt");
			FileOutputStream fos = new FileOutputStream("/Users/sonir/Dropbox/Study/Java/CoreJavaMadeEasyBharat/IOStreams/BufferedReaderDoc1.txt");){
			int i;
			while((i=fis.read())!=-1){
				fos.write((char)i);
			}
			}catch(Exception exc){
				exc.printStackTrace();
			}
	}
}