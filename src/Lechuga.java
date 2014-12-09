public class Lechuga {
    //propiedades
    private String tipoLechuga;
    private String procedencia;
    private String color;
    private Double eurosUnidad;
    private Distribuidor distribuidor;
    
    //métodos getter y setter
	public void setTipoLechuga(String tipoLechuga) {
		this.tipoLechuga = tipoLechuga;
	}
	public String getTipoLechuga() {
		return tipoLechuga;
	}
	
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public String getProcedencia() {
		return procedencia;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}

	public void setEurosUnidad(Double eurosUnidad) {
		this.eurosUnidad = eurosUnidad;
	}
	public Double getEurosUnidad() {
		return eurosUnidad;
	}	

	public void setDistribuidor(Distribuidor distribuidor) {
		this.distribuidor = distribuidor;
	}
	public Distribuidor getDistribuidor() {
		return distribuidor;
	}		
}