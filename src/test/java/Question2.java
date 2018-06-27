import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;


/**
 * Created by renajing on 6/26/18.
 */
public class Question2  {

    public static WebDriver driver;

    @Before
    public void setUpDriver(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
        driver.get("https://www.weightwatchers.com/us/");
    }


    // run with -Dwebdriver.chrome.driver="location of webdriver"
    @Test
    public void selenium(){
        LandingPage landingPage = new LandingPage();
        landingPage.setDriver(driver);
        landingPage
                .assertTitle()
                .clickFindMeeting()
                .assertTitle()
                .search("10011")
                .printFirstLocation()
                .printFirstDistance()
                .clickOnLocation()
                .assertLocationMatches()
                .printTodaysHours();
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
