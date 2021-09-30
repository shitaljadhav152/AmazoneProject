Feature: Login Functionality

Background: User Successfully Login
Given user open Browser as "Chrome" and exe "D:\\Automation supportb tools\\chromedriver.exe"
Given user open url as "https://www.amazon.in/"
When user move to Element sign in
When user clicks on Sign in

@SmokeTest
Scenario: Login functionality with valid username and password
When user enters <Uname> as a username
When user clicks on continue
When user enters <Pword> as a password
When user clicks on a Sign in
Then validation for sign in with valid credentials
Then user close the browser

Examples:
|Uname|Pword|
|9767748530|414005|
|9767779149|123456|

@SmokeTest
Scenario: Login functionality with Invalid Username and password
When user enters <Uname> as a username
When user clicks on continue
When user enters <Pword> as a password
When user clicks on a Sign in
Then validation for sign in with invalid credentials
Then user close the browser

Examples:
|Uname|Pword|
|7890654367|567890|
|9876567041|017890|


@RegressionTest
Scenario: Login functionality with valid Username and Invalid password
When user enters <Uname> as a username
When user clicks on continue
When user enters <Pword> as a password
When user clicks on a Sign in
Then validation for sign in with valid username and invalid password
Then user close the browser

Examples:
|Uname|Pword|
|9767748530|598320|
|5678905432|456789|


@RegressionTest
Scenario: Login functionality with Invalid Username and valid password
When user enters <Uname> as a username
When user clicks on continue
When user enters <Pword> as a password
When user clicks on a Sign in
Then validation for sign in with Invalid username and valid password
Then user close the browser

Examples:
|Uname|Pword|
|9456780123|414005|
|4567853214|678900|




