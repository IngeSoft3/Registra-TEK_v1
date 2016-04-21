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
    
    public void ModificarSede(String cdg, String nmb, String drc){
        SedeDAO s = new SedeDAO();
        s.update(new SedeDTO(cdg, nmb, drc));
    } //los resultados se ven en la BD
    
    public void EliminarSede(String cdg){
        SedeDAO s = new SedeDAO();
        s.delete(cdg);
    } //los resultados se ven en la BD
    
    public String[][] ListarTodasLasSedes(){
        
        List<SedeDTO> lstSd; //necesitare la lista de Sedes...
        SedeDTO sd; //tambien un objeto sede independiente para trasformarlo...
        String[][] datos; //por que voy a necesitar mandar esa Matriz de Strings para que la Tabla la Pinte.
        
        SedeDAO s = new SedeDAO(); //creo una nueva instancia para el movimiento de los datos en la BD.
        lstSd = s.readAll(); // Le paso toda la lista de SedesDTO a la variable "lstSd";
        
        int numFilas = lstSd.size(); //extraigo el numero de Filas desde el tamaño del arreglo... (en minusculas por que no es una constante si no que su valor varia dependiendo del numero de regitros que halla en el arreglo)
        final int NUM_COLUMNAS = 3; //por que ya se que son las columnas: codigo, nombre, ubicacion;
        
        datos = new String[numFilas][NUM_COLUMNAS];
        
        for (int i = 0; i < (datos.length); i++) {
            String[] filaTemporalSede = {"","",""};
            //for (int j = 0; j < (datos[i].length); j++) {
                 
                 sd = lstSd.get(i); //paseme el objeto SedeDTO que este en esa posicion i;
                 filaTemporalSede[0] = sd.getCodigo(); //llene la posicion 0 de la fila temporal con el codigo
                 filaTemporalSede[1] = sd.getNombre(); //llene la posicion 0 de la fila temporal con el nombre
                 filaTemporalSede[2] = sd.getDireccion(); //llene la posicion 0 de la fila temporal con la direccion
                
            //}
            datos[i] = filaTemporalSede;
        }
        return datos;
        //los resultados se ven en la Aplicacion
    }
    
}
