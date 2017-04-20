import java.io.*;

public class ReaderWriterDemo{
	public static void main(String [] args)throws Exception{
		FileReader fr = null;
		FileWriter fw = null;
		
		//fr = new FileReader(new File("/Users/sonir/Dropbox/Study/Java/CoreJavaMadeEasyBharat/IOStreams/Hello.txt"));
		//fw = new FileWriter(new File("/Users/sonir/Dropbox/Study/Java/CoreJavaMadeEasyBharat/IOStreams/HelloWriter.txt"));
		
		fr = new FileReader("/Users/sonir/Dropbox/Study/Java/CoreJavaMadeEasyBharat/IOStreams/Hello.txt");
		fw = new FileWriter("/Users/sonir/Dropbox/Study/Java/CoreJavaMadeEasyBharat/IOStreams/HelloWriter.txt");
		
		int i;
		while((i=fr.read()) != -1){
			fw.write(i);
		}
		fr.close();
		fw.close();
	}
}