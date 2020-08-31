package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FHCRegisterPage {

    public FHCRegisterPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='btn btn-primary py-3 px-5']")
    public WebElement createButton;

    @FindBy(id ="UserName")
    public WebElement username;

    @FindBy(id ="Password")
    public WebElement password;

    @FindBy(id ="Email")
    public WebElement mail;

    @FindBy(id ="NameSurname")
    public WebElement fullname;

    @FindBy(id ="PhoneNo")
    public WebElement phone;

    @FindBy(id ="SSN")
    public WebElement ssnumber;

    @FindBy(id = "DrivingLicense")
    public WebElement dLicense;

    @FindBy(id ="IDCountry")
    public WebElement Country;

    @FindBy(id ="IDState")
    public WebElement state;

    @FindBy(id ="Address")
    public WebElement address;

    @FindBy(id ="WorkingSector")
    public WebElement sector;

    @FindBy(id ="BirthDate")
    public WebElement birthdate;

    @FindBy (id = "btnSubmit")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement successfullyMessage;


}
