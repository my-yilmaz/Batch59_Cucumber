Feature: US1004 kullanici parametre ile configuration file'i kullanabilmeli

  @config
  Scenario: TC07 configuration properties dosyasindan parametre kullanimi
    Given kullanici "facebookUrl" anasayfasinda
    Then kullanici 2 saniye bekler
    And url'in "face" icerdigini test eder
    Then sayfayi kapatir