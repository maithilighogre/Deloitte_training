import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class datadriven {
	public static void main(String args[]) throws IOException{
		String str = null;
		try{
			FileInputStream f1= new FileInputStream("C:\\test\\test.xlsx");
			XSSFWorkbook wb= new XSSFWorkbook(f1);
			XSSFSheet sh=wb.getSheetAt(0);
			Row r=sh.getRow(0);
			Cell c=r.getCell(0);
			str=c.toString();
			System.out.println(c);
			System.setProperty("webdriver.chrome.driver","c:\\chromedriver\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
//			driver.get(str);
//			f1.close();
			
//            Cell cell = r.createCell(1);
//            
//            WebElement w=driver.findElement(By.id("banner_cta_button"));
//            String extracted = w.getText();
//            System.out.println(extracted);
//            cell.setCellValue(extracted);
//            FileOutputStream fos = new FileOutputStream("C:\\test\\test.xlsx");
//            wb.write(fos);
//            fos.close();
			
			driver.get("http://www.indiatoday.in");
			driver.switchTo().alert().dismiss();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
