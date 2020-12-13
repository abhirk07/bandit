import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class addtwo {
	
	public static void main(String[] args) throws InterruptedException
	{
	// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\india\\Desktop\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
    
    Actions action = new Actions(driver);
    
    WebElement element1 = driver.findElement(By.id("sum1"));
    action.moveToElement(element1);
    element1.click();
    element1.sendKeys("20");
    
    Thread.sleep(3000);
	
    WebElement element2 = driver.findElement(By.id("sum2"));
    element2.click();
    element2.sendKeys("30");
    
    Thread.sleep(3000);
    
    WebElement button = driver.findElement(By.className("btn btn-default"));
    button.click();
    
    Thread.sleep(5000);
    
    driver.quit();
    
	}

}
