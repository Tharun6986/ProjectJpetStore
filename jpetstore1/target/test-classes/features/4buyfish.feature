Feature:Buy product
Scenario: User buys the product which is in stock
Given user  searches for a product
When user wants to buy a product which is in stock
Then user buys and adds items to cart 
