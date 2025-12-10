package Week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccwithSelect {

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
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Kaviya");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement element = driver.findElement(By.name("industryEnumId"));
		Select options = new Select(element);
		options.selectByVisibleText("Computer Software");
		
		WebElement element2 = driver.findElement(By.name("ownershipEnumId"));
		Select options1 = new Select(element2);
		options1.selectByVisibleText("S-Corporation");
		
		WebElement element3 = driver.findElement(By.name("dataSourceId"));
		Select options2 = new Select(element3);
		options2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement element4 = driver.findElement(By.name("marketingCampaignId"));
		Select options3 = new Select(element4);
		options3.selectByIndex(5);
		
		WebElement element5 = driver.findElement(By.name("generalStateProvinceGeoId"));
		 Select options4 = new Select (element5);
		 options4.selectByValue("TX");
		 
		 driver.findElement(By.className("smallSubmit")).click();
		 String title = driver.getTitle();
		 System.out.println(title);
		 driver.close();
	}

}
