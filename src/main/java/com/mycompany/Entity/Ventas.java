/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Entity;

/**
 *
 * @author Javier Chong
 */
public class Ventas extends Productos{
    private int numeroVenta;
    private double costoTotal;
    private double itbms;

    public Ventas() {
       this.numeroVenta = 0;
        this.costoTotal = 0.0;
        this.itbms = 0.0;
    }

    public Ventas(int numeroVenta, double costoTotal, double itbms, String nombrePro, String codigoBarra, double precioStandart, double precioDescuento) {
        super(nombrePro, codigoBarra, precioStandart, precioDescuento);
        this.numeroVenta = numeroVenta;
        this.costoTotal = costoTotal;
        this.itbms = itbms;
    }

    
    
    
    public Ventas(int numeroVenta, double costoTotal, double itbms) {
        this.numeroVenta = numeroVenta;
        this.costoTotal = costoTotal;
        this.itbms = itbms;
    }

    
    
    
    public int getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public double getItbms() {
        return itbms;
    }

    public void setItbms(double itbms) {
        this.itbms = itbms;
    }


}
