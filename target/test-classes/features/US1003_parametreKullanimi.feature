
Feature: US1003 kullanici parametre kullanarak arama yapabilmeli

  @parametre
  Scenario: TC06 kullanici parametre ile amazonda arama yapabilmeli
    Given kullanici amazon anasayfasinda
    And kullanici "One Punch Man" icin arama yapar
    And sonuclarin "One Punch Man" icerdigini test edersek
    Then sayfayi kapatir