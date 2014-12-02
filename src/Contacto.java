public class Contacto {

    //añadid las propiedades convenientes
    private String nombre; 
    private String apellido;
    private int telefono;    
    
    //métodos getter y setter
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}    

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getApellido() {
		return apellido;
	}    

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getTelefono() {
		return telefono;
	}  	
}
