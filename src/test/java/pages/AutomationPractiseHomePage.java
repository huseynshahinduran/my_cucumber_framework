package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPractiseHomePage {

        public AutomationPractiseHomePage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }
        @FindBy(xpath = "//a[@class='login']")
        public WebElement signInButton;

        @FindBy(id = "email_create")
        public WebElement emailBox;

        @FindBy(id = "SubmitCreate")
        public WebElement createButton;

    }




