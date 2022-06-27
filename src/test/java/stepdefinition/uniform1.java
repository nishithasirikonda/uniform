package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class uniform1 {
WebDriver driver;
	
	
	
	@Given("User is on homepage")
	public void user_is_on_homepage() {
    System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		
	    driver = new ChromeDriver();  //open my browser
		
		driver.get("http://uniformm1.upskills.in/admin/");
	}

	
	
	
	@When("User enter invalid credentials")
	public void user_enter_invalid_credentials() {
		driver.findElement(By.id("input-username")).sendKeys("Nishitha");
		driver.findElement(By.id("input-password")).sendKeys("Admin@123");
	}

	
	
	
	@When("User click on submit button")
	public void user_click_on_submit_button() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		{
			driver.quit();
	         Thread.sleep(2000);
		}
	}
	
	
	
	
	@Then("validation message appears")
	public void validation_message_appears() {
		

	}


	
	@When("User enter valid credentials")
	public void user_enter_valid_credentials() {
		driver.findElement(By.id("input-username")).sendKeys("admin");
		driver.findElement(By.id("input-password")).sendKeys("Admin@123");
	  
	}

	
	
	
	@When("click on submit button")
	public void click_on_submit_button()throws InterruptedException { 
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/ul[1]/li[7]/a[1]")).click();
	Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/ul[1]/li[7]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("input-name")).sendKeys("12");
		
		driver.findElement(By.id("input-code")).sendKeys("629dd8e1e60cd");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/button[1]")).click();	
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]")).click();
		driver.findElement(By.xpath("//button[@id='button-filter']")).click();
		driver.findElement(By.xpath("//td[@class='text-right']//a[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/i[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/ul[1]/li[4]/a[1]/i[1]")).click();	
		{
			driver.quit();
		}
		
	}

	
	
	
	@Then("User navigates to homepage")
	public void user_navigates_to_homepage() {
	 
	}
	
	
}


