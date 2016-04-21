
package modelo.dao;

import conexion.Conexion;

import dao.metodos_IO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author
 */
public class ProcedureDAO {
    
    //constantes que me permitiran manejar las sentencias SQL de la base de datos
    private static final String  SQL_EXISTS = "SELECT EXISTS(SELECT * FROM docente WHERE codigo = ?)";
    private static final String  SQL_TIMESTAMPDIFF = "SELECT TIMESTAMPDIFF(YEAR, (SELECT fechaNacimiento FROM docente WHERE codigo= ? ), CURDATE()) AS age;";
    
    //constante que me permitira saber si estoy conectado...
    private static final Conexion con = Conexion.saberEstado();
    
    //metodos para realizar el CRUD...
    public boolean PermitirIngreso(String s) {
        PreparedStatement ps; 
        ResultSet res;
        
        try {
            
            ps = con.getCnn().prepareStatement(SQL_EXISTS); //preparo el statement 
            ps.setInt(1, metodos_IO.leerIntSinMensaje(s)); //convierto el String en Entero
            
            res = ps.executeQuery(); //ejecúto el statement y eso me devuelve un 0 o un 1, true o false numerico.
            
            if (res.next()) { 
                con.cerrarConexion(); //cierre la conexion
                return true;
            } 
                    
        } catch (SQLException ex) {
            Logger.getLogger(dao.CursoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrarConexion(); 
        }
        return false; // si no ingreso por que el valor no existia entonces, devuelva falso, es decir no lo deje entrar.
    
    }
    
    public int getEdadDocente(int code){}
    
}
