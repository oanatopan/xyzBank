package tests;

import models.CustomerModel;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.CustomerPage;
import pages.LoginPage;
import pages.ManagerPage;
import shareData.SharedData;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class CreateCustomersTest extends SharedData {


    @Test

    public void automationTest(){
        CustomerModel testData = new CustomerModel("src/test/resources/CustomersData.json");
        LoginPage loginPage = new LoginPage( getDriver());
        loginPage.loginBankManager();

        ManagerPage managerPage = new ManagerPage (getDriver());
        managerPage.createCustomer();

        List<String> firstNameValueList = Arrays.asList("Oana1", "Oana2", "Oana3");
        List<String> lastNameValueList = Arrays.asList("Topan1", "Topan2", "Topan3");
        List<String> postCodeValueList = Arrays.asList("123", "456", "789");

        CustomerPage customerPage = new CustomerPage(getDriver());
        customerPage.createCustomersProcess(firstNameValueList, lastNameValueList, postCodeValueList);

    }
}