import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by renajing on 6/26/18.
 */
public class FindMeeting extends Page {

    private By title = By.xpath("//title[contains(text(),'Find A Meeting: Get Schedules & Times Near You | Weight Watchers')]");

    private By meetingSearch = By.id("meetingSearch");

    private By submitSearch = By.className("form-blue-pill__btn");

    public FindMeeting assertTitle(){
        driver.findElement(title);
        return this;
    }

    public MeetingPage search(String input){
        WebElement searchBar = driver.findElement(meetingSearch);
        searchBar.sendKeys(input);
        WebElement submitButton = driver.findElement(submitSearch);
        submitButton.click();
        return new MeetingPage();
    }
}
