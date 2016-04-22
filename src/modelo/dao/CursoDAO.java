
package dao;

import conexion.Conexion;
import dto.CursoDTO;
import interfaces.Obligacion;

/**
 *
 * @author
 */
public class CursoDAO implements Obligacion<CursoDTO>{
    
    //constantes que me permitiran manejar las sentencias SQL de la base de datos
    private static final String  SQL_INSERT = "";
    private static final String  SQL_DELETE = "";
    private static final String  SQL_UPDATE = "";
    private static final String    SQL_READ = "";
    private static final String SQL_READALL = "";
    
    //constante que me permitira saber si estoy conectado...
    private static final Conexion con = Conexion.saberEstado();
    
    //metodos para realizar el CRUD...
    @Override
    public boolean create(CursoDTO c) {
        
    }

    @Override
    public boolean delete(Object key) {
         
    }

    @Override
    public boolean update(CursoDTO c) {
        
    }

    @Override
    public CursoDTO read(Object key) {
        
    }

    @Override
    public List<CursoDTO> readAll() {
        
    }
    
}
