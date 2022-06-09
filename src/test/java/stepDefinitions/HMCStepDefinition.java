package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HotelmycampPage;
import utilities.ConfigReader;

public class HMCStepDefinition {
    HotelmycampPage hmc = new HotelmycampPage();

    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
        hmc.logIn.click();
    }

    @Then("gecerli username girer")
    public void gecerli_username_girer() {
        hmc.username.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
    }

    @Then("gecerli password girer")
    public void gecerli_password_girer() {
        hmc.password.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
    }

    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        hmc.submitButonu.click();
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertTrue(hmc.kullaniciProfilIsmi.isDisplayed());
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hmc.password.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
    }

    @Then("sayfaya giris yapamadigini kontrol eder")
    public void sayfayaGirisYapamadiginiKontrolEder() {
        Assert.assertTrue(hmc.submitButonu.isDisplayed());
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        hmc.password.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
    }

    @And("gecersiz username olarak {string} girer")
    public void gecersizUsernameOlarakGirer(String username) {
        hmc.username.sendKeys(username);
    }

    @And("gecersiz password olarak {string} girer")
    public void gecersizPasswordOlarakGirer(String password) {
    hmc.password.sendKeys(password);
    }
}
