package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver.this);
    }
    @FindBy (XPath"//button[@ng-click='showCust()']")
    public WebElement bankManagerElement;

    public void loginBankManager(){
        bankManagerElement.click();
    };
}
