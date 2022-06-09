package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon anasayfasinda")
    public void kullanici_amazon_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Then("kullanici Nutalla icin arama yapar")
    public void kullanici_nutalla_icin_arama_yapar() {

        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }

    @Then("sonuclarin Nutella icerdigini test edersek")
    public void sonuclarin_nutella_icerdigini_test_edersek() {
        String expecteKelime = "Nutella";
        String actualKelime = amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualKelime.contains(expecteKelime));

    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici Java icin arama yapar")
    public void kullaniciJavaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);

    }

    @And("sonuclarin Java icerdigini test eder")
    public void sonuclarinJavaIcerdiginiTestEder() {
        String expecteKelime = "Java";
        String actualKelime = amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualKelime.contains(expecteKelime));
    }

    @And("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {

        amazonPage.aramaKutusu.sendKeys("Iphone" + Keys.ENTER);

    }

    @Then("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String expecteKelime = "Iphone";
        String actualKelime = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualKelime.contains(expecteKelime));
    }

    @Given("kullanici {string} icin arama yapar")
    public void kullanici_icin_arama_yapar(String istenenKelime) {
        amazonPage.aramaKutusu.sendKeys(istenenKelime + Keys.ENTER);
    }

    @Given("sonuclarin {string} icerdigini test edersek")
    public void sonuclarin_icerdigini_test_edersek(String istenenKelime) {
        String expecteKelime = istenenKelime;
        String actualKelime = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualKelime.contains(expecteKelime));
    }

    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @And("url'in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String istenenKelime) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }

    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenenSaniye) {
        try {
            Thread.sleep(istenenSaniye * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
