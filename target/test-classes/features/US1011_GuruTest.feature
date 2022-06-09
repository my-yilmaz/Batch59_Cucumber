Feature: US1011 web tablosundaki istenen sutunu yazdirma

  Scenario: TC_18_kullanici_sutun_basligi_ile_liste_alabilmeli
    
    Given kullanici "guruUrl" anasayfasinda
    And "IstenenBaslik", sutunundaki tum degerleri yazdirir
    And sayfayi kapatir
