
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;


public class MaquinaControl implements ActionListener{
    
    vista.RegistroMaquinas maquinaVista;
    modelo.Maquina maquinaModelo;
    modelo.GestorMaquina maquinaGestorModelo;
    
    public MaquinaControl(vista.RegistroMaquinas maquinaVista){
        this.maquinaVista= maquinaVista;
        maquinaGestorModelo = new modelo.GestorMaquina();
    }
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(maquinaVista.btnRegistrarMaquina)){
            
            String codigo = maquinaVista.txtCodigoMaquina.getText();
            String nombre = maquinaVista.txtNombreMaquina.getText();
            String proveedor = maquinaVista.txtProveedorMaquina.getText();
            String marca = maquinaVista.txtMarcaMaquina.getText();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
            String fechaAdquisicion = formato.format(maquinaVista.jDateChooser1.getDate());
            
            
            maquinaModelo = new modelo.Maquina(codigo,nombre,proveedor,marca,fechaAdquisicion);
            maquinaGestorModelo.RegistrarMaquinas(maquinaModelo);
            
            
        }
        
        
        if(e.getSource().equals(maquinaVista.btnNuevoMaquina)){
            
            maquinaVista.txtCodigoMaquina.setText("");
            maquinaVista.txtNombreMaquina.setText("");
            maquinaVista.txtProveedorMaquina.setText("");
            maquinaVista.txtMarcaMaquina.setText("");
            maquinaVista.jDateChooser1.setDate(null);
            maquinaVista.txtCodigoMaquina.requestFocus();
        }
        
        
        
        
    }
    
    

    
    
}
