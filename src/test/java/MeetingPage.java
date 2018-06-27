import org.openqa.selenium.By;

/**
 * Created by renajing on 6/26/18.
 */
public class MeetingPage extends Page {

    private By location = By.className("location__name");

    private By distance = By.className("location__distance");

    private String locationName;

    public MeetingPage printFirstLocation(){
        this.locationName = driver.findElements(location).get(0).getText();
        System.out.println(locationName);
        return this;
    }

    public MeetingPage printFirstDistance(){
        System.out.println(driver.findElements(distance).get(0).getText());
        return this;
    }

    public MeetingsResultsPage clickOnLocation(){
        driver.findElements(location).get(0).click();
        return new MeetingsResultsPage(locationName);
    }


}
