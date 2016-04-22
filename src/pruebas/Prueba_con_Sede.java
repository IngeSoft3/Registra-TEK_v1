package pruebas;

import controlador.Controlador_Sede;
import dao.SedeDAO;
import dto.SedeDTO;

/**
 *
 * @author
 */
public class Prueba_con_Sede {
    
    public static void main(String[] args) {
        SedeDAO s = new SedeDAO();
        s.create(new SedeDTO("123", "sede1", "desconocida"));
        SedeDTO salonABuscar = s.read("1100");
        System.out.println(salonABuscar.toString());
        s.update(new SedeDTO("222", "salon1", "unknown"));
        salonABuscar.mostrarDatos();
        
        }
}