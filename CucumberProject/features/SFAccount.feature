Feature: Account creation in saleforce application
@Sanity
  Scenario: Create salesforce account
    Given Launch the Browser
    And Load the URL
    And Enter the username
    And Enter the password
    And Click on login button
    And Click on toggle menu button from the left corner
    And Click view All
    And Click Sales from App Launcher
    And Click on Accounts tab
    And Click on New button
    And Enter Mani as account name
    And Select Ownership as Public
    When Click save
    Then Account name should be created
