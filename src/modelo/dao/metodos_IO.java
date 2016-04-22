
package dao;

import javax.swing.JOptionPane;
import javax.swing.RootPaneContainer;
import javax.swing.plaf.RootPaneUI;

/**
 *
 * @author
 */
public class metodos_IO {
    
    /**
     * método para JOPSMD un mensaje.
     * JOPSMD: JOtionPane.showMessageDialog (mensaje de salida)
     * @param mensaje 
     */
    public static void JOPSMD(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje); 
    }
    
}
