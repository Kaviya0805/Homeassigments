package Week3day1;

public class Safari extends Chrome {
public void readermode()
{
	System.out.println("the screen is in reader mode");
}
public void fullscreen()
{
	System.out.println("the screen in full screen");
}
public static void main(String[] args) {
	Safari object3 = new Safari();
	object3.readermode();
	object3.clearcache();
	object3.closebrowser();
	object3.openurl();
}
}
