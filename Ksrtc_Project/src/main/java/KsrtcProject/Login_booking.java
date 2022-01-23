package KsrtcProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_booking {

	@Test
	public void ksrtc() throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\gayathri\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://ksrtc.in/oprs-web/login/show.do");
        driver.findElement(By.id("userName")).sendKeys("gayu69707@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Gayathri.123");
        driver.findElement(By.id("submitBtn")).click();
        driver.findElement(By.id("fromPlaceName")).sendKeys("BANGALORE");
		Thread.sleep(2000);
        Robot r1=new Robot();
        r1.keyPress(KeyEvent.VK_ENTER);
        r1.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        driver.findElement(By.id("toPlaceName")).sendKeys("Aatingal");
        Robot r2=new Robot();
        r2.keyPress(KeyEvent.VK_ENTER);
        r2.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000); 
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        jse.executeScript("document.getElementById('txtJourneyDate').value='27/01/2022'");
        jse.executeScript("document.getElementById('txtReturnJourneyDate').value='31/01/2022'");
        Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id='bookingsForm']/div[1]/div/div[2]/div[3]/button")).click(); 
		driver.quit();
		
		
		
	}
}
