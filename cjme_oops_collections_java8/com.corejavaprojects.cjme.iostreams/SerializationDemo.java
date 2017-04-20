import java.io.*;

public class SerializationDemo{
	public static void main(String[] args){
		EmployeeForSerialization empObj = new EmployeeForSerialization(1,"John",412647,"888888888");
		try{
		FileOutputStream fos = new FileOutputStream("/Users/sonir/Dropbox/Study/Java/CoreJavaMadeEasyBharat/IOStreams/Emp.ser");
		ObjectOutputStream ous = new ObjectOutputStream(fos);
		ous.writeObject(empObj);
		}catch(FileNotFoundException fileExc){
			System.out.println("FileNotFoundException");
		}catch(IOException ioExc){
			System.out.println("IOException");
		}		
	}
}