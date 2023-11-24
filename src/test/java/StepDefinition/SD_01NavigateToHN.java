package StepDefinition;

import Seleniumcode.AT_01NavigateToHN;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.annotations.Test;

import java.io.IOException;

public class SD_01NavigateToHN {
    @Test
    @Given("Open Browser and enter Url and Navigate to GG homepage")
    public void open_browser_and_enter_url_and_navigate_to_gg_homepage() throws IOException {
        AT_01NavigateToHN.NavigateHN();

    }




    @Test

    @Then("get Title assert")
    public void get_title_assert() {
        AT_01NavigateToHN.AsserTitle();

    }




}
