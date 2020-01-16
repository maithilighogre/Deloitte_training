import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pepperfry.com/site_product/search?q=Bed&as=0&src=os");
		driver.manage().window().maximize();
		// driver.get("https://www.pepperfry.com/");
		WebElement chkbox = driver.findElement(By.xpath(
				"//html//body//div[2]//div[2]//div[1]//div[2]//div[5]//div[3]//div//div[1]//div[1]//div[2]//ul//div//div[1]//li[1]//label"));
		chkbox.click();

		// Select sel=new Select(driver.findElement(By.id("curSortType")));
		// sel.selectByVisibleText("Price: Low to High");
		// driver.findElement(By.linkText("Living")).click();
		// driver.findElement(By.className("hvr-col-head")).click();
		// driver.findElement(By.linkText("Settees")).click();

	}

}
