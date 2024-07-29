package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    @FindBy(xpath = "//input[@name='userCardNo']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='userPassword']")
    public WebElement userpassword;

    @FindBy(xpath = "//span[normalize-space(text())='Giriş Yap']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[normalize-space(text())='Hatalı bilgi girişi yaptınız. Lütfen bilgilerinizi kontrol ediniz.']")
    public WebElement allertMessage;

    @FindBy(xpath = "//span[normalize-space(text())='Hesap Oluştur']")
    public WebElement accountButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameArea;

    @FindBy(xpath = "//input[@name='surname']")
    public WebElement surnameArea;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailArea;

    @FindBy(xpath = "//input[@name='gsmNumber']")
    public WebElement gsmNumberArea;

    @FindBy(xpath = "//div[@name='checkBox1']")
    public WebElement checkBox1;

    @FindBy(xpath = "//div[@name='checkBox2']")
    public WebElement checkBox2;

    @FindBy(xpath = "//div[@name='checkBox3']")
    public WebElement checkBox3;
    @FindBy(xpath = "//div[@name='checkBox3']")
    public WebElement checkBox4;

    @FindBy(xpath = "//span[normalize-space(text())='Devam']")
    public WebElement continueButton;


    @FindBy(xpath = "//input[@name='input1']")
    public WebElement codeCell1;

    @FindBy(xpath = "//input[@name='input2']")
    public WebElement codeCell2;

    @FindBy(xpath = "//input[@name='input3']")
    public WebElement codeCell3;

    @FindBy(xpath = "//input[@name='input4']")
    public WebElement codeCell4;

    @FindBy(xpath = "//input[@name='input5']")
    public WebElement codeCell5;

    @FindBy(xpath = "//input[@name='input6']")
    public WebElement codeCell6;

    @FindBy(xpath = "//span[normalize-space(text())='Onayla']")
    public WebElement confirmButton;

    @FindBy(xpath = "//div[@id='errorVerificationNo']")
    public WebElement allertMessageOTP;
}