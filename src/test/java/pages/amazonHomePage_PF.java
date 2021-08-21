package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonHomePage_PF {

    @FindBy(id = "twotabsearchtextbox")
    WebElement txt_searchbox;
    @FindBy(id="nav-search-submit-button")
    WebElement btn_searchbtn;

    WebDriver driver = null;
    public amazonHomePage_PF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterTextInSearchBox(String text){
        txt_searchbox.sendKeys(text);
    }

    public void clickOnSearchBtn(){
        btn_searchbtn.click();
    }
}
