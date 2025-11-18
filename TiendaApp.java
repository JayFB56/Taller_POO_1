import java.util.Scanner;

// TERCER ARCHIVO: La clase ejecutable de la Parte 2 (POO)
public class TiendaApp {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== REGISTRO DE PRODUCTOS ===");

        [cite_start]// Crear un array para 2 objetos Producto [cite: 126]
        Producto[] productos = new Producto[2];
        double totalGeneral = 0; [cite_start]// [cite: 127]

        [cite_start]// Bucle para registrar la información de los 2 productos [cite: 128]
        for (int i = 0; i < 2; i++) {
            System.out.println("\nProducto #" + (i + 1));
            
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            
            System.out.print("Precio: ");
            double precio = sc.nextDouble();
            
            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();
            
            sc.nextLine(); // Limpiar buffer después de nextInt/nextDouble

            [cite_start]// Instancia un nuevo objeto Producto y lo guarda en el array [cite: 159]
            productos[i] = new Producto(nombre, precio, cantidad);
        }

        System.out.println("\n=== RESUMEN DE INVENTARIO ===");
        
        [cite_start]// Recorrer el array para mostrar info y sumar el total [cite: 160, 161]
        for (Producto p : productos) {
            p.mostrarInfo(); [cite_start]// Llama al método del objeto [cite: 162]
            totalGeneral += p.calcularTotal(); [cite_start]// Acumula el total individual [cite: 163]
        }

        System.out.println("\nTOTAL GENERAL DEL INVENTARIO: $" + totalGeneral); [cite_start]// [cite: 164, 165]
        
        sc.close();
    }
}