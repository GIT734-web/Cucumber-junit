@Login
Feature: Login features
This feature includes scenario that would validate the following feature.
1)Login as Admin
2)Login as linda darshan
3)Login with Negative data

Background: 
Given I am able to navigate onto the login page

#Scenario: Login as Admin
#When I entered the username as "Admin"
#And  I entered the password as "admin123"
#And i click on the Login Button
#Then i should see the username as "welcome Paulette"

#Scenario: Login as linda darshan
#When I entered the username as "Admin"
#And  I entered the password as "admin123"
#And i click on the Login Button
#Then i should see the username as "Welcome Paulette"

Scenario Outline: Test Login with Different data
When I entered the username as "<username>"
And  I entered the password as "<password>"
And i click on the Login Button
Then i should see the username as "Login Name"

Examples:
|username|password|LoginName
|Admin   |admin123|Welcome Paulette
|Admin   |admin123|Welcome Paulette

@InvalidLogin
Scenario: Login with Negative data
When I entered the username as "Mohit"
And I entered the password as "Mohit"
And i click on the Login Button
Then i should see a error message as  "Invalid credentials"