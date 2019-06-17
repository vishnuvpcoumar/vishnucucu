package casestudy_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class casestudycode {
	WebDriver Driver;
	
	
	//Case_1
	
	@Given("I enters to homepage")
	public void i_enters_to_homepage() {

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\Selium 3.0\\chromedriver.exe" ); 
		  Driver=new ChromeDriver();
		  Driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	      Driver.manage().window().maximize();
	}
	@Given("I enter ad_username")
	public void i_enter_ad_username() {
		Driver.findElement(By.cssSelector("#header > div:nth-child(1) > div > div > div.col-sm-8 > div > ul > li:nth-child(1) > a")).click();;
		 Driver.findElement(By.name("userName")).sendKeys("admin");
		
		
	   
	}

	@Given("I enter ad_password")
	public void i_enter_ad_password() {
		 Driver.findElement(By.name("password")).sendKeys("password456");
	    
	}

	@Then("I click on ad_login")
	public void i_click_on_ad_login() {
		 Driver.findElement(By.name("Login")).submit();
	  
	}

	@Then("I enters add products")
	public void i_enters_add_products() {
		
		 WebDriverWait wait=new WebDriverWait(Driver,100);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > main > div > div > div > div:nth-child(1) > button")));
		Driver.findElement(By.cssSelector("body > main > div > div > div > div:nth-child(1) > button > span")).click();
		//Driver.findElement(By.cssSelector("body > main > div > div > div > div:nth-child(1) > button")).click();
		
	
	    
	}

	@Then("i enters details")
	public void i_enters_details() {


Actions b= new Actions(Driver);
		  Driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[1]/div")).click();
		  b.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		  Driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[2]/div")).click();
		  b.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	  Driver.findElement(By.xpath("//*[@id=\"prodid\"]")).sendKeys("Laptop");
	  Driver.findElement(By.xpath("//*[@id=\"priceid\"]")).sendKeys("80,000");
	  Driver.findElement(By.xpath("//*[@id=\"quantityid\"]")).sendKeys("1");
	  Driver.findElement(By.xpath("//*[@id=\"brandid\"]")).sendKeys("hp1");
	  Driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("laptops for office purpose");
	  Driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")).submit();
		 Driver.findElement(By.linkText("SignOut")).click();
	 
	}

	
		 
	
	@Given("I Click on proceed to pay")
	public void i_Click_on_proceed_to_pay() {
		 WebDriverWait wait=new WebDriverWait(Driver,50);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#header > div:nth-child(1) > div > div > div.col-sm-8 > div > ul > li:nth-child(1) > a")));
		 Driver.findElement(By.linkText("SignIn")).click();
		 Driver.findElement(By.name("userName")).sendKeys("Lalitha");
		 Driver.findElement(By.name("password")).sendKeys("password123");
		 Driver.findElement(By.name("Login")).submit();
		 WebElement search=Driver.findElement(By.name("products"));
			search.sendKeys("HeadPhone");
			Driver.findElement(By.cssSelector("body > div.col-md-12.col-sm-12.col-xs-12 > form > input[type=submit]")).click();
			Driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9 > div > div > div > div:nth-child(3) > center > a")).click();
			Driver.findElement(By.cssSelector("#header > div.header-middle > div > div > div.col-sm-8 > div > a:nth-child(2)")).click();
			Driver.findElement(By.cssSelector("#cart > tfoot > tr:nth-child(2) > td:nth-child(5) > a")).click();
			Driver.findElement(By.cssSelector("body > b > div > div > div.col-lg-6.col-md-6.col-sm-6.col-xs-12.col-md-push-6.col-sm-push-6 > div > div.panel-body > div:nth-child(4) > div > form:nth-child(2) > input")).click();
			  WebDriverWait wa=new WebDriverWait(Driver,50);
				 wa.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#btn")));
				 Driver.findElement(By.cssSelector("#swit > div:nth-child(2) > div > label > i")).click();
				 Driver.findElement(By.id("btn")).click();
					Driver.findElement(By.name("username")).sendKeys("Lalitha");
					 Driver.findElement(By.name("password")).sendKeys("password123");
					 Driver.findElement(By.cssSelector("input[type='submit']")).submit();
					 Driver.close();
	}


}
