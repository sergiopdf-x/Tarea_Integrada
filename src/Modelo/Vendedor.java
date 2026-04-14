package Modelo;

public class Vendedor {
    public String nombre;
    public String area;
    private double montoVendido;
    private double porcentajeComision;
    private double cumplimientoMeta;

    public Vendedor(){
        this.nombre = "Andrea Lopez";
        this.area = "Tecnologia";
        this.montoVendido = 2850.75;
        this.porcentajeComision = 8;
        this.cumplimientoMeta = 92;
    }

    //Getters
    public String getNombre(){
        return  nombre;
    }

    public String getArea(){
        return area;
    }

    public double getMontoVendido(){
        return montoVendido;
    }

    public double getPorcentajeComision(){
        return porcentajeComision;
    }

    public double getCumplimientoMeta(){
        return cumplimientoMeta;
    }

    //Setter con validaciones
    public void setMontoVendido(double montoVendido){
        if(montoVendido > 0){
            this.montoVendido = montoVendido;
        }else{
            System.out.println("El monto no es valido");
        }
    }

    public double calcularComision(){
        return montoVendido * (porcentajeComision/100);
    }

    public double calcularIngresoTotal(){
        return  montoVendido + calcularComision();
    }

    public String obtenerEstadoCumplimiento(){
        if(cumplimientoMeta >= 90){
            return "Excelente";
        }else if(cumplimientoMeta >=70){
            return "Aceptable";
        }else {
            return "Bajo";
        }
    }

    public String obtenerMensajeDesempeno(){
        if (cumplimientoMeta >= 90){
            return "Vendedor con empeño sobresaliente";
        }else if (cumplimientoMeta >=70){
            return "Vendedor con desempeño aceptable";
        }else{
            return "Se requiere seguimiento comercial";
        }
    }
}
