import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class AutoComplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\india\\Desktop\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        
       WebElement element = driver.findElement(By.id("autocomplete"));
       
       element.sendKeys("Ujjanipura");
       
       Thread.sleep(2000);
       
       WebElement suggestion = driver.findElement(By.className("pac-item"));
       
       suggestion.click();
       
       Thread.sleep(3000);
        
        driver.quit();
        
        
        
    }
    
}