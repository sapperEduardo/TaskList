
package logica;

import persistencia.Coneccion;
import vista.Principal;

public class Main {

    public static void main(String[] args) {
        
        
        Coneccion.conectar();
        
        Principal p = new Principal();
        
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        
        
        
    }
}
