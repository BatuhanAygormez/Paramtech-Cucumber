Feature: Sisteme login olma

  @test1
  Scenario: Invalid verilerle başarısız login
    Given Kullanici ilgili URL ile sayfaya ulasir.
    When Kullanici "Giriş Yap" butonuna tiklar.
    And Kullanici Kurumsal Giriş butonuna tiklar.
    And Kullanici açilan sayfada ilgili alanlari invalid verilerle doldurur ve Giriş Yap butonuna tiklar.
    Then Kullanici ekranda çikan "Hatalı bilgi girişi yaptınız." uyari mesajini dogrular.

  @test2
  Scenario: OTP ekranında uyari mesajini dogrulama
    Given Kullanici ilgili URL ile sayfaya ulasir.
    When Kullanici "Giriş Yap" butonuna tiklar.
    And Kullanici Kurumsal Giriş butonuna tiklar.
    And Kullanici Hesap Olustur butonuna tiklar.
    And Kullanici ilgili alanlari valid verilerle doldurur ve Devam butonuna tiklar.
    And Kullanici açilan OTP ekraninda ilgili alan invalid veri ile doldurur ve Onayla butonuna tiklar.
    Then Kullanici ekranda çikan "Girdiğiniz onay kodu hatalıdır." uyari mesajini dogrularr
