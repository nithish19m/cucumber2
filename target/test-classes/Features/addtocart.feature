Feature: add to cart test

Scenario: login to site
When chrome browser is launched
When application is navigated
When username is entered
When password is entered
When login button is clicked
When user finds and adds the product to cart
When the cart is validated
Then application is closed