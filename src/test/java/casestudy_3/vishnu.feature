Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: Title of your scenario outline
  Given I Enters username
    And I Enters password
    Then I Enters Login
    Then I clicks on Add New Poduct
    Given I want to write a step with "<Product Name>"
    When I check for the "<Price>" in step
    Then I verify the "<Quantity>" in step
   
    Examples: 
      | Product Name      | Price   | Quantity |
      | Basketball        |     500 | 5        |
      | Vollyball         |     700 | 10       | 

      
     