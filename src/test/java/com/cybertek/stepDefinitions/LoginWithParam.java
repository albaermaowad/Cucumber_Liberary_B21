package com.cybertek.stepDefinitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utelities.Driver;
import com.cybertek.utelities.configurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginWithParam {

    LoginPage loginPage = new LoginPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        String url = configurationReader.getProperty("qa2_url");
        Driver.getDriver().get(url);

        @When("I enter username {string}")
        public void i_enter_username (String string){

        }
        @When("I enter password {string}")
        public void i_enter_password (String string){
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
        @When("click the sign in button")
        public void click_the_sign_in_button () {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }


    }
}
