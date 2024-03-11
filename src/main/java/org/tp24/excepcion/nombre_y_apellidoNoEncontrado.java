package org.tp24.excepcion;

public class nombre_y_apellidoNoEncontrado extends RuntimeException {
    public nombre_y_apellidoNoEncontrado(String nombre, String apellido){
        super("No se encontraron clientes que correspondan al nombre: " + nombre + " y apellido: " + apellido);
    }
}
