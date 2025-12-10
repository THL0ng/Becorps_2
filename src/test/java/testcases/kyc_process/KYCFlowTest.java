package testcases.kyc_process;

import bases.basetest.BaseTest;
import pages.create_new_company.Login_Page;
import pages.kyc_process.Companies_Page;
import pages.kyc_process.CreateCompany_Page;
import pages.kyc_process.Dashboard_Page;
import pages.kyc_process.Team_Page;
import org.testng.annotations.Test;

public class KYCFlowTest extends BaseTest {

    @Test
    public void TC_01_Login_Success() {
        Login_Page login = new Login_Page(driver);
        login.inputUserName();
        login.inputPassword();
        login.clickToLoginButton();
    }

    @Test
    public void TC_02_Change_Role_Expert() {
        Team_Page team = new Team_Page(driver);
        team.click_TeamTab();
        team.click_Impresonate();
        team.verify_Text();
    }

    @Test
    public void TC_03_KYC_selectProfile() {
        Dashboard_Page dash = new Dashboard_Page(driver);
        dash.click_KYCPending();
        dash.click_ProfileJustCreated();
    }

    @Test
    public void TC_04_UploadFiles() {
        Companies_Page com = new Companies_Page(driver);
        com.click_KYC_UBO();
        com.verifyStatus_Incomplete();

        com.click_number1_layer1();
        com.upload_Number1();

        com.click_number2_layer1();
        com.upload_Number2();

        com.click_director();
        com.upload_Director();

        com.verifyStatus_Verifying();
        com.click_ConfirmKYC();
        com.click_SureConFirm();
        com.verifyStatus_Confirmed();

    }

    @Test
    public void TC_05_Create_Company_Profile() {
        CreateCompany_Page create = new CreateCompany_Page(driver);
        create.click_CreateCompanyProfile();

        create.input_RegistrationNo();
        create.RandomDate();
        create.click_confirm_createCompanyProfile();
        create.back_CompaniesTab();
        create.Checkstatus_ActiveAndConfirmed();

    }

}
