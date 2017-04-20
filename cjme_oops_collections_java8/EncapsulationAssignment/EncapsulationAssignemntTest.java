public class EncapsulationAssignemntTest{
	public static void main(String args[]){
		EncapsulationAssignemnt encapObj = new EncapsulationAssignemnt();
		encapObj.setId(2);
		encapObj.setName("Jane Doe");
		encapObj.setSsn("122");
		System.out.println("ID: " +encapObj.getId());
		System.out.println("Name: " +encapObj.getName());
		System.out.println("SSN: " +encapObj.getSsn());
	}
}