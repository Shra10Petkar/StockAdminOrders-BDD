Feature: Delete Request

Scenario: User want to delete data from database by using id
When User want to delete data by using URI "http://localhost:8080/orders?id=16"
Then Verify status code 200
