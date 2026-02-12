package testcases.transfer_company;

import bases.basetest.BaseTest;
import pages.create_new_company.Login_Page;
import org.testng.annotations.Test;
import pages.transfer_company.Transfer_Company_Page;
import pages.transfer_company.Transfer_Step1;
import pages.transfer_company.Transfer_Step2;


public class TransferCompanyFlowTest extends BaseTest {


    @Test
    public void TC_01_Login_And_Click_Transfer() {
        Login_Page login = new Login_Page(driver);
        Transfer_Company_Page transferTab = new Transfer_Company_Page(driver);
        login.inputUserName();
        login.inputPassword();
        login.clickToLoginButton();
        transferTab.clickToTranserCompanyTab();
    }

    @Test
    public void TC_02_Transfer_Step01() {
        Transfer_Step1 step1 = new Transfer_Step1(driver);
        step1.selectRandomCountry();
    }

    @Test
    public void TC_03_Transfer_Step02() {
        Transfer_Step2 step2 = new Transfer_Step2(driver);
        step2.inputCapitalAmountForm();
        step2.inputNumberOfSharesForm();
        step2.selectRandomCurency();
        step2.selectRandomShareType();


        step2.clickShareholderButton();
        step2.selectRandomGender();
        step2.inputTransfer_FirstNameShareholder();
        step2.inputTransfer_LastNameShareholder();
        step2.selectRandomIden();
        step2.inputidentificationForm();
        step2.selectRandomNationality();
        step2.RandomDate();
        step2.inputEmailForm();
        step2.inputAddressForm();
        step2.inputnumberPhone();
        step2.selectRandomCountry();

        step2.click_shareDistributionButton();
        step2.selectRandomShareType_Shareholder();
        step2.selectRandomCurency_Shareholder();

        step2.handleShareDistributionFlow();



        step2.clickShareholderButton();
        step2.selectRandomGender();
        step2.inputTransfer_FirstNameShareholder();
        step2.inputTransfer_LastNameShareholder();
        step2.selectRandomIden();
        step2.inputidentificationForm();
        step2.selectRandomNationality();
        step2.RandomDate();
        step2.inputEmailForm();
        step2.inputAddressForm();
        step2.inputnumberPhone();
        step2.selectRandomCountry();
        step2.click_shareDistributionButton();
        step2.selectRandomShareType_Shareholder();
        step2.selectRandomCurency_Shareholder();

        step2.handleShareDistributionFlow();


    }








}
