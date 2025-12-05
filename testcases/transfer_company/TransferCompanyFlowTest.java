package transfer_company;

import basetest.BaseTest;
import create_new_company.Login_Page;
import org.testng.annotations.Test;



public class TransferCompanyFlowTest extends BaseTest {


    @Test
    public void TC_01_Login_Success() {
        Login_Page login = new Login_Page(driver);
        login.inputUserName();
        login.inputPassword();
        login.clickToLoginButton();
    }

    @Test
    public void TC_02_Click_Transfer() {
        Transfer_Company_Page transferTab = new Transfer_Company_Page(driver);
        transferTab.clickToTranserCompanyTab();
    }

    @Test
    public void TC_03_Transfer_Step01() {
        Transfer_Step1 step1 = new Transfer_Step1(driver);
        step1.selectRandomCountry();
    }

    @Test
    public void TC_04_Transfer_Step02() {
        Transfer_Step2 step2 = new Transfer_Step2(driver);
        step2.inputCapitalAmountForm();
        step2.inputNumberOfSharesForm();
        step2.clickDropDownList_shareCapital();







    }








}
