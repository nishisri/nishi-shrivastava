# Test Cases on Monefy app.

UI Testcases:
1. Application Icon is displayed in menu as per requirement and are in proper place.
2. When the user holds his/her touch on the expense category icon,having some expense:  
(i) The corresponding area on pie chart should get highlighted

  
(ii) The expense category and expense value should be displayed inside the pie chart.
3. The color of the label where balance is displayed should be set to green if balance is positive else it should be set to red.
4. Icons/buttons should be of required size and suitable to big fingers.
5. Verify that icons are placed at the same section of the screen to avoid confusion.
6. Ensure that the text inside the chart does not overlap with the chart.
7. Validate that the calender is showing properly on the pages of application.
8. Verify the behaviour of the application, when other application notification pops up.
9. Verify the application behavior and icons/buttons position when device is rotated.


Functional Testcases:


1. When the user taps on app icon, landing screen should be displayed with last saved values.


2. The user has selected a particular account from the drop down under hamburger symbol:

    
(i) All the expenses and income displayed should be of that account only

.

3. User has opened a new account:

	
(i) If user has added initial balance, with "Included in the balance" flag true,
then the initial balance should reflect in the balance

.

(ii) If user has added initial balance, with "Included in the balance" flag false,
then the initial balance should not get reflected in the balance

.
	
(iii) User has followed 
**step "1.(i)"**, now user again changes the flag value of "Included in the balance" to False,then the initial balance should not reflect in the balance

.
4. User wants to merge accounts:
 
Given the user is on Manage Accounts Section and has already selected the account which he/she wants to merge:
 From the drop down user selects the account with which he/she wants to merge the above selected account.

   
(i). The account should be merged and all the expenses and income should be reflected in the account selected from the drop down
.   

(ii). The account which was merged, should not be displayed in the "Accounts" dropdown under hamburger symbol
.   
   
(iii). The account merged should not be displayed under Transfer

5. Transfer of money from one account to another:
  When user transfers money from his/her one account to another:

    
(i). The correct amount debited should be displayed under expenses in the "From" account

   
(ii). The amount transferred should be reflected under "income" section of the credited account.


6. Given User has paid subscription of the application & When user touches on vertical ellipsis icon followed by a tap on category option:

	
(i). User should be able to add new category of expenses

	
(ii). User should be able to create new category of incomes

	
(iii). User should be able to update the expense category item.

7. Given user has touched  vertical ellipsis followed by a tap on Accounts option:
	
	
(i). User should see the list of account already added
	
	
(ii). User should be able to add new account.

8. Given user has followed "**Step 2.(ii)**" option:
	
	
(i). The same account should get reflected under account option present under hamburger sign
	
	
(ii). The same account should be also available in the to and from account drop down present under "New transfer" options


9. Based on the group by functionality under hamburger symbol (group by day/week/month/year/all):
	
	
(i). The corresponding expenses and income should be displayed


10. Given the user has selected to view expenses based on weekly basis:
	
	
(i). When the user is on main screen, the user should be able to swipe the screens
	
	
(ii). Expenses/ Income falling under that week should be displayed in chart


11. When the user taps on "Balance" label, the user should be able to see the detailed information

12. User should be able to delete the entry of his expense or income

13. User should be able to modify the amount/category of expense

14. Verify the android versions application support.
15. Verify the behavior once the time application crashes.
16. Validate that the interface of the application is as per the screen size.
17. Verify that the call/message/alarm notifications still shows up while the application is running.




Performance Tests:

1. Validate if application process is still running in background when user minimizes the application

2. Verify how the application behaves while switching between the 2G/3G/4G Network to WiFi or vice versa

3. Verify how the application behave when battery is low
4. Validate that the response time of the application is as per the requirements

5. Monitor the battery consumption,memory leaks

6. Validating the application behavior when multiple applications are running



Security Testing:


1. Validating if confidential information related to account details numbers are not accessible through sql injections.
2. Validating that no other application is accessing the cache folder of the application.
3. To validate that business logic implementation is secured and not vulnerable to any attack from outside.
4. Analyse the data storage.
5. Validate that SQL injection is not allowed at places while storing/retrieving the information.

Prioritization:

1. Functional test will be highest in priority and will explore it more than other area.
2. Performance Test will be the next.

3. Security Test will be the next.

4. Cosmetic issues on UI are of lower priority. 


How much time you have planned for each charter?
Functional testing:5hrs
UI Testing:2 hrs
Performance testing:2 hrs
Security testing:2 hrs

What kind of risks you need to mitigate for this type of application?
- Sensitive data leakage
- Unsafe sensitive data/money transmission
- Unsafe Sensitive Data Storage
- system upgradation issues


Defects Found:
UI Alignment Issue:
1. Full calender alignment is not showing corrrectly on UI,PFA Screenshot.


