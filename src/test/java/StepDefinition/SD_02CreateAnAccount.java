package StepDefinition;

import Seleniumcode.AT_02CreateAnAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.annotations.Test;

import java.io.IOException;

public class SD_02CreateAnAccount {
    @Test
    @Given("from the Home page click on Account link")
    public void from_the_home_page_click_on_account_link() throws IOException {
        AT_02CreateAnAccount.CreateAnAcct();

    }
    @Test
    @Then("click on CreateAnAccount button")
    public void click_on_create_an_account_button() {
        AT_02CreateAnAccount.CreateAnAcct01();

    }



}
