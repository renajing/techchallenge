import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by renajing on 6/26/18.
 */
public class MeetingsResultsPage extends Page {

    private String locationName;

    private By todaysHours = By.className("hours-list--currentday");

    public MeetingsResultsPage(String locationName) {
        this.locationName = locationName;
    }

    public MeetingsResultsPage assertLocationMatches(){
        driver.findElement(By.xpath("//span[contains(text(),'" + locationName + "')]"));
        return this;
    }

    public MeetingsResultsPage printTodaysHours(){
        WebElement elem = driver.findElement(todaysHours);
        System.out.println(elem.getText());
        return this;
    }
}
