@tag
Feature: Parcel

  @RegressionTest
  Scenario: Login
    Given Open Chrome start application
    When Enter valid username and password
    Then user should able to login successfully

  @RegressionTest 
  Scenario: Parametarization
    When Parametarization "mpatel1" and "Myprodpass@72"
    

 	@RegressionTest @SmokeTest
  Scenario Outline: DataDriven Parametarization
    When DataDriven "<Username>" and "<Password>"
    Then user should able to loginIn DataDriven parametarization

    Examples: 
      | Username | Password |
      | Uname1   | Pass1    |
      | Uname2   | Pass2    |

  @SmokeTest @SmokeTest
  Scenario: Data Table Parametaraization
    When DataTable username and password
      | DataTable  | DataTable  |
      | DataTable1 | DataTable1 |

  @RegressionTest
  Scenario: Data Map Parametaraization
    When DataMap username and password
      | username | password |
      | Map      | Map      |
      | Map1     | Map1     |
