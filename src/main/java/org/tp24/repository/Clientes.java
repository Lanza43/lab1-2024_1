package org.tp24.repository;
import java.time.LocalDate;



public record Clientes(String cedula, String nombre, String apellido, LocalDate fecha, String direccion, Integer cupoMax) {

}
