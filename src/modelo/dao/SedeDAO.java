
package dao;

import conexion.Conexion;
import dto.SedeDTO;
import interfaces.Obligacion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author
 */
public class SedeDAO implements Obligacion<SedeDTO>{
    
    //constantes que me permitiran manejar las sentencias SQL de la base de datos
    private static final String  SQL_INSERT = "INSERT INTO sede (codigo, nombre, direccion) VALUES (?, ?, ?)";
    private static final String  SQL_DELETE = "DELETE FROM sede WHERE codigo = ?";
    private static final String  SQL_UPDATE = "UPDATE sede SET nombre=?, direccion=? WHERE codigo = ?";
    private static final String    SQL_READ = "SELECT * FROM sede WHERE codigo = ?";
    private static final String SQL_READALL = "SELECT * FROM sede";
    
    //constante que me permitira saber si estoy conectado...
    private static final Conexion con = Conexion.saberEstado();
    
    //metodos para realizar el CRUD...
    @Override
    public boolean create(SedeDTO c) {
        
    }

    @Override
    public boolean delete(Object key) {
        
    }

    @Override
    public boolean update(SedeDTO c) {
        
    }

    @Override
    public SedeDTO read(Object key) {
        
    }

    @Override
    public List<SedeDTO> readAll() {
        
    }
    
}
