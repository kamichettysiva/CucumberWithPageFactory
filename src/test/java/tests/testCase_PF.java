package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.amazonH_PF;
import pages.amazonHomePage2;

public class testCase_PF {
    WebDriver driver = null;
    amazonH_PF amazonh_pf = null;
    @BeforeSuite
    public void setUp(){
        String ProjDir = System.getProperty("user.dir");
        System.out.println(ProjDir);
        System.setProperty("webdriver.chrome.driver", ProjDir+"/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        amazonh_pf = new amazonH_PF(driver);
        driver.get("https://www.amazon.in/");
    }

    @Test
    public void test1(){
        amazonh_pf.enterTextInSearchBox("grooming");
        amazonh_pf.clickOnSearchBtn();
    }

    @Test
    public void test2(){
        amazonh_pf.enterTextInSearchBox("TV");
        amazonh_pf.clickOnSearchBtn();
    }

    @AfterSuite
    public void tearDown(){
        driver.close();
        System.out.println("Test is success");
    }
}
