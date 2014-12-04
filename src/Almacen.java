import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;
public class Almacen {
	public static void main (String args[]) throws IOException 	{
		FileReader fr = new FileReader("distribuidores.txt");
		BufferedReader br = new BufferedReader(fr); 
		String [] campos = null;
		System.out.println("\nLos distribuidores:");
		String s;
		ArrayList <Distribuidor> al_distri = new ArrayList <Distribuidor> ();		
		while((s = br.readLine()) != null) { 
			//creamos los objetos
			Distribuidor distri=new Distribuidor();
			Direccion dire=new Direccion();
			Contacto conta=new Contacto();	
			
			campos = s.split(",");
		    
			 //introducimos los valores en los objetos para despues añadirlos al ArrayList
	 		//DISTRIBUIDOR
	 		distri.setNombre(campos[0]);
	 		distri.setCIF(campos[1]);
	 		//DIRECCION
	 		dire.setDireccion(campos[2]);	 			
	 		/*
	 		odireccion.setCiudad(separado[2]);
	 		odireccion.setCalle(separado[3]);
	 		odireccion.setNumero(Integer.parseInt(separado[4]));
	 		odireccion.setCodPostal(Integer.parseInt(separado[5]));
	 		*/
	 		//CONTACTO
	 		conta.setNombre(campos[3]);
	 		conta.setApellido(campos[4]);
	 		conta.setTelefono(Integer.parseInt(campos[5]));
	 		//completamos los datos del distribuidor con los objetos
			distri.setDireccion(dire);
			distri.setPersonaContacto(conta);
			//añadimos el objeto distribuidor al ArrayList
			al_distri.add(distri);
		}

		for(int x=0; x<al_distri.size(); x++){
			System.out.println("--------------------------------");	
			//nombre,CIF,o_direccion,o_personaContacto
				System.out.println("nombre: " + al_distri.get(x).getNombre());
				System.out.println("C.I.F.: " + al_distri.get(x).getCIF());
				System.out.println("direccion: ");
					System.out.println("	" + al_distri.get(x).getDireccion().getDireccion());
				System.out.println("persona de contacto: ");
					System.out.println("	" + al_distri.get(x).getPersonaContacto().getNombre());
					System.out.println("	" + al_distri.get(x).getPersonaContacto().getApellido());
					System.out.println("	" + al_distri.get(x).getPersonaContacto().getTelefono());
			System.out.println("--------------------------------");       
        	}   


		Scanner sc = new Scanner(System.in);	
		System.out.println("\nIntroduce la informacion de los productos");
		String cadena = "";
		
		//manzana
		ArrayList <Manzana> al_manza = new ArrayList <Manzana>();
		for (int m=0; m<2; m++)	{
			System.out.println("\n	manzana "+m+1+":");
			/*
			String tipoManzana, procedencia, color, 
			Double eurosKilo;
			Distribuidor distribuidor;
			*/
			Manzana manza = new Manzana();
			//manza.setTipoManzana(sc.next());
			System.out.println("\n	Introduce el nombre del distribuidor:");
			cadena = sc.next();
			//recorremos el ArrayList de distribuidores para buscar el introducido
			for(int j=0; j<al_distri.size(); j++){
				//si lo encontramos
				if (cadena.equalsIgnoreCase(al_distri.get(j).getNombre())){
					//le asignamos el valor del distribuidor al objeto leche
					manza.setDistribuidor(al_distri.get(j));
				}
				//añadimos la manzana al ArrayList
				al_manza.add(manza);
			}
		}
		
		//lechuga
		ArrayList <Lechuga> al_lechuga = new ArrayList <Lechuga>();
		System.out.println("\n	lechuga:");
		/*
		String tipoLechuga, procedencia, color;
		Double eurosUnidad;
		Distribuidor distribuidor;
		*/
		Lechuga lechu = new Lechuga();
		//lechu.setTipoLechuga(sc.next());
		System.out.println("\n	Introduce el nombre del distribuidor:");
		cadena = sc.next();
		//recorremos el ArrayList de distribuidores para buscar el introducido
		for(int j=0; j<al_distri.size(); j++) {
			//si lo encontramos
			if (cadena.equalsIgnoreCase(al_distri.get(j).getNombre())){
				//le asignamos el valor del distribuidor al objeto leche
				lechu.setDistribuidor(al_distri.get(j));
			}
		}
		//añadimos la manzana al ArrayList
		al_lechuga.add(lechu);
		
		//leche
		ArrayList <Leche> al_leche = new ArrayList <Leche>();
		for (int l=0; l<2; l++)
		{
			System.out.println("\n	leche"+l+1+":");
			/*
    		String tipo, procedencia;
			Double eurosLitro;
			Distribuidor distribuidor;
			*/
			Leche lec = new Leche();
			//lec.setTipo(sc.next());
			System.out.println("\n	Introduce el nombre del distribuidor:");
			cadena = sc.next();
			//recorremos el ArrayList de distribuidores para buscar el introducido
			for(int j=0; j<al_distri.size(); j++)
			{
				//si lo encontramos
				if (cadena.equalsIgnoreCase(al_distri.get(j).getNombre())){
					//le asignamos el valor del distribuidor al objeto leche
					lec.setDistribuidor(al_distri.get(j));
				}
			//añadimos la leche al ArrayList
			al_leche.add(lec);	
			}
		}
    
		// Vaciar los ArrayList
		al_distri.clear();
		al_leche.clear();
		al_lechuga.clear();
		al_manza.clear();
	}
}	