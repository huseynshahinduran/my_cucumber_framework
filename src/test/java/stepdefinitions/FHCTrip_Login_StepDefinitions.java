package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import pages.FHCTrip_LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class FHCTrip_Login_StepDefinitions {

    FHCTrip_LoginPage fhcTrip_loginPage=new FHCTrip_LoginPage();

    @Given("user is on the fhctriplogin page")
    public void user_is_on_the_fhctriplogin_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhc_login_url"));

    }

    @Given("user enters valid username")
    public void user_enters_valid_username() {

        fhcTrip_loginPage.userName.sendKeys(ConfigurationReader.getProperty("gecerli_username"));

    }
    @Given("user enters valid password")
    public void user_enters_valid_password() {

        fhcTrip_loginPage.password.sendKeys(ConfigurationReader.getProperty("gecerli_password"));

    }
    @Given("user click login button")
    public void user_click_login_button() {

        fhcTrip_loginPage.loginButton.click();

    }
    @Then("verify login is successful")
    public void verify_login_is_successful() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("ListOfUsers"));

    }

    @Given("user enters invalid username")
    public void user_enters_invalid_username() {
        fhcTrip_loginPage.userName.sendKeys(ConfigurationReader.getProperty("gecersiz_username"));
    }

    @Given("user enters invalid password")
    public void user_enters_invalid_password() {
        fhcTrip_loginPage.password.sendKeys(ConfigurationReader.getProperty("gecersiz_password"));
    }

    @Then("verify login is not successful")
    public void verify_login_is_not_successful() {
        Assert.assertTrue(Driver.getDriver().findElement(By.id("divMessageResult")).isDisplayed());
    }

    @Given("user enters valid username {string}")
    public void user_enters_valid_username(String string) {
        fhcTrip_loginPage.userName.sendKeys(string);
    }

    @Given("user enters valid password {string}")
    public void user_enters_valid_password(String string) {
        fhcTrip_loginPage.password.sendKeys(string);
    }









}
