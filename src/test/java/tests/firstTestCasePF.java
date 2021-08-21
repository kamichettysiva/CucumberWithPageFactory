package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.amazonHomePage_PF;


public class firstTestCasePF {
    WebDriver driver = null;
    amazonHomePage_PF amazonhmepage_pf = null;
    @BeforeSuite
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\web_drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        amazonhmepage_pf = new amazonHomePage_PF(driver);
    }

    @Test
    public void searchproduct1(){
        amazonhmepage_pf.enterTextInSearchBox("grooming");
        amazonhmepage_pf.clickOnSearchBtn();
    }

    @AfterSuite
    public void tearDown(){
        driver.close();
        System.out.println("Test using Page Factory is successful");

    }

}
