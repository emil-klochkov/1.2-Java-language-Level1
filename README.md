# 1.2-Java-language-Level1

## 1. Product.java (Clase Producto)
Representa un producto con un nombre y un precio.

Se pueden obtener sus valores con getName() y getPrice().

Tiene un método toString() para mostrar su información de forma clara.

## 2. Sale.java (Clase Venta)
Maneja una lista de productos y calcula el precio total de la venta.

addProduct(Product product): Agrega un producto a la venta.

calculateTotal(): Suma los precios de los productos y muestra el total. Si no hay productos, lanza una excepción.

getTotalPrice(): Devuelve el total de la venta.

generateIndexOutOfBoundsException(): Prueba una excepción de índice fuera de rango con una lista vacía.

## 3. EmptySaleException.java (Excepción de Venta Vacía)
Excepción personalizada que se lanza si intentas calcular el total sin haber agregado productos.

## 4. Main.java (Clase Principal)
Ejecuta el programa y prueba distintos casos:

Intenta calcular el total sin productos (para probar la excepción).

Agrega productos y vuelve a calcular el total.

Prueba una IndexOutOfBoundsException con una lista vacía.

