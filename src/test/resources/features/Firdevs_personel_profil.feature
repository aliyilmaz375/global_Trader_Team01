

Feature: US_1154_kullanici personel profil bilgilerini degistirilebilir
  Background:(BEFORE METHOD)

    Given kullanici "glb_traider" sayfasina gider
    And  kulanici glb_traider  sayfasinda sign in butonuna basar
    And kullanici email ve password girisi yapar
    And kullanici login butonuna basar


  Scenario:   Us _07 kullanici personel bilgilerini degistirebilir

    Given kullanici personel profile butonuna tiklar
    And kullanici edit butonuna tiklar
    And kullanici name girer
    And kullanici mobil number girer
    When kullanici adress girer
    And  kullanici landline secer
#    And kullanici country secer
#    And kullanici state girer
 #   And kullanici city secer


    Then kullanici update2 butonuna tiklayip bilgileri update eder

