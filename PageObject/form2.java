package PageObject;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class form2 {
	
	public static void waitpage(WebDriver driver)
	 {

	      WebDriverWait wait = new WebDriverWait(driver,5);
	      
	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
	      
	 }
	 
	 public static String extract(WebDriver driver)
	 {
		 return driver.findElement(By.className("alert")).getText();
	      	 
	 }

}
