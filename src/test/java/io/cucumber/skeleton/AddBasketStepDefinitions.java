package io.cucumber.skeleton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import drivers.Driver;
import org.openqa.selenium.WebDriver;
import pageObjectModel.AddBasketEvents;
import java.util.concurrent.TimeUnit;

public class AddBasketStepDefinitions {
    private WebDriver driver;
    AddBasketEvents event = new AddBasketEvents();

    @Given("Navigate to Website")
    public void navigate_to_website() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hepsiburada.com/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        System.out.println("Siteye gidildi.");
    }

    @And("^Click on Book, Music, Movie, Hobby category$")
    public void click_on_category() throws Throwable {
        event.clickCategoryButton();
        System.out.println("Kitap, Müzik, Film, Hoby kategorisine tıklandı.");
    }

    @And("^Click on the Remote Control Tools tab under the category$")
    public void click_on_subCategory() throws Throwable {
        event.clickSubCategoryButton();
        System.out.println("Uzaktan Kumandalı Araçlar alt kategorisine tıklandı.");
    }

    @And("^Choose one of the drone spare parts$")
    public void choose_product() throws Throwable {
        event.clickViewProduct();
        System.out.println("Drone yedek parçası bulundu.");
    }

    @When("^Add product to basket")
    public void add_product_to_basket() throws Throwable {
        event.clickAddBasket();
        System.out.println("Ürün sepete eklendi.");
    }

    @And("^Close the modal$")
    public void close_the_modal() throws Throwable {
        event.clickCloseCheckoutModal();
        System.out.println("Sepete eklendi modalı kapatıldı.");
    }

    @Then("^View basket$")
    public void view_basket() throws Throwable {
        event.clickViewBasket();
        System.out.println("Sepete ekleme işlemi başarıyla tamamlandı... ! ");
    }
}
