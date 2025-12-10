package pages.transfer_company;

import bases.basepage.BasePage;
import data.commons.DataTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class Transfer_Step1 extends BasePage {
    public Transfer_Step1(WebDriver driver) {
        super(driver);
    }

    private final By click_Dropdown = By.xpath("//mat-label[normalize-space()='Country of Incorporation']/ancestor::mat-form-field//div[contains(@class,'mat-select-trigger')]");
    private final By companyName = By.xpath("//mat-label[text()='Company Name']/ancestor::mat-form-field//input");
    private final By registrationNumber = By.xpath("//mat-label[text()='Registration Number']/ancestor::mat-form-field//input");
    private final By incorporationDate = By.xpath("//input[@formcontrolname='registrationDate']");
    private final By companyActivityForm = By.xpath("//mat-label[text()='Company activity']/ancestor::mat-form-field//textarea");
    private final By yesOption = By.xpath("//mat-radio-button[.//span[@class='mat-radio-label-content' and contains(normalize-space(),'Yes')]]");
    private final By noOption = By.xpath("//mat-radio-button[.//span[@class='mat-radio-label-content' and contains(normalize-space(),'No')]]");
    private final By click_uploadFile = By.xpath("//ngx-dropzone-label[contains(@class,'dropzone-upload__label')]");
    private final By ourAddressSing = By.xpath("//mat-radio-button[.//span[normalize-space()='Singapore'] and .//p[contains(normalize-space(),'Use your own address')]]");
    private final By ourRegisteredAddress = By.xpath("//mat-radio-button[.//p[contains(normalize-space(),'Use our registered address')]]");
    private final By addressLine = By.xpath("//input[@formcontrolname='address']/ancestor::mat-form-field//input");
    private final By rentalForm = By.xpath("//ngx-dropzone-label[text()=' Upload rental agreement document']");
    private final By nextButton = By.xpath("//button[@type='submit']");



    public void selectRandomYesNo() {
        Random random = new Random();
        int pick = random.nextInt(2);  // 0 hoặc 1

        if (pick == 0) {
            driver.findElement(yesOption).click();
            System.out.println("Random picked: YES");

            try {
                click(click_uploadFile);
                uploadFileWithRobotBackup("01.png");
            } catch (Exception e) {
                System.out.println("Upload failed: " + e.getMessage());
            }
        } else {
            driver.findElement(noOption).click();
            System.out.println("Random picked: NO");
        }

    }

    public void handleSingaporeAddressSection() {
        Random random = new Random();
        int pick = random.nextInt(2);   // 0 = own address, 1 = registered address

        if (pick == 0) {
            System.out.println("Picked: Use your own address → filling form");
            click(ourAddressSing);
            fillOwnAddressDetails();


        } else {
            System.out.println("Picked: Use registered address → skipping fields");
            click(ourRegisteredAddress);
            useOurRegisteredAddressDetails();

        }

    }

    public void fillOwnAddressDetails() {

        waitClickable(companyName);
        type(companyName, DataTest.companyName);
        waitClickable(registrationNumber);
        type(registrationNumber, String.valueOf(DataTest.registrationNumber));
        setRandomDate(incorporationDate, 2023, 2030, "dd/MM/yyyy");
        waitClickable(companyActivityForm);
        type(companyActivityForm, "Ecommerce");
        selectRandomYesNo();

        waitClickable(addressLine);
        type(addressLine, "HCM City");
        waitClickable(rentalForm);
        click(rentalForm);
        uploadFileWithRobotBackup("01.png");
        waitClickable(nextButton);
        click(nextButton);
    }

    public void useOurRegisteredAddressDetails() {

        waitClickable(companyName);
        type(companyName, DataTest.companyName);
        waitClickable(registrationNumber);
        type(registrationNumber, String.valueOf(DataTest.registrationNumber));
        setRandomDate(incorporationDate, 2023, 2030, "dd/MM/yyyy");
        waitClickable(companyActivityForm);
        type(companyActivityForm, "Ecommerce");
        selectRandomYesNo();
        waitClickable(nextButton);
        click(nextButton);
    }

    public void fillAddressFormHK(){
        waitClickable(companyName);
        type(companyName, DataTest.companyName);
        waitClickable(registrationNumber);
        type(registrationNumber, String.valueOf(DataTest.registrationNumber));
        setRandomDate(incorporationDate, 2023, 2030, "dd/MM/yyyy");
        waitClickable(companyActivityForm);
        type(companyActivityForm, "Ecommerce");
        selectRandomYesNo();

        waitClickable(addressLine);
        type(addressLine,"Inazuma");
        waitClickable(rentalForm);
        click(rentalForm);
        uploadFileWithRobotBackup("01.png");
    }

    public String selectRandomCountry() {
        waitClickable(click_Dropdown);
        click(click_Dropdown);

        List<WebElement> options = driver.findElements(
                By.xpath("//mat-option//span[contains(@class,'mat-option-text')]")
        );

        if (options.size() == 0) {
            throw new RuntimeException("Dropdown không có option nào!");
        }

        Random random = new Random();
        int index = random.nextInt(options.size());

        WebElement chosen = options.get(index);
        chosen.click();

        String country = chosen.getText().trim();
        System.out.println("Selected option: " + country);

        return handleAddressByCountry (country);
    }

    public String handleAddressByCountry(String selectedCountry) {

        switch (selectedCountry.toLowerCase()) {

            case "singapore":
                System.out.println("→ Country = Singapore → apply Singapore logic");
                handleSingaporeAddressSection();
                break;

            case "hong kong":
                System.out.println("→ Country = Hong Kong → fill address normally");
                fillAddressFormHK();
                click(nextButton);
                break;

            default:
                System.out.println("→ Unknown country → skip");
                click(nextButton);
                break;
        }
        return selectedCountry;
    }

}




























