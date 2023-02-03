Feature: Senaryo Ismi
  @Smoke
  Scenario: Ilk Senaryo
    Given Ilk senaryo adimi
    When Ikinci senaryo adimi
    When Ucuncu senaryo adimi

  @Regression @Smoke
  Scenario: Ikinci Senaryo
    Given Ilk senaryo adimi
    When Ikinci senaryo adimi
