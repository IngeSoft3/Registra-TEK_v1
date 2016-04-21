package dto;

/**
 *
 * @author
 */
public class CursoDTO {
    
    //declarando las variables
    private String codigo, nombre, jornada;
    private int sede_codigo;
    
    //sobrecarga de constructores...
    public CursoDTO() {}
    public CursoDTO(String codigo) {this.codigo = codigo;}
    public CursoDTO(String codigo, String nombre, String jornada, int sede_codigo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.jornada = jornada;
        this.sede_codigo = sede_codigo;
    }
    
    //metodos de acesso SET...
    public void setCodigo(String codigo) {this.codigo = codigo;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setJornada(String jornada) {this.jornada = jornada;}
    public void setSede_codigo(int sede_codigo) {this.sede_codigo = sede_codigo;}
    
    //metodos de acesso GET...
    public String getCodigo() {return codigo;}
    public String getNombre() {return nombre;}
    public String getJornada() {return jornada;}
    public int getSede_codigo() {return sede_codigo;}
    
    //Metodos Operacionales...
    /* No implemente mostrarDatos() con toString() con override por que cada  
     * que lo hacia no me mostraba los datos del objeto si no que antes me
     * mostraba era el tipo de dato mas la posicion en memoria. 
     */
    public void mostrarDatos() { //metodo para mostrar los datos de este objeto
        System.out.println (" Curso: \n------------------- " + 
             "\n codigo  = \t" + codigo + 
             "\n nombre  = \t" + nombre + 
             "\n jornada = \t" + jornada + 
             "\n-------------------"); 
    }
}
