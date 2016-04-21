
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
        PreparedStatement ps; 
        
        try {
            
            ps = con.getCnn().prepareStatement(SQL_INSERT);
            ps.setString(1, c.getCodigo());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getDireccion());
            
            if (ps.executeUpdate() > 0) {
                con.cerrarConexion();
                return true;
            }
                    
        } catch (SQLException ex) {
            Logger.getLogger(SedeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrarConexion(); 
        }
        return false;
    }

    @Override
    public boolean delete(Object key) {
        PreparedStatement ps;
        try {
            ps = con.getCnn().prepareStatement(SQL_DELETE);
            ps.setString(1, key.toString());
            
            if (ps.executeUpdate() > 0){
                // con.cerrarConexion(); no estaba, pero me aseguro por si las...
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SedeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrarConexion(); 
        }
        return false;
    }

    @Override
    public boolean update(SedeDTO c) {
        PreparedStatement ps; 
        
        try {
            
            ps = con.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getDireccion());
            ps.setInt(3, metodos_IO.leerIntSinMensaje(c.getCodigo()));
            
            if (ps.executeUpdate() > 0) {
                //con.cerrarConexion();
                return true;
            }
                    
        } catch (SQLException ex) {
            Logger.getLogger(SedeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrarConexion(); 
        }
        return false;
    }

    @Override
    public SedeDTO read(Object key) {
        PreparedStatement ps;
        ResultSet res;
        SedeDTO s = null;
        
        try {
            ps = con.getCnn().prepareStatement(SQL_READ);
            ps.setString(1, key.toString());
            
            res = ps.executeQuery();
                    
            while(res.next()){
                s = new SedeDTO(res.getString(1), res.getString(2), res.getString(3));
            }
            return s;
        } catch (SQLException ex) {
            Logger.getLogger(SedeDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrarConexion(); 
        }
        return s;
    }

    @Override
    public List<SedeDTO> readAll() {
        PreparedStatement ps;
        ResultSet res;
        ArrayList<SedeDTO> sedes = new ArrayList();
        
        try {
            
            ps = con.getCnn().prepareStatement(SQL_READALL);
            res = ps.executeQuery();
            
            while(res.next()){
                sedes.add(new SedeDTO(res.getString(1), res.getString(2), res.getString(3)));
            } 
            
        }catch (SQLException ex) {
                Logger.getLogger(SedeDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                con.cerrarConexion(); 
            }
            return sedes;
    }
    
}
