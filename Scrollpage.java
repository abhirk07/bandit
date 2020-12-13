import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Scrollpage {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\india\\Desktop\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://formy-project.herokuapp.com/scroll");
        
        Actions ac = new Actions(driver);
        
        WebElement element = driver.findElement(By.id("name"));
        
        ac.moveToElement(element);
        
        element.sendKeys("Abhi");
        
        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/02/2020");
        
        Thread.sleep(1000);
        
        driver.quit();
        
        driver.quit();
        
        
	}
	

}
