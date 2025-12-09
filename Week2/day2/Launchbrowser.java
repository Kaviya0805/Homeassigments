package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {
	
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();

	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
	Thread.sleep(3000);
	
	driver.findElement(By.id("pass")).sendKeys("Tuna@321");
	Thread.sleep(3000);
	
	driver.findElement(By.name("login")).click();
	
	String title = driver.getTitle();
	System.out.println(title);
	
}
}
