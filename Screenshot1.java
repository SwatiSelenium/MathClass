package MathClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot1 
{
	ChromeDriver driver;
	@Test
	public void screenshot_first() throws IOException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
	// step 1 - upcasting	
		TakesScreenshot ts = driver;
	// step 2
		File source = ts.getScreenshotAs(OutputType.FILE);
	//step 3
		File desitination = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\screenshot\\swati.png");
	// step 4
		FileUtils.copyFile(source, desitination);
	}
		
}
