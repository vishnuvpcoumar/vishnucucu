package casestudy_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;

public class code {
	WebDriver Driver;
	@Given("I want to login as admin")
	public void i_want_to_login_as_admin() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\Selium 3.0\\chromedriver.exe" ); 
		  Driver=new ChromeDriver();
		  Driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	      Driver.manage().window().maximize();
	  	 Driver.findElement(By.cssSelector("#header > div:nth-child(1) > div > div > div.col-sm-8 > div > ul > li:nth-child(1) > a")).click();;
		 Driver.findElement(By.name("userName")).sendKeys("admin");
		 Driver.findElement(By.name("password")).sendKeys("password456");
		
	
	}

	@Given("i want to enter category name")
	public void i_want_to_enter_category_name() {
		 Driver.findElement(By.name("Login")).submit();
		 Driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/button/h4")).click();
	  
	}

	@Given("i want to enter subcategory name")
	public void i_want_to_enter_subcategory_name() {
		Actions b=new Actions(Driver);
		Driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[1]/div")).click();
		b.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    
	}

	@Given("enter product name as {string}")
	public void enter_product_name_as(String string) {
		Driver.findElement(By.xpath("//*[@id=\"prodid\"]")).sendKeys(string);
	
	}

	@Given("enter price as {string}")
	public void enter_price_as(String string) {
		Driver.findElement(By.xpath("//*[@id=\"priceid\"]")).sendKeys(string);
	}

	@Given("enter quantity as {string}")
	public void enter_quantity_as(String string) {
		Driver.findElement(By.xpath("//*[@id=\"quantityid\"]")).sendKeys(string);
		   
	}

	@Given("enter brand as {string}")
	public void enter_brand_as(String string) {
		Driver.findElement(By.xpath("//*[@id=\"brandid\"]")).sendKeys(string);
	}

	@Given("enter description as {string}")
	public void enter_description_as(String string) {
		Driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys(string);
		Driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")).click(); 
		Driver.findElement(By.linkText("SignOut")).click();
	}




}
