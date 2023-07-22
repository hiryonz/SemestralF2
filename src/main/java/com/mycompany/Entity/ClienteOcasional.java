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
public class ClienteOcasional {
    IngresoDatos ingreso = new IngresoDatos();
    
    private String nombre;
    private String fechaNacimiento;
    private String genero;
    private String cedula;
    private String correo;
    private String telefono;
    private String provincia;
    private String ciudad;
    private String corregimiento;

    public ClienteOcasional() {
    
        this.nombre = "";
        this.fechaNacimiento = "";
        this.genero = "";
        this.cedula = "";
        this.correo = "";
        this.telefono = "";
        this.provincia = "";
        this.ciudad = "";
        this.corregimiento = "";
    }

    
    
    public ClienteOcasional(String nombre, String cedula, String genero, String fechaNacimiento, String telefono, String provincia, String ciudad, String corregimiento,String correo) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.corregimiento = corregimiento;
        
       int  numero = Integer.parseInt(telefono);
        ingreso.ingreso(nombre, cedula, genero, fechaNacimiento, numero, provincia, ciudad, corregimiento, correo);
        
    }

    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCorregimiento() {
        return corregimiento;
    }

    public void setCorregimiento(String corregimiento) {
        this.corregimiento = corregimiento;
    }
    
    
}
