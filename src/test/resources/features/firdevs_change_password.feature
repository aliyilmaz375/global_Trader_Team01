Feature: US_1154_kullanici personel profil bilgilerini degistirilebilir
  Background:(BEFORE METHOD)

    Given kullanici "glb_traider" sayfasina gider
    And  kulanici glb_traider  sayfasinda sign in butonuna basar
    And kullanici email ve password girisi yapar
    And kullanici login butonuna basar




  Scenario: US_06 password bilgilerini deistirebilir .
    Given kullanici change password butonuna tiklar
    And kullanici current password girisi yapar
    And kullanici new password girer
    And kullanici confirm password girer
    Then kullanici update butonuna basar