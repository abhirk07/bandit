import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\india\\Desktop\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");
        
       WebElement element = driver.findElement(By.id("name"));
       
       element.click();
       
       element.sendKeys("Abhi");
       
       WebElement button = driver.findElement(By.id("button"));
       
       button.click();
       
       Thread.sleep(3000);
    	   

        driver.quit();
    }
}
