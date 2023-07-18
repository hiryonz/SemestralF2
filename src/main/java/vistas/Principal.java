
package vistas;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_Consultas = new javax.swing.JButton();
        btn_GuardarCompras = new javax.swing.JButton();
        btn_RegistrarCliente = new javax.swing.JButton();
        btn_SalirPrincipal = new javax.swing.JButton();
        btn_RegistrarProductos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo (7).png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Wise (2).png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 42)); // NOI18N
        jLabel4.setText("MENU PRINCIPAL");

        btn_Consultas.setBackground(new java.awt.Color(0, 151, 178));
        btn_Consultas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Consultas.setForeground(new java.awt.Color(255, 255, 255));
        btn_Consultas.setText("CONSULTAS");
        btn_Consultas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btn_Consultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultasActionPerformed(evt);
            }
        });

        btn_GuardarCompras.setBackground(new java.awt.Color(0, 151, 178));
        btn_GuardarCompras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_GuardarCompras.setForeground(new java.awt.Color(255, 255, 255));
        btn_GuardarCompras.setText("GUARDAR COMPRAS");
        btn_GuardarCompras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn_GuardarCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarComprasActionPerformed(evt);
            }
        });

        btn_RegistrarCliente.setBackground(new java.awt.Color(0, 151, 178));
        btn_RegistrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_RegistrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_RegistrarCliente.setText("REGISTRAR CLIENTE");
        btn_RegistrarCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btn_RegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarClienteActionPerformed(evt);
            }
        });

        btn_SalirPrincipal.setBackground(new java.awt.Color(0, 151, 178));
        btn_SalirPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_SalirPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btn_SalirPrincipal.setText("SALIR");
        btn_SalirPrincipal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btn_SalirPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirPrincipalActionPerformed(evt);
            }
        });

        btn_RegistrarProductos.setBackground(new java.awt.Color(0, 151, 178));
        btn_RegistrarProductos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_RegistrarProductos.setForeground(new java.awt.Color(255, 255, 255));
        btn_RegistrarProductos.setText("REGISTRAR PRODUCTO");
        btn_RegistrarProductos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btn_RegistrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_GuardarCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_RegistrarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_Consultas, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_RegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_SalirPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_RegistrarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Consultas, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_GuardarCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_RegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(btn_SalirPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_GuardarComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_GuardarComprasActionPerformed

    private void btn_RegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarClienteActionPerformed
        TiposCliente tc = new TiposCliente();
        tc.setVisible(true);
        tc.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_btn_RegistrarClienteActionPerformed

    private void btn_SalirPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirPrincipalActionPerformed
       this.dispose();
    }//GEN-LAST:event_btn_SalirPrincipalActionPerformed

    private void btn_RegistrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarProductosActionPerformed
       this.dispose();
       var dp = new DatosProducto();
       dp.setVisible(true);
       dp.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_RegistrarProductosActionPerformed

    private void btn_ConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ConsultasActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Consultas;
    private javax.swing.JButton btn_GuardarCompras;
    private javax.swing.JButton btn_RegistrarCliente;
    private javax.swing.JButton btn_RegistrarProductos;
    private javax.swing.JButton btn_SalirPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
