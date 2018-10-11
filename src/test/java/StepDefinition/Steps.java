package StepDefinition;

import PageFactory.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Steps {

    WebDriver driver;
    LoginPage objLoginPage;

    @Given("^Open the Firefox and launch the application$")
    public void open_the_Firefox_and_launch_the_application() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "D:\\Projects\\WiPro\\eclipse-workspace\\\\SelcuDemo\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.demo.guru99.com/v4");
        System.out.println("open FF");
    }

    @When("^Enter the Username \"(.*)\" and Password \"(.*)\"$")
    public void enter_the_Username_and_Password(String username,String password) throws Throwable
    {
        objLoginPage = new LoginPage(driver);

        objLoginPage.enterUsername(username);
        objLoginPage.enterPassword(password);
    }

    @Then("^Reset the credential$")
    public void Reset_the_credential() throws Throwable {
        objLoginPage = new LoginPage(driver);

        objLoginPage.clickResetBtn();
    }

}
