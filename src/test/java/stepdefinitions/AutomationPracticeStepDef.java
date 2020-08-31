package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.AutomationPractiseCreateAccountPage;
import pages.AutomationPractiseHomePage;
import utilities.Driver;

public class AutomationPracticeStepDef {
        AutomationPractiseHomePage apHomePage = new AutomationPractiseHomePage();
        AutomationPractiseCreateAccountPage apCreatePage = new AutomationPractiseCreateAccountPage();
        @Given("user web sayfasinda")
        public void user_web_sayfasinda() {
                Driver.getDriver().get("http://automationpractice.com/index.php");
        }
        @Given("user sign in linkine tiklar")
        public void user_sign_in_linkine_tiklar() {
                apHomePage.signInButton.click();
        }
        @Given("user Create an account bolumune  email adresi girer")
        public void user_Create_an_account_bolumune_email_adresi_girer() {
                apHomePage.emailBox.sendKeys("testabcd5842134564@gmail.com");
        }
        @Given("Create an Account butonuna basar")
        public void create_an_Account_butonuna_basar() {
                apHomePage.createButton.click();
        }
        @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
        public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
                apCreatePage.gender.click();
                apCreatePage.firstname.sendKeys("Betul");
                apCreatePage.lastname.sendKeys("Trhn");
                apCreatePage.password.sendKeys("123123");
                Select birthDay = new Select(apCreatePage.day);
                birthDay.selectByIndex(4);
                Select birthMonth = new Select(apCreatePage.month);
                birthMonth.selectByIndex(3);
                Select birthYear = new Select(apCreatePage.year);
                birthYear.selectByIndex(12);
                apCreatePage.address1.sendKeys("Wall street");
                apCreatePage.city.sendKeys("NY");
                Select state = new Select(apCreatePage.state);
                state.selectByIndex(4);
                apCreatePage.zipcode.sendKeys("11122");
                Select country = new Select(apCreatePage.country);
                country.selectByIndex(1);
                apCreatePage.phone.sendKeys("1231234323");
                apCreatePage.aliasAddress.sendKeys("my address");
        }
        @Given("user Register butonuna basar")
        public void user_Register_butonuna_basar() {
                apCreatePage.registerButton.click();
        }
        @Then("hesap olusturuldugunu dogrulayin")
        public void hesap_olusturuldugunu_dogrulayin() {
                Assert.assertTrue(apCreatePage.myAccount.isDisplayed());
        }
}