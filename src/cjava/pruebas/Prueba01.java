package cjava.pruebas;

import cjava.beans.Empleado;

public class Prueba01 {
    public static void main(String[] args) {
        Empleado x= new Empleado(100,"juan", true);
        Empleado y = x;
        x.setNombre("julio");
        System.out.println(y.getNombre());
        
    }
}
