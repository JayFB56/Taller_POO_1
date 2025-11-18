# Taller_POO_1

## 1. ¿Qué ventajas observas en la versión orientada a objetos?

Las principales ventajas son la **Modularidad** y el **Encapsulamiento**.

* [cite_start]**Modularidad y Organización:** El código se divide en entidades lógicas (`Producto`) que agrupan datos (atributos) y las operaciones que actúan sobre esos datos (métodos)[cite: 13, 14]. [cite_start]Esto hace que el código sea más fácil de entender y de seguir que la versión estructurada, donde todos los datos son manipulados por funciones externas[cite: 12].
* **Encapsulamiento:** Al declarar los atributos del producto como `private` (privados), se protege la información. [cite_start]La única forma de manipular el estado del objeto es a través de sus métodos públicos (como `calcularTotal()`), lo que aumenta la robustez y facilita el mantenimiento[cite: 14].

## 2. ¿Qué parte del código resultó más clara o fácil de mantener?

La **clase `Producto`** resultó la parte más clara y fácil de mantener.

* Los métodos `calcularTotal()` y `mostrarInfo()` son altamente **cohesivos** porque solo necesitan la información interna del objeto para funcionar.
* En la clase `TiendaApp`, la lógica principal es simple: iterar sobre una lista de objetos y pedir a cada objeto que ejecute una acción (`p.mostrarInfo()` o `p.calcularTotal()`), lo cual es muy intuitivo y reduce errores de tipado o de paso de parámetros.

## 3. ¿Cómo podrías extender el programa para manejar más productos?

Extender el programa en la versión POO requiere solo un cambio en la clase `TiendaApp` para usar una **colección dinámica** en lugar de un *array* de tamaño fijo:

1.  **Reemplazar el array** `Producto[]` con un `ArrayList<Producto>`.
2.  Esto eliminaría la limitación de registrar solo 2 productos, permitiendo agregar una cantidad variable de productos durante la ejecución.

## 4. ¿Podrías agregar una clase Tienda que contenga los productos y calcule el total?

Sí, esta sería la mejor práctica para un sistema de gestión de inventario.

* Se crearía una clase `Tienda` (o `Inventario`).
* Esta clase contendría un atributo que es una lista de objetos `Producto`.
* La clase `Tienda` sería responsable de métodos como:
    * `agregarProducto(Producto p)`
    * `calcularTotalGeneral()`
    * `mostrarInventarioCompleto()`
* Esto aplica el principio de **Responsabilidad Única**, dejando a `TiendaApp` como simple ejecutor y a `Tienda` como gestor de la colección de productos.
