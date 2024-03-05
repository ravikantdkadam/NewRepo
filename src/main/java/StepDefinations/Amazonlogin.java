//package StepDefinations;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class Amazonlogin {
//	
//	static WebDriver driver;
//
//	@Given("^User is already on login page$")   // precondition 
//	
//	public void User_is_already_on_login_page() {
//		
//
//		System.setProperty("webdriver.Chrome.driver","D:\\Testing\\Automation Testing\\chromedriver.exe");
//		
//		   driver =new ChromeDriver();  
//	      
//	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	      
//	      driver.get("https://www.amazon.in/");
//	      
//	    driver.findElement(By.id("nav-link-accountList")).click();
//
//}
//	
//	@When("^Title of login page is Amazon Sign In$")
//	public void title_of_login_page_is_Amazon_Sign_In() {
//		
//		
//		 String Title = driver.getTitle();
//			Assert.assertEquals("Amazon Sign In", Title);
//		
//
//	    
//	}
//	
//	@Then("^User enters \"(.*)\"$")
//	public void user_enters(String username) {
//		
//		driver.findElement(By.name("email")).sendKeys(username);
//		
//	}
//
//	@Then("User clicks on Continue button$")
//	public void user_clicks_on_continue_button() {
//		
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//	  
//	}
//
//	@Then("^User enter the \"(.*)\"$")
//	public void user_enter_the(String Password) {
//		
//		driver.findElement(By.name("password")).sendKeys(Password);
//
//	}
//
//	@Then("^User click on signin Button$")
//	public void user_click_on_signin_button() {
//		
//		driver.findElement(By.id("signInSubmit")).click();
//	}
//
//	@Then("^user is on homepage$")
//	public void user_is_on_homepage() {
//		
//		String Homepage=driver.getTitle();
//		Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", Homepage);
//		
//	   
//		
//		
//	}
//
//
//	}
