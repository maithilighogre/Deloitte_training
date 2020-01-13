import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.*;

public class SeleniumWebDriver {
	private static String fileWithPath;
	public static void main(String args[]) throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver\\chromedriver.exe");
				DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver= new ChromeDriver();
		
//		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
//		driver.findElement(By.linkText("Profile")).click();
//		driver.findElement(By.linkText("log in")).click();
//		driver.findElement(By.name("email")).sendKeys("Hello");
		
//		driver.get("https://www.myntra.com/accessories?f=Brand%3AStudio%20Voylla%2CVoylla%3A%3ACategories%3AEarrings&sort=new");
//		driver.findElement(By.className("common-checkboxIndicator")).click();
//			WebElement chkbox=driver.findElement(By.name("Earrings"));
//			chkbox.click();
//			if(chkbox.isSelected()){
//				System.out.println("Checked");
//			}
//			
//			driver.get("https://www.myntra.com/accessories?f=Brand%3AStudio%20Voylla%2CVoylla%3A%3ACategories%3AEarrings&sort=new");
//			driver.findElement(By.className("common-checkboxIndicator")).click();
//				WebElement chkbox=driver.findElement(By.xpath("/html/body/div[2]/div/main/div[3]/div[1]/section/div/div[2]/ul/li[1]/label/text()"));
//				chkbox.click();
//				if(chkbox.isSelected()){
//					System.out.println("Checked");
//				}
		
//		driver.get("https://www.myntra.com/accessories");
//		driver.findElement(By.className("discount-list")).click();
//		driver.findElement(By.className("discount-input")).click();
//			WebElement rad=driver.findElement(By.name("discount-product"));
//			rad.click();
//			if(rad.isSelected()){
//				System.out.println("Checked");
//			}
			
			
		
//		driver.get("https://www.myntra.com/shoe");
//		driver.findElement(By.className("sort-sortBy")).click();
//		driver.findElement(By.className("sort-label")).click();
//			Select sel=new Select(driver.findElement(By.id("new")));
//			sel.selectByVisibleText("What's New");
	
	
//		driver.get("https://www.myntra.com");
//		driver.findElement(By.cssSelector("#mountRoot > div > div > div > form > fieldset.register-input-container > div:nth-child(3) > input"));
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("c:/SeleniumWorkspace/error.png"));
		
	
	}

}
