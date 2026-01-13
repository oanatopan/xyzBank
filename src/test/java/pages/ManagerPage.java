package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    public ManagerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver.this);
    }
    @FindBy (xpath = "//button[@ng-click='showCust()']")
    public WebElement addCustomerElement;

    public void loginBankManager(){
        addCustomerElement.click();
    };
}
