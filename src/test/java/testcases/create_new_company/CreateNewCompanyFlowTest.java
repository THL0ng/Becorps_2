package testcases.create_new_company;
import bases.basetest.BaseTest;
import pages.create_new_company.*;
import org.testng.annotations.Test;

public class CreateNewCompanyFlowTest extends BaseTest {

    @Test
    public void TC_01_Login_Success() {
        Login_Page login = new Login_Page(driver);
        login.inputUserName();
        login.inputPassword();
        login.clickToLoginButton();
    }

    @Test
    public void TC_02_Click_RegisterTab() {
        Register_Company_Page registertab = new Register_Company_Page(driver);
        registertab.clickToRegisterCompanyTab();
    }

    //@Test
    public void TC_03_CompanyDetail_Step1() {
        CompanyDetail_Page step_1 = new CompanyDetail_Page(driver);
        step_1.inputFirstName();
        step_1.inputSecondName();
        step_1.inputThirdName();
        step_1.inputCompanyActivity();
        step_1.inputAddressCompany();
        step_1.clickRental();
        step_1.selectAndUploadFile();
        step_1.clickSubmit();

    }

    //@Test
    public void TC_04_Capital_Step2() {
        Capital_Page step2 = new Capital_Page(driver);
        step2.inputCapitalAmountForm();
        step2.inputNumberOfSharesForm();
        step2.clickDropDownList_shareCapital();
        step2.clickShareholderButton();
        step2.clickDropDownList_shareHolder();
        step2.inputFirstNameShareholder();
        step2.inputLastNameShareholder();
        step2.clickDropDownList_IdentificationDoc();
        step2.inputidentificationForm();
        step2.inputEmailForm();
        step2.clickDropdownList_nationality();
        step2.RandomDate();
        step2.inputnumberPhone();
        step2.inputAddressForm();
        step2.clickDropDownList_Country();
        step2.click_shareDistributionButton();
        step2.clickDropDownlist_shareType();
        step2.clickDropDownlist_currency();
        step2.inputnumberOfShare_Distribution();
        step2.click_savebuttonDistributon();

        step2.clickShareholderButton();
        step2.clickDropDownList_shareHolder();
        step2.inputFirstNameShareholder();
        step2.inputLastNameShareholder2();
        step2.clickDropDownList_IdentificationDoc();
        step2.inputidentificationForm();
        step2.inputEmailForm();
        step2.clickDropdownList_nationality();
        step2.RandomDate();
        step2.inputnumberPhone();
        step2.inputAddressForm();
        step2.clickDropDownList_Country2();
        step2.click_shareDistributionButton();
        step2.clickDropDownlist_shareType();
        step2.clickDropDownlist_currency();
        step2.inputnumberOfShare_Distribution2();
        step2.click_savebuttonDistributon();

        step2.click_NomineeDirector();
        step2.click_nextStep();


    }

    //@Test
    public void TC_05_Review_Step3() {
        Review_Page review = new Review_Page(driver);
        review.click_ReviewNextButton();
    }

    //@Test
    public void TC_06_Quote_Step4() {
        Quote_Page quote = new Quote_Page(driver);
        //quote.click_Checkbox();
        quote.click_RequestButton();
    }

    //@Test
    public void TC_07_Verify_SuperAdmin_Assign_Expert() {
        Main_Request_Page main = new Main_Request_Page(driver);
        main.verifyText();
        main.click_editButton();
        main.select_And_Assign();
        main.click_submit();
        main.click_confirm();

    }

}
