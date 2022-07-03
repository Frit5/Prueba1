package vista;

public class PrincipalFrameEstrumetal extends javax.swing.JFrame {

    RegistroMaquinas registroMaquinas;
    ConsultaMaquinas consultaMaquinas;

    public PrincipalFrameEstrumetal() {

        registroMaquinas = new RegistroMaquinas();
        consultaMaquinas = new ConsultaMaquinas();
        add(registroMaquinas);
        add(consultaMaquinas);
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuMantenimiento = new javax.swing.JMenu();
        jMenuItemRegistroMaquinas = new javax.swing.JMenuItem();
        jMenuItemConsultarMaquina = new javax.swing.JMenuItem();
        jMenuItemMantCorrect = new javax.swing.JMenuItem();
        jMenuItemMantPrevent = new javax.swing.JMenuItem();
        jMenuItemProgMant = new javax.swing.JMenuItem();
        jMenuProduccion = new javax.swing.JMenu();
        jMenuItemSolicitudesMant = new javax.swing.JMenuItem();
        jMenuProveedores = new javax.swing.JMenu();
        jMenuItemMantExterno = new javax.swing.JMenuItem();
        jMenuItemAlquiler = new javax.swing.JMenuItem();
        jMenuItemCotizaciones = new javax.swing.JMenuItem();
        jMenuItemVentas = new javax.swing.JMenuItem();
        jMenuItemFacturas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Mantenimientos");
        setName("PrincipalFrame"); // NOI18N

        jMenuMantenimiento.setText("Mantenimiento");
        jMenuMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMantenimientoActionPerformed(evt);
            }
        });

        jMenuItemRegistroMaquinas.setText("Registro Maquinas");
        jMenuItemRegistroMaquinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistroMaquinasActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuItemRegistroMaquinas);

        jMenuItemConsultarMaquina.setText("Consultar Maquinas");
        jMenuItemConsultarMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarMaquinaActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuItemConsultarMaquina);

        jMenuItemMantCorrect.setText("Mantenimiento Correctivo");
        jMenuItemMantCorrect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMantCorrectActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuItemMantCorrect);

        jMenuItemMantPrevent.setText("Mantenimiento Preventivo");
        jMenuItemMantPrevent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMantPreventActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuItemMantPrevent);

        jMenuItemProgMant.setText("Programación Mantenimientos");
        jMenuItemProgMant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProgMantActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuItemProgMant);

        jMenuBar1.add(jMenuMantenimiento);

        jMenuProduccion.setText("Produccion");
        jMenuProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProduccionActionPerformed(evt);
            }
        });

        jMenuItemSolicitudesMant.setText("Solicitudes Mantenimiento");
        jMenuItemSolicitudesMant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSolicitudesMantActionPerformed(evt);
            }
        });
        jMenuProduccion.add(jMenuItemSolicitudesMant);

        jMenuBar1.add(jMenuProduccion);

        jMenuProveedores.setText("Proveedores");
        jMenuProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuProveedoresActionPerformed(evt);
            }
        });

        jMenuItemMantExterno.setText("Mantenimiento Externo");
        jMenuItemMantExterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMantExternoActionPerformed(evt);
            }
        });
        jMenuProveedores.add(jMenuItemMantExterno);

        jMenuItemAlquiler.setText("Alquiler");
        jMenuItemAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlquilerActionPerformed(evt);
            }
        });
        jMenuProveedores.add(jMenuItemAlquiler);

        jMenuItemCotizaciones.setText("Cotizaciones");
        jMenuItemCotizaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCotizacionesActionPerformed(evt);
            }
        });
        jMenuProveedores.add(jMenuItemCotizaciones);

        jMenuItemVentas.setText("Ventas");
        jMenuItemVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVentasActionPerformed(evt);
            }
        });
        jMenuProveedores.add(jMenuItemVentas);

        jMenuItemFacturas.setText("Facturas");
        jMenuItemFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFacturasActionPerformed(evt);
            }
        });
        jMenuProveedores.add(jMenuItemFacturas);

        jMenuBar1.add(jMenuProveedores);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemMantExternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMantExternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemMantExternoActionPerformed

    private void jMenuItemRegistroMaquinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistroMaquinasActionPerformed
  registroMaquinas.setVisible(true);
    }//GEN-LAST:event_jMenuItemRegistroMaquinasActionPerformed

    private void jMenuItemMantCorrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMantCorrectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemMantCorrectActionPerformed

    private void jMenuItemMantPreventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMantPreventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemMantPreventActionPerformed

    private void jMenuItemProgMantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProgMantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemProgMantActionPerformed

    private void jMenuItemSolicitudesMantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSolicitudesMantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSolicitudesMantActionPerformed

    private void jMenuItemAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlquilerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemAlquilerActionPerformed

    private void jMenuItemCotizacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCotizacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemCotizacionesActionPerformed

    private void jMenuItemVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemVentasActionPerformed

    private void jMenuItemFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFacturasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemFacturasActionPerformed

    private void jMenuItemConsultarMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarMaquinaActionPerformed
consultaMaquinas.setVisible(true);    }//GEN-LAST:event_jMenuItemConsultarMaquinaActionPerformed

    private void jMenuMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMantenimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuMantenimientoActionPerformed

    private void jMenuProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuProduccionActionPerformed

    private void jMenuProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuProveedoresActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrameEstrumetal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jMenuItemAlquiler;
    public javax.swing.JMenuItem jMenuItemConsultarMaquina;
    public javax.swing.JMenuItem jMenuItemCotizaciones;
    public javax.swing.JMenuItem jMenuItemFacturas;
    public javax.swing.JMenuItem jMenuItemMantCorrect;
    public javax.swing.JMenuItem jMenuItemMantExterno;
    public javax.swing.JMenuItem jMenuItemMantPrevent;
    public javax.swing.JMenuItem jMenuItemProgMant;
    public javax.swing.JMenuItem jMenuItemRegistroMaquinas;
    public javax.swing.JMenuItem jMenuItemSolicitudesMant;
    public javax.swing.JMenuItem jMenuItemVentas;
    public javax.swing.JMenu jMenuMantenimiento;
    public javax.swing.JMenu jMenuProduccion;
    public javax.swing.JMenu jMenuProveedores;
    // End of variables declaration//GEN-END:variables
}
