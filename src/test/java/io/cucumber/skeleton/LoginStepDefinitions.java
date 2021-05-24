package io.cucumber.skeleton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import drivers.Driver;
import org.openqa.selenium.WebDriver;
import pageObjectModel.LoginEvents;
import java.util.concurrent.TimeUnit;

public class LoginStepDefinitions {
    private WebDriver driver;
    LoginEvents event = new LoginEvents();

    @Given("^Navigate to Hepsiburada$")
    public void navigate_to_hepsiburada() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hepsiburada.com/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        System.out.println("Siteye giriş yapıldı.");
    }

    @And("^Click on the my account$")
    public void click_on_myAccount() throws Throwable {
        event.clickMyAccount();
        System.out.println("Giriş yap veya üye ol butonuna tıklandı.");
    }

    @And("^Click on the login$")
    public void click_on_login() throws Throwable {
        event.clickLoginButton();
        System.out.println("Giriş Yap butonuna tıklandı.");
    }

    @And("^Typing a user email address$")
    public void type_email() throws Throwable {
        event.sendUserName();
        System.out.println("E-posta adresi girildi.");
    }

    @And("^Typing a user password address")
    public void type_password() throws Throwable {
        event.sendPassword();
        System.out.println("Şifre girildi.");
    }

    @When("^Click on the login button$")
    public void click_login_button() throws Throwable {
        event.clickBtnLogin();
        System.out.println("Giriş yap butonuna tıklandı.");
    }

    @Then("^Redirect home page$")
    public void view_basket() throws Throwable {
        System.out.println("Ana sayfaya dönüldü");
    }
}
