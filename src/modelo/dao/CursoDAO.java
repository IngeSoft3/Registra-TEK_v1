
package dao;

import conexion.Conexion;
import dto.CursoDTO;
import interfaces.Obligacion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author
 */
public class CursoDAO implements Obligacion<CursoDTO>{
    
    //constantes que me permitiran manejar las sentencias SQL de la base de datos
    private static final String  SQL_INSERT = "INSERT INTO curso (codigo, nombre, jornada, sede_codigo) VALUES (?, ?, ?, ?)";
    private static final String  SQL_DELETE = "DELETE FROM curso WHERE codigo = ?";
    private static final String  SQL_UPDATE = "UPDATE salon SET nombre=?, jornada=?, sede_codigo=? WHERE codigo = ?";
    private static final String    SQL_READ = "SELECT * FROM curso WHERE codigo = ?";
    private static final String SQL_READALL = "SELECT * FROM curso";
    
    //constante que me permitira saber si estoy conectado...
    private static final Conexion con = Conexion.saberEstado();
    
    //metodos para realizar el CRUD...
    @Override
    public boolean create(CursoDTO c) {
        
        PreparedStatement ps; 
        
        try {
            
            ps = con.getCnn().prepareStatement(SQL_INSERT);
            ps.setString(1, c.getCodigo());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getJornada());
            
            if (ps.executeUpdate() > 0) {
                con.cerrarConexion();
                return true;
            }
                    
        } catch (SQLException ex) {
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrarConexion(); 
        }
        return false; 
    }

    @Override
    public boolean update(CursoDTO c) {
        PreparedStatement ps; 
        
        try {
            
            ps = con.getCnn().prepareStatement(SQL_UPDATE);
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getJornada());
              ps.setInt (3, c.getSede_codigo());
              ps.setInt (4, metodos_IO.leerIntSinMensaje(c.getCodigo()));
            
            if (ps.executeUpdate() > 0) {
                //con.cerrarConexion();
                return true;
            }
                    
        } catch (SQLException ex) {
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrarConexion(); 
        }
        return false;
    }

    @Override
    public CursoDTO read(Object key) {
        PreparedStatement ps;
        ResultSet res;
        CursoDTO c = null;
        
        try {
            ps = (PreparedStatement) con.getCnn().prepareStatement(SQL_READ);
            ps.setString(1, key.toString());
            
            res = ps.executeQuery();
                    
            while(res.next()){
                c = new CursoDTO(res.getString(1), res.getString(2), res.getString(3), res.getInt(4));
            }
            return c;
        } catch (SQLException ex) {
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.cerrarConexion(); 
        }
        return c;
    }

    @Override
    public List<CursoDTO> readAll() {
        PreparedStatement ps;
        ResultSet res;
        List<CursoDTO> salones = new List();
        
        try {
            
            ps = con.getCnn().prepareStatement(SQL_READALL);
            res = ps.executeQuery();
            
            while(res.next()){
                salones.add(new CursoDTO(res.getString(1), res.getString(2), res.getString(3), res.getInt(4)));
            } 
            
        }catch (SQLException ex) {
                Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                //con.cerrarConexion(); 
            }
        return salones;
    }
    
}
