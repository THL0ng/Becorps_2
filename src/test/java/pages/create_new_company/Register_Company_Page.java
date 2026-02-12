package pages.create_new_company;

import bases.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register_Company_Page extends BasePage {

    public Register_Company_Page(WebDriver driver) {
        super(driver);
    }
    private final By registerCompanyButton   = By.xpath("//a[contains(normalize-space(.), 'Register Company')]");


    public void clickToRegisterCompanyTab(){
        waitClickable(registerCompanyButton);
        click(registerCompanyButton);
    }

}
