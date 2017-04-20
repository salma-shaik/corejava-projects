import java.io.*;

public class ReadFileUSingFileIpStream{
	public static void main(String[] args){
		FileInputStream fis = null;
		try{
		fis = new FileInputStream(new File("/Users/sonir/Dropbox/Study/Java/CoreJavaMadeEasyBharat/IOStreams/Hello.txt"));
		
		int i;
		while((i=fis.read())!=-1){
			System.out.println((char)i);
		}
		}catch(FileNotFoundException fileExc){
			System.out.println("File not found");
		}catch(IOException ioExc){
			System.out.println("IO Exception");
		}finally{
			fis.close();
		}
	}
}