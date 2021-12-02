package steps;

import impl.HomeImpl;
import impl.LoginImpl;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import java.util.Map;

public class LoginSteps implements CommonPage {
    LoginImpl impl = new LoginImpl();


    @When("I input following credentials:")
    public void iInputFollowingCredentials(Map<String, String> credentials) {
        impl.logIn(credentials.get("email"), credentials.get("password"));
    }

    @Then("I should see {string} dashboard")
    public void iShouldSeeDashboard(String dashboardName) {
        Assert.assertTrue(new HomeImpl().isDashboardDisplayed(dashboardName));
    }

    @Then("I should see error message")
    public void iShouldSeeErrorMessage() {
        Assert.assertTrue(impl.getPage().errorMsg.isDisplayed());
    }


    @And("Login with {string} credentials")
    public void loginWithCredentials(String userRole) {
        switch (userRole.toLowerCase()){
            case "admin": impl.logIn();
            break;
        }
    }
}
