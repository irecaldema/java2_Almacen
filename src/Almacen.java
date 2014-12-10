import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;
public class Almacen {
	public static void main (String args[]) throws IOException 	{
		Scanner sc = new Scanner(System.in);		
		int seleccion=0;
		ArrayList <Distribuidor> al_distri = new ArrayList <Distribuidor> ();//28		
		System.out.println("\n	Introduce el numero correspondiente:");
		System.out.println("		1: distribuidores");
		System.out.println("		2: productos");
		System.out.println("		3: clientes");
		System.out.println("		4: cesta");	
		System.out.println("		0: salir");			
		seleccion = sc.nextInt();
		while (seleccion!=0){		
			switch (seleccion) 
			{
				case 1: {
				//***distibuidores***
					FileReader fr = new FileReader("distribuidores.txt");
					BufferedReader br = new BufferedReader(fr); 
					String [] campos = null;
					System.out.println("\nLos distribuidores:");
					String s;
					//ArrayList <Distribuidor> al_distri = new ArrayList <Distribuidor> ();		
					while((s = br.readLine()) != null) { 
						//creamos los objetos
						Distribuidor distri = new Distribuidor();
						Direccion dire = new Direccion();
						Contacto conta = new Contacto();	
						
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
					break;
				}//case 1
				//distibuidores
				case 2: {
					//***introduccion de productos***		
					System.out.println("\nIntroduce la informacion de los productos");
					String cadena = "";
					
					//manzana
					ArrayList <Manzana> al_manza = new ArrayList <Manzana>();
					int cont = 0;
					for (int m=0; m<2; m++)	{
						cont=m+1;
						System.out.println("\n	manzana "+cont+":");
						/*
						String tipoManzana, procedencia, color, 
						Double eurosKilo;
						Distribuidor distribuidor;
						*/
						Manzana manza = new Manzana();
						System.out.println("\n		tipo de manzana:");
						manza.setTipoManzana(sc.next());
						System.out.println("\n		procedencia:");
						manza.setProcedencia(sc.next());
						System.out.println("\n		color:");
						manza.setColor(sc.next());
						System.out.println("\n		euro/kilo:");
						manza.setEurosKilo(sc.nextDouble());			
						System.out.println("\n	Introduce el nombre del distribuidor:");
						cadena = sc.next();
						System.out.println("\n	Introduce el codigo de barras:");
						manza.setCod_barras(sc.nextInt());
						//recorremos el ArrayList de distribuidores para buscar el introducido
						for(int j=0; j<al_distri.size(); j++){
							//si lo encontramos
							if (cadena.equalsIgnoreCase(al_distri.get(j).getNombre())){
								//le asignamos el valor del distribuidor al objeto leche
								manza.setDistribuidor(al_distri.get(j));
							}
						}
						//añadimos la manzana al ArrayList
						al_manza.add(manza);			
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
					System.out.println("\n		tipo de lechuga:");
					lechu.setTipoLechuga(sc.next());
					System.out.println("\n		procedencia:");
					lechu.setProcedencia(sc.next());
					System.out.println("\n		color:");
					lechu.setColor(sc.next());
					System.out.println("\n		euro/unidad:");
					lechu.setEurosUnidad(sc.nextDouble());	
					System.out.println("\n	Introduce el nombre del distribuidor:");
					cadena = sc.next();
					System.out.println("\n	Introduce el codigo de barras:");
					lechu.setCod_barras(sc.nextInt());
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
					cont=0;
					for (int l=0; l<2; l++)
					{
						cont=l+1;
						System.out.println("\n	leche"+cont+":");
						/*
			    		String tipo, procedencia;
						Double eurosLitro;
						Distribuidor distribuidor;
						*/
						Leche lec = new Leche();
						//lec.setTipo(sc.next());
						System.out.println("\n		tipo de leche:");
						lec.setTipo(sc.next());
						System.out.println("\n		procedencia:");
						lec.setProcedencia(sc.next());
						System.out.println("\n		euro/litro:");
						lec.setEurosLitro(sc.nextDouble());
						System.out.println("\n	Introduce el nombre del distribuidor:");
						cadena = sc.next();
						System.out.println("\n	Introduce el codigo de barras:");
						lec.setCod_barras(sc.nextInt());			
						//recorremos el ArrayList de distribuidores para buscar el introducido
						for(int j=0; j<al_distri.size(); j++)
						{
							//si lo encontramos
							if (cadena.equalsIgnoreCase(al_distri.get(j).getNombre())){
								//le asignamos el valor del distribuidor al objeto leche
								lec.setDistribuidor(al_distri.get(j));
							}
						}
						//añadimos la leche al ArrayList
						al_leche.add(lec);	
					}
					//introduccion de productos	
					//***visualizacion de los productos***
					//manzana,lechuga y leche
					System.out.println("****Manzana****");
						/*
						String tipoManzana, procedencia, color, 
						Double eurosKilo;
						Distribuidor distribuidor;
						*/
					for(int i = 0;i<al_manza.size();i++)	{
						System.out.println("Tipo de manzana: "+(al_manza.get(i).getTipoManzana()));
						System.out.println("Prcedencia: "+(al_manza.get(i).getProcedencia()));
						System.out.println("Color: "+(al_manza.get(i).getColor()));
						System.out.println("euro/Kg: "+(al_manza.get(i).getEurosKilo()));
						System.out.println("***DISTRIBUIDOR***");
						    /*
						    String nombre,	CIF;
							Direccion direccion;
								String direccion;
							Contacto personaContacto;
							    String nombre, apellido;
								int telefono;   
							*/
						System.out.println("DISTRIBUIDOR: "+(al_manza.get(i).getDistribuidor().getNombre()));
						System.out.println("CIF:" + al_manza.get(i).getDistribuidor().getCIF());
						System.out.println("DIRECCION:" + al_manza.get(i).getDistribuidor().getDireccion().getDireccion());
						System.out.println("CONTACTO:" + al_manza.get(i).getDistribuidor().getPersonaContacto().getNombre() + " " + al_manza.get(i).getDistribuidor().getPersonaContacto().getApellido());
						System.out.println("TELEFONO:" + al_manza.get(i).getDistribuidor().getPersonaContacto().getTelefono());
						System.out.println("*********************************************************");
						System.out.println("Codigo de barras: "+(al_manza.get(i).getCod_barras()));						
					}
					System.out.println("****Lechuga****");
						/*
						String tipoLechuga, procedencia, color;
						Double eurosUnidad;
						Distribuidor distribuidor;
						*/
					for(int i = 0;i<al_lechuga.size();i++)	{
						System.out.println("Tipo de lechuga: "+(al_lechuga.get(i).getTipoLechuga()));
						System.out.println("Prcedencia: "+(al_lechuga.get(i).getProcedencia()));
						System.out.println("Color: "+(al_lechuga.get(i).getColor()));
						System.out.println("euro/Unidad: "+(al_lechuga.get(i).getEurosUnidad()));
						System.out.println("***DISTRIBUIDOR***");
						    /*
						    String nombre,	CIF;
							Direccion direccion;
								String direccion;
							Contacto personaContacto;
							    String nombre, apellido;
								int telefono;   
							*/
						System.out.println("DISTRIBUIDOR: "+(al_lechuga.get(i).getDistribuidor().getNombre()));
						System.out.println("CIF:" + al_lechuga.get(i).getDistribuidor().getCIF());
						System.out.println("DIRECCION:" + al_lechuga.get(i).getDistribuidor().getDireccion().getDireccion());
						System.out.println("CONTACTO:" + al_lechuga.get(i).getDistribuidor().getPersonaContacto().getNombre() + " " + al_lechuga.get(i).getDistribuidor().getPersonaContacto().getApellido());
						System.out.println("TELEFONO:" + al_lechuga.get(i).getDistribuidor().getPersonaContacto().getTelefono());
						System.out.println("*********************************************************");
						System.out.println("Codigo de barras: "+(al_lechuga.get(i).getCod_barras()));						
					}
					System.out.println("****Leche****");
						/*
			    		String tipo, procedencia;
						Double eurosLitro;
						Distribuidor distribuidor;
						*/
					for(int i = 0;i<al_leche.size();i++)	{
						System.out.println("Tipo de leche: "+(al_leche.get(i).getTipo()));
						System.out.println("Prcedencia: "+(al_leche.get(i).getProcedencia()));
						System.out.println("euro/litro: "+(al_leche.get(i).getEurosLitro()));
						System.out.println("***DISTRIBUIDOR***");
						    /*
						    String nombre,	CIF;
							Direccion direccion;
								String direccion;
							Contacto personaContacto;
							    String nombre, apellido;
								int telefono;   
							*/
						System.out.println("DISTRIBUIDOR: "+(al_leche.get(i).getDistribuidor().getNombre()));
						System.out.println("CIF:" + al_leche.get(i).getDistribuidor().getCIF());
						System.out.println("DIRECCION:" + al_leche.get(i).getDistribuidor().getDireccion().getDireccion());
						System.out.println("CONTACTO:" + al_leche.get(i).getDistribuidor().getPersonaContacto().getNombre() + " " + al_leche.get(i).getDistribuidor().getPersonaContacto().getApellido());
						System.out.println("TELEFONO:" + al_leche.get(i).getDistribuidor().getPersonaContacto().getTelefono());
						System.out.println("*********************************************************");
						System.out.println("Codigo de barras: "+(al_leche.get(i).getCod_barras()));
					}
			    
					// Vaciar los ArrayList
					al_distri.clear();
					al_leche.clear();
					al_lechuga.clear();
					al_manza.clear();
					break;
				}//case 2
				//visualizacion de los productos
				case 3: {			
					// *****introducir clientes*****
					//lectura del archivo y añadir los datos a un arraylist
					FileReader fr2 = new FileReader("clientes.txt");
					BufferedReader br2 = new BufferedReader(fr2); 
					String [] campos2 = null;
					System.out.println("\nLos clientes:");
					String s2;
					ArrayList <Cliente> al_cliente = new ArrayList <Cliente> ();		
					while((s2 = br2.readLine()) != null) { 
						//creamos los objetos
						Cliente cliente = new Cliente();
						Direccion dire2=new Direccion();
			
						campos2 = s2.split(",");
					    
						 //introducimos los valores en los objetos para despues añadirlos al ArrayList
				 		//Cliente
				 		cliente.setNombre(campos2[0]);
				 		cliente.setApellidos(campos2[1]);
				 		cliente.setDNI(campos2[2]);
				 		//DIRECCION
				 		dire2.setDireccion(campos2[3]);
				 		//Cliente
				 		cliente.setNum_socio(Double.parseDouble(campos2[4]));
				 		cliente.setDto(Double.parseDouble(campos2[5]));
				 		//completamos los datos del cliente con los objetos
						cliente.setDireccion(dire2);
						//añadimos el objeto distribuidor al ArrayList
						al_cliente.add(cliente);
					}
					//mostrar los datos del arraylist en pantalla
					for(int x=0; x<al_cliente.size(); x++){
						System.out.println("--------------------------------");	
						//  String nombre, apellidos, DNI; Direccion direccion; Double num_socio, dto;
							System.out.println("Nombre: " + al_cliente.get(x).getNombre());
							System.out.println("Apellidos: " + al_cliente.get(x).getApellidos());
							System.out.println("DNI: " + al_cliente.get(x).getDNI());
							System.out.println("Direccion: ");
								System.out.println("	" + al_cliente.get(x).getDireccion().getDireccion());
							System.out.println("Numero de socio: " + al_cliente.get(x).getNum_socio());
							System.out.println("Descuento: " + al_cliente.get(x).getDto());				
						System.out.println("--------------------------------");       
					}  	
					// Vaciar los ArrayList
					al_cliente.clear();
					break;
				}//case 3
				//introducir clientes
				// *****cesta*****
				case 4: {
					
					break;
				}//case 4
				// cesta	
			
				default: {
					System.out.println("\n	No has seleccionado una opcion valida:");
				}//default
			}//switch
		
			System.out.println("\n	Introduce el numero correspondiente:");
			System.out.println("		1: distribuidores");
			System.out.println("		2: productos");
			System.out.println("		3: clientes");
			System.out.println("		4: cesta");	
			System.out.println("		0: salir");			
			seleccion = sc.nextInt();	
		}//while
	}//ejecucion
}//class	