Feature: Login

Scenario: Verify dresses page
Given I am in homepage
When I click on dresses page
Then I should see dresses page

Scenario: Verify the dresses page
Given I am in home page
When I enter the email in newsletter and hit enter
Then I should see the email subscription message

Scenario: Validate add to cart to button
Given I am in home page
When I hover on the first product
Then I should see a Add to cart button displayed