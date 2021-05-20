package com.cybertek.stepDefinitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utelities.Driver;
import com.cybertek.utelities.configurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.security.auth.login.Configuration;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        String url = configurationReader.getProperty("qa2_url");
        Driver.getDriver().get(url);
    }
    @When("I login as a librarian")
    public void i_login_as_a_librarian() {

        String username = configurationReader.getProperty("lip19_user");
        String Password = configurationReader.getProperty("lip19_pass");
        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(Password);
        loginPage.signInButton.click();

    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {

        String expected = "dashboard";

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.urlContains(expected));
        String actual = Driver.getDriver().getCurrentUrl();


        Assert.assertTrue(actual.contains(expected));

    }


    @When("I login as a student")
    public void iLoginAsAStudent() {

        String StudentUsername = configurationReader.getProperty("stu12_user");
        String StudentPassword = configurationReader.getProperty("stu12_pass");
        loginPage.usernameInput.sendKeys(StudentUsername);
        loginPage.passwordInput.sendKeys(StudentPassword);
        loginPage.signInButton.click();


    }
}
