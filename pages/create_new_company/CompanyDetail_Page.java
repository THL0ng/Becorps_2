package create_new_company;

import basepage.BasePage;
import commons.DataTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static commons.DataTest.*;

public class CompanyDetail_Page extends BasePage {

    public CompanyDetail_Page(WebDriver driver) {
        super(driver);
    }


    private final By firstNameForm = By.xpath("//mat-label[text()='First proposed name']/ancestor::mat-form-field//input");
    private final By secondNameForm  = By.xpath("//mat-label[text()='Second proposed name']/ancestor::mat-form-field//input");
    private final By thirdNameForm = By.xpath("//mat-label[text()='Third proposed name']/ancestor::mat-form-field//input");
    private final By companyActivityForm = By.xpath("//mat-label[text()='Company activity']/ancestor::mat-form-field//textarea");
    private final By addressCompanyForm = By.xpath("//mat-label[text()='Address Line']/ancestor::mat-form-field//input");
    private final By rentalForm = By.xpath("//ngx-dropzone-label[text()=' Upload rental agreement document']");
    private final By submitButton = By.xpath("//button[@type='submit']");

    public void inputFirstName(){
        waitVisible(firstNameForm);
        type(firstNameForm, firstName);
    }

    public void inputSecondName(){
        waitVisible(secondNameForm);
        type(secondNameForm, secondName );
    }

    public void inputThirdName(){
        waitVisible(thirdNameForm);
        type(thirdNameForm, thirdName );
    }

    public void inputCompanyActivity(){
        waitVisible(companyActivityForm);
        type(companyActivityForm, companyActivity );
    }


    public void inputAddressCompany(){
        waitVisible(addressCompanyForm);
        type(addressCompanyForm, addresscompany );
    }


    public void clickRental (){
        waitClickable(rentalForm);
        click(rentalForm);
    }


    public void selectAndUploadFile(){
        uploadFileWithRobotBackup("01.png");
    }

    public void clickSubmit(){
        waitClickable(submitButton);
        click(submitButton);

    }





}
