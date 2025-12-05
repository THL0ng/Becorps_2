package transfer_company;

import basepage.BasePage;
import commons.DataTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static commons.DataTest.numberOfShares;

public class Transfer_Step2 extends BasePage {
    public Transfer_Step2(WebDriver driver) {
        super(driver);
    }

    private final By capitalAmountForm = By.xpath("//td[@class='mat-cell']//mat-form-field//input[@type='number']");
    private final By numberOfsharesForm = By.xpath("//td[@class='mat-cell text-center']//mat-form-field//input[@type='number']");
    private final By currency = By.xpath("//mat-select[@formcontrolname='currency']");
    private final By currencyValue = By.xpath("//span[normalize-space()='EUR']");
    private final By shareType = By.xpath("//mat-select[@formcontrolname='shareTypeId']");
    private final By shareTypeValue = By.xpath("//span[normalize-space()='ordinary']");




    public void inputCapitalAmountForm(){
        waitVisible(capitalAmountForm);
        type(capitalAmountForm,"250000");

    }

    public void inputNumberOfSharesForm(){
        waitVisible(numberOfsharesForm);
        type(numberOfsharesForm,"100000");

    }

    public void clickDropDownList_shareCapital (){
        selectDropdown(currency,currencyValue);
        selectDropdown(shareType,shareTypeValue);
    }

}
