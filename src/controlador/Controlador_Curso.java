
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
    
    public void EliminarCurso(String cdg){
        CursoDAO c = new CursoDAO();
        c.delete(cdg);
    } //los resultados se ven en la BD
    
    public String[] ListarCursoConCodigo(String cdg){
        
        CursoDTO cd; //Luego utilizare este objeto de tabla para realizar un vector
        CursoDAO c = new CursoDAO(); //creo una DAO para que genere movimientos desde la base de datos.
        String[] FilaCurso = {"","","",""}; //creo un vector que es el que voy a agregar al la tabla de consultas
        
        //aqui lo utilizo para almacenar el objeto que me retorna...
        cd = c.read(cdg); //obtengo el objeto desde la base de datos...
        
        FilaCurso[0] =  cd.getCodigo();
        FilaCurso[1] =  cd.getNombre();
        FilaCurso[2] =  cd.getJornada();
        FilaCurso[3] =  cd.getSede_codigo()+"";
        
        return FilaCurso;
    } //los resultados se ven en la Aplicacion
    
    public String[][] ListarTodosLosCursos(){
        
        List<CursoDTO> lstCrs; //necesitare la lista de Cursos...
        CursoDTO cd; //tambien un objeto sede independiente para trasformarlo...
        String[][] datos; //por que voy a necesitar mandar esa Matriz de Strings para que la Tabla la Pinte.
        
        CursoDAO c = new CursoDAO(); //creo una nueva instancia para el movimiento de los datos en la BD.
        lstCrs = c.readAll(); // Le paso toda la lista de CursosDTO a la variable "lstCrs";
        
        int numFilas = lstCrs.size(); //extraigo el numero de Filas desde el tamaño del arreglo... (en minusculas por que no es una constante si no que su valor varia dependiendo del numero de regitros que halla en el arreglo)
        final int NUM_COLUMNAS = 4; //por que ya se que son las columnas: codigo, nombre, jornada, sede_codigo;
        
        datos = new String[numFilas][NUM_COLUMNAS];
        
        for (int i = 0; i < (datos.length); i++) {
            String[] filaTemporalCurso = {"","","",""};
            //for (int j = 0; j < (datos[i].length); j++) {
                 
                 cd = lstCrs.get(i); //paseme el objeto CursoDTO que este en esa posicion i;
                 filaTemporalCurso[0] = cd.getCodigo(); //llene la posicion 0 de la fila temporal con el codigo
                 filaTemporalCurso[1] = cd.getNombre(); //llene la posicion 1 de la fila temporal con el nombre
                 filaTemporalCurso[2] = cd.getJornada(); //llene la posicion 2 de la fila temporal con la jornada
                 filaTemporalCurso[3] = cd.getSede_codigo()+""; //llene la posicion 3 de la fila temporal con el codigo de la sede en string.
                
            //}
            datos[i] = filaTemporalCurso;
        }
        return datos;
        //los resultados se ven en la Aplicacion
    }
    
}
