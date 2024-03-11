package org.tp24.Interfaz;
import org.tp24.repository.Clientes;

public interface Interclientes {
    Clientes buscarClientePorNombre_y_Apellido(String nombre, String apellido);
    Clientes buscarClienteConCupoMaxIgualOMayor(Integer cupoMax);
    Clientes buscarClientePorCedula(String cedula);
}