package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LoginPage {
    //Find all element in Login Page
    WebDriver driver;

    @FindBy(name="uid")
    private WebElement usernameField;

    @FindBy(name="password")
    private WebElement passwordField;

    @FindBy(name="btnReset")
    private WebElement resetBtn;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);    }

    //Enter username
    public void enterUsername(String strUsername){

        usernameField.sendKeys(strUsername);

    }

    //Enter password
    public void enterPassword(String strPassword){

        passwordField.sendKeys(strPassword);

    }

    //Click on Reset button
    public void clickResetBtn(){

        resetBtn.click();

    }
}
