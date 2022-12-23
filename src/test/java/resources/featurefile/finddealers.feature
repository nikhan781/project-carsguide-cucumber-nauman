Feature: Find the dealers and verify

  Scenario: Find the dealers and verify the dealers are in list

    Given I am on homepage

    When I mouse hover on buy+sell tab

    And I click Find a Dealer

    Then I navigate to car-dealers page

    And I should see the dealer names <dealersName> are display on page
      | dealersName           |
      | 1 Stop Auto Group     |

      | 101 Auto Centre       |

      | 1477 Cars Pty Ltd     |

      | 1st Choice Car City   |

      | 3 Point Motors - New  |

      | 3 Point Motors Epping |

      | 3 Point Motors Kew    |
