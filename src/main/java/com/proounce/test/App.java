package com.proounce.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "C:\\Testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		        //open application
		driver.get("http://localhost:3000/"); 
		        //login page
		WebElement var=driver.findElement(By.id("username"));
		var.sendKeys("SAEVANS");
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("welcome123"); 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div/form/label/span[1]/span[1]/input")).click();
		driver.findElement(By.xpath(".//*[@class='MuiButton-label']")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@title='AASF']")).click();
    }
}
