package pages.create_new_company;

import bases.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Review_Page extends BasePage {

    public Review_Page(WebDriver driver) {
        super(driver);
    }

    private final By nextButtonReview = By.xpath("(//button[contains(@class,'mat-stepper-next') and .//span[contains(text(),'Next')]])[2]");

    public void click_ReviewNextButton(){
        waitClickable(nextButtonReview);
        click(nextButtonReview);
    }

}
