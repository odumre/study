package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Demo {
static WebDriver driver;
@BeforeMethod
	public static void setUp() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Yaden\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
	driver = new EdgeDriver();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.facebook.com");
	String pageTitle = driver.getTitle();
		System.out.println("hello");
	Assert.assertEquals(pageTitle, "facebook");
	

}
@Test
public void testNg() {
	
}

}
