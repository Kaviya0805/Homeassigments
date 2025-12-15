package Week3day1;

public class Textfield extends Webelements {
	public void gettext()
	{
		System.out.println("getting the text");
	}
public static void main(String[] args) {
	Textfield object3 = new Textfield();
	object3.gettext();
	object3.Click();
	object3.settext(null);
	
}
}
