Feature: Getir Appium Case Study

  Scenario: Test Case-1
    Given Navigate to the MobileApp
    Then Skip the onboarding screen
    Then HomePage Header Check
    Then BABY CARE category selected
    Then Add a random product to basket
    Then Snacks category selected
    Then Add a random product to basket
    Then Go To Basket
    Then Confirmed Price
    Then Remove Products
    Then Confirmed Basket Empty


    Scenario: Test Case-2
      Given Navigate to the MobileApp
      Then Skip the onboarding screen
      Then Select a random category
      Then Select random wislist items
      Then Go to Left Menu
      Then Go to My Wishlist Page
      Then Remove Wishlists
      Then Confirmed Wishlist Empty

