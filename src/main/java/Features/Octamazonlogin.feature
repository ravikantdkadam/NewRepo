Feature: Amazon  Feature Test

# Without Examples keyword 


#Scenario: Amazon login Feature_Test

#Given User is already on login page 
#When Title of login page is Amazon Sign In 
#Then User enters "9975674668"
#And User clicks on Continue button 
#Then User enter the "Ravikant@25"
#And User click on signin Button 
#Then user is on homepage






# With Examples Keyword 



Scenario Outline: Amazon login Feature_Test

Given User is already on login page 
When Title of login page is Amazon Sign In 
Then User enters "<username>"
And User clicks on Continue button 
Then User enter the "<password>"
And User click on signin Button 
Then user is on homepage

Examples:

   | username  | password   |
    |9975674668 | Ravikant@25 |
    |8329318994 | test@123    |
    









