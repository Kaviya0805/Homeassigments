package Week3day1;

public class Chrome extends Browser {
	public void opencahe()
	{
		System.out.println("Opening cache");
	}
	public void clearcache()
	{
		System.out.println("clearcahe");
		
	}
public static void main(String[] args) {
	Chrome object2 = new Chrome();
	object2.opencahe();
	object2.clearcache();
	object2.openurl();
	object2.closebrowser();
	object2.navigateback();
	
	
	
}
}
