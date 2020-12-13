package PageObject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;

public class form {

	
	 public static void main(String[] args) throws InterruptedException {

	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\india\\Desktop\\Selenium\\selenium-java-3.141.59\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        driver.get("https://formy-project.herokuapp.com/form");
	      	             
	        form1.submit(driver);
	        form2.waitpage(driver);
	        form2.extract(driver);
	         
	        assertEquals("The form was successfully submitted!",form2.extract(driver)); 
	   
	        driver.quit();        
	 	        
 }
	 
	
	 
	 
}
