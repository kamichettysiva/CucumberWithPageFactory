package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.amazonHomePage;
import pages.amazonHomePage2;

public class firstTestCase {
    WebDriver driver = null;
    amazonHomePage2 amazonhomepage2 = null;
    @BeforeSuite
    public void setUp(){
        String ProjDir = System.getProperty("user.dir");
        System.out.println(ProjDir);
        System.setProperty("webdriver.chrome.driver", ProjDir+"/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        amazonhomepage2 = new amazonHomePage2(driver);
        driver.get("https://www.amazon.in/");
    }

    @Test
    public void test(){
        amazonhomepage2.enterTextSearchBox( "macbook");
        amazonhomepage2.clickOnSearchButton();
    }

    @AfterSuite
    public void tearDown(){
        driver.close();
        System.out.println("Test is success");
    }

    @Test
    public void test1(){
        amazonhomepage2.enterTextSearchBox( "macbook");
        amazonhomepage2.clickOnSearchButton();
    }
}
