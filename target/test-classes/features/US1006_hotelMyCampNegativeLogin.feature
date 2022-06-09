# hotel my camp sitesinde 3 adet test seneryosu olusturalim
  # 1- yanlis password dogru username
  # 2- dogru password yanlis username
  # 3- yanlis password yanlis username
@hotelNegativeTest
Feature: US1006 yanlis biligilerle siteye giris yapilamaz

  Scenario: TC09 yanlis password ile giris yapilamaz
    Given kullanici "HMCUrl" anasayfasinda
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapamadigini kontrol eder
    And sayfayi kapatir

    Scenario:  TC10 yanlis kullanici adi ile giris yapilamaz
      Given kullanici "HMCUrl" anasayfasinda
      Then Log in yazisina tiklar
      And gecersiz username girer
      And gecerli password girer
      And Login butonuna basar
      Then sayfaya giris yapamadigini kontrol eder
      And sayfayi kapatir

  Scenario:  TC11 yanlis kullanici adi ve sifre ile giris yapilamaz
    Given kullanici "HMCUrl" anasayfasinda
    Then Log in yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapamadigini kontrol eder
    And sayfayi kapatir