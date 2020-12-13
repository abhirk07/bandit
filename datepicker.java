import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class datepicker {
	

public static void main(String[] args) throws InterruptedException
	
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\india\\Desktop\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://formy-project.herokuapp.com/datepicker");
	    
	    WebElement picker = driver.findElement(By.id("datepicker"));
	    Thread.sleep(2000);
	    picker.sendKeys("06/11/2020");
	    Thread.sleep(2000);
	    picker.sendKeys(Keys.RETURN);
	    Thread.sleep(2000);
	    
	    driver.quit();
	    
	    
	    
	    
	}
}
