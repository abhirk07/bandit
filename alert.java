import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class alert {
	
	public static void main(String[] args) throws InterruptedException
	
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\india\\Desktop\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://formy-project.herokuapp.com/switch-window");
	 
	    WebElement element = driver.findElement(By.id("alert-button"));
	    Thread.sleep(1000);
	    element.click(); 
	    
	    Alert al = driver.switchTo().alert();
	    Thread.sleep(3000);
	    al.accept();
	    Thread.sleep(1000);
	    
	    
	    driver.quit();
	    
	    
	    
	}

}
