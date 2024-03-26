package Master;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class over {
	public static WebDriver driver;

//	public static void main(String[] ) {
		@BeforeMethod
		public void beforemethod() {
		driver =new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		}
		
		@Test
		public void test() {
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		Actions action =new Actions(driver);
		
         WebElement log = null;
         
		action.moveToElement(log).perform();
		
		driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(6)")).click();
		WebElement text =driver.findElement(By.xpath("//*[@id=\"contentGrid_105852\"]/div/div[6]/div[1]/div/div/a/img"));
	
		System.out.println(text);
		if (text.isDisplayed())
		{
			System.out.println("Redmi RC is present");
			
		}
		else
			System.out.println("Redmi RC is not present");
		}
		@AfterMethod
		public void aftermethod() {
			driver.quit();
			
		}
		
		
		
		

	}

