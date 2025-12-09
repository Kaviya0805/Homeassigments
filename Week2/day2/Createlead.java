package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Createlead {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--guest");
		ChromeDriver driver=new ChromeDriver(option);
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/");
		 driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("label")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kaviya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sundaramurthy");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Title");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	 
		
	}
}
