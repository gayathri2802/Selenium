package Steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ksrtcSript {
    
	static WebDriver driver;
	
	@Given("Open the chrome browser and url of ksrtc page")
	public void open_the_chrome_browser_and_url_of_ksrtc_page() {

        System.setProperty("webdriver.chrome.driver", "C:\\gayathri\\driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://ksrtc.in/oprs-web/login/show.do");
		System.out.println("Given done");
	}
	@When("enter valid username and password")
	public void enter_valid_username_and_password() {
		
		 driver.findElement(By.id("userName")).sendKeys("gayu69707@gmail.com");
         driver.findElement(By.id("password")).sendKeys("Gayathri.123");
		
		System.out.println("When done");
	}
	@Then("login successful")
	public void login_successful() {
	    driver.findElement(By.id("submitBtn")).click();
		System.out.println("then done");
	}
   
	@Given("enter From Location,To location")
	public void enter_from_location_to_location() throws AWTException, InterruptedException {
		
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
		System.out.println("2nd Given done");
	}
	@When("Enter Date of departure and Date of return")
	public void enter_date_of_departure_and_date_of_return() throws InterruptedException {
		 JavascriptExecutor jse= (JavascriptExecutor) driver;
         jse.executeScript("document.getElementById('txtJourneyDate').value='27/01/2022'");
         jse.executeScript("document.getElementById('txtReturnJourneyDate').value='31/01/2022'");
         Thread.sleep(2000);
		 System.out.println("2nd when done");
	}
	@Then("click on Search for bus button")
	public void click_on_search_for_bus_button() {
		driver.findElement(By.xpath("//*[@id='bookingsForm']/div[1]/div/div[2]/div[3]/button")).click(); 
		System.out.println("2nd then done");
		driver.quit();
	}

}
