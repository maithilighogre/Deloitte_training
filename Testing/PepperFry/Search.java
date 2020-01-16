import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pepperfry.com/");
		driver.manage().window().maximize();
		WebElement click = driver.findElement(By.id("search"));
		click.sendKeys("Bed");
		click.submit();		
		WebElement chkbox = driver.findElement(By.xpath(
				"//html//body//div[2]//div[2]//div[1]//div[2]//div[5]//div[3]//div//div[1]//div[1]//div[2]//ul//div//div[1]//li[1]//label"));
		chkbox.click();
	}
}
