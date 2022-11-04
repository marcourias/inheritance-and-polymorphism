
package com.mycompany.act1unidad3;

public class empleados extends usuarios{
//atributos de la clase empleado
    String departamento;
    float  sueldo;
    
//metodos de la clase empleado

    public empleados(String departamento, float sueldo, int idUsuario, String nombre, String apellidos, String sexo, int edad) {
        super(idUsuario, nombre, apellidos, sexo, edad);
        this.departamento = departamento;
        this.sueldo = sueldo;
    }

    public empleados(String departamento, float sueldo) {
        this.departamento = departamento;
        this.sueldo = sueldo;
    }

    public empleados() {
    
    }

    public String getDepartamento() {
        return departamento;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    public String mensaje(float sueldo){
    String impuesto;
        if (sueldo<10000)
            impuesto = "No paga impuestos en esta compañia ";
        else
            impuesto = "Debe pagar impuestos en la compañia";
        return impuesto;
    }
    
    
    
}
