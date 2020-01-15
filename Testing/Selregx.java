import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Selregx {
	public static void main(String args[]){
//		String regx="TestMatch 2020 NewWorldOrder";
//		if(regx.matches("Test[A-Z]...202[0-9].")){
//			System.out.println(true);
//		}
//		else
//			System.out.println(true);
		
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement we= driver.findElement(By.xpath("//*[@id='gbqfq']"));
		we.sendKeys("not able to see sponsered links on google search");
		driver.findElement(By.xpath("//*[@id='gbqfq']")).click();
		List<WebElement> allElements = driver.findElements(By.xpath("//hs/a"));
		for(WebElement element: allElements){
			allElements.size();
			System.out.println(element.getText());
		}
	}
}
