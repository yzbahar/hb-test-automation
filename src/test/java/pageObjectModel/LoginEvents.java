package pageObjectModel;

import drivers.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginEvents extends abstractClass {
    WebDriver driver;

    public LoginEvents(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//div[@id='myAccount']")
    private WebElement myAccount;
    public void clickMyAccount() {
        clickFunction(myAccount);
    }

    @FindBy(xpath="//a[@id='login']")
    private WebElement loginButton;
    public void clickLoginButton() {
        clickFunction(loginButton);
    }

    @FindBy(xpath="//input[@id='txtUserName']")
    private WebElement sendUserName;
    public void sendUserName() {
        sendKeysFunction(sendUserName,"yzbahar@hotmail.com");
    }

    @FindBy(xpath="//input[@id='txtPassword']")
    private WebElement sendPassword;
    public void sendPassword() {
        sendKeysFunction(sendPassword,"Bahar1234");
    }

    @FindBy(xpath="//button[@id='btnLogin']")
    private WebElement btnLogin;
    public void clickBtnLogin() {
        clickFunction(btnLogin);
    }

}
