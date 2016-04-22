package controlador;

import dao.EstudianteDAO;
import dto.EstudianteDTO;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author
 */
public class Controlador_Estudiante {

  public void RegistrarEstudiante(String cdg, String nmb, String ape, Date feNa, int cdcrs){
    EstudianteDAO e = new EstudianteDAO();
    e.create(new EstudianteDTO(cdg, nmb, ape, feNa, cdcrs));
  } //los resultados se ven en la BD
  
  public void ModificarEstudiante(String cdg,String nmb, String ape, Date feNa, int cdcrs){
    EstudianteDAO e = new EstudianteDAO();
    e.update(new EstudianteDTO(cdg, nmb, ape, feNa, cdcrs));
  } //los resultados se ven en la BD
  
  public void EliminarEstudiante(String cdg){
    EstudianteDAO e = new EstudianteDAO();
    e.delete(cdg);
  } //los resultados se ven en la BD
    
  public String[] ListarEstudianteConCodigo(String cdg){
      
    EstudianteDTO ed; //Luego utilizare este objeto de tabla para realizar un vector
    EstudianteDAO e = new EstudianteDAO(); //creo una DAO para que genere movimientos desde la base de datos.
    String[] FilaEstudiante = {"","","",""}; //creo un vector que es el que voy a agregar al la tabla de consultas
    
    //aqui lo utilizo para almacenar el objeto que me retorna...
    ed = e.read(cdg); //obtengo el objeto desde la base de datos...
    
    FilaEstudiante[0] =  ed.getCodigo();
    FilaEstudiante[1] =  ed.getNombre();
    FilaEstudiante[2] =  ed.getApellidos();
    FilaEstudiante[3] =  ed.getFechaNacimiento()+"";
    
    return FilaEstudiante;
  } //los resultados se ven en la Aplicacion
  
  public String[][] ListarTodasLasEstudiantes(){
        
    List<EstudianteDTO> lstEst; //necesitare la lista de Estudiantes...
    EstudianteDTO ed; //tambien un objeto sede independiente para trasformarlo...
    String[][] datos; //por que voy a necesitar mandar esa Matriz de Strings para que la Tabla la Pinte.
    
    EstudianteDAO e = new EstudianteDAO(); //creo una nueva instancia para el movimiento de los datos en la BD.
    lstEst = e.readAll(); // Le paso toda la lista de EstudiantesDTO a la variable "lstDct";
    
    int numFilas = lstEst.size(); //extraigo el numero de Filas desde el tamaño del arreglo... (en minusculas por que no es una constante si no que su valor varia dependiendo del numero de regitros que halla en el arreglo)
    final int NUM_COLUMNAS = 3; //por que ya se que son las columnas: codigo, nombre, ubicacion;
    
    datos = new String[numFilas][NUM_COLUMNAS];
    
    for (int i = 0; i < (datos.length); i++) {
      String[] filaTemporalEstudiante = {"","","","",""};
    //for (int j = 0; j < (datos[i].length); j++) {
     
        ed = lstEst.get(i); //paseme el objeto EstudianteDTO que este en esa posicion i;
        filaTemporalEstudiante[0] = ed.getCodigo(); //llene la posicion 0 de la fila temporal con el codigo
        filaTemporalEstudiante[1] = ed.getNombre(); //llene la posicion 0 de la fila temporal con el nombre
        filaTemporalEstudiante[2] = ed.getApellidos(); //llene la posicion 0 de la fila temporal con la direccion
        filaTemporalEstudiante[3] = ed.getFechaNacimiento()+""; //llene la posicion 0 de la fila temporal con la direccion
        filaTemporalEstudiante[4] = ed.getCodigo_curso()+""; //llene la posicion 0 de la fila temporal con la direccion
      
    //}
      datos[i] = filaTemporalEstudiante;
    }
    return datos;
    //los resultados se ven en la Aplicacion
  }
  
}
