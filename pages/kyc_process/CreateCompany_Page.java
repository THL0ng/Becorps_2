package kyc_process;

import basepage.BasePage;
import commons.DataTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static commons.DataTest.firstName;

public class CreateCompany_Page extends BasePage {

    public CreateCompany_Page(WebDriver driver) {
        super(driver);
    }



    private final By create_company_profile = By.xpath("//span[normalize-space()='Create Company Profile']");

    private final By input_Registration = By.xpath("//mat-label[normalize-space()='Registration No']/following::input[@formcontrolname='registrationNumber'][1]");
    private final By incorporationDate = By.xpath("//mat-label[normalize-space()='Incorporation Date']/following::input[@formcontrolname='registrationDate'][1]");

    private final By confirm_createCompanyProfile = By.xpath("//mat-dialog-actions//span[normalize-space()='Create Company Profile']");
    private final By back_to_companies = By.xpath("//a[contains(normalize-space(.), 'Companies')]");


    public void click_CreateCompanyProfile(){
        waitClickable(create_company_profile);
        click(create_company_profile);
    }


    public void input_RegistrationNo(){
        waitClickable(input_Registration);
        type(input_Registration,"123");
    }


    public void RandomDate (){
        setRandomDate(incorporationDate, 2023, 2030, "dd/MM/yyyy");

    }


    public void click_confirm_createCompanyProfile(){
        waitClickable(confirm_createCompanyProfile);
        click(confirm_createCompanyProfile);
    }

    public void back_CompaniesTab(){
        waitClickable(back_to_companies);
        click(back_to_companies);
    }



    public Map<String, String> KYC_Status(WebDriver driver, String companyName) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement row = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath(
                                "//tr[contains(@class,'mat-row')]" +
                                        "[.//td[contains(@class,'mat-column-name')]//span" +
                                        "[contains(normalize-space(),'" + companyName + "')]]"
                        )
                )
        );

        String companyStatus = row
                .findElement(By.cssSelector("td.mat-column-status app-status"))
                .getText()
                .trim();

        String kycStatus = row
                .findElement(By.xpath("(//td[contains(@class,'mat-column-kycStatus')]//span[contains(@class,'status-wrapper')])[1]"))
                .getText()
                .trim();

        Map<String, String> result = new HashMap<>();
        result.put("companyStatus", companyStatus);
        result.put("kycStatus", kycStatus);

        return result;

    }




    public Map<String, String> KYC_Status_FirstRow(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Step 1: Lấy Company Name đầu tiên
        String firstCompanyName = driver.findElement(
                By.xpath("//tbody//tr[contains(@class,'mat-row')][1]//td[contains(@class,'mat-column-name')]//span")
        ).getText().trim();

        // Step 2: XPATH của em nhưng thay companyName = firstCompanyName
        WebElement row = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//tr[contains(@class,'mat-row')]" +
                                "[.//td[contains(@class,'mat-column-name')]//span" +
                                "[contains(normalize-space(),'" + firstCompanyName + "')]]")
                )
        );

        String companyStatus = row
                .findElement(By.cssSelector("td.mat-column-status app-status"))
                .getText()
                .trim();

        String kycStatus = row
                .findElement(By.xpath("(//td[contains(@class,'mat-column-kycStatus')]//span[contains(@class,'status-wrapper')])[1]"))
                .getText()
                .trim();

        Map<String, String> result = new HashMap<>();
        result.put("companyStatus", companyStatus);
        result.put("kycStatus", kycStatus);

        return result;

    }








    public void Checkstatus_ActiveAndConfirmed(){
        CreateCompany_Page create = new CreateCompany_Page(driver);
        //Map<String, String> status = create.KYC_Status(driver, "Long5711gmail.com");
        Map<String, String> status = create.KYC_Status_FirstRow(driver);
        Assert.assertEquals(status.get("companyStatus"), "Active");
        Assert.assertEquals(status.get("kycStatus"), "Incomplete");

    }





}













    

