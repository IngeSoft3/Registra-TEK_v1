
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
    
    /**
     * método para leer un dato string y convertirlo a double.
     * @param mensaje
     * @return 
     */
    public static double leerDouble(String mensaje) {
        String N = JOptionPane.showInputDialog(mensaje);
        double n = Double.parseDouble(N);
        return n;
    }
    
    
    /**
     * método para leer un dato string y convertirlo a long.
     * @param mensaje
     * @return 
     */
    public static long leerLong(String mensaje) {
        String N = JOptionPane.showInputDialog(mensaje);
        long n = Long.parseLong(N);
        return n;
    }
    
    /**
     * método para leer un dato string y convertirlo a Float
     * @param mensaje
     * @return 
     */
    public static float leerFloat(String mensaje) { 
        //método para leer un dato string y convertirlo a float
        String N = JOptionPane.showInputDialog(mensaje);
        float n = Float.parseFloat(N);
        return n;
    }
    
    
    /**
     * método para leer un dato string y convertirlo a Float.
     * @param mensaje
     * @return 
     */
    public static float leerFloatSinMensaje(String mensaje) { //
        float n = Float.parseFloat(mensaje);
        return n;
    }
    
}
