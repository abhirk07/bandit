package PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class form1 {
	
	 public static void submit(WebDriver driver)
	 {
		 driver.findElement(By.id("first-name")).sendKeys("Abhinandan");
	      
	      driver.findElement(By.id("last-name")).sendKeys("R");
	      
	      driver.findElement(By.id("job-title")).sendKeys("Automation Engineer");
	      
	      driver.findElement(By.id("radio-button-1")).click();
	      
	      driver.findElement(By.id("checkbox-1")).click();
	      
	      driver.findElement(By.id("select-menu")).click();
	     
	      driver.findElement(By.xpath("//*[@id=\"select-menu\"]/option[4]")).click();
	      
	   	      
	      driver.findElement(By.id("datepicker")).sendKeys("12/12/2020");
	     
	      driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
	            
	      
	      driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();
	     
	 }

}
