package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }

    @FindBy(name = "email")
    public WebElement emailInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginBtn;

    @FindBy(xpath = "//div[text()='Incorrect username/password']")
    public WebElement errorMsg;
}
