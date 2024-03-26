package Master;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddToCard {

	WebDriver driver;
	@Test
	
	public void test2() {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobiles");
		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[1]/div/div/div[1]/div[2]/div[1]/div/div[2]/a/span")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");

		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
		
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
//		d.click();
		
		//window handling
		Set<String>windowhand=driver.getWindowHandles();
		Iterator<String>it=windowhand.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		//driver.switchTo().window(child);
		
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,250)", "");
		
		WebElement firstname=driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span"));
		
		firstname.click();
		
		WebElement first=driver.findElement(By.xpath("/html/body/div[1]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[39]/div/div/span/span/input"));
        first.click();
		
		driver.switchTo();
	
	}
}