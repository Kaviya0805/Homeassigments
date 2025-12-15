package Week3day1;

public class Webelements {
	public void Click()
	{
		System.out.println("Clicking the element");
	}
	public void settext(String text)
	{
		System.out.println("Text");
	}
	public static void main(String[] args) {
		Webelements object1 = new Webelements();
		object1.Click();
		object1.settext(null);
	}
}
