Feature: Post Request for owner

Scenario: User want to post the data of other  into database
Given User want to pass the data of other into database
When User want to pass the data of others by using URI "http://localhost:8080/owner"
Then User want to validate data by  status line "HTTP/1.1 200"
And User want to validate status code  200