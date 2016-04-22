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
        /*SedeDAO s = new SedeDAO();
        s.create(new SedeDTO("123", "sede1", "desconocida"));
        SedeDTO salonABuscar = s.read("1100");
        System.out.println(salonABuscar.toString());
        s.update(new SedeDTO("222", "salon1", "unknown"));
        salonABuscar.mostrarDatos();*/
        
        prueba_CRUD();
        //prueba_ListarSedeConCodigo();
        
    }
    
    public static void prueba_CRUD() {
        
        //declarando los objetos que utilizare para la prueba
        SedeDTO sdto; 
        SedeDAO sdao;
        
        sdao = new SedeDAO();
        sdao.create(new SedeDTO("123", "sede1", "desconocida"));
        System.out.println("Creacion Satisfactoria \n");
        
        sdto = sdao.read("123");
        System.out.println("objeto salon: " + sdto.toString() + " almacenado en memoria");
        sdto.mostrarDatos();
        System.out.println("Consulta Satisfactoria \n");
        
        sdao.update(new SedeDTO("123", "sedeMod", "unknown"));
        sdto = sdao.read("123"); //lo busco de nuevo para mostrar sus cambios en la consola
        sdto.mostrarDatos(); 
        System.out.println("Modificacion Satisfactoria \n");
        
        sdao.delete("123");
        System.out.println("Eliminacion Satisfactoria \n");
    }
    
    public static void prueba_ListarSedeConCodigo() {
        //Prueba del metodo ListarSedeConCodigo del controlador que me retorna un vector de Strings...
        Controlador_Sede cs = new Controlador_Sede();
        final int NUM_COLUMNAS = 3; //son tres: codigo, nombre, apellidos;
        for (int i = 0; i < NUM_COLUMNAS; i++) {
            System.out.println(cs.ListarSedeConCodigo("1100")[i]);
    }
    
}
