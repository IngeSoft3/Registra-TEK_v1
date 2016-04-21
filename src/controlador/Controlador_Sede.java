package controlador;

import dao.SedeDAO;
import dto.SedeDTO;
import java.util.List;

/**
 *
 * @author
 */

public class Controlador_Sede {
    
    public void RegistrarSede(String cdg, String nmb, String drc){
        SedeDAO s = new SedeDAO();
        s.create(new SedeDTO(cdg, nmb, drc));
        //SedeDTO salonABuscar = s.read("1100");
        //System.out.println(salonABuscar.toString());
        //s.update(new SalonDTO("222", "salon1", "unknown"));
        //salonABuscar.mostrarDatos();    
    } //los resultados se ven en la BD
    
    
    
}
