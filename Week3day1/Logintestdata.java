package Week3day1;

public class Logintestdata extends Testdata {
	public void Enterusername()
	{
		System.out.println("Enter your username");
	}
    public void Enterpassword()
    {
    	System.out.println("Enter your password");
    }
    public static void main(String[] args) {
		Logintestdata username = new Logintestdata();
		username.Entercredentials();
		username.Navigatetohomepage();
		username.Enterusername();
		username.Enterpassword();
				
	}
}
