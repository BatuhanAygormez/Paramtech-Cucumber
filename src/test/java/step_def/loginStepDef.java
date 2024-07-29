package step_def;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class loginStepDef {

    BasePage basePage = new BasePage() {}; 
    LoginPage loginPage = new LoginPage();
    Actions action = new Actions(Driver.getDriver());

    @Given("Kullanici ilgili URL ile sayfaya ulasir.")
    public void kullanici_ilgili_url_ile_sayfaya_ulasir() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
        BrowserUtils.waitFor(2);
    }

    @And("Kullanici {string} butonuna tiklar.")
    public void kullanici_butonuna_tiklar(String string) {
        basePage.acceptCookies.click();
        BrowserUtils.waitFor(2);
        basePage.loginbutton.click();
        BrowserUtils.waitFor(2);
    }

    @And("Kullanici Kurumsal Giriş butonuna tiklar.")
    public void kullanici_kurumsal_giriş_butonuna_tiklar() {
        action.click(basePage.institutionalButton).build().perform(); // Using action class to click
        BrowserUtils.waitFor(2);
    }

    @And("Kullanici açilan sayfada ilgili alanlari invalid verilerle doldurur ve Giriş Yap butonuna tiklar.")
    public void kullanici_açilan_sayfada_ilgili_alanlari_invalid_verilerle_doldurur_ve_giriş_yap_butonuna_tiklar() {
        BrowserUtils.switchToWindow("Param™ | Türkiye'nin Elektronik Parası"); // Switch to new tab
        BrowserUtils.waitFor(2);
        loginPage.userName.sendKeys("98765432109");
        BrowserUtils.waitFor(2);
        loginPage.userpassword.sendKeys("123456789");
        BrowserUtils.waitFor(2);
        action.click(loginPage.signInButton).build().perform();
        BrowserUtils.waitFor(2);
    }

    @Then("Kullanici ekranda çikan {string} uyari mesajini dogrular.")
    public void kullanici_ekranda_çikan_uyari_mesajini_dogrular(String actualAlertmessage) {
        String expectedMessage = loginPage.allertMessage.getText();
        Assert.assertTrue(expectedMessage.contains(actualAlertmessage));
    }

    @When("Kullanici Hesap Olustur butonuna tiklar.")
    public void kullanici_hesap_olustur_butonuna_tiklar() {
        BrowserUtils.switchToWindow("Param™ | Türkiye'nin Elektronik Parası");
        BrowserUtils.waitFor(2);
        action.click(loginPage.accountButton).build().perform();
        BrowserUtils.waitFor(2);
    }

    @When("Kullanici ilgili alanlari valid verilerle doldurur ve Devam butonuna tiklar.")
    public void kullanici_ilgili_alanlari_valid_verilerle_doldurur_ve_devam_butonuna_tiklar() {
        loginPage.nameArea.sendKeys("deneme");
        BrowserUtils.waitFor(2);
        loginPage.surnameArea.sendKeys("deneme");
        BrowserUtils.waitFor(2);
        loginPage.emailArea.sendKeys("paramtechtestcase@gmail.com");
        BrowserUtils.waitFor(2);
        loginPage.gsmNumberArea.sendKeys("5556667788");
        BrowserUtils.waitFor(2);
        loginPage.checkBox1.click();
        BrowserUtils.waitFor(2);
        loginPage.checkBox2.click();
        BrowserUtils.waitFor(2);
        loginPage.checkBox3.click();
        BrowserUtils.waitFor(2);
        action.click(loginPage.continueButton).build().perform();
        BrowserUtils.waitFor(2);
    }

    @When("Kullanici açilan OTP ekraninda ilgili alan invalid veri ile doldurur ve Onayla butonuna tiklar.")
    public void kullanici_açilan_otp_ekraninda_ilgili_alan_invalid_veri_ile_doldurur_ve_onayla_butonuna_tiklar() {
        for (int i = 1; i < 7; i++) {
            String locator = "//input[@name='input" + i + "']";
            Driver.getDriver().findElement(By.xpath(locator)).sendKeys("" + i + "");
            BrowserUtils.waitFor(2);
        }
        action.click(loginPage.confirmButton).build().perform();
        BrowserUtils.waitFor(2);
    }

    @Then("Kullanici ekranda çikan {string} uyari mesajini dogrularr")
    public void kullanici_ekranda_çikan_uyari_mesajini_dogrulamali(String actualAlertmessageOTP) {
        String expectedMessage = loginPage.allertMessageOTP.getText();
        Assert.assertTrue(expectedMessage.contains(actualAlertmessageOTP));
    }

    @Given("Kullanıcı belirtilen URL üzerinden sayfaya erişir")
    public void Kullan_c_belirtilen_URL_zerinden_sayfaya_eri_ir() {
    }
}
