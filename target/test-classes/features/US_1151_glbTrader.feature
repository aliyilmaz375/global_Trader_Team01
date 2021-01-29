Feature: Global Trader Sign IN
@signin
  Scenario: TC_01 GlobalTrader Sign In Positive Test
    Given kullanici anasayfaya gider
    And Sign In butonuna tiklar
    And email girer
    And password girer
    Then Login butonuna tiklar
    Then hesabina basariyla girdigini test eder

  Scenario: TC_02 GlobalTrader Sign In Negative Test
    Given kullanici anasayfaya gider
    And Sign In butonuna tiklar
    And invalid email girer
    And password girer
    Then Login butonuna tiklar
    Then email hata mesajinin gorundugunu dogrular

  Scenario: TC_03 GlobalTrader Sign In Negative Test
    Given kullanici anasayfaya gider
    And Sign In butonuna tiklar
    And email girer
    And invalid password girer
    Then Login butonuna tiklar
    Then Sorry hata mesajinin gorundugunu dogrular

  Scenario: TC_04 GlobalTrader Logout Test
    When kullanici glbTrader hesabina gider
    Given LogOut butonuna tiklar
    And hesaptan ciktigini dogrular