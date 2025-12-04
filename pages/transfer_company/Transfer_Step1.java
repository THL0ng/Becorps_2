package transfer_company;

import basepage.BasePage;
import commons.DataTest;
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



    public void click_ToDropDownList(){
        waitClickable(click_Dropdown);
        click(click_Dropdown);
    }

    public void selectRandomOption(WebDriver driver) {

        // Lấy tất cả option text trong dropdown
        List<WebElement> options = driver.findElements(
                By.xpath("//mat-option//span[contains(@class,'mat-option-text')]")
        );

        if (options.size() == 0) {
            throw new RuntimeException("Dropdown không có option nào!");
        }

        // Random index
        Random random = new Random();
        int index = random.nextInt(options.size()); // từ 0 → size-1

        WebElement chosen = options.get(index);

        // Click option
        chosen.click();

        System.out.println("Selected option: " + chosen.getText().trim());
    }

    public void input_CompanyName(){
        waitClickable(companyName);
        type(companyName, DataTest.companyName);
    }

    public void input_registrationNumber(){
        waitClickable(registrationNumber);
        type(registrationNumber, String.valueOf(DataTest.registrationNumber));
    }

    public void RandomDate (){
        setRandomDate(incorporationDate, 2023, 2030, "dd/MM/yyyy");

    }

    public void input_CompanyActivity(){
        waitClickable(companyActivityForm);
        type(companyActivityForm, "Ecommerce");
    }


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






}
