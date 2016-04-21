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
    
}
