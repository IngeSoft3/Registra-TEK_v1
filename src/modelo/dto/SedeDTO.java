package dto;

/**
 *
 * @author
 */
public class SedeDTO {
    //declarando las variables
    private String codigo, nombre, direccion;
    
    //sobrecarga de constructores...

    //sobrecarga de constructores...
    public SedeDTO() {}
    public SedeDTO(String codigo) {this.codigo = codigo;}
    public SedeDTO(String codigo, String nombre, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    //metodos de acesso SET...
    public void setCodigo(String codigo) {this.codigo = codigo;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setDireccion(String direccion) {this.direccion = direccion;}

    
    //metodos de acesso GET...
    public String getCodigo() {return codigo;}
    public String getNombre() {return nombre;}
    public String getDireccion() {return direccion;}
    
    //Metodos Operacionales...
    /* No implemente mostrarDatos() con toString() con override por que cada
     * que lo hacia no me mostraba los datos del objeto si no que antes me
     * mostraba era el tipo de dato mas la posicion en memoria. 
     */
    public void mostrarDatos() {
        //metodo para mostrar los datos de este objeto
        System.out.println (" Sede: \n------------------- " +
                "\n  codigo   = \t" + codigo +
                "\n  nombre   = \t" + nombre +
                "\n direccion = \t" + direccion + 
                "\n-------------------");
    
    }
    
}
