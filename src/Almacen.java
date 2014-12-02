import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
public class Almacen {
	public static void main (String args[]) throws IOException 	{
		FileReader fr = new FileReader("distribuidores.txt");
		BufferedReader br = new BufferedReader(fr); 
		String [] campos = null;
		System.out.println("\nLos distribuidores:");
		String s;
		ArrayList <Distribuidor> al_distri = new ArrayList <Distribuidor> ();		
		while((s = br.readLine()) != null) 
		{ 
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
		// Vaciar el ArrayList
		al_distri.clear();
	}
}	