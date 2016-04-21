
package interfaces;
import java.util.List;

/**
 *
 * @author
 */
public interface Obligacion <Cualquiercosa> {
    
    //metodos de manejo de la Base de datos...
    public boolean create(Cualquiercosa c);
    public boolean delete(Object key);
    public boolean update(Cualquiercosa c);
    
    public Cualquiercosa read(Object key);
    public List<Cualquiercosa> readAll();
    
}
