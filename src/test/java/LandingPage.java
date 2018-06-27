import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by renajing on 6/26/18.
 */
public class LandingPage extends Page {

    private By titlePath = By.xpath("//title[contains(text(),'Weight Loss Program, Recipes & Help | Weight Watchers')]");

    private By findMeeting = By.className("find-a-meeting");

    public LandingPage assertTitle(){
        driver.findElement(titlePath);
        return this;
    }

    public FindMeeting clickFindMeeting(){
        WebElement findMeetingButton = driver.findElement(findMeeting);
        findMeetingButton.click();
        return new FindMeeting();
    }


}
