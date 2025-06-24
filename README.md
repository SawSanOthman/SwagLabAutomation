"# SwagLabAutomation" 🧪 Automaton Flow
Setup: Launch browser and navigate to https://www.saucedemo.com/.

Login: Use the credentials:

makefile

Username: standard_user
Password: secret_sauce
Add Items: Click every “Add to cart” button found on the inventory page.

Remove Items: Click every “Remove” button found in the cart.

Print First Letters: Output the first character of each product name.

Print Non‑‘S’ Names: Print names that do not start with "S".

Stop‑At Test: Print each product name until "Sauce Labs Onesie" is encountered – then stop.

🧩 Test Structure
Test Priority	Method Name	Description
1	LogIn()	Login flow
2	AddToCartButtons()	Adds items to cart
3	RemoveButtons()	Removes items from cart
4	Items()	Prints initial letters
5	PrintTheLetterT()	Prints names not starting with ‘S’
6	PrintTheNamed()	Prints names up to “Sauce Labs Onesie”

All tests are independent and run in ascending priority order.

Modifiers like Thread.sleep() are used for demonstration/pausing; better to replace with explicit waits for production use.

🚀 Running Tests
Run all tests with Maven:


mvn test
Or execute the @Test methods directly through your IDE’s TestNG runner.

🛠️ Enhancements & Tips
Replace Thread.sleep() with WebDriverWait and ExpectedConditions for robust synchronization.

Use Page Object Model (POM) to organize selectors and actions.

Add assertions (TestNG Assert) to validate expected UI states after actions.

Parameterize credentials and URLs using TestNG XML or external property/config files.

Add tests for checkout, sorting, filtering, and logout flows.


