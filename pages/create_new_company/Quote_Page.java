package create_new_company;

import basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Quote_Page extends BasePage {

    public Quote_Page(WebDriver driver) {
        super(driver);
    }

    private final By checkbox01 = By.xpath("//mat-checkbox/label/span[1]");
    private final By checkbox02 = By.xpath("(//mat-checkbox[@formcontrolname='isSelected']//span[contains(@class,'mat-checkbox-inner-container')])[2]");
    private final By checkbox03 = By.xpath("(//mat-checkbox[@formcontrolname='isSelected']//span[contains(@class,'mat-checkbox-inner-container')])[3]");
    private final By checkbox04 = By.xpath("(//mat-checkbox[@formcontrolname='isSelected']//span[contains(@class,'mat-checkbox-inner-container')])[4]");
    private final By checkbox05 = By.xpath("(//mat-checkbox[@formcontrolname='isSelected']//span[contains(@class,'mat-checkbox-inner-container')])[5]");
    private final By requestButton = By.xpath("//button[.//span[contains(text(),'Request quote')]]");

    public void click_Checkbox(){
        clickCheckbox(checkbox01);
        clickCheckbox(checkbox02);
        clickCheckbox(checkbox03);
        clickCheckbox(checkbox04);
        clickCheckbox(checkbox05);
    }



    public void click_RequestButton(){
        waitClickable(requestButton);
        click(requestButton);

    }

}
