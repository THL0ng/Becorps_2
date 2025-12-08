package transfer_company;

import basepage.BasePage;
import commons.DataTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static commons.DataTest.email;

public class Transfer_Step2 extends BasePage {
    public Transfer_Step2(WebDriver driver) {
        super(driver);
    }

    private final By capitalAmountForm = By.xpath("//td[@class='mat-cell']//mat-form-field//input[@type='number']");
    private final By numberOfsharesForm = By.xpath("//td[@class='mat-cell text-center']//mat-form-field//input[@type='number']");
    private final By currency = By.xpath("//mat-select[@formcontrolname='currency']");
    private final By shareType = By.xpath("//mat-select[@formcontrolname='shareTypeId']");

    private final By addShareholderButton  = By.xpath("//div[@class='inline-flex gap-1 items-center']");
    private final By shareholder_Salutation = By.xpath("//mat-select[@formcontrolname='salutation']");
    private final By firstNameShareholder  = By.xpath("//input[@formcontrolname='firstName']");
    private final By lastNameShareholder  = By.xpath("//input[@formcontrolname='lastName']");
    private final By identificationForm  = By.xpath("//input[@formcontrolname='identificationNumber']");
    private final By emailForm = By.xpath("//input[@type='email']");
    private final By identification = By.xpath("//mat-select[@formcontrolname='officerIdentificationTypeId']");
    private final By nationality = By.xpath("//app-country-select-input[@formcontrolname='nationalityId']");
    private final By randomDate = By.xpath("//input[@formcontrolname='expiryDate']");
    private final By addressForm = By.xpath("//input[@placeholder='Address line']");
    private final By phoneForm  = By.xpath("//input[@type='tel']");
    private final By country  = By.xpath("//mat-form-field[8]/div/div[1]");
    private final By addShareDistributionButton  = By.xpath("//section[contains(@class,'inline-flex')]//button[contains(@class,'mat-focus-indicator')]//span[contains(@class,'mat-button-wrapper')]");
    private final By shareType_shareDistribution = By.xpath("(//th[normalize-space()='Share type']/ancestor::table//mat-select[@formcontrolname='shareTypeId']//div[contains(@class,'mat-select-trigger')])[last()]");
    private final By currency_shareDistribution = By.xpath("(//th[normalize-space()='Share type']/ancestor::table//mat-select[@formcontrolname='currency']//div[contains(@class,'mat-select-trigger')])[last()]");










    public void inputCapitalAmountForm(){
        waitVisible(capitalAmountForm);
        type(capitalAmountForm, String.valueOf(DataTest.transfer_CapitalAmount));

    }

    public void inputNumberOfSharesForm(){
        waitVisible(numberOfsharesForm);
        type(numberOfsharesForm,String.valueOf(DataTest.transfer_NumberOfShares));

    }

    public String selectRandomCurency() {
        waitClickable(currency);
        click(currency);

        List<WebElement> options = driver.findElements(
                By.xpath("//mat-option//span[contains(@class,'mat-option-text')]")
        );

        if (options.size() == 0) {
            throw new RuntimeException("nationality dropdown không có option!");
        }

        Random random = new Random();
        int index = random.nextInt(options.size());


        WebElement chosen = options.get(index);
        String curreny = chosen.getText().trim();
        System.out.println("Selected nationality: " + curreny);

        chosen.click();

        return curreny;
    }

    public String selectRandomShareType() {
        waitClickable(shareType);
        click(shareType);

        List<WebElement> options = driver.findElements(
                By.xpath("//mat-option//span[contains(@class,'mat-option-text')]")
        );

        if (options.size() == 0) {
            throw new RuntimeException("nationality dropdown không có option!");
        }

        Random random = new Random();
        int index = random.nextInt(options.size());


        WebElement chosen = options.get(index);
        String shareType = chosen.getText().trim();
        System.out.println("Selected nationality: " + shareType);

        chosen.click();

        return shareType;
    }

    public void clickShareholderButton(){
        waitVisible(addShareholderButton);
        click(addShareholderButton);
    }

    public String selectRandomGender() {
        waitClickable(shareholder_Salutation);
        click(shareholder_Salutation);

        List<WebElement> options = driver.findElements(
                By.xpath("//mat-option//span[contains(@class,'mat-option-text')]")
        );

        if (options.size() == 0) {
            throw new RuntimeException("Gender dropdown không có option!");
        }

        Random random = new Random();
        int index = random.nextInt(options.size());

        WebElement chosen = options.get(index);
        chosen.click();

        String gender = chosen.getText().trim();
        System.out.println("Selected gender: " + gender);

        return gender;
    }

