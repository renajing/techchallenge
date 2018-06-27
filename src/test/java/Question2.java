import org.junit.Assert;
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
public class Question2 {

    // run with -Dwebdriver.chrome.driver="location of webdriver"
    @Test
    public void selenium(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.google.com");
        driver.get("https://www.weightwatchers.com/us/");

        WebElement title = driver.findElement(By.xpath("//title[contains(text(),'Weight Loss Program, Recipes & Help | Weight Watchers')]"));

        WebElement findMeetingButton = driver.findElement(By.className("find-a-meeting"));
        findMeetingButton.click();
        WebElement meetingTItle = driver.findElement(By.xpath("//title[contains(text(),'Find A Meeting: Get Schedules & Times Near You | Weight Watchers')]"));
        WebElement meetingSearch = driver.findElement(By.id("meetingSearch"));
        meetingSearch.sendKeys("10011");
        WebElement button = driver.findElement(By.className("form-blue-pill__btn"));
        button.click();


        WebElement locationElement = driver.findElements(By.className("location__name")).get(0);
        System.out.println(locationElement.getText());
        String text = locationElement.getText();
        System.out.println(driver.findElements(By.className("location__distance")).get(0).getText());

        locationElement.click();
        driver.findElement(By.xpath("//span[contains(text(),'" + text + "')]"));

        WebElement todaysHours = driver.findElement(By.className("hours-list--currentday"));
        System.out.println(todaysHours.getText());
        driver.close();


    }
}
