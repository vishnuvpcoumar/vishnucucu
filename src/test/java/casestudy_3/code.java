package casestudy_3;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

public class code {
	WebDriver driver;
	@Given("I Enters username")
	public void i_Enters_username() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	     driver.manage().window().maximize();driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("admin");
	  
	}

	@Given("I Enters password")
	public void i_Enters_password() {
		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password456");
	   
	}

	@Then("I Enters Login")
	public void i_Enters_Login() {
		driver.findElement(By.name("Login")).submit();
	  
	}

	@Then("I clicks on Add New Poduct")
	public void i_clicks_on_Add_New_Poduct() {
		 driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button/h4")).click();
		 Actions b=new Actions(driver);
			driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[1]/div")).click();
			b.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	   
	}

	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String string) {
		driver.findElement(By.xpath("//*[@id=\"prodid\"]")).sendKeys(string);
	    
	}
	

	@When("I check for the {string} in step")
	public void i_check_for_the_in_step(String string) {
		driver.findElement(By.xpath("//*[@id=\"priceid\"]")).sendKeys(string);
		
	}
	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String string) {
		driver.findElement(By.xpath("//*[@id=\"quantityid\"]")).sendKeys(string);
		driver.findElement(By.xpath("//*[@id=\"brandid\"]")).sendKeys("nike");
		driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("ball");
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")).click();
		driver.close();
	}



	

}
