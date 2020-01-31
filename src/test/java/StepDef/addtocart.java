package StepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class addtocart {
	WebDriver driver;
	@When("chrome browser is launched")
	public void chrome_browser_is_launched() {
	    System.out.println("Launch chrome browser");
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_c2a.04.30\\Desktop\\Selenium drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	}

	@When("application is navigated")
	public void application_is_navigated() {
	   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#/");
	   System.out.println("Navigates the application");
	   driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@When("username is entered")
	public void username_is_entered() {
	   driver.findElement(By.name("userName")).sendKeys("Lalitha");
	   System.out.println("Enter username Lalitha");
	}

	@When("password is entered")
	public void password_is_entered() {
	   driver.findElement(By.name("password")).sendKeys("Password123");
	   System.out.println("Enter password Password123");
	}

	@When("login button is clicked")
	public void login_button_is_clicked() {
		   driver.findElement(By.name("Login")).click();
		   System.out.println("Click on login");
	}

	@When("user finds and adds the product to cart")
	public void user_finds_and_adds_the_product_to_cart() {
		driver.findElement(By.name("products")).sendKeys("head");
		driver.findElement(By.xpath("//input[@name='val' and @value='FIND DETAILS']")).click();
		
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	    
	}

	@When("the cart is validated")
	public void the_cart_is_validated() {
         driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
         String a=driver.findElement(By.id("demo")).getText();
         Assert.assertEquals(a, "Shopping cart");
         System.out.println("product added to cart");         
 	}

	@Then("application is closed")
	public void application_is_closed() {
		driver.close();
	 
	}


}
