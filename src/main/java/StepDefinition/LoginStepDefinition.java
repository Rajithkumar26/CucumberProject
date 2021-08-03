package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {

WebDriver driver;
@Given("^User is already on login page$")
public void user_is_already_on_login_page() throws Throwable {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaibhav\\Downloads\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://ui.cogmento.com/");
}

@When("^title of login page is Free CRM$")
public void title_of_login_page_is_Free_CRM() throws Throwable {
	 String title = driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals("Cogmento CRM", title);
}

@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and(String username, String password) throws Throwable {
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\'ui\']/div/div/form/div/div[1]/div/input")).sendKeys(username);
	 driver.findElement(By.xpath("//*[@id=\'ui\']/div/div/form/div/div[2]/div/input")).sendKeys(password);
}

@Then("^user clicks on login button$")
public void user_clicks_on_login_button() throws Throwable {
	WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\'ui\']/div/div/form/div/div[3]"));
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", loginBtn);
}

@Then("^user is on home page$")
public void user_is_on_home_page() throws Throwable {
	String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
	 Assert.assertEquals("Cogmento CRM", title);
}
	
}
