package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class AddEmployee extends CommonMethods {

    @When("user click on PIM option")
    public void user_click_on_pim_option() {
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

    }
    @When("user click on employee button")
    public void user_click_on_employee_button() {
        driver.findElement(By.id("menu_pim_addEmployee")).click();

    }
    @When("user enter firstname and middlename and lastname")
    public void user_enter_firstname_and_middlename_and_lastname() {
        driver.findElement(By.id("firstName")).sendKeys("Mohamed");
        driver.findElement(By.id("middleName")).sendKeys("El");
        driver.findElement(By.id("lastName")).sendKeys("WASSIF");

    }
    @When("user click on save button")
    public void user_click_on_save_button() {
        driver.findElement(By.id("btnSave")).click();

    }
}
