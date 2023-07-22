/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.HikariMetods;

import com.mycompany.Entity.Main;
import com.mycompany.HikariCP.ConexionHikari;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.mycompany.Entity.ClienteVip;

/**
 *
 * @author Javier Chong
 */
public class IngresoDatos {

    
    //nombre, cedula, genero, fechaNacimiento, telefono, provincia, ciudadm corregimiento, correo
    public String ingreso(String nombre,String cedula, String genero, String nacimiento, int numero, String provincia, String ciudad, String corregimiento,   String correo){
        try (Connection connect = ConexionHikari.getConnection();
    PreparedStatement statement = connect.prepareStatement("insert into clientes(numero_cedula, nombre, fecha_nacimiento, genero"+
            ", correo, numero_telefono, provincia, ciudad, corregimiento)"
            + " values(?,?,?,?,?,?,?,?,?)");){
      
        statement.setString(1, cedula);
        statement.setString(2, nombre);
        statement.setString(3, nacimiento);
        statement.setString(4, genero);
        statement.setString(5, correo);
        statement.setInt(6, numero);
        statement.setString(7, provincia);
        statement.setString(8, ciudad);
        statement.setString(9, corregimiento);

        
        System.out.println("se guardo la info");
        statement.executeUpdate();
        
    }catch (SQLException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String IngresoClienteVip(String asesor, double credito, int numeroMembresia, double descuento, String cedula, double cantidad_promedio_gastado, String productos_frecuentes){
        try (Connection connect = ConexionHikari.getConnection();
    PreparedStatement statement = connect.prepareStatement("insert into clientes_vip(numero_cedula, numero_membresia, cantidad_promedio_gastada, productos_frecuentes, descuento"+
            ", asesor_asignado, cantidad_credito)"
            + " values(?,?,?,?,?,?,?)");){
           statement.setString(1, cedula);
        statement.setInt(2, numeroMembresia);
        statement.setDouble(3, cantidad_promedio_gastado);
        statement.setString(4, productos_frecuentes);
        statement.setDouble(5, descuento);
        statement.setString(6, asesor);
        statement.setDouble(7, credito);
 

        
        
        statement.executeUpdate();
        System.out.println("se guardo la info en VIP");
    }catch (SQLException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
        public String IngresoClienteFrecuente(int numeroMembresia, double descuento, String cedula, double cantidad_promedio_gastado, String productos_frecuentes){
        try (Connection connect = ConexionHikari.getConnection();
    PreparedStatement statement = connect.prepareStatement("insert into clientes_frecuentes(numero_cedula, numero_membresia, cantidad_promedio_gastada, productos_frecuentes, descuento)"
            + " values(?,?,?,?,?)");){
           statement.setString(1, cedula);
        statement.setInt(2, numeroMembresia);
        statement.setDouble(3, cantidad_promedio_gastado);
        statement.setString(4, productos_frecuentes);
        statement.setDouble(5, descuento);
 
 

        
        
        statement.executeUpdate();
        System.out.println("se guardo la info en Frecuente");
    }catch (SQLException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    
}

