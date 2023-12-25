package Demo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SimplilearnAutomationTest {
	
	private WebDriver driver;
	 @BeforeClass
	 public void setUp() {
	 // Set the path to the ChromeDriver executable
	 System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 }
	 @AfterClass
	 public void tearDown() {
	 driver.quit();
	 }
	 @Test
	 public void verifyAutomationTestEngineer() {
	 // Navigate to the application - https://www.simplilearn.com/
	 driver.get("https://www.simplilearn.com/");
	 // Hover the pointer over 'All Courses'
	 WebElement allCourses = driver.findElement(By.linkText("All Courses"));
	 hoverOverElement(allCourses);
	 // Hover the pointer over 'Software Development'
	 WebElement softwareDevelopment = driver.findElement(By.linkText("Software Development"));
	 hoverOverElement(softwareDevelopment);
	 // Click on 'Automation Testing Masters Program'
	 WebElement automationTesting = driver.findElement(By.linkText("Automation Testing Masters 
	Program"));
	 automationTesting.click();
	 // Verify the text ‘Automation Test Engineer' is visible on the next page
	 WebElement pageTitle = driver.findElement(By.xpath("//h1[contains(text(), 'Automation Test 
	Engineer')]"));
	 Assert.assertTrue(pageTitle.isDisplayed(), "Text 'Automation Test Engineer' is not visible.");
	 }
	 // Helper method to perform hover over an element
	 private void hoverOverElement(WebElement element) {
	 org.openqa.selenium.interactions.Actions action = new 
	org.openqa.selenium.interactions.Actions(driver);
	 action.moveToElement(element).build().perform();
	 }


}
