/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Entity;

/**
 *
 * @author Javier Chong
 */
public class Membresia extends ClienteOcasional{
    private int numeroMembresia;
    private double cantidadPromedioGastado;
    private String productoCompradoFrecuente;
    private double descuento;

    public Membresia() {
         this.numeroMembresia = 0;
        this.cantidadPromedioGastado = 0.0;
        this.productoCompradoFrecuente = "";
        this.descuento = 0.0;
    }

    public Membresia(int numeroMembresia, double descuento) {
        this.numeroMembresia = numeroMembresia;
        this.descuento = descuento;
    }

    public Membresia(int numeroMembresia, double descuento, String nombre, String cedula, String genero, String fechaNacimiento, String telefono, String provincia, String ciudad, String corregimiento, String correo) {
        super(nombre, cedula, genero, fechaNacimiento, telefono, provincia, ciudad, corregimiento, correo);
        this.numeroMembresia = numeroMembresia;
        this.descuento = descuento;
    }

    public Membresia(String nombre, String cedula, String genero, String fechaNacimiento, String telefono, String provincia, String ciudad, String corregimiento, String correo) {
        super(nombre, cedula, genero, fechaNacimiento, telefono, provincia, ciudad, corregimiento, correo);
    }



    
    
    
    public Membresia(int numeroMembresia, double cantidadPromedioGastado, String productoCompradoFrecuente, double descuento) {
        this.numeroMembresia = numeroMembresia;
        this.cantidadPromedioGastado = cantidadPromedioGastado;
        this.productoCompradoFrecuente = productoCompradoFrecuente;
        this.descuento = descuento;
    }

    
    
    
    public int getNumeroMembresia() {
        return numeroMembresia;
    }

    public void setNumeroMembresia(int numeroMembresia) {
        this.numeroMembresia = numeroMembresia;
    }

    public double getCantidadPromedioGastado() {
        return cantidadPromedioGastado;
    }

    public void setCantidadPromedioGastado(double cantidadPromedioGastado) {
        this.cantidadPromedioGastado = cantidadPromedioGastado;
    }

    public String getProductoCompradoFrecuente() {
        return productoCompradoFrecuente;
    }

    public void setProductoCompradoFrecuente(String productoCompradoFrecuente) {
        this.productoCompradoFrecuente = productoCompradoFrecuente;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
    
    
}
