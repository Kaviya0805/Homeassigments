package Week4day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Actionclassroom {
public static void main(String[] args) throws IOException {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--guest");
	ChromeDriver driver=new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//button[@class='a-button-text']")).click();
	WebElement Scrollto = driver.findElement(By.xpath("//a[@class='nav_a'][contains(text(),'Conditions of Use & Sale')]"));
	Actions act = new Actions(driver);
	act.scrollToElement(Scrollto).perform();
	String text = Scrollto.getText();
	System.out.println(text);
	File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
	File targert = new File("./data/sample1.png");
	FileUtils.copyFile(screenshotAs, targert);
	driver.close();
	

}
}
