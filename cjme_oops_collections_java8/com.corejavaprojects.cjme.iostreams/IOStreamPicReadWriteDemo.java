import java.io.*;

public class IOStreamPicReadWriteDemo{
	public static void main(String[] args){
		FileInputStream fis;
		FileOutputStream fos;
		try{
		fis = new FileInputStream(new File("/Users/sonir/Dropbox/Study/Java/CoreJavaMadeEasyBharat/IOStreams/SolarSystem.jpg"));
		fos = new FileOutputStream(new File("/Users/sonir/Dropbox/Study/Java/CoreJavaMadeEasyBharat/IOStreams/SolarSystemCopy.jpg"));
		
		int i;
		while((i=fis.read())!=-1){
			fos.write((char)i);
		}
		}catch(FileNotFoundException fileExc){
			System.out.println("File Not Found Exception");
		}catch(IOException ioExc){
			System.out.println("IO Exception");
		}finally{
			fis.close();
			fos.close();
		}
	}
}