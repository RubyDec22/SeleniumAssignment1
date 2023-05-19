package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewAccount {
	
WebDriver driver;
	
	@Before 
	
	public void init() {
		
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	   @Test
	   public void launch() {
		   driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		   driver.findElement(By.id("password")).sendKeys("abc123");
		   
	   }
	   @Test
	   public void login() throws InterruptedException {
		   driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		   driver.findElement(By.id("password")).sendKeys("abc123");
		   driver.findElement(By.name("login")).click();
		   
		   Thread.sleep(300);
		   
		   driver.findElement(By.xpath("//span[@class = 'nav-label']"));
		   
		   Thread.sleep(300);
		   driver.get("https://techfios.com/billing/?ng=accounts/add/\">New Account/");
		   
		   Thread.sleep(300);
		   driver.findElement(By.id("account")).sendKeys("Ruby");
		   
		   Thread.sleep(300);
		   driver.findElement(By.id("description")).sendKeys("Add Account");
		   
		   Thread.sleep(300);
		   driver.findElement(By.id("balance")).sendKeys("6,000");
		   
		   Thread.sleep(300);
		   driver.findElement(By.id("account_number")).sendKeys("1653249");
		   
		   Thread.sleep(300);
		   driver.findElement(By.id("contact_person")).sendKeys("Ruby Kwatra");
		   
		   Thread.sleep(300);
		   driver.findElement(By.id("contact_phone")).sendKeys("309-325-9010");
		   
		   Thread.sleep(500);
		   driver.findElement(By.id("ib_url")).sendKeys("https://www.techfios.com/");
		   
		   Thread.sleep(300);
		   driver.findElement(By.xpath("//button[@class= 'btn btn-primary']")).click();
		   
	   }
	   @After
	   public void Browser() throws InterruptedException {
		   Thread.sleep(12000);
		   driver.close();
		   
	   }
	   
}




