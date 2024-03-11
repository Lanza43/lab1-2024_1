package org.tp24.excepcion;

public class clienteConCedulaNoEncontrado extends RuntimeException {
    public clienteConCedulaNoEncontrado(String cedula){
        super("Cliente identificado con la cedula: "+cedula+" no encontrado");
    }
}
