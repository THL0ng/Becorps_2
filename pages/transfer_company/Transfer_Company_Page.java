package transfer_company;

import basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Transfer_Company_Page extends BasePage {
    public Transfer_Company_Page(WebDriver driver) {
        super(driver);
    }

    private final By transferCompanyButton = By.xpath("//a[contains(normalize-space(.), 'Transfer Company')]");

    public void clickToTranserCompanyTab(){
        waitClickable(transferCompanyButton);
        click(transferCompanyButton);
    }


}
