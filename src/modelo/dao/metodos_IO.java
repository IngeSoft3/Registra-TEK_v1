
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
    
    /**
     * //método para leer un dato de tipo string y convertirlo a entero
     * @param mensaje
     * @return 
     */
    public static int leerInt(String mensaje) {
        String N = JOptionPane.showInputDialog(mensaje);
        int n = Integer.parseInt(N);
        return n;
    }
    
    /**
     * método para leer un dato string y convertirlo a Entero.
     * @param dato
     * @return 
     */
    public static int leerIntSinMensaje(String dato) { //
        int n = Integer.parseInt(dato);
        return n;
    }
    
    
}
