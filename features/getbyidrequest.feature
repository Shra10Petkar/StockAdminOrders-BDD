Feature: Get By Id

Scenario: User want to read data from database by using id
When User want to fetch the data from database by using id "http://localhost:8080/orders?orderId=6"
Then User want to verify the statusline "HTTP/1.1 200"
And User want to verify the status-code 200