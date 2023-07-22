/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.HikariMetods;
import com.mycompany.Entity.Membresia;
import com.mycompany.HikariCP.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author almac
 */
public class Eliminar {
    
    
    /*Metodo para eliminar clientes VIP
    El metodo recive el numero de menbrecia */
    public void eliminarVip(String numeroMembresia){
        
        try(Connection connect = ConexionHikari.getConnection();
               PreparedStatement statement = 
                connect.prepareStatement("DELETE FROM ClientesVip WHERE numeroMembresia  = ? ")){
            
           statement.setString(1, numeroMembresia);
           
           statement.executeUpdate();
           
            System.out.println("el cliente con membrecia: "+numeroMembresia+ " se elimino de 'clientes VIP' ");
        } catch (SQLException ex) {
            Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /*Metodo para eliminar un cliente Frecuente*/
    public void eliminarFrecuentes(String numeroMembresia){
        
        try(Connection connect = ConexionHikari.getConnection();
               PreparedStatement statement = 
                connect.prepareStatement("DELETE FROM ClienteFrecuente WHERE numeroMembresia = ? ")){
            
           statement.setString(1, numeroMembresia);
           
           statement.executeUpdate();
           System.out.println("el cliente con membrecia: "+numeroMembresia+ " se elimino de 'clientes Frecuentes' ");
           
        } catch (SQLException ex) {
            Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    /*Metodo para eliminar los clientes ocacionales*/
        public void eliminarOcacional(String cedula){
        
        try(Connection connect = ConexionHikari.getConnection();
               PreparedStatement statement = 
                connect.prepareStatement("DELETE FROM ClienteOcacional WHERE cedula = ? ")){
            
           statement.setString(1, cedula);
           
           statement.executeUpdate();
           System.out.println("el cliente con cedula: "+cedula+ " se elimino ");
           
        } catch (SQLException ex) {
            Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
