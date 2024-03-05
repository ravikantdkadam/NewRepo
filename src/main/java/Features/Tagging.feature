Feature: Amazon  Feature Test


@SmokeTest @RegressionTest
Scenario: Amazon login with valid credential
Given user is on login page1 
When user enter the username and password 



@RegressionTest
Scenario: Amazon login with invalid credential
Given user is on login page 
When user enter the invalid username and password 



@SmokeTest
Scenario: user select product and add to cart 
Given user is on main page
When user select the product 
And click on the Add to card button 



Scenario:User able to verify the previous order list 
Given user is on initial screen 
When user click on you order link 
Then user able to see the previous order list 



@SmokeTest @RegressionTest
Scenario: user able to signout successfully
Given user is on homepage 
When user click on account list 
And move the mouse on Signout link 
And Click on Sign out link 
Then user sign out from the amazon account 

