package Week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Deleteleads {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--guest");
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("label")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("12345678");
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("10069")).click();
		driver.findElement(By.linkText("Delete"));
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("id")).sendKeys("10069");
		

		
		

		
	}

}
