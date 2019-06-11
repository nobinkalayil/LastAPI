Feature:
  Verify different GET operation using REST-Assured

  Scenario: Verify one author of the post
    Given : I perform GET operation for "/post"
    And :   I perform GET for the post number "1"
    Then :   I should see the author name as "Nibin"


  Scenario: Verify post new register
    Given : I perform post operation for "/comments"
    And :   I sent post request
    Then :   I should be able to see updated register.