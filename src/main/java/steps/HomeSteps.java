package steps;

import impl.HomeImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CucumberLogUtils;
import utils.SeleniumUtils;
import utils.WebDriverUtils;

public class HomeSteps{
    HomeImpl impl = new HomeImpl();

    public static int likeCount = 0;

    @Given("I navigate to homepage")
    public void i_navigate_to_homepage() {
        impl.navigateToHomepage();
    }


    @Then("Title of the page should be {string}")
    public void i_should_see_swag_labs_title(String expectedTitle) {
        CucumberLogUtils.logInfo("Saucelabs page", false);
        Assert.assertEquals(expectedTitle, WebDriverUtils.getDriver().getTitle());
    }

    @Then("I should see dashboard {string}")
    public void iShouldSeeDashboard(String dashboardName) {
        Assert.assertTrue(impl.isDashboardDisplayed(dashboardName));
    }

    @When("I capture number of likes of the last statement")
    public void iCaptureNumberOfLikesOfTheLastStatement() {
        SeleniumUtils.sleet(2000);

        likeCount = Integer.parseInt(impl.getPage().allLikeBtn.get(impl.getPage().allLikeBtn.size()-1).getText());
    }

    @And("Click on {string} button of the the last statement")
    public void clickOnButtonOfTheTheLastStatement(String buttonName) {
        SeleniumUtils.sleet(2000);
        switch (buttonName.toLowerCase()){
            case "like": impl.getPage().allLikeBtn.get(impl.getPage().allLikeBtn.size()-1).click();
            break;
        }
    }

    @Then("Number of likes should increase by {int}")
    public void numberOfLikesShouldIncreaseBy(int increasedBy) {
        int currentLikeCount = Integer.parseInt(impl.getPage().allLikeBtn.get(impl.getPage().allLikeBtn.size()-1).getText());
        Assert.assertEquals(currentLikeCount, likeCount + increasedBy);
    }

    @When("I add a statement {string}")
    public void iAddAStatement(String statement) {
        impl.addStatement(statement);
    }

    @Then("I should be see {string} on the page")
    public void iShouldBeSeeOnThePage(String statement) {
        Assert.assertTrue(impl.doesStatementExist(statement));
    }
}
