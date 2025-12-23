package Week4day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsAmazonhome {
	public static void main(String[] args) throws IOException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--guest");
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//button[@class='a-button-text']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro" ,Keys.ENTER);
		driver.findElement(By.xpath("//span[@class='a-price-whole']")).click();
	    Set<String> Firstproduct = driver.getWindowHandles();
	    List<String> Firstproductprice = new ArrayList<String>(Firstproduct);
	    System.out.println(Firstproductprice);
	    driver.switchTo().window(Firstproductprice.get(1));
	    String Productprice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[6]")).getText();
	    System.out.println(Productprice);
	    WebElement ScrollElement = driver.findElement(By.xpath("(//span[@class='a-size-base a-color-secondary'])[7]"));
	    Actions act = new Actions(driver);
	    act.scrollToElement(ScrollElement).perform();
	    String Customer = ScrollElement.getText();
	    System.out.println(Customer);
	    File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
	    File Target = new File("./data/Sample2.png");
	    FileUtils.copyFile(screenshotAs, Target);
	    driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
	    String Subtotal = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
	    System.out.println(Subtotal);
	    driver.close();
	}

}
