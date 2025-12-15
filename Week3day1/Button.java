package Week3day1;

public class Button extends Webelements {
	public void submit()
	{
		System.out.println("Clicking the submit button");
	}
public static void main(String[] args) {
	Button object2 = new Button();
	object2.submit();
	object2.Click();
	object2.settext(null);
}
}
