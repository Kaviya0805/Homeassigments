package Week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebookhome {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--guest");
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();

		driver.get("https://en-gb.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kaviya");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gokul");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("kaviya@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Kaviya0805");
        
        WebElement element = driver.findElement(By.name("birthday_day"));
        Select day = new Select(element);
        day.selectByIndex(7);
        
        WebElement element2 = driver.findElement(By.name("birthday_month"));
        Select month = new Select(element2);
        month.selectByIndex(4);
        
        WebElement element3 = driver.findElement(By.name("birthday_year"));
        Select year = new Select(element3);
        
        driver.findElement(By.xpath("//input[@id='sex']")).click();
        year.selectByContainsVisibleText("1999");
        
        
        

	
}

}
