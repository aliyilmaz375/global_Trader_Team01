Feature: Global Trader
  Scenario: TC_01 sepete urun ekleme
    Given kullanici anasayfaya gider
    And Computer Office kategorisini secer
    And kullanici arama butonuna basar
    And kullanici ilk urune tiklar
    And kullanici Buy Now butonuna tiklar
    And kullanici glbTrader hesabina gider
    Then kullanici sepette urun oldugunu dogrular

