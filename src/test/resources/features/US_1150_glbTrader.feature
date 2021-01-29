Feature: Global Trader Login

  Scenario: TC_01 GlobalTrader SignIn Positive Test
    Given kullanici anasayfaya gider
    And Join Now butonuna tiklar
    And email girer
    And name girer
    And mobile girer
    And password girer
    And password u dogrular
    And Sign Up butonuna tiklar
    Then Success mesajinin gorundugunu dogrular

    Scenario: TC_02 Global Trader SignIn Negative Test
      Given kullanici anasayfaya gider
      And Join Now butonuna tiklar
      And gecersiz bir email girer
      And name girer
      And mobile girer
      And password girer
      And password u dogrular
      And Sign Up butonuna tiklar
      Then email hata mesajinin gorundugunu dogrular

  Scenario: TC_03 Global Trader SignIn Negative Test
    Given kullanici anasayfaya gider
    And Join Now butonuna tiklar
    And gecersiz bir email girer
    And name girer
    And mobile girer
    And password girer
    And confirm password textbox ina baska bir password girin
    And Sign Up butonuna tiklar
    Then password hata mesajinin gorundugunu dogrular



