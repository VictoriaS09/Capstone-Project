@completeTest
Feature: Retail Home Page

  @verifyShop
  Scenario: Verify Shop by Department sidebar
    Given User is on retail website
    When User click on All section
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |


  @addItem
  Scenario: Verify User can add an item to cart
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'tester9@gmail.com' and password 'Tekstudent123!'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item "kasa outdoor smart plug"
    And User click on Search icon
    And User click on item
    And User select quantity "2"
    And User click add to Cart button
    Then the cart icon quantity should change to "2"

  @placeOrder
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'tester9@gmail.com' and password 'Tekstudent123!'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item "kasa outdoor smart plug"
    And User click on Search icon
    And User click on item
    And User select quantity "2"
    And User click add to Cart button
    Then the cart icon quantity should change to "2"
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below information
     | fullName | PhoneNumber | StreetAddress | apt | city | state | zipCode |
    And User click Add Your Address button
    And User click Add a credit card or Debit Card for Payment method
    And User fill debit or credit card information
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | value      | value      | value           | value          | value        |
    And User click on Add your card button
    And User click on Place Your Order
    Then a message should be displayed 'Order Placed, Thanks'
    
    @placeOrderTwo
    Scenario: Verify User can place an order with Shipping address and payment Method on file
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'tester9@gmail.com' and password 'Tekstudent123!'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Electronics'
    And User search for an item "Apex Legends"
    And User click on Search icon
    And User click on item
    And User select quantity "5"
    And User click add to Cart button
    Then the cart icon quantity should change to "5"
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a message should be displayed 'Order Placed, Thanks'
