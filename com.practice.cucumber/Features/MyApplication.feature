
@tag
Feature: Parcel

  @tag1
  Scenario: Login
    Given Open Chrome start application
    When Enter valid username and password
    Then user should able to login successfully

  @tag2
  Scenario: Parametarization
    When Enter valid "mpatel1" and "Myprodpass@72"
    Then user should able to login in parametarization

  @tag3
  Scenario Outline: DataDriven Parametarization
    When DataDriven "<Username>" and "<Password>"

    Examples: 
      | Username | Password |
      | Uname1   | Pass1    |
      | Uname2   | Pass2    |
      | Uname3   | Pass3    |
