package seleniumtasks;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddif {



	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
	}
	@Test
	public void set() throws InterruptedException
{
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles",Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[4]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='nav-tools']/a[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='a-page']/a[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("h4ghfgmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='nav-left']/a[1]")).click();
	}
	
}