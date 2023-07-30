Feature: UserLogin
Scenario: Login
Given Launch browser
When User open URL "https://www.saucedemo.com/v1/"
And User enter email as "standard_user" and password as "secret_sauce"
And Click on Login button      
      
Scenario Outline: Login DDT
Given Launch browser
When User open URL "https://www.saucedemo.com/v1/"
And User enter email as "<email>" and password as "<password>"
And Click on Login button


Examples:
      | email  | password |
      | standard_user |     secret_sauce | 
      | standard_user |     secret_sauce | 
      
      

      