package POC_BDD.POC_BDD_art;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SeleniumTest {

	public static WebDriver driver;

	@Given("^Open Browser chrome$")
	public void launch_the_appilcation() throws Exception {

		System.setProperty("webdriver.ie.driver","d:\\s.w\\chromedriver.exe");

		driver = new ChromeDriver();


	}

	@When("^Go to  google$")
	public void enter_the_username_password()
			throws Exception {
String URL = "https://www.google.com";
		driver.get(URL);

		
	}

	@Then("^Page available should be  having Search$")
	public void click_on_Login_button() throws Exception {
		Thread.sleep(60);
		WebDriverWait wait = new WebDriverWait(driver, 60);

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By
				.xpath(".//*[@id='lst-ib']")));

		
		
	}

}
