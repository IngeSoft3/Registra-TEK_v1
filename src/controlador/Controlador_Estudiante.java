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
  
}
