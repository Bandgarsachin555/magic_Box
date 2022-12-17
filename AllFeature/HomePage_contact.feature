Feature: ABL_Homepage

  @HomePage
  Scenario Outline: To add contact details
    Given user is on Contact page
    When use try to create Contact details
    When Enter "<Fname>" and "<Lname>" and "<CompanyName>"
    And Enter correct Status and socialChannel
    And click on do not call and do not Text
    And Enter Date of Birth
      | day | year |
      |  18 | 2000 |
  And Click on save button
    Examples: 
      | Fname  | Lname | CompanyName |
      | Sachin | patil | infosys      |
