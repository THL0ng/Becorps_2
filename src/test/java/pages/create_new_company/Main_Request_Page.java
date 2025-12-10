package pages.create_new_company;

import bases.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class Main_Request_Page extends BasePage {

    public Main_Request_Page(WebDriver driver) {
        super(driver);
    }

    private final By getText = By.xpath("//div[normalize-space(.)='Super Admin']");
    private final By clickEditButton  = By.xpath("(//mat-icon[normalize-space()='edit'])[2]");
    private final By sendKeyForm = By.xpath("//input[@placeholder='Enter email of person']");
    private final By submitButton = By.xpath("//button[normalize-space()='Submit']");
    private final By confirmButton = By.xpath("//button[normalize-space()='Confirm']");
    private final By expertProfile = By.xpath("//p[normalize-space()='Expert Long_01_Test']");



    public void verifyText (){
        Assert.assertEquals(getText(getText), "Super Admin");

    }

    public void click_editButton(){
        waitClickable(clickEditButton);
        click(clickEditButton);
    }

    public void select_And_Assign(){
        waitClickable(sendKeyForm);
        selectDropdown(sendKeyForm,expertProfile);
    }

    public void click_submit(){
        waitClickable(submitButton);
        click(submitButton);
    }

    public void click_confirm(){
        waitClickable(confirmButton);
        click(confirmButton);

    }



}
