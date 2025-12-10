package Week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdownclassroom {
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
	 driver.findElement(By.linkText("Create Lead")).click();
	 
	 WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
	 Select select = new Select(element);
	 select.selectByIndex(4);
	 
	 WebElement elementA = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	 Select selectA = new Select(elementA);
	 selectA.selectByVisibleText("Automobile");
	 
	 WebElement elementB = driver.findElement(By.id("createLeadForm_dataSourceId"));
	 Select selectB = new Select(elementB);
	 selectB.selectByValue("OWN_CCORP");
	 
	 driver.findElement(By.className("smallSubmit")).click();

	 
	 
	 



}
}
