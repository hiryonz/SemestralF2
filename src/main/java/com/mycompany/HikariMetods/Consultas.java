/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.HikariMetods;

import com.mycompany.Entity.ClienteVip;
import com.mycompany.Entity.Main;
import com.mycompany.HikariCP.ConexionHikari;
import com.mycompany.Operations.Operations;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Javier Chong
 */
public class Consultas {
    List<String> productosF = new ArrayList<>();
    ClienteVip vip = new ClienteVip();
    
    public String Productosfrecuentes(String cedula){
        try (Connection connect = ConexionHikari.getConnection();
    PreparedStatement statement = connect.prepareStatement("SELECT productos_comprados, COUNT(*) AS frecuencia FROM compras WHERE numero_cedula = ? GROUP BY productos_comprados ORDER BY frecuencia DESC");)
        {
      
        statement.setString(1, cedula);
 
        ResultSet resultSet = statement.executeQuery();
        
        while(resultSet.next()){
            String producto = resultSet.getString("productos_comprados");
            productosF.add(producto);
            System.out.println("productos");
        }
        
         if (!productosF.isEmpty()) {
        vip.setProductoCompradoFrecuente(productosF.get(0));
        } else {
            System.out.println("La lista está vacía.");
        }
        
    }catch (SQLException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null; 
    }
    
    
        public String PromedioGastado(String cedula){
        try (Connection connect = ConexionHikari.getConnection();
    PreparedStatement statement = connect.prepareStatement("SELECT AVG(costo_total) AS promedio FROM compras WHERE numero_cedula = ?");)
        {
      
        statement.setString(1, cedula);
 
        ResultSet resultSet = statement.executeQuery();
        
        if(resultSet.next()){
            double monto = resultSet.getDouble("promedio");
            System.out.println("promedio");
             vip.setCantidadPromedioGastado(monto);
        }else {
         System.out.println("Cliente con ID " + cedula + " no encontrado o sin compras.");
        }
        
        
    }catch (SQLException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null; 
    }
        
       
        
}
