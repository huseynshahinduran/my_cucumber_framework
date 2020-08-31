package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.FHCRegisterPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class FHCRegister_StepDefinitions {

    FHCRegisterPage fhcRegisterPage=new FHCRegisterPage();

    @Given("kullanici fhctrip sayfasindadir")
    public void kullanici_fhctrip_sayfasindadir() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fhc_login_url"));
    }

    @Given("kullanici {string} butonuna tiklar")
    public void kullanici_butonuna_tiklar(String string) {
        fhcRegisterPage.createButton.click();
    }

    @Given("kullanici username girer")
    public void kullanici_username_girer() throws InterruptedException {
        Thread.sleep(500);
        fhcRegisterPage.username.sendKeys(ConfigurationReader.getProperty("username"));
    }

    @Given("kullanici password girer")
    public void kullanici_password_girer() throws InterruptedException {
        Thread.sleep(500);
        fhcRegisterPage.password.sendKeys(ConfigurationReader.getProperty("test_password"));
    }

    @Given("kullanici email girer")
    public void kullanici_email_girer() throws InterruptedException {
        Thread.sleep(500);
        fhcRegisterPage.mail.sendKeys(ConfigurationReader.getProperty("test_email"));
    }

    @Given("kullanici Fulname girer")
    public void kullanici_Fulname_girer() throws InterruptedException {
        Thread.sleep(500);
        fhcRegisterPage.fullname.sendKeys(ConfigurationReader.getProperty("name_surname"));
    }

    @Given("kullanici phone girer")
    public void kullanici_phone_girer() throws InterruptedException {
        Thread.sleep(500);
        fhcRegisterPage.phone.sendKeys(ConfigurationReader.getProperty("phone_num"));
    }

    @Given("kullanici SSN girer")
    public void kullanici_SSN_girer() throws InterruptedException {
        Thread.sleep(500);
        fhcRegisterPage.ssnumber.sendKeys("654-65-4654");
    }

    @Given("kullanici driving lisans girer")
    public void kullanici_driving_lisans_girer() throws InterruptedException {
        Thread.sleep(500);
        fhcRegisterPage.dLicense.sendKeys("HS5842");
    }

    @Given("kullanici Country dropdown dan secer")
    public void kullanici_Country_dropdown_dan_secer() throws InterruptedException {
        Thread.sleep(500);
        Select select=new Select(fhcRegisterPage.Country);
        select.selectByValue("United Kingdom");
    }

    @Given("kullanici  state dropdown dan secer")
    public void kullanici_state_dropdown_dan_secer() throws InterruptedException {
        Thread.sleep(500);
        Select select=new Select(fhcRegisterPage.state);
        select.selectByIndex(227);
    }

    @Given("kullanici address girer")
    public void kullanici_address_girer() throws InterruptedException {
        Thread.sleep(500);
        fhcRegisterPage.address.sendKeys("1/2 5 Carbeth Street Glasgow");
    }

    @Given("kullanici working sector girer")
    public void kullanici_working_sector_girer() throws InterruptedException {
        Thread.sleep(500);
        fhcRegisterPage.sector.sendKeys("Tourism");
    }

    @Given("kullanici birthday girer")
    public void kullanici_birthday_girer() throws InterruptedException {
        Thread.sleep(500);
        fhcRegisterPage.birthdate.sendKeys("06/07/1994");
    }

    @Then("kullanici save butonuna tiklar")
    public void kullanici_save_butonuna_tiklar() {
        fhcRegisterPage.saveButton.click();
    }


}
