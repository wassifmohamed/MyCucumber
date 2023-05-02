package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddEmployee extends CommonMethods {

    @When("user click on PIM option")
    public void user_click_on_pim_option() {
       // driver.findElement(By.id("menu_pim_viewPimModule")).click();
        WebElement pimTab=driver.findElement(By.id("menu_pim_viewPimModule"));
        doClick(pimTab);


    }
    @When("user click on employee button")
    public void user_click_on_employee_button() {
        WebElement addEmpBtn =driver.findElement(By.id("menu_pim_addEmployee"));
        doClick(addEmpBtn);

    }
    @When("user enter firstname and middlename and lastname")
    public void user_enter_firstname_and_middlename_and_lastname() {
       // driver.findElement(By.id("firstName")).sendKeys(    ConfigReader.getPropertyValue("firstname"));
        WebElement firstNameTextBx=driver.findElement(By.id("firstName"));
        sendText(firstNameTextBx, ConfigReader.getPropertyValue("firstname"));

        //driver.findElement(By.id("middleName")).sendKeys(ConfigReader.getPropertyValue("middlename"));
        WebElement midNameTxBx=driver.findElement(By.id("middleName"));
        sendText(midNameTxBx,ConfigReader.getPropertyValue("middlename"));

        //driver.findElement(By.id("lastName")).sendKeys(ConfigReader.getPropertyValue("lastname"));
        WebElement lastNameTxBx =driver.findElement(By.id("lastName"));
        sendText(lastNameTxBx,ConfigReader.getPropertyValue("lastname"));

    }
    @When("user click on save button")
    public void user_click_on_save_button() {
       WebElement saveBtn= driver.findElement(By.id("btnSave"));
        doClick(saveBtn);
    }
}
