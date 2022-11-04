
package com.mycompany.act1unidad3;


public class invitados extends usuarios{

//atributos de la clase invitados
String fechaIngreso;

//metodos de la clase invitados

    public invitados(String fechaIngreso, int idUsuario, String nombre, String apellidos, String sexo, int edad) {
        super(idUsuario, nombre, apellidos, sexo, edad);
        this.fechaIngreso = fechaIngreso;
    }

    public invitados(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public invitados() {
    
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void mensaje(String fechaIngreso){
        System.out.println("Este usuario no pertenece a la empresa, ingreso en esta fecha "+fechaIngreso);
    }
}