    public void inputTransfer_FirstNameShareholder(){
        waitVisible(firstNameShareholder);
        type(firstNameShareholder, DataTest.transfer_FirstNameShareholder);
    }

    public void inputTransfer_LastNameShareholder(){
        waitVisible(lastNameShareholder);
        type(lastNameShareholder, DataTest.transfer_LastNameShareholder);
    }

    public String selectRandomIden() {
        waitClickable(identification);
        click(identification);

        List<WebElement> options = driver.findElements(
                By.xpath("//mat-option//span[contains(@class,'mat-option-text')]")
        );

        if (options.size() == 0) {
            throw new RuntimeException("Gender dropdown không có option!");
        }

        Random random = new Random();
        int index = random.nextInt(options.size());

        WebElement chosen = options.get(index);
        chosen.click();

        String iden = chosen.getText().trim();
        System.out.println("Selected Iden: " + iden);

        return iden;
    }

    public void inputidentificationForm(){
        waitVisible(identificationForm);
        type(identificationForm, String.valueOf(DataTest.identification));
    }

    public String selectRandomNationality() {
        waitClickable(nationality);
        click(nationality);

        List<WebElement> options = driver.findElements(
                By.xpath("//mat-option//span[contains(@class,'mat-option-text')]")
        );

        if (options.size() == 0) {
            throw new RuntimeException("nationality dropdown không có option!");
        }

        Random random = new Random();
        int index = random.nextInt(options.size());


        WebElement chosen = options.get(index);
        String nationality = chosen.getText().trim();
        System.out.println("Selected nationality: " + nationality);

        chosen.click();

        return nationality;
    }

    public void RandomDate (){
        setRandomDate(randomDate, 2023, 2030, "dd/MM/yyyy");

    }

    public void inputEmailForm(){
        waitVisible(emailForm);
        type(emailForm, email);

    }

    public void inputAddressForm (){
        type(addressForm, DataTest.addressShareholder);
    }

    public void inputnumberPhone (){
        enterPhoneNumber(phoneForm, DataTest.numberPhone);
    }

    public String selectRandomCountry() {
        waitClickable(country);
        click(country);

        List<WebElement> options = driver.findElements(
                By.xpath("//mat-option//span[contains(@class,'mat-option-text')]")
        );

        if (options.size() == 0) {
            throw new RuntimeException("nationality dropdown không có option!");
        }

        Random random = new Random();
        int index = random.nextInt(options.size());


        WebElement chosen = options.get(index);
        String country = chosen.getText().trim();
        System.out.println("Selected nationality: " + country);

        chosen.click();

        return country;
    }

    public void click_shareDistributionButton(){
        waitClickable(addShareDistributionButton);
        click(addShareDistributionButton);
    }

    public String selectRandomCurency_Shareholder() {
        waitClickable(currency_shareDistribution);
        click(currency_shareDistribution);

        List<WebElement> options = driver.findElements(
                By.xpath("//mat-option//span[contains(@class,'mat-option-text')]")
        );

        if (options.size() == 0) {
            throw new RuntimeException("nationality dropdown không có option!");
        }

        Random random = new Random();
        int index = random.nextInt(options.size());


        WebElement chosen = options.get(index);
        String curreny_Shareholder = chosen.getText().trim();
        System.out.println("Selected nationality: " + curreny_Shareholder);

        chosen.click();

        return curreny_Shareholder;
    }

    public String selectRandomShareType_Shareholder() {
        waitClickable(shareType_shareDistribution);
        click(shareType_shareDistribution);

        List<WebElement> options = driver.findElements(
                By.xpath("//mat-option//span[contains(@class,'mat-option-text')]")
        );

        if (options.size() == 0) {
            throw new RuntimeException("nationality dropdown không có option!");
        }

        Random random = new Random();
        int index = random.nextInt(options.size());


        WebElement chosen = options.get(index);
        String shareType_Shareholder = chosen.getText().trim();
        System.out.println("Selected nationality: " + shareType_Shareholder);

        chosen.click();

        return shareType_Shareholder;
    }





}
