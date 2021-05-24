package pageObjectModel;

import drivers.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddBasketEvents extends abstractClass {
     WebDriver driver;

    public AddBasketEvents(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "ul.sf-MenuItems-1Sj7h>:nth-of-type(9)")
    private WebElement categoryButton;
    public void clickCategoryButton() {
        clickFunction(categoryButton);
    }

    @FindBy(xpath = "//span[text()='Uzaktan Kumandalı Araçlar']")
    private WebElement subCategoryButton;
    public void clickSubCategoryButton() {
        clickFunction(subCategoryButton);
    }

    @FindBy(xpath = "//span[text()='Corby CDA01 Drone Aksesuar Paketi CX015-SD01 Uyumlu']")
    private WebElement viewProduct;
    public void clickViewProduct() {
        clickFunction(viewProduct);
    }

    @FindBy(xpath = "//button[@class='button big with-icon']")
    private WebElement addBasket;
    public void clickAddBasket() {
        clickFunction(addBasket);
    }

    @FindBy(xpath = "//a[@class='checkoutui-Modal-2iZXl']")
    private WebElement closeCheckoutModal;
    public void clickCloseCheckoutModal() {
        clickFunction(closeCheckoutModal);
    }

    @FindBy(xpath = "//a[@class='sf-OldMyAccount-2OvEz sf-OldMyAccount-3TYPj']")
    private WebElement viewBasket;
    public void clickViewBasket() {
        clickFunction(viewBasket);
    }

}
