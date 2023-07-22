/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Entity;

import com.mycompany.HikariMetods.IngresoDatos;
import com.mycompany.Operations.Operations;

/**
 *
 * @author Javier Chong
 */
public class ClienteVip extends Membresia{
    private String asesor;
    private double credito;
    
    IngresoDatos ing = new IngresoDatos();
    
    public ClienteVip() {
        this.asesor = "";
        this.credito = 0.0;
    }

    public ClienteVip(String nombre, String cedula, String genero, String fechaNacimiento, String telefono, String provincia, String ciudad, String corregimiento, String correo) {
        super(nombre, cedula, genero, fechaNacimiento, telefono, provincia, ciudad, corregimiento, correo);
        int numero = Integer.parseInt(telefono);
        ing.ingreso(nombre, cedula, genero, fechaNacimiento, numero, provincia, ciudad, corregimiento, correo);
    }

    
    
    
    public ClienteVip(String asesor, double credito, int numeroMembresia, double descuento,String cedula) {
        super(numeroMembresia, descuento);
        this.asesor = asesor;
        this.credito = credito;        
        ing.IngresoClienteVip(asesor, credito, numeroMembresia, descuento, cedula,super.getCantidadPromedioGastado(),super.getProductoCompradoFrecuente() );
    }

 
 

    
    
    public String getAsesor() {
        return asesor;
    }

    public void setAsesor(String asesor) {
        this.asesor = asesor;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
    
    
    
}
