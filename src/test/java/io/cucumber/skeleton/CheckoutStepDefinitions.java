package io.cucumber.skeleton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.CheckoutEvents;

public class CheckoutStepDefinitions {

    CheckoutEvents event = new CheckoutEvents();

    @Given("^Typing a product name in the search bar$")
    public void product_name_searchBar() {
        event.sendProductName();
        System.out.println("Ürün search barda aratıldı..");
    }

    @And("^Select product$")
    public void select_product() throws Throwable {
        event.clickSelectProduct();
        System.out.println("Açılan sayfadan ürün seçildi .");
    }

    @And("^Add product$")
    public void add_product() throws Throwable {
        event.clickAddProduct();
        System.out.println("Seçilen ürün sepete eklendi.");
    }

    @And("^Close the success modal$")
    public void close_success_modal() throws Throwable {
        event.clickCloseCheckoutModal();
        System.out.println("Sepete eklendi modalı kapatıldı.");
    }

    @When("^Re-add from different merchant$")
    public void different_merchant() throws Throwable {
        event.clickAddDifferentMerchant();
        System.out.println("Aynı ürün başka satıcıdan sepete eklendi.");
    }

    @And("^Close the text modal$")
    public void close_text_modal() throws Throwable {
        event.clickTextClose();
        System.out.println("Onarım paketi istemiyorum kapatıldı.");
    }

    @Then("^View account basket$")
    public void view_account_basket() throws Throwable {
        event.clickViewAccountBasket();
        System.out.println("Sepete ekleme işlemi başarıyla tamamlandı... ! ");
    }
}
