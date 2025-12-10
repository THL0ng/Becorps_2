package pages.create_new_company;

import bases.basepage.BasePage;
import data.commons.DataTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static data.commons.DataTest.email;
import static data.commons.DataTest.numberOfShares;

public class Capital_Page extends BasePage {
    public Capital_Page(WebDriver driver) {
        super(driver);
    }

    private final By capitalAmountForm = By.xpath("//td[@class='mat-cell']//mat-form-field//input[@type='number']");
    private final By numberOfsharesForm = By.xpath("//td[@class='mat-cell text-center']//mat-form-field//input[@type='number']");
    private final By currency = By.xpath("//mat-select[@formcontrolname='currency']");
    private final By currencyValue = By.xpath("//span[normalize-space()='EUR']");
    private final By shareType = By.xpath("//mat-select[@formcontrolname='shareTypeId']");
    private final By shareTypeValue = By.xpath("//span[normalize-space()='ordinary']");
    private final By addShareholderButton  = By.xpath("//div[@class='inline-flex gap-1 items-center']");
    private final By shareholder_Salutation = By.xpath("//mat-select[@formcontrolname='salutation']");
    private final By shareholder_SalutationValue = By.xpath("//span[normalize-space()='Miss.']");
    private final By firstNameShareholder  = By.xpath("//input[@formcontrolname='firstName']");
    private final By lastNameShareholder  = By.xpath("//input[@formcontrolname='lastName']");
    private final By identificationForm  = By.xpath("//input[@formcontrolname='identificationNumber']");
    private final By emailForm = By.xpath("//input[@type='email']");
    private final By identification = By.xpath("//mat-select[@formcontrolname='officerIdentificationTypeId']");
    private final By identificationValue = By.xpath("//span[normalize-space()='ID']");
    private final By nationality = By.xpath("//app-country-select-input[@formcontrolname='nationalityId']");
    private final By nationalityValue = By.xpath("//mat-option//span[contains(text(),'Germany')]");
    private final By randomDate = By.xpath("//input[@formcontrolname='expiryDate']");
    private final By phoneForm  = By.xpath("//input[@type='tel']");
    private final By addressForm = By.xpath("//input[@placeholder='Address line']");
    private final By country  = By.xpath("//mat-form-field[8]/div/div[1]");
    private final By countryValue  = By.xpath("//span[contains(normalize-space(), 'Spain')]");
    private final By countryValue2  = By.xpath("//span[contains(normalize-space(), 'Mexico')]");
    private final By addShareDistributionButton  = By.xpath("//section[contains(@class,'inline-flex')]//button[contains(@class,'mat-focus-indicator')]//span[contains(@class,'mat-button-wrapper')]");
    private final By shareType_shareDistribution = By.xpath("(//th[normalize-space()='Share type']/ancestor::table//mat-select[@formcontrolname='shareTypeId']//div[contains(@class,'mat-select-trigger')])[last()]");
    private final By shareTypeValue_shareDistribution = By.xpath("//mat-option[.//span[contains(@class,'mat-option-text')]//span[normalize-space()='ordinary']]");
    private final By currency_shareDistribution = By.xpath("(//th[normalize-space()='Share type']/ancestor::table//mat-select[@formcontrolname='currency']//div[contains(@class,'mat-select-trigger')])[last()]");
    private final By currencyValue_shareDistribution = By.xpath("//mat-option//span[normalize-space()='EUR']");
    private final By numberOfShare_Distribution = By.xpath("//input[@formcontrolname='numberOfShares']");
    private final By saveButton_Distribution = By.xpath("//span[normalize-space()='Save']");
    private final By addNomineeDirector = By.xpath("//span[contains(normalize-space(),'Add Nominee Director')]");
    private final By nextbutton = By.xpath("(//button[contains(@class,'mat-stepper-next') and contains(@class,'bg-primary-900')])[2]");


    public void inputCapitalAmountForm(){
        waitVisible(capitalAmountForm);
        type(capitalAmountForm, String.valueOf(DataTest.capitalAmount));

    }

    public void inputNumberOfSharesForm(){
        waitVisible(numberOfsharesForm);
        type(numberOfsharesForm,(numberOfShares));

    }

    public void clickDropDownList_shareCapital (){
        selectDropdown(currency,currencyValue);
        selectDropdown(shareType,shareTypeValue);
    }

    public void clickShareholderButton(){
        waitVisible(addShareholderButton);
        click(addShareholderButton);
    }

    public void clickDropDownList_shareHolder (){
        selectDropdown(shareholder_Salutation,shareholder_SalutationValue);
    }

    public void inputFirstNameShareholder(){
        waitVisible(firstNameShareholder);
        type(firstNameShareholder, DataTest.firstNameShareholder);
    }

    public void inputLastNameShareholder(){
        waitVisible(lastNameShareholder);
        type(lastNameShareholder, DataTest.lastNameShareholder);
    }

    public void inputLastNameShareholder2(){
        waitVisible(lastNameShareholder);
        type(lastNameShareholder, DataTest.lastNameShareholder2);
    }

    public void clickDropDownList_IdentificationDoc(){
        selectDropdown(identification, identificationValue);
    }

    public void inputidentificationForm(){
        waitVisible(identificationForm);
        type(identificationForm, String.valueOf(DataTest.identification));
    }

    public void inputEmailForm(){
        waitVisible(emailForm);
        type(emailForm, email);

    }

    public void clickDropdownList_nationality(){
        waitClickable(nationality);
        selectDropdown(nationality,nationalityValue);

    }

    public void RandomDate (){
        setRandomDate(randomDate, 2023, 2030, "dd/MM/yyyy");

    }

    public void inputnumberPhone (){
        enterPhoneNumber(phoneForm, DataTest.numberPhone);
    }

    public void inputAddressForm (){
        type(addressForm, DataTest.addressShareholder);
    }

    public void clickDropDownList_Country(){
        waitClickable(country);
        click(country);
        waitClickable(countryValue);
        click(countryValue);
    }

    public void clickDropDownList_Country2(){
        waitClickable(country);
        click(country);
        waitClickable(countryValue2);
        click(countryValue2);
    }

    public void click_shareDistributionButton(){
        waitClickable(addShareDistributionButton);
        click(addShareDistributionButton);
    }

    public void clickDropDownlist_shareType(){
        waitClickable(shareType_shareDistribution);
        jsClick(shareType_shareDistribution);
        waitClickable(shareTypeValue_shareDistribution);
        jsClick(shareTypeValue_shareDistribution);
    }

    public void clickDropDownlist_currency(){
        waitClickable(currency_shareDistribution);
        click(currency_shareDistribution);
        waitClickable(currencyValue_shareDistribution);
        click(currencyValue_shareDistribution);
    }

    public void inputnumberOfShare_Distribution(){
        waitClickable(numberOfShare_Distribution);
        type(numberOfShare_Distribution, DataTest.numberOfShare_Distribution);
    }

    public void click_savebuttonDistributon(){
        waitClickable(saveButton_Distribution);
        click(saveButton_Distribution);
    }

    public void inputnumberOfShare_Distribution2(){
        waitClickable(numberOfShare_Distribution);
        type(numberOfShare_Distribution, DataTest.numberOfShare_Distribution2);
    }

    public void click_NomineeDirector(){
        waitClickable(addNomineeDirector);
        click(addNomineeDirector);
    }

    public void click_nextStep(){
        waitClickable(nextbutton);
        click(nextbutton);

    }






}
