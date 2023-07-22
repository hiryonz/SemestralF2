/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Entity;

/**
 *
 * @author Javier Chong
 */
public class Productos {
    private String nombrePro;
    private String codigoBarra;
    private double precioStandart;
    private double precioDescuento;

    public Productos(String nombrePro, String codigoBarra, double precioStandart, double precioDescuento) {
        this.nombrePro = nombrePro;
        this.codigoBarra = codigoBarra;
        this.precioStandart = precioStandart;
        this.precioDescuento = precioDescuento;
    }

    public Productos() {
        this.nombrePro = "";
        this.codigoBarra = "";
        this.precioStandart = 0.0;
        this.precioDescuento = 0.0;
    }

    
    
    
    
    
    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public double getPrecioStandart() {
        return precioStandart;
    }

    public void setPrecioStandart(double precioStandart) {
        this.precioStandart = precioStandart;
    }

    public double getPrecioDescuento() {
        return precioDescuento;
    }

    public void setPrecioDescuento(double precioDescuento) {
        this.precioDescuento = precioDescuento;
    }
    
    
    
    
    
    
}
