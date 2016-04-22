package pruebas;

import dao.metodos_IO;
import javax.swing.JOptionPane;
import modelo.dao.ProcedureDAO;

/**
 *
 * @author
 */
public class Prueba_con_Procedures {
    public static void main(String[] args) {
        
      ProcedureDAO p;
        
      //Probando el Login...
      String pass = metodos_IO.JOPSID("Digite Contraseña");
        
      p = new ProcedureDAO();
      boolean respuesta = p.PermitirIngreso(pass);
        
      if (respuesta) {
          metodos_IO.JOPSMD("Ingreso Correctamente");
      }else{
          metodos_IO.JOPSMD("Ingreso Fallido");
      }
    }
    
    //Probando el calculo de la Edad...
    int code = metodos_IO.leerIntSinMensaje(metodos_IO.JOPSID("Digite codigo"));
    p = new ProcedureDAO();
    int edad = p.getEdadDocente(code);
    metodos_IO.JOPSMD("La edad del docente con codigo " + code + " es:" + edad);
    
}
