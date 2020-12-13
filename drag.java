import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class drag {
	
public static void main(String[] args) throws InterruptedException
	
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\india\\Desktop\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://formy-project.herokuapp.com/dragdrop");
	    
	     WebElement element1= driver.findElement(By.id("image"));
	     

	     WebElement element2= driver.findElement(By.id("box"));
	     
	     Actions ac = new Actions(driver);
	     Thread.sleep(2000);
	     ac.dragAndDrop(element1, element2).build().perform();
	     Thread.sleep(3000);
	     
	     driver.quit();
	    	 
	    
	}

}
