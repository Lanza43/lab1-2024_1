package org.tp24.excepcion;

public class cuposMaximosNoEncontrado extends RuntimeException {
    public cuposMaximosNoEncontrado(Integer cupoMax){
        super("Cliente con el cupo maximo: "+cupoMax+" Porfavor revisar");
    }
}
