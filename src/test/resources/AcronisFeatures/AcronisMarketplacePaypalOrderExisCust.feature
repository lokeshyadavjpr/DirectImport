
@AcronisMarketplacePaypalOrder
Feature: Title of your feature

  @AcronisMarketplacePaypalOrderExistingCustomer
  Scenario: Place Online order of Acronis using PayPal PG
    Given Open Acronis Offer Link
    And Update Quantity
    And Provide username
    When Select Add to Cart
    Then Login through existing customer credentials
    Then Verify Offer Name on Cart Page 
    And Verify Amount on Cart Page
    Then Select Checkout
    And Click Ok on additional taxes popup
    Then Verify page is navigated to Checkout page
    Then Select PayPal Radio button
    Then Select PayNow button
    Then Select Ok on Confirmation popup to proceed
    Then Provide PayPal email and password
    And Login into paypal through Login button
    Then On Paypal page Click Continue to Review Order
    Then verify Successful payment confirmation screen
    Then Login into Admin panel and verify placed order
    Then In admin panel verify Invoice Details page
    
    
    
    










