public class Distribuidor {
    //propiedades
    private String nombre;
    private String CIF;
    private Direccion direccion;
    private Contacto personaContacto;
    //nombre,CIF,direccion,personaContacto
    
    //metodos getter y setter
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	} 

	public void setCIF(String CIF) {
		this.CIF = CIF;
	}
	public String getCIF() {
		return CIF;
	}	
	
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public Direccion getDireccion() {
		return direccion;
	}	
	
	public void setPersonaContacto(Contacto personaContacto) {
		this.personaContacto = personaContacto;
	}
	public Contacto getPersonaContacto() {
		return personaContacto;
	}		
}