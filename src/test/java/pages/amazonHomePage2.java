package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import config.log4j2Properties;

public class amazonHomePage2 {
    WebDriver driver = null;
    By txt_searchbox =  By.id("twotabsearchtextbox");
    By btn_searchbtn = By.id("nav-search-submit-button");
    log4j2Properties log = new log4j2Properties();


    public amazonHomePage2(WebDriver driver){
        this.driver = driver;
    }

    public void enterTextSearchBox(String text){
        driver.findElement(txt_searchbox).sendKeys(text);
    }

    public void clickOnSearchButton(){
        driver.findElement((By) btn_searchbtn).click();
    }

}
