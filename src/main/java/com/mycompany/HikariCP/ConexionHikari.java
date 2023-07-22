/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.HikariCP;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import java.sql.Connection;
import java.sql.SQLException;


public class ConexionHikari {
 
   private static HikariConfig configuration = new HikariConfig();
   private static HikariDataSource dataS;
    
    static {
        configuration.setJdbcUrl("jdbc:mariadb://localhost:3307/uwu");
        configuration.setUsername("estudiante");
        configuration.setPassword("estudiante");
        configuration.addDataSourceProperty("cachePrepStmts", true);
        configuration.addDataSourceProperty("PrepStmtsCacheSize", 250);
        configuration.addDataSourceProperty("PrepStmtsCacheSqlLimit", 2048);
        dataS = new HikariDataSource(configuration);
        
    }
    
    public static Connection getConnection() throws SQLException{
        return  dataS.getConnection();
    }


    private ConexionHikari(){
        
    }
}

