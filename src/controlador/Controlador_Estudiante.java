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
  
}
