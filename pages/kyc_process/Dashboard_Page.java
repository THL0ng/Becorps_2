package kyc_process;

import basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard_Page extends BasePage {

    public Dashboard_Page(WebDriver driver) {
        super(driver);
    }



    private final By kyc_Pending = By.xpath("//p[normalize-space()='KYC Pending']");
    private final By selectProfile = By.xpath("//span[normalize-space(text())='Long24442gmail.com']");
    //private final By selectProfile = By.xpath("//span[normalize-space(text())='" + name + "']");


    public void click_KYCPending(){
        waitClickable(kyc_Pending);
        click(kyc_Pending);
    }


    public void click_Toprofile(){
        waitClickable(selectProfile);
        click(selectProfile);
    }


    public void click_ToProfile(){
        waitClickable(selectProfile);
        click_RandomCompanyName(selectProfile);
    }

}
