/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Entity;

import com.mycompany.HikariMetods.IngresoDatos;

/**
 *
 * @author Javier Chong
 */
public class ClienteFrecuente extends Membresia{
    IngresoDatos ing = new IngresoDatos();

    public ClienteFrecuente(int numeroMembresia, double cantidadPromedioGastado, String productoCompradoFrecuente, double descuento) {
        super(numeroMembresia, cantidadPromedioGastado, productoCompradoFrecuente, descuento);
    }
    
    


    public ClienteFrecuente(String nombre, String cedula, String genero, String fechaNacimiento, String telefono, String provincia, String ciudad, String corregimiento, String correo) {
        super(nombre, cedula, genero, fechaNacimiento, telefono, provincia, ciudad, corregimiento, correo);
        int numero = Integer.parseInt(telefono);
        ing.ingreso(nombre, cedula, genero, fechaNacimiento, numero, provincia, ciudad, corregimiento, correo);
    }
    
    
    
    public ClienteFrecuente(int numeroMembresia, double descuento, String cedula) {
        super(numeroMembresia, descuento);
        
     ing.IngresoClienteFrecuente(numeroMembresia, descuento, cedula, super.getCantidadPromedioGastado(), super.getProductoCompradoFrecuente());

    }
}
    

