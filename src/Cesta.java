import java.util.ArrayList;
public class Cesta {

//propiedades
private Cliente cliente;
//ArrayList de cada producto
private ArrayList<Manzana> al_manzana;
private ArrayList<Lechuga> al_lechuga;
private ArrayList<Leche> al_leche;

//métodos getter y setter
    public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Cliente getCliente() {
		return cliente;
	}	
	
	public void setAl_manzana(ArrayList<Manzana> al_manzana) {
		
		this.al_manzana = al_manzana;
	}
	public ArrayList<Manzana> getAl_manzana() {
		return al_manzana;
	}
	
	public void setAl_lechuga(ArrayList<Lechuga> al_lechuga) {
		
		this.al_lechuga = al_lechuga;
	}
	public ArrayList<Lechuga> getAl_lechuga() {
		return al_lechuga;
	}
	
	public void setAl_leche(ArrayList<Leche> al_leche) {
		
		this.al_leche = al_leche;
	}
	public ArrayList<Leche> getAl_leche() {
		return al_leche;
	}	
//método calcular importe compra

}