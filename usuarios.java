package com.mycompany.act1unidad3;

public class usuarios {

    //Atributos de la clase usuarios
    private int idUsuario;
    private String nombre;
    private String apellidos;
    private String sexo;
    private int edad;
    
    //metodos de la clase usuarios

    public usuarios(int idUsuario, String nombre, String apellidos, String sexo, int edad) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.edad = edad;
    }

    public usuarios() {
    
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mensaje(){
        System.out.println("Actividad 1 Unidad 3 Herencia y Polimorfismo fase 1");
    }
    
    
    
}
