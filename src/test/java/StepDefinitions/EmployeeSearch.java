package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EmployeeSearch extends CommonMethods  {

    @When("when user enter  valid employee id")
    public void when_user_enter_valid_employee_id() {


    }
    @When("Click on search button")
    public void click_on_search_button() {


    }
    @When("user see employee information is displayed")
    public void user_see_employee_information_is_displayed() {
        System.out.println("The employee is Displayed");

    }

    @When("user select Jop title")
    public void user_select_jop_title() {
        WebElement jobTitleDdl=driver.findElement(By.id("empsearch_job_title"));
        selectByOptions(jobTitleDdl,"");

    }
}
