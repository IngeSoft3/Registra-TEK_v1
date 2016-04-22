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
    
    public static void prueba_ListarSedeConCodigo() {
        //Prueba del metodo ListarSedeConCodigo del controlador que me retorna un vector de Strings...
        Controlador_Sede cs = new Controlador_Sede();
        final int NUM_COLUMNAS = 3; //son tres: codigo, nombre, apellidos;
        for (int i = 0; i < NUM_COLUMNAS; i++) {
            System.out.println(cs.ListarSedeConCodigo("1100")[i]);
    }
    
}
