@search
Feature: Search Feature

  Scenario Outline: Search Customer
    Given Customer in a LoginPage
    When Enter Customer name "<CustomerName>"   in search box
    And  Click  on Search Button
    Then Customer details appear

    Examples:
      | CustomerName |

      |John          |
      |Ankita        |