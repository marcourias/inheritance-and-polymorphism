
package com.mycompany.act1unidad3;

public class act1Unidad3 {

    public static void main(String[] args) {
        //damos de alta un usuario y probamos la herencia
        empleados emp = new empleados("admon", 12000, 1,"cesar","chan","H",40);
        //probamos el polimorfismo en esta clase.
        emp.mensaje();
        System.out.println("Id Empleado "+emp.getIdUsuario()+" Nombre "+emp.getNombre()+" apellidos "+emp.getApellidos());
        System.out.println("Sexo "+emp.getSexo()+" Departamento "+emp.getDepartamento()+" Sueldo "+emp.getSueldo());
        System.out.println(emp.mensaje(12000));
        
        
        
        
        //damos de alta a un invitado y probamos la herencia
        invitados inv = new invitados("12-oct-2022", 10, "alexa","sin apellido","M",39);
        //probamos el polimorfismo
        inv.mensaje();
        System.out.println("El usuario "+inv.getNombre());
        inv.mensaje("12-oct-2022");
        
        

    }
    
    
}
