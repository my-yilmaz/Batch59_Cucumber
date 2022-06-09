# amazon sayfayasna gidip nutella, java, elma, armut aratip
  # sonuclari arama yaptigimiz kelimeyi icerdigini test edebilirim

Feature:  US1007 kullanici amazonda istedigi kelimeleri aratirsak

  Scenario Outline: TC12 amazonda listedeki elementleri aratma
    Given kullanici "amazonUrl" anasayfasinda
    Then kullanici "<istenenKelime>" icin arama yapar
    And sonuclarin "<istenenKelimeKonrol>" icerdigini test edersek
    And sayfayi kapatir

    Examples:
      | istenenKelime | istenenKelimeKonrol |
      | nutella       | nutella             |
      | java          | java                |
      | elma          | elma                |
      | armut         | armut               |