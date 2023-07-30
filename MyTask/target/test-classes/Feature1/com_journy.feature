Feature: UserLogin to Complete Checkout
Scenario: End to End Journy
Background: Common steps for both cases

Given Launch browser
When User open URL "https://www.saucedemo.com/v1/"
And User enter email as "standard_user" and password as "secret_sauce"
And Click on Login button

When User click on Filter button
When User Click on add to cart button
When User Click on cartIcon and Checkout button
When User Fill Form fname as "SmallWorld" and lname as "Financial Services" and code as "123456" and click on continue button
And Click on Finish button
And Verify Success Message 



Scenario: Login
      
      
Scenario Outline: Login DDT
Given Launch browser
When User open URL "https://www.saucedemo.com/v1/"
And User enter email as "<email>" and password as "<password>"
And Click on Login button


Examples:
      | email  | password |
      | standard_user |     secret_sauce | 
      | standard_user |     secret_sauce | 
      

