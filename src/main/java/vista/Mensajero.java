package vista;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Mensajero {

    
    public static void Mensaje(String mensaje, String tipo,  String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        
        if(tipo.equalsIgnoreCase("info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }else if(tipo.equalsIgnoreCase("error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        
        JDialog dialog = optionPane.createDialog(titulo);    
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
    }
    
    
}
