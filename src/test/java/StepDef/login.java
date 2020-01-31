package StepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
WebDriver driver;
@When("user launches chrome browser")

public void user_launches_chrome_browser() {
  System.out.println("Launch chrome browser");
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_c2a.04.30\\Desktop\\Selenium drivers\\chromedriver.exe");
  driver=new ChromeDriver();
}

@When("user navigates the application")
public void user_navigates_the_application() {
	driver.get("http://newtours.demoaut.com/");
	  System.out.println("Navigate the application");
}

@When("user enters the username")
public void user_enter_username() {
	
	driver.findElement(By.name("userName")).sendKeys("mercury");
			  System.out.println("Enter the mercury");
}

@When("user enters the password")
public void user_enters_the_password() {
	driver.findElement(By.name("password")).sendKeys("mercury");
	  System.out.println("Enter the password");
}

@When("user clicks on the login button")
public void user_clicks_on_the_login_button() {
	driver.findElement(By.name("login")).click();
	  System.out.println("Click on login");
}

@Then("validate login process")
public void validate_login_process() {
	String a=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).getText();
			Assert.assertEquals(a,"SIGN-OFF");
	  System.out.println("Validate login process");
	  
}
@Then("close the application")
public void close_the_application() {
   driver.close();
}


}
