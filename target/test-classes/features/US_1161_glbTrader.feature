Feature: US004 SearchBox ve DropDown Kontrol

  Scenario: TC_001 SearchBox tiklayip  WomenChiffon yazdirma

    Given kullanici glabaltrader anasayfaya gider
    And kullanici searchbox kutusuna " WomenChiffon" yazdirir
    And kullanici arama butonuna basar
    Then kullanici searchbox kutusunun butonunun calisip calismadigini kontrol eder
    And kullanici sayfayi kapatir

  Scenario: TC_002 DropDown a tiklayip Furniture yazdirma

    Given  kullanici glabaltrader anasayfaya gider
    And kullanici AllCategories kutusuna "Furniture" yazdirir
    And kullanici arama butonuna basar
    Then kullanici AllCatagories butonunun calisip calismadigini kontrol eder
    And kullanici sayfayi kapatir


  Scenario: TC_003 DropDown da Women Clothing & Accessories kategorisindede ilk cikan  sonucunu Women Chiffon olup olmadigini kontrol etme

    Given kullanici glabaltrader anasayfaya gider
    And kullanici AllCategories kutusuna "Women Clothing & Accessories" yazdirir
    And kullanici arama butonuna basar
    Then allcategorisinde cikan sonuculardan ilk urununun olup WomenChiffon olmadigini kontrol eder kontrol eder
    And kullanici sayfayi kapatir

  Scenario: TC_004 Search Box kutusuna WomenChiffon yazdirma ve cikan sonucun Women Chiffon olup olmadigini kontrol etme

    Given kullanici glabaltrader anasayfaya gider
    And kullanici searchbox kutusuna "WomenChiffon " yazdirir
    And kullanici ilk urune tiklar
    Then kullanici cikan sonucun WomenChiffon  olup olmadigini kontrol eder
    And kullanici sayfayi kapatir


  Scenario: TC_005 TC_003de cikan sonucu ve TC_004 de cikan sonuclari karsilastirma
    Then allcategorisinde  ve searchboxda cikan sonuclari karsilastirma

  Scenario: TC_006 globaltrader  facebook sayfasi kontroletme

    Given kullanici glabaltrader anasayfaya gider
    And kullanici sayfanin en altina gider
    And kullanici facebook butonuna basar
    Then kullanici facebook sayfasinda globaltrader sayfasi olup olmadigini test eder
    And kullanici sayfayi kapatir

  Scenario:TC_007 glabaltrader twitter sayfasini kontrol etme

    Given kullanici glabaltrader anasayfaya gider
    And  kullanici sayfanin en altina gider
    And kullanici twitter butonuna basar
    Then kullanici twitter sayfasinda globaltrader sayfasinda olup olmadigini test eder
    And kullanici sayfayi kapatir
