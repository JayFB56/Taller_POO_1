// SEGUNDO ARCHIVO: La clase principal del programa POO
class Producto {
    [cite_start]// Atributos (nombre, precio, cantidad) [cite: 77]
    [cite_start]// Usamos 'private' para aplicar Encapsulamiento [cite: 14]
    private String nombre; [cite_start]// [cite: 84]
    private double precio; [cite_start]// [cite: 86]
    private int cantidad; [cite_start]// [cite: 88]

    [cite_start]// Constructor [cite: 91]
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre; [cite_start]// [cite: 93]
        this.precio = precio; [cite_start]// [cite: 95]
        this.cantidad = cantidad; [cite_start]// [cite: 97, 98]
    }

    [cite_start]// Método para calcular el total [cite: 78]
    public double calcularTotal() {
        return precio * cantidad; [cite_start]// [cite: 112, 113]
    }

    [cite_start]// Método para mostrar la información [cite: 78]
    public void mostrarInfo() {
        System.out.println("\nProducto: " + nombre); [cite_start]// [cite: 115]
        System.out.println("Precio unitario: $" + precio); [cite_start]// [cite: 116]
        System.out.println("Cantidad: " + cantidad); [cite_start]// [cite: 117]
        System.out.println("Total: $" + calcularTotal()); [cite_start]// [cite: 118]
    }
}