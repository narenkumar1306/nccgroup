@login
Feature:As a User, I want to go through the website so,that I can update my details as well as placing orders too.

  Background:
    Given I log into website as "narenkumar1306@gmail.com" and "test123"

  Scenario: Order TShirt & Verify item exist in Order History
    And I click on the t-shirts button
    And I click on more button
    And I added the quantity to two by clicking on the quantity plus button
    And I click on add to cart to continue the process
    And I click on proceed to checkout button to continue process
    And I continue to proceed to checkout from shopping page to address
    And I continue to proceed to checkout from address  to shipping
    And I tick terms of service to proceed to checkout from shipping to payment
    And I select payment type as pay by bank wire
    When I click on confirm order button to confirm the order
    Then I should see order is placed

 Scenario: Update Personal Information(FirstName) in My Account. & Further verify FirstName field appears updated
   And I click on my personal inforamtion
   And I changed firstname as "Naren" from N
   When I go back to my personal information
   Then I should see first name is updated with naren




