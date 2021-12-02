package impl;

import pages.LoginPage;
import utils.ConfigReader;

public class LoginImpl {
    LoginPage page;

    public LoginPage getPage(){
        if(page == null)
            page = new LoginPage();
        return page;
    }

    public void logIn(String username, String password){
        getPage().emailInput.sendKeys(username);
        getPage().passwordInput.sendKeys(password);
        getPage().loginBtn.click();
    }

    public void logIn(){
        getPage().emailInput.sendKeys(ConfigReader.readProperty("username"));
        getPage().passwordInput.sendKeys(ConfigReader.readProperty("password"));
        getPage().loginBtn.click();
    }
}
