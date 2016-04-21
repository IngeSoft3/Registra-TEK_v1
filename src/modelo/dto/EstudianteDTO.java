
package dto;

import java.sql.Date;
/**
 *
 * @author
 */
public class EstudianteDTO {
    
    //declarando las variables
    private String codigo, nombre, apellidos;
    private Date fechaNacimiento;
    private int codigo_curso;
    
    //sobrecarga de constructores...
    public EstudianteDTO() {}
    public EstudianteDTO(String codigo) {this.codigo = codigo;}
    public EstudianteDTO(String codigo, String nombre, String apellidos, Date fechaNacimiento, int codigo_curso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.codigo_curso = codigo_curso;
    }
    
    //metodos de acesso SET...
    public void setCodigo(String codigo) {this.codigo = codigo;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}
    public void setFechaNacimiento(Date fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}
    public void setCodigo_curso(int codigo_curso) {this.codigo_curso = codigo_curso;}
    
    //metodos de acesso GET...
    public String getCodigo() {return codigo;}
    public String getNombre() {return nombre;}
    public String getApellidos() {return apellidos;}
    public Date getFechaNacimiento() {return fechaNacimiento;}
    public int getCodigo_curso() {return codigo_curso;}
    
    //Metodos Operacionales...
    
    /* No implemente mostrarDatos() con toString() con override por que cada  
     * que lo hacia no me mostraba los datos del objeto si no que antes me
     * mostraba era el tipo de dato mas la posicion en memoria. 
     */
    
}
