package vista;

import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class ConsultaMaquinas extends javax.swing.JInternalFrame {

    public controlador.GestorMaquinaControl gestorMaquinaControl;
    private DefaultTableModel tabla;

    public ConsultaMaquinas() {
        initComponents();
        gestorMaquinaControl = new controlador.GestorMaquinaControl(this);
        String titulosTabla[] = {"Codigo", "Nombre", "Proveedor", "Marca", "Fecha Adquisicion"};
        tabla = new DefaultTableModel(null, titulosTabla);
        tblResultadosMaquina.setModel(tabla);
        btnAceptar.addActionListener( gestorMaquinaControl);

    }

    public DefaultTableModel getTableModel() {
        return tabla;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbtnCodigoMaquina = new javax.swing.JRadioButton();
        rbtnNombreMaquina = new javax.swing.JRadioButton();
        rbtnProveedorMaquina = new javax.swing.JRadioButton();
        rbtnMarcaMaquina = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtValorBusquedaMaquina = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultadosMaquina = new javax.swing.JTable();

        setTitle("Consulta de Maquinas");
        setName("InternalFrameConsultaMaquinas"); // NOI18N

        rbtnCodigoMaquina.setText("Código");

        rbtnNombreMaquina.setText("Nombre");

        rbtnProveedorMaquina.setText("Proveedor");

        rbtnMarcaMaquina.setText("Marca");

        jLabel1.setText("Valor a Buscar:");

        btnAceptar.setText("Aceptar");

        tblResultadosMaquina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblResultadosMaquina);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(31, 31, 31)
                                .addComponent(txtValorBusquedaMaquina))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnCodigoMaquina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnNombreMaquina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnProveedorMaquina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnMarcaMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAceptar))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnCodigoMaquina)
                    .addComponent(rbtnNombreMaquina)
                    .addComponent(rbtnProveedorMaquina)
                    .addComponent(rbtnMarcaMaquina)
                    .addComponent(btnAceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtValorBusquedaMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JRadioButton rbtnCodigoMaquina;
    public javax.swing.JRadioButton rbtnMarcaMaquina;
    public javax.swing.JRadioButton rbtnNombreMaquina;
    public javax.swing.JRadioButton rbtnProveedorMaquina;
    public javax.swing.JTable tblResultadosMaquina;
    public javax.swing.JTextField txtValorBusquedaMaquina;
    // End of variables declaration//GEN-END:variables
}
