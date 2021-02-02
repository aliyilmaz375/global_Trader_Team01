Feature: Global Trader Login

  Scenario: TC_001_Joining the system by creating a new account with valid credentials
    Given kullanici anasayfaya gider
    Then Seller Join Now butonuna tiklar
    And Vendor Type secer
    And Sadece harflerden olusan bir company ismi girer
    And 10 haneli numaralardan olusan company mobile girer
    And Company address girer
    And Sadece harflerden olusan full name girer
    And Daha onceden kayıt olunmamıs gecerli bir email address girer
    And Page Url oalcak bir subdomain adress girer
    And 10 haneli numaralardan olusan mobile number girer
    And Dropdowndan bir country secer
    And State name girer
    And City name girer
    And Bir adres girer
    And Postal Code girer
    And Categories Dropdowndan bir category secer
    And Seller Registrationa password girer
    And * ile isaretli zorunlu alanlarin dolu oldugunu dogrular
    And Registration Buttonunu tiklar
    And Ekranda Thank you to join our team. You are Registered Successfully. yazisi gorundugunu dogrular


  Scenario: TC_002_can not Join the system by creating a new account if one of the mandatory fields is unfilled
    Given kullanici anasayfaya gider
    Then Seller Join Now butonuna tiklar
    And Vendor Type secer
    And Company name bos birakin
    And 10 haneli numaralardan olusan company mobile girer
    And Company address girer
    And Sadece harflerden olusan full name girer
    And Daha onceden kayıt olunmamıs gecerli bir email address girer
    And Page Url oalcak bir subdomain adress girer
    And 10 haneli numaralardan olusan mobile number girer
    And Dropdowndan bir country secer
    And State name girer
    And City name girer
    And Bir adres girer
    And Postal Code girer
    And Categories Dropdowndan bir category secer
    And Seller Registrationa password girer
    And Registration Buttonunu tiklar
    And Kayıt isleminin yapilamadigini dogrular


  Scenario: TC_003_can not Join the system by creating a new account if invalid credentials are used
    Given kullanici anasayfaya gider
    Then Seller Join Now butonuna tiklar
    And Vendor Type secer
    And Sadece harflerden olusan bir company ismi girer
    And 10 haneli numaralardan olusan company mobile girer
    And Company address girer
    And harflerden ve sayilardan  olusan full name girer
    And Daha onceden kayıt olunmamıs gecerli bir email address girer
    And Page Url oalcak bir subdomain adress girer
    And 10 haneli numaralardan olusan mobile number girer
    And Dropdowndan bir country secer
    And State name girer
    And City name girer
    And Bir adres girer
    And Postal Code girer
    And Categories Dropdowndan bir category secer
    And Seller Registrationa password girer
    And * ile isaretli zorunlu alanlarin dolu oldugunu dogrular
    And Registration Buttonunu tiklar
    And Kayıt isleminin yapilamadigini dogrular

  @wip
  Scenario: TC_004_can not Join the system by creating a new account if invalid credentials are used
    Given kullanici anasayfaya gider
    Then Seller Join Now butonuna tiklar
    And Vendor Type secer
    And Sadece harflerden olusan bir company ismi girer
    And 10 haneli numaralardan olusan company mobile girer
    And Company address girer
    And Sadece harflerden olusan full name girer
    And Invalid bir email address girer
    And Page Url oalcak bir subdomain adress girer
    And 10 haneli numaralardan olusan mobile number girer
    And Dropdowndan bir country secer
    And State name girer
    And City name girer
    And Bir adres girer
    And Postal Code girer
    And Categories Dropdowndan bir category secer
    And Seller Registrationa password girer
    And * ile isaretli zorunlu alanlarin dolu oldugunu dogrular
    And Registration Buttonunu tiklar
    And Kayıt isleminin yapilamadigini dogrular