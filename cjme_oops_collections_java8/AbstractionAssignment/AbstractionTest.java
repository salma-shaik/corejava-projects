public class AbstractionTest{
	public static void main(String args[]){
		TouchScreenLaptop dellNotebook = new DellNotebook();
		TouchScreenLaptop hPNotebook = new HPNotebook();
		dellNotebook.scroll();
		dellNotebook.click();
		hPNotebook.scroll();
		hPNotebook.click();
	}
}