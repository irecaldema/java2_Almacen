public class Cliente {
    
    //propiedades
    private String nombre;
    private String apellidos;
    private String DNI;
    private Direccion direccion;
    private Double num_socio;
    private Double dto;

    //métodos getter y setter
    public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}

    public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getApellidos() {
		return apellidos;
	}
	
    public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	public String getDNI() {
		return DNI;
	}

    public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDireccion() {
		return direccion;
	}	

    public void setNum_socio(String num_socio) {
		this.num_socio = num_socio;
	}
	public String getNum_socio() {
		return num_socio;
	}

    public void setDto(String dto) {
		this.dto = dto;
	}
	public String getDto() {
		return dto;
	}
}