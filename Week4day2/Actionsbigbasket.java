package Week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Actionsbigbasket {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--guest");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:Ramkj6:']")).click();
		WebElement Mouseto = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
       Actions act = new Actions(driver);	
       act.moveToElement(Mouseto).perform();
       driver.findElement(By.xpath("(//a[text()='Rice & Rice Products'])[2]")).click();
       driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
       driver.findElement(By.xpath("//input[@id='i-bbRoyal']")).click();
       
       
	
	}

}
