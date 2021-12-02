package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

import java.util.List;

public class HomePage {
    public HomePage (){
        PageFactory.initElements(WebDriverUtils.getDriver(), this);
    }

    @FindBy(id = "inputArea1")
    public WebElement dosInput;

    @FindBy(xpath = "//button[text()='Add do ']")
    public WebElement addDoBtn;

    @FindBy(xpath = "//button[text()='Enter']")
    public WebElement enterBtn;

    @FindBy(xpath = "//div[@class='row DoAndDontsContent']/div[1]//div[contains(@class, 'col-md-7 txt')]")
    public List<WebElement> allDoElements;

    @FindBy(xpath = "//div[@class='row DoAndDontsContent']/div[2]//div[contains(@class, 'col-md-7 txt')]")
    public List<WebElement> allDontElements;

    @FindBy(xpath = "//button[@class='btn btn-outline-success']")
    public List<WebElement> allLikeBtn;


}
