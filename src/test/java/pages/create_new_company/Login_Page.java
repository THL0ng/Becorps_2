package pages.create_new_company;

import bases.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static data.commons.DataTest.password;
import static data.commons.DataTest.userName;

public class Login_Page extends BasePage {

        public Login_Page(WebDriver driver) {
        super(driver);
    }

        private final By usernameField = By.xpath("//input[@type='email']");
        private final By passwordField = By.xpath("//input[@type='password']");
        private final By loginButton = By.xpath("//button[@type='submit']");


        public void inputUserName (){
            type(usernameField, userName);
            waitVisible(usernameField);
        }

        public void inputPassword (){
            type(passwordField, password);
            waitVisible(passwordField);
        }


        public void clickToLoginButton(){
            click(loginButton);
        }

    }

