@completeTest
Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'tester9@gmail.com' and password 'Tekstudent123!'
    And User click on login button
    And User should be logged in into Account

  @updateInfo
  Scenario: Verify User can update Profile information
    When User click on Account option
    And User update Name 'Jane' and Phone '1012028855'
    And User click on Update button
    Then User profile information should be updated

  @updatePassword
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword    | confirmPassword |
      | Tekschool123!    | Tekstudent123! | Tekstudent123!  |
    And User click on change password button
    Then a message should be displayed 'Password Updated Successfully'

@addPayment
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill debit or credit card information
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | value      | value      | value           | value          | value        |
    And User click on Update Your Card button
    Then a message should be displayed 'Payment Method Updated Successfully'
  
  @removeCard  
  Scenario: Verify User can remove Debit or Credit card
  When User click on Account option
  And User click on remove option of card section
  Then payment details should be removed 
  
  @addAddress
  Scenario: Verify User can add  an Address
    When User click on Account option
    And User click on  Add address option
    And User fill new address form with below information
    |fullName|PhoneNumber|StreetAddress|apt|city|state|zipCode|
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'
    
    @editAddress 
   Scenario: Verify User can edit an Address added on account 
   When User click on Account option
   And User click on edit address option
   And user fill new address form with below information
    | fullName | PhoneNumber | StreetAddress | apt | city | state | zipCode |
    And User click Add Your Address button
    Then a message should be displayed 'Address Updated Successfully'
    
    @removeAddress
    Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
