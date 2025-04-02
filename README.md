# 1.2-Java-language-Level1

## 1. Product.java (Product Class)
Represents a product with a name and a price.

Its values ​​can be obtained with getName() and getPrice().

It has a toString() method to clearly display its information.

## 2. Sale.java (Sale Class)
Handles a list of products and calculates the total sale price.

addProduct(Product product): Adds a product to the sale.

calculateTotal(): Adds the product prices and displays the total. If there are no products, throws an exception.

getTotalPrice(): Returns the total sale price.

generateIndexOutOfBoundsException(): Tests for an index out of range exception with an empty list.

## 3. EmptySaleException.java (EmptySaleException)
Custom exception that is thrown if you try to calculate the total without adding any products.

## 4. Main.java (Main Class)
Run the program and test different cases:

Try calculating the total without products (to test for the exception).

Add products and recalculate the total.

Try an IndexOutOfBoundsException with an empty list.

