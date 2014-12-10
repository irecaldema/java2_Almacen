public class Manzana {
    //propiedades
    private String tipoManzana;
    private String procedencia;
    private String color;
    private Double eurosKilo;
    private Distribuidor distribuidor;
	private int cod_barras;

    //métodos getter y setter
	public void setTipoManzana(String tipoManzana) {
		this.tipoManzana = tipoManzana;
	}
	public String getTipoManzana() {
		return tipoManzana;
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

	public void setEurosKilo(Double eurosKilo) {
		this.eurosKilo = eurosKilo;
	}
	public Double getEurosKilo() {
		return eurosKilo;
	}

	public void setDistribuidor(Distribuidor distribuidor) {
		this.distribuidor = distribuidor;
	}
	public Distribuidor getDistribuidor() {
		return distribuidor;
	}	
	
	public void setCod_barras(int cod_barras) {
		this.cod_barras = cod_barras;
	}
	public int getCod_barras() {
		return cod_barras;
	}	
}