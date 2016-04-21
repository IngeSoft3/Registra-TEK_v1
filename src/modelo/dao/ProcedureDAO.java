
package modelo.dao;

import conexion.Conexion;

import dao.metodos_IO;
import java.sql.PreparedStatement;


/**
 *
 * @author
 */
public class ProcedureDAO {
    
    //constantes que me permitiran manejar las sentencias SQL de la base de datos
    private static final String  SQL_EXISTS = "";
    private static final String  SQL_TIMESTAMPDIFF = "";
    
    //constante que me permitira saber si estoy conectado...
    private static final Conexion con = Conexion.saberEstado();
    
    //metodos para realizar el CRUD...
    public boolean PermitirIngreso(String s) {}
    
    public int getEdadDocente(int code){}
    
}
