Feature: US_1152_Seller_Sıgn_In

  Scenario: TC_001 GlobalTrader Seller Sign In Positive Test
    Given kullanici anasayfaya gider
    And Seller Sign In butonuna tiklar
    And Seller valid email girer
    And Seller valid password girer
    Then Seller Login butonuna tiklar
    Then Seller hesabina basariyla girdigini test eder

  Scenario: TC_002 GlobalTrader Seller Sign In Negative Test
    Given kullanici anasayfaya gider
    And Seller Sign In butonuna tiklar
    And Seller invalid email girer
    And Seller valid password girer
    Then Seller Login butonuna tiklar
    Then Seller hesabina login olamadıgını test eder

  Scenario: TC_003 GlobalTrader Seller Sign In Negative Test
    Given kullanici anasayfaya gider
    And Seller Sign In butonuna tiklar
    And Seller valid email girer
    And Seller invalid password girer
    Then Seller Login butonuna tiklar
    Then Seller hesabina login olamadıgını test eder

  Scenario: TC_03 GlobalTrader Seller Sign In Negative Test
    Given kullanici anasayfaya gider
    And Seller Sign In butonuna tiklar
    And Seller invalid email girer
    And Seller invalid password girer
    Then Seller Login butonuna tiklar
    Then Seller hesabina login olamadıgını test eder

