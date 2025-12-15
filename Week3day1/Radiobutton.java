package Week3day1;

public class Radiobutton extends Button{
	public void selectRadioButton()
	{
		System.out.println("Selecting the radio button");
	}
public static void main(String[] args) {
	Radiobutton object5 = new Radiobutton();
	object5.selectRadioButton();
	object5.Click();
	object5.settext(null);
	object5.submit();
}
}
