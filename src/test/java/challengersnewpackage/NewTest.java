package challengersnewpackage;

//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;	
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class NewTest {		
	
	//initialize the driver
    private WebDriver driver;
    long start;
    long finish;
    @Test				
	public void testEasy() {	
    	long start = System.currentTimeMillis();

		driver.get("http://kamalkarki.com"); 
		long finish = System.currentTimeMillis();
		long totalTime = finish - start;
		System.out.println("Loading Time: "+totalTime);
		
		//get the title of kamalkarki.com page
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Kamal Karki || Developer")); 		
	}	
	@BeforeTest
	public void beforeTest() {	
		System.setProperty("webdriver.chrome.driver","C:/geckodriver/chromedriver.exe");
	    driver = new ChromeDriver(); 
	    
	}
	@AfterTest
	public void afterTest() {
		

		driver.quit();

	}		
}

//public class NewTest {
	 
	//public WebDriver driver;
 
 // @Test
 
  //public void main() {
 
	// Find the element that's ID attribute is 'account'(My Account)
 
    //  driver.findElement(By.id("account")).click();
 
      // Find the element that's ID attribute is 'log' (Username)
 
      // Enter Username on the element found by above desc.
 
   //   driver.findElement(By.id("log")).sendKeys("testuser_1");
 //
      // Find the element that's ID attribute is 'pwd' (Password)
 
      // Enter Password on the element found by the above desc.
 
     // driver.findElement(By.id("pwd")).sendKeys("Test@123");
 
      // Now submit the form. WebDriver will find the form for us from the element
 
      //driver.findElement(By.id("login")).click();
 
      // Print a Log In message to the screen
 
      //System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
 
      // Find the element that's ID attribute is 'account_logout' (Log Out)
 
      //driver.findElement(By.id("account_logout"));
 
  //}
 
  //@BeforeTest
 
  //public void beforeMethod() {
 
	  // Create a new instance of the Firefox driver
 
    //  driver = new FirefoxDriver();
 
      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
      //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
      //Launch the Online Store Website
 
    //  driver.get("http://www.onlinestore.toolsqa.wpengine.com");
 
  //}
 
  //@AfterTest
 
  //public void afterMethod() {
 
	  // Close the driver
 
    //  driver.quit();
 
  //}
 
//}