public class Distribuidor {
    //propiedades
    private String nombre;
    private String CIF;
    private Dirección dirección;
    private Contacto personaContacto;
    
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
	
	public void setDirección(Dirección dirección) {
		this.dirección = dirección;
	}
	public Dirección getDirección() {
		return dirección;
	}	
	
	public void setContacto(Contacto personaContacto) {
		this.personaContacto = personaContacto;
	}
	public Contacto getContacto() {
		return personaContacto;
	}		
}