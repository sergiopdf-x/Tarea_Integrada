import Modelo.Vendedor;

public class Main{
    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        
        System.out.println("Nombre: " + v.getNombre());
        System.out.println("Area: " + v.getArea());
        System.out.println("Monto Vendido: " + v.getMontoVendido());
        System.out.println("Comision: " + v.calcularComision());
        System.out.println("Ingreso total: " + v.calcularIngresoTotal());
        System.out.println("Estado: " + v.obtenerEstadoCumplimiento());
        System.out.println("Mensaje: " + v.obtenerMensajeDesempeno());
    }
}
