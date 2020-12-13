import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class checkbox {
	
public static void main(String[] args) throws InterruptedException
	
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\india\\Desktop\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://formy-project.herokuapp.com/checkbox");
	    
	    WebElement cb1 = driver.findElement(By.id("checkbox-1"));
	    cb1.click();
	    Thread.sleep(2000);
	    
	    WebElement cb2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
	    cb2.click();
	    Thread.sleep(2000);
	    
	    WebElement cb3 = driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
	    cb3.click();
	    Thread.sleep(2000);
	    
	    driver.quit();
	    
	}

}
