import java.io.*;

public class DeserializationDemo{
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException{
		FileInputStream fis = new FileInputStream("/Users/sonir/Dropbox/Study/Java/CoreJavaMadeEasyBharat/IOStreams/Emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		EmployeeForSerialization emp = (EmployeeForSerialization)ois.readObject();
		System.out.println("id: " +emp.id);
		System.out.println("ssn: " +emp.ssn);		
	}
}