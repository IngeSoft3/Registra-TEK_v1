package controlador;

import modelo.dao.ProcedureDAO;

/**
 *
 * @author
 */
public class Controlador_Procedures {
    
    /**
     * Me permite Ingresar a una persona a la aplicacion, solo con su codigo sí existe.
     * @param codigo
     * @return 
     */
    public static boolean Login(String codigo){
        ProcedureDAO p;  //crei yb objeto ProcedureDAO

        p = new ProcedureDAO(); //lo instancio
        boolean respuesta = p.PermitirIngreso(codigo); //Le Pregunto si es este codigo esta en la base de datos permitale el ingreso si no no.
        return respuesta; // y retorneme lo que halla hecho, me refiero a que si ejecuto el ingreso o no lo ejecuto.
        
    }
}
