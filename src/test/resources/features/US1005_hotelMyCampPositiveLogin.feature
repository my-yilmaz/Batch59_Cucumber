Feature: US1005 dogru kullanici adi ve sifre ile giris yapılabilmelidir
  @HMC
  Scenario: TC08 positive login test
    Given kullanici "HMCUrl" anasayfasinda
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    And sayfayi kapatir