
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;


public class GestorMaquinaControl implements ActionListener {
    
    modelo.GestorMaquina maquinaModelo;
    vista.ConsultaMaquinas consultarMaquinaVista;
    
public GestorMaquinaControl(vista.ConsultaMaquinas consultarMaquinaVista){
    this.consultarMaquinaVista= consultarMaquinaVista;
    maquinaModelo = new modelo.GestorMaquina();
}

public void ActionPermormed(ActionEvent e){
    DefaultTableModel tmodelo;
    String valor = consultarMaquinaVista.txtValorBusquedaMaquina.getText();
    int parametro =0;
    
    if(consultarMaquinaVista.rbtnCodigoMaquina.isSelected()){
     parametro =1;   
    }
    if(consultarMaquinaVista.rbtnNombreMaquina.isSelected()){
     parametro=2;   
    }
    if(consultarMaquinaVista.rbtnProveedorMaquina.isSelected()){
     parametro=3;   
    }
    if(consultarMaquinaVista.rbtnMarcaMaquina.isSelected()){
     parametro=4;   
    }
    
    LinkedList<modelo.Maquina>
    maquinas= maquinaModelo.getMaquinabyParametro(parametro,valor);   
    String registro[] = new String [5];
    
    String[]titulos={"Codigo","Nombre","Proveedor","Marca","Fecha Adquisicion"};
    tmodelo = new DefaultTableModel();
    tmodelo.setColumnIdentifiers(titulos);
    
    for(modelo.Maquina m:maquinas){
        registro[0]=m.getCodigo();
        registro[1]=m.getNombre();
        registro[2]=m.getProveedor();
        registro[3]=m.getMarca();
        registro[4]=m.getFechaAdquisicion();
        tmodelo.addRow(registro);
    }
    
    consultarMaquinaVista.tblResultadosMaquina.setModel(tmodelo);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
}


