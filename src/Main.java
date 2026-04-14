import Modelo.Paciente;
import Modelo.Vendedor;

public class Main{
    public static void main(String[] args) {
        Vendedor v = new Vendedor();
        Paciente p = new Paciente();

        System.out.println("Nombre: " + v.getNombre());
        System.out.println("Area: " + v.getArea());
        System.out.println("Monto Vendido: " + v.getMontoVendido());
        System.out.println("Comision: " + v.calcularComision());
        System.out.println("Ingreso total: " + v.calcularIngresoTotal());
        System.out.println("Estado: " + v.obtenerEstadoCumplimiento());
        System.out.println("Mensaje: " + v.obtenerMensajeDesempeno());
        System.out.println("-------------------------------");

        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Id: " + p.getId());
        System.out.println("Seguro: " + p.getSeguro());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Costo consulta: " + p.getCostoConsulta());
        System.out.println("Numero de consultas: " + p.getNumeroConsultas());
        System.out.println("Prioridad: " + p.getPrioridad());
        System.out.println("Total a pagar: " + p.calculoTotal());
        System.out.println("Clasificacion: " + p.clasificacion());
        System.out.println("Mensaje: " + p.mensaje());
        System.out.println("-------------------------------");
    }
}
