package Master;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class amazonlogin {
	WebDriver driver;
	@BeforeClass
	public void setup() {
//		System.setProperty("webdriver.chrome.driver","/opt/chromedriver");

		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url() {
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		

}
//	@Test(priority=1)
//	public void Title() {
//	String expected="Myntra – log in or sign up";
//	String actual=driver.getTitle();
//	Assert.assertEquals(actual, expected,"This is mismatched");
//
//}
	@Test(priority=2)
	public void urlmatch() {
		String expected="https://www.amazon.in/";
		String actual=driver.getCurrentUrl();
		Assert.assertEquals(actual, expected,"This is mismatched"); 
	}
	@Test(priority=3)
	public void check_credentials() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
	driver.findElement(By.name("email")).sendKeys("manikandanpk3333@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("manikandan");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	//to check whether box is empty
	String actual=driver.findElement(By.name("email")).getAttribute("value");
	String expected="";
	Assert.assertEquals(actual, expected);
	
	//to check the error message
	String actualerrormsg=driver.findElement(By.xpath("//div[@id='email_container']/div[last()]")).getText();
	String expectederrormsg="The email address you entered isn't connected to an account. Find your account and log in.";
	Assert.assertEquals(actualerrormsg, expectederrormsg);
	}
}
