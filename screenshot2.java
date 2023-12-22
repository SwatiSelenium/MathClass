package MathClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class screenshot2 
{
	ChromeDriver driver;
	
	@BeforeMethod
	public void launch()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void case1()
	{
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("TATA cars");
		search.sendKeys(Keys.ENTER);
	}
	@Test
	public void case2()
	{
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Kia");
		search.sendKeys(Keys.ENTER);
	}
	
	@Test
	public void case3()
	{
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Toyota");
		search.sendKeys(Keys.ENTER);
	}
	@Test
	public void case4()
	{
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Ford");
		search.sendKeys(Keys.ENTER);
	}

	@Test
	public void case5()
	{
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Maruti");
		search.sendKeys(Keys.ENTER);
	} 
	@AfterMethod
	public void quit1() throws InterruptedException, IOException
	{
		ChromeDriver ts = driver;
		File source1 = driver.getScreenshotAs(OutputType.FILE);
		//File destination1 = new File("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\screenshot\\\\cars"+Math.random()+".png");
		File destination1 = new File("C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Selenium\\\\screenshot\\\\cars"+getClass()+".png");
		FileUtils.copyFile(source1, destination1);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
