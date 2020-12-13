import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Switchtabs {
	
	public static void main(String[] args) throws InterruptedException
	{
	// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\india\\Desktop\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    
    driver.get("https://formy-project.herokuapp.com/switch-window");
    
    WebElement element = driver.findElement(By.id("new-tab-button"));
    
    Thread.sleep(3000);
    
    element.click();
    
    Thread.sleep(3000);
    
    String tab1 = driver.getWindowHandle();
    
    for(String tab2: driver.getWindowHandles())
    {
    	driver.switchTo().window(tab2);
    }
    
    Thread.sleep(3000);
    
    driver.switchTo().window(tab1);
    
    Thread.sleep(3000);
    driver.quit();
    
    
    
	}

}
