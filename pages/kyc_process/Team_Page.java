package kyc_process;

import basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Team_Page extends BasePage {


    public Team_Page(WebDriver driver) {
        super(driver);
    }


    private final By teamTab = By.xpath("//a[contains(normalize-space(.), 'Team')]");
    private final By Impersonate = By.xpath("//td[.//span[contains(text(),'Expert Long_01_Test')]]/parent::tr//button[@ng-reflect-message='Impersonate']");
    private final By verifyText = By.xpath("//div[contains(@class,'menu-item-wrapper')]/button[contains(@class,'mat-focus-indicator')]/span[contains(@class,'mat-button-wrapper')]");



    public void click_TeamTab(){
        waitVisible(teamTab);
        waitClickable(teamTab);
        click(teamTab);
    }

    public void click_Impresonate(){
        waitClickable(Impersonate);
        click(Impersonate);
    }

    public void verify_Text(){
        Assert.assertEquals(getText(verifyText), "stop impersonate");


    }


}
