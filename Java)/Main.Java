public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto(1, "camisa", 10.00, 2);
        Producto producto2 = new Producto(2, "Pantalon", 50.00, 1);
        Electronico producto3 = new Electronico(3, "Telefono", 1200.00, 2, "Samsung");
        Electronico producto4 = new Electronico(4, "Teclado", 600.00, 1, "Logitech");

        // Crea una orden
        Orden orden = new Orden();

        // Agrega los productos a la orden
        orden.agregarProducto(producto1);
        orden.agregarProducto(producto2);
        orden.agregarProducto(producto3);
        orden.agregarProducto(producto4);

        // Mostrar los detalles de la orden
        orden.mostrarDetalles();
    }
}