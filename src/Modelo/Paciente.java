package Modelo;

public class Paciente {
    private String nombre;
    private int id;
    private String seguro;
    private int edad;
    private double costoConsulta;
    private int numeroConsultas;
    private int prioridad;

    public Paciente(){
        this.nombre = "Carlos Perez";
        this.id = 0102030405;
        this.seguro = "Premium";
        this.edad = 45;
        this.costoConsulta = 25.50;
        this.numeroConsultas = 3;
        this.prioridad = 4;
    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    public int getId(){
        return id;
    }

    public String getSeguro(){
        return seguro;
    }

    public int getEdad(){
        return  edad;
    }

    public double getCostoConsulta(){
        return costoConsulta;
    }

    public int getNumeroConsultas(){
        return numeroConsultas;
    }

    public int getPrioridad(){
        return prioridad;
    }

    //Setter con validaion
    public void setEdad(int edad){
        if (edad > 0){
            this.edad= edad;
        }else{
            System.out.println("Edad no valida");
        }
    }

    public void setCostoConsulta(double costoConsulta){
        if(costoConsulta > 0){
            this.costoConsulta = costoConsulta;
        }
    }

    public void setNumeroConsultas(int numeroConsultas){
        if (numeroConsultas >= 0){
            this.numeroConsultas = numeroConsultas;
        }else {
            System.out.println("Numero de consultas no valida");
        }
    }

    public void setPrioridad(int prioridad){
        if(prioridad >= 1 && prioridad <= 5){
            this.prioridad = prioridad;
        }
    }

    //Metodos de calculos
    public double calculoTotal() {
        double total = costoConsulta * numeroConsultas;
        if (seguro == "Basico") {
            total = total - (total * 0.10);
        } else if (seguro == "Premium") {
            total = total - (total * 0.20);
        }
            return total;
    }

    public String clasificacion(){
        if (prioridad >= 4){
            return "Alta prioridad";
        }else if(prioridad >= 2){
            return "Prioridad media";
        }else{
            return "Prioridad baja";
        }
    }

    //Mensaje
    public String mensaje(){
        if (prioridad >=4){
            return "Atencion inmediata requerida";
        }else if (prioridad >= 2){
            return "Seguimiento necesario";
        }else{
            return "Control general";
        }
    }
}