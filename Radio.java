import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Radio {
public static void main(String[] args) throws InterruptedException
	
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\india\\Desktop\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://formy-project.herokuapp.com/radiobutton");
	    
	    WebElement rdbtn1 = driver.findElement(By.id("radio-button-1"));
	    		rdbtn1.click();
	    		
	    		Thread.sleep(2000);
	    		
	    WebElement rdbtn2 = driver.findElement(By.cssSelector("input[value='option2']"));
	    rdbtn2.click();
	    
	    Thread.sleep(2000);
	    
	    WebElement rdbtn3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
	    rdbtn3.click();
	    
	    Thread.sleep(2000);
	    
	    driver.quit();
	    
	
  
   }

}
