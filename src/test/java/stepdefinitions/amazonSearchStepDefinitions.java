package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.amazonHomePage_PF;

public class amazonSearchStepDefinitions {

    WebDriver driver = null;
    amazonHomePage_PF amazonhmepage_pf = null;

    @Given("amazon webpage is launched")
    public void amazon_webpage_is_launched() {
        String ProjDir = System.getProperty("user.dir");
        System.out.println(ProjDir);
        System.setProperty("webdriver.chrome.driver", ProjDir+"/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        amazonhmepage_pf = new amazonHomePage_PF(driver);
    }

    @When("user enters a product name in the search box")
    public void user_enters_a_product_name_in_the_search_box() {
        amazonhmepage_pf.enterTextInSearchBox("grooming");
    }

    @When("clicks on search button")
    public void clicks_on_search_button() {
        amazonhmepage_pf.clickOnSearchBtn();
    }

    @Then("search results should be displayed")
    public void search_results_should_be_displayed() {
        driver.close();
        System.out.println("Test using Page Factory is successful");
    }

    @When("user enters a {string} in the search box")
    public void userEntersAInTheSearchBox(String arg0) {
        amazonhmepage_pf.enterTextInSearchBox(arg0);
    }
}
