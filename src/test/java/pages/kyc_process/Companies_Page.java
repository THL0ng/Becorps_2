package pages.kyc_process;

import bases.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Companies_Page extends BasePage {
    public Companies_Page(WebDriver driver) {
        super(driver);
    }

    private final By kyc_Ubo = By.xpath("//div[normalize-space()='KYC/UBO']");
    private final By status_Incomplete = By.xpath("//span[normalize-space()='Incomplete']");
    private final By number_1 = By.xpath("//span[normalize-space()='Number 1_ Layer1']");
    private final By number_2 = By.xpath("//span[normalize-space()='Number 2_ Layer1']");
    private final By proofAddress_Number1 = By.xpath("//mat-expansion-panel[.//*[contains(normalize-space(),'Number 1_ Layer1')]]//p[normalize-space()='PROOF_OF_ADDRESS']/ancestor::section[contains(@class,'officers-container')]//div[contains(@class,'w-[15%]')]//button");
    private final By passport_Number1 = By.xpath("//mat-expansion-panel[.//*[contains(normalize-space(),'Number 1_ Layer1')]]//p[normalize-space()='PASSPORT']/ancestor::section[contains(@class,'officers-container')]//div[contains(@class,'w-[15%]')]//button");
    private final By proofAddress_Number2 = By.xpath("//mat-expansion-panel[.//*[contains(normalize-space(),'Number 2_ Layer1')]]//p[normalize-space()='PROOF_OF_ADDRESS']/ancestor::section[contains(@class,'officers-container')]//div[contains(@class,'w-[15%]')]//button");
    private final By passport_Number2 = By.xpath("//mat-expansion-panel[.//*[contains(normalize-space(),'Number 2_ Layer1')]]//p[normalize-space()='PASSPORT']/ancestor::section[contains(@class,'officers-container')]//div[contains(@class,'w-[15%]')]//button");
    private final By director = By.xpath("//span[normalize-space()='Director:']");



    //private final By passport_Director = By.xpath("//mat-expansion-panel[.//*[contains(normalize-space(),' Nominee _ Long17146gmail.com ')]]//p[normalize-space()='PASSPORT']/ancestor::section[contains(@class,'officers-container')]//div[contains(@class,'w-[15%]')]//button");
    private final By passport_Director = By.xpath("//mat-expansion-panel[.//*[contains(normalize-space(),'Director:')]]//p[normalize-space()='PASSPORT']/ancestor::section[contains(@class,'officers-container')]//div[contains(@class,'w-[15%]')]//button");

    //private final By proofAddress_Director = By.xpath("//mat-expansion-panel[.//*[contains(normalize-space(),' Nominee _ Long17146gmail.com ')]]//p[normalize-space()='PROOF_OF_ADDRESS']/ancestor::section[contains(@class,'officers-container')]//div[contains(@class,'w-[15%]')]//button");
    private final By proofAddress_Director = By.xpath("//mat-expansion-panel[.//*[contains(normalize-space(),'Director:')]]//p[normalize-space()='PROOF_OF_ADDRESS']/ancestor::section[contains(@class,'officers-container')]//div[contains(@class,'w-[15%]')]//button");



    private final By status_Verifying = By.xpath("//span[normalize-space()='Verifying']");
    private final By confirmKYC_Button = By.xpath("//button[normalize-space()='upload_file Confirm KYC']");
    private final By sure_confirmKYC = By.xpath("//span[normalize-space()='Confirm']");
    private final By status_Confirmed = By.xpath("//span[normalize-space()='Confirmed']");



    public void click_KYC_UBO (){
        waitClickable(kyc_Ubo);
        click(kyc_Ubo);
    }


    public void verifyStatus_Incomplete(){
        waitVisible(status_Incomplete);
        Assert.assertEquals(getText(status_Incomplete), "Incomplete");
    }


    public void click_number1_layer1(){
        waitClickable(number_1);
        click(number_1);
    }


    public void upload_Number1(){
        waitClickable(proofAddress_Number1);
        click(proofAddress_Number1);
        uploadFileWithRobotBackup("01.png");
        waitClickable(number_1);
        click(number_1);
        waitClickable(passport_Number1);
        click(passport_Number1);
        uploadFileWithRobotBackup("01.png");

    }


    public void click_number2_layer1(){
        waitClickable(number_2);
        click(number_2);
    }


    public void upload_Number2(){
        waitClickable(proofAddress_Number2);
        click(proofAddress_Number2);
        uploadFileWithRobotBackup("01.png");
        waitClickable(number_2);
        click(number_2);
        waitClickable(passport_Number2);
        click(passport_Number2);
        uploadFileWithRobotBackup("01.png");

    }


    public void click_director(){
        waitClickable(director);
        click(director);
    }

    public void upload_Director(){
        waitClickable(passport_Director);
        click(passport_Director);
        uploadFileWithRobotBackup("01.png");
        waitClickable(director);
        click(director);
        waitClickable(proofAddress_Director);
        click(proofAddress_Director);
        uploadFileWithRobotBackup("01.png");

    }

    public void verifyStatus_Verifying() {
        waitVisible(status_Verifying);
        Assert.assertEquals(getText(status_Verifying), "Verifying");
    }


    public void click_ConfirmKYC(){
        waitClickable(confirmKYC_Button);
        click(confirmKYC_Button);

    }

    public void click_SureConFirm(){
        waitClickable(sure_confirmKYC);
        click(sure_confirmKYC);
    }


    public void verifyStatus_Confirmed(){
        waitVisible(status_Confirmed);
        Assert.assertEquals(getText(status_Confirmed), "Confirmed");

    }

}
