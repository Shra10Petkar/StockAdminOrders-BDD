Feature: Get Request

Scenario: User want to read data from database
When User want to fetch the data from database "http://localhost:8080/orders"
Then User want to verify the status line "HTTP/1.1 200"
And User want to verify the status code 200