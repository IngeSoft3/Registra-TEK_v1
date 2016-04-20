
package conexion;

//import java.sql.Connection;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author
 */

//tendrr solo dos atributos para facilitar la manipulacion...

public class Conexion {
    
    public static Conexion instance; //creando una instancia de tipo conexion
    //lo anterior me sirve para aplicar el patron de diseño singleton.
    private Connection cnn;
    
    //El patron dao me pide que mi constructor sea privado para no 
    //crear instancias de tipo "Conexion" desde afuera
    private Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");//hay se pone el driver.
            cnn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rg_tk?zeroDateTimeBehavior=convertToNull", "root", ""); //aqui pongo la url, el usuario, y el password
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public synchronized static Conexion saberEstado(){
        if (instance == null) {
            instance = new Conexion();
        } 
        return instance;
    }

    public Connection getCnn() {
        return cnn;
    }
    
    public void cerrarConexion(){
        instance = null;
    }
    
}
