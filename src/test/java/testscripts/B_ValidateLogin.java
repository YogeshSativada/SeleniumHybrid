package testscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class B_ValidateLogin extends BaseTest {
	
	
	@Test
	public void validateLoginTest1() throws IOException, InterruptedException
	{
				
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("yogesh6855");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Target@2025");
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");
		
			
	}
	
	@Test
	public void validateLoginTest2() throws IOException, InterruptedException
	{
				
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz009");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz456");
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
		
			
	}
	
	@Test
	public void validateLoginTest3() throws IOException, InterruptedException
	{
				
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz1245");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Target@2025");
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
		
			
	}
	
	@Test
	public void validateLoginTest4() throws IOException, InterruptedException
	{
				
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("yogesh6855");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz456");
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
		
			
	}

}
