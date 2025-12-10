package Week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class EditleadAssignment {public static void main(String[] args) {
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
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.xpath("//input[@id= 'createLeadForm_companyName']")).sendKeys("Testleaf");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Kaviya");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Gokul");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Kav");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation tester");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kaviya0805@gmail.com");
	
    WebElement element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select Province = new Select(element);
	Province.selectByVisibleText("New York");
	
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.name("description")).clear();
    driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("life is good");
    driver.findElement(By.className("smallSubmit")).click();
    System.out.println("Page Title after Update: " + driver.getTitle());
    driver.close();
	
	
	}
}