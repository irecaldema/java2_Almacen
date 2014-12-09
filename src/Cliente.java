public class Cliente {
    //propiedades
    private String nombre;
    private String apellidos;
    private String DNI;
    private Direccion direccion;
    private Double num_socio;
    private Double dto; //descuento

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

    public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public Direccion getDireccion() {
		return direccion;
	}	

    public void setNum_socio(Double num_socio) {
		this.num_socio = num_socio;
	}
	public Double getNum_socio() {
		return num_socio;
	}

    public void setDto(Double dto) {
		this.dto = dto;
	}
	public Double getDto() {
		return dto;
	}
}