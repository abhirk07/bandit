import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class dropdown {
	
public static void main(String[] args) throws InterruptedException
	
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\india\\Desktop\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://formy-project.herokuapp.com/dropdown");
	    
	    WebElement element1 = driver.findElement(By.id("dropdownMenuButton"));
	    Thread.sleep(1000);
	    element1.click();
	    
	    Thread.sleep(3000);
	    
	    Actions ac  = new Actions(driver);
	    
	    WebElement element2 = driver.findElement(By.xpath("/html/body/div/div/div/a[12]"));
	    ac.moveToElement(element2);
	    Thread.sleep(1000);
	    element2.click();
	    
	    Thread.sleep(2000);
	    
	    driver.quit();
	    		
	    
	}
	

}
