package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

import static Utils.CommonMethods.driver;

public class Login extends CommonMethods {



    @Given("open the browser and launch HRMS application")
    public void open_the_browser_and_launch_hrms_application() {

          openBrowserAndLaunchApplication();
    }
    @When("user enters valid email and valid password")
    public void user_enters_valid_email_and_valid_password() {
          driver.findElement(By.id("txtUsername")).sendKeys(ConfigReader.getPropertyValue("username"));
          driver.findElement(By.id("txtPassword")).sendKeys(ConfigReader.getPropertyValue("password"));

    }
    @When("click on login button")
    public void click_on_login_button() {
        driver.findElement(By.id("btnLogin")).click();


    }
    @Then("user is logged successfully")
    public void user_is_logged_successfully() {
        boolean userloggedIn=driver.findElement(By.xpath("//a[contains(text(),'Welcome')]")).isDisplayed();
        if (userloggedIn)
        {
            System.out.println("user is logged in Successfully");
        }

    }
    @Then("close the browser")
    public void close_the_browser() {
      closeBrowser();

    }
}
