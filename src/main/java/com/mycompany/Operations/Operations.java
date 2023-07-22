/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Operations;

import com.mycompany.Entity.ClienteVip;
import java.util.List;

/**
 *
 * @author Javier Chong
 */
public class Operations {
    private List<String> productosF;
    private double monto;
    ClienteVip vip = new ClienteVip();
    
    
    public void ProductoFrecuente(List<String> lista){
        this.productosF = lista;
        vip.setProductoCompradoFrecuente(productosF.get(0));

    }
    
    public void PromedioGastado(double monto){
        this.monto = monto;
        vip.setCantidadPromedioGastado(monto);
        
    }
}
