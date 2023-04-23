package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login {

    WebDriver driver;

    @Given("open the browser and launch HRMS application")
    public void open_the_browser_and_launch_hrms_application() {
        WebDriver driver = new EdgeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");


    }
    @When("user enters valid email and valid password")
    public void user_enters_valid_email_and_valid_password() {
        driver.findElement(By.id("WebDriver driver")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhem123");

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
}
