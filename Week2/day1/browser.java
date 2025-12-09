package Week2.day1;

public class browser {
  public String launchbrowser(String browsername) {
	  System.out.println("Edge browser");
	  return browsername;
  }
  
  public String loadurl()
  {
	  System.out.println("Url Loaded successfully");
	  
  }
  public static void main(String[] args) {
	browser loadbrowser = new browser();
	loadbrowser.launchbrowser();
	loadbrowser.loadurl();
	
}
	}
	