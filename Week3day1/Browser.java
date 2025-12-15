package Week3day1;

public class Browser {
	public void openurl()
	{
		System.out.println("opening url");
	}
	public void closebrowser()
	{
		System.out.println("CLosing Browser");
	}
	public void navigateback()
	{
		System.out.println("Navigating back");
	}
	

	public static void main(String[] args) {
		Browser object1 = new Browser();
		object1.openurl();
		object1.closebrowser();
		object1.navigateback();
	}
}
