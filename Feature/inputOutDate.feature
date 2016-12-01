Feature: Enter a Date

Scenario:
	Given User is on BuyTickets Page
	When User enters OutDate
	And OneWay button is set
	Then Ticket Page should be displayed