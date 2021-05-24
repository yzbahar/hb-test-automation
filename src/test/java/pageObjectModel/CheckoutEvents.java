package pageObjectModel;

import drivers.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutEvents extends abstractClass {
    WebDriver driver;
    boolean staleElement = true;
    public CheckoutEvents(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//input[@type='text']")
    private WebElement sendProductName;
    public void sendProductName() {
        while(staleElement){
            try{
                sendKeysFunction(sendProductName,"iphone 12");
                sendProductName.sendKeys(Keys.ENTER);
                staleElement = false;
            } catch(StaleElementReferenceException e){
                staleElement = true;
            }
        }
    }

    @FindBy(xpath="//li[@class='search-item col lg-1 md-1 sm-1  custom-hover not-fashion-flex'][1]")
    private WebElement selectProduct;
    public void clickSelectProduct() {
        clickFunction(selectProduct);
    }

    @FindBy(xpath="//button[@class='button big with-icon']")
    private WebElement addProduct;
    public void clickAddProduct() {
        clickFunction(addProduct);
    }

    @FindBy(xpath = "//a[@class='checkoutui-Modal-2iZXl']")
    private WebElement closeCheckoutModal;
    public void clickCloseCheckoutModal() {
        clickFunction(closeCheckoutModal);
    }

    @FindBy(xpath="//button[@class='add-to-basket button small']")
    private WebElement addDifferentMerchant;
    public void clickAddDifferentMerchant() {
        clickFunction(addDifferentMerchant);
    }

    @FindBy(xpath="//i[@class='close']")
    private WebElement textClose;
    public void clickTextClose() {
        clickFunction(textClose);
    }


    @FindBy(xpath="//button[text()='Sepete git']")
    private WebElement viewAccountBasket;
    public void clickViewAccountBasket() {
        clickFunction(viewAccountBasket);
    }
}
