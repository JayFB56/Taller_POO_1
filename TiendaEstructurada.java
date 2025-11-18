import java.util.Scanner;

// PRIMER ARCHIVO: Contiene el primer código ejecutable
public class TiendaEstructurada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        [cite_start]// 1. Pide al usuario el nombre, precio y cantidad de un producto. [cite: 22]
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingrese el precio unitario: ");
        double precio = sc.nextDouble();
        
        System.out.print("Ingrese la cantidad: ");
        int cantidad = sc.nextInt();

        [cite_start]// 2. Calcule el valor total (precio x cantidad). [cite: 23]
        double total = calcularTotal(precio, cantidad);

        [cite_start]// 3. Muestre un resumen con toda la información. [cite: 24]
        mostrarResumen(nombre, precio, cantidad, total);
        
        sc.close();
    }

    public static double calcularTotal(double precio, int cantidad) {
        return precio * cantidad;
    }


    public static void mostrarResumen(String nombre, double precio, int cantidad, double total) {
        System.out.println("\n=== RESUMEN DE PRODUCTO ===");
        System.out.println("Producto: " + nombre);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: $" + total);
    }
}