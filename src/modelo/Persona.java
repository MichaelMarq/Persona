
package modelo;


public class Persona {
    
    //Atributos
    
    private String nombre,apellido,email,celular,direccion;
    
    //Constructor
    
    public Persona(String nombre,String apellido,String email,String celular,String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.direccion = direccion;
    }
    
    //Metodos get y set
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getCelular(){
        return celular;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    //Set

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setCelular(String celular){
        this.celular = celular;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    @Override
    public String toString(){
        return this.nombre + " "+this.apellido;
    }
    
    
}
