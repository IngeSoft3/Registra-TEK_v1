
package controlador;

import dao.CursoDAO;
import dao.metodos_IO;
import dto.CursoDTO;

/**
 *
 * @author
 */
public class Controlador_Curso {
    
    public void RegistrarCurso(String cdg, String nmb, String drc, String cdgsd){
        CursoDAO c = new CursoDAO();
        int codigoCursoConvertido = metodos_IO.leerIntSinMensaje(cdgsd);
        c.create(new CursoDTO(cdg, nmb, drc, codigoCursoConvertido));
    } //los resultados se ven en la BD
    
    public void ModificarCurso(String cdg, String nmb, String drc, String cdgsd){
        CursoDAO c = new CursoDAO();
        int codigoCursoConvertido = metodos_IO.leerIntSinMensaje(cdgsd);
        c.update(new CursoDTO(cdg, nmb, drc, codigoCursoConvertido));
    } //los resultados se ven en la BD
    
    
    
}
