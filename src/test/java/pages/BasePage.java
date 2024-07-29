package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//button[normalize-space(text())='Çerezleri Kabul Et']")
    public WebElement acceptCookies;

    @FindBy(xpath = "//a[normalize-space(text())='Giriş Yap']")
    public WebElement loginbutton;

    @FindBy(xpath = "(//a[normalize-space(text())='Kurumsal Giriş'])[2]")
    public WebElement institutionalButton;
}
