package Week3day1;

public class Testdata {
	public void Entercredentials()
	{
		System.out.println("Enter you credentials");
	}

	public void Navigatetohomepage() 
	{
	System.out.println("Navigating to homepage");	
	}
	public static void main(String[] args) {
		Testdata credentials = new Testdata();
		credentials.Entercredentials();
		credentials.Navigatetohomepage();
	}
}
