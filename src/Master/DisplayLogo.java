package Master;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DisplayLogo {

	WebDriver driver = null;

	@Test(priority = 1)
	public boolean displayLogo() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
			try {
				
				
				WebElement ele =driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));//element present
				if(ele.isDisplayed()) {
					System.out.println("pass");//visible
					//return true
					}
				else {
					System.out.println("fail");
					//return false
				}
				
			}catch (NoSuchElementException e) {  //not present
			return false;
				
			}
			return false;

	}
}