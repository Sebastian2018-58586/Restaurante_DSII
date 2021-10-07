package restaurante_dsii.GUI;

public class Menu_principal extends javax.swing.JFrame {


    public Menu_principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        verCocina = new javax.swing.JButton();
        verMenu = new javax.swing.JButton();
        doPedido = new javax.swing.JButton();
        infoMeseros = new javax.swing.JButton();
        pagos = new javax.swing.JButton();
        doPedido1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verCocina.setForeground(new java.awt.Color(204, 204, 204));
        verCocina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cocinero.png"))); // NOI18N
        verCocina.setBorderPainted(false);
        verCocina.setContentAreaFilled(false);
        verCocina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verCocina.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verCocinaMouseMoved(evt);
            }
        });
        verCocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCocinaActionPerformed(evt);
            }
        });
        jPanel1.add(verCocina, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 150, 140));

        verMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/anillo.png"))); // NOI18N
        verMenu.setContentAreaFilled(false);
        verMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verMenu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verMenuMouseMoved(evt);
            }
        });
        verMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verMenuActionPerformed(evt);
            }
        });
        jPanel1.add(verMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 140, 140));

        doPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/estadisticas.png"))); // NOI18N
        doPedido.setContentAreaFilled(false);
        doPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doPedido.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                doPedidoMouseMoved(evt);
            }
        });
        doPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doPedidoActionPerformed(evt);
            }
        });
        jPanel1.add(doPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 150, 140));

        infoMeseros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/dinero.png"))); // NOI18N
        infoMeseros.setContentAreaFilled(false);
        infoMeseros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infoMeseros.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                infoMeserosMouseMoved(evt);
            }
        });
        infoMeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoMeserosActionPerformed(evt);
            }
        });
        jPanel1.add(infoMeseros, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 140, 140));

        pagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/menu.png"))); // NOI18N
        pagos.setContentAreaFilled(false);
        pagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pagos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                pagosMouseMoved(evt);
            }
        });
        pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagosActionPerformed(evt);
            }
        });
        jPanel1.add(pagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 150, 140));

        doPedido1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/notas.png"))); // NOI18N
        doPedido1.setContentAreaFilled(false);
        doPedido1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doPedido1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                doPedido1MouseMoved(evt);
            }
        });
        doPedido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doPedido1ActionPerformed(evt);
            }
        });
        jPanel1.add(doPedido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 150, 140));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MENU PRINCIPAL");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 340, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Diseño sin título (2).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verCocinaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verCocinaMouseMoved
        verCocina.setToolTipText("*ACCEDER A COCINA/STOCK");
    }//GEN-LAST:event_verCocinaMouseMoved

    private void verCocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCocinaActionPerformed

    }//GEN-LAST:event_verCocinaActionPerformed

    private void verMenuMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMenuMouseMoved
        verMenu.setToolTipText("*VER MENÚ DE PLATOS");
    }//GEN-LAST:event_verMenuMouseMoved

    private void verMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verMenuActionPerformed
      
    }//GEN-LAST:event_verMenuActionPerformed

    private void doPedidoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doPedidoMouseMoved
        doPedido.setToolTipText("*INGRESO DE PEDIDOS");
    }//GEN-LAST:event_doPedidoMouseMoved

    private void doPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doPedidoActionPerformed
 
    }//GEN-LAST:event_doPedidoActionPerformed

    private void infoMeserosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMeserosMouseMoved
  
    }//GEN-LAST:event_infoMeserosMouseMoved

    private void infoMeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoMeserosActionPerformed
  
    }//GEN-LAST:event_infoMeserosActionPerformed

    private void pagosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagosMouseMoved
       
    }//GEN-LAST:event_pagosMouseMoved

    private void pagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagosActionPerformed

    }//GEN-LAST:event_pagosActionPerformed

    private void doPedido1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doPedido1MouseMoved

    }//GEN-LAST:event_doPedido1MouseMoved

    private void doPedido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doPedido1ActionPerformed
     
    }//GEN-LAST:event_doPedido1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doPedido;
    private javax.swing.JButton doPedido1;
    private javax.swing.JButton infoMeseros;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pagos;
    public javax.swing.JButton verCocina;
    private javax.swing.JButton verMenu;
    // End of variables declaration//GEN-END:variables
}
