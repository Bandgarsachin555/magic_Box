Feature: ABL

  @HomePage
  Scenario Outline: To verify HomePage dashboard and Add company details
    When user click on company tab
    Then click on Edit button and add employee
    And enter Company "<name>"
    And Add Adress details "<streatAddress>" , "<city>" , "<state>" , "<postcode>"
    And select "<countryname>" country
    And Add phone no details "<number>"
When add discription number of employee
      | infoys is good company | 250000 |
    When add stock symbol anualRevenue
      | infy | 10000000 |
    And click on save button
    Examples: 
      | name  | streatAddress | city | state      | postcode | number     | countryname |
      | wipro | pune          | pune | maharastra |   111111 | 1234567890 | india       |

    
