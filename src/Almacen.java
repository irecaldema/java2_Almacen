import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Almacen {
	public static void main (String args[]) throws IOException 	{
		Scanner sc = new Scanner(System.in);		
		int seleccion=0;
		ArrayList <Distribuidor> al_distri = new ArrayList <Distribuidor> ();
		ArrayList <Leche> al_leche = new ArrayList <Leche>();
		ArrayList <Manzana> al_manza = new ArrayList <Manzana>();
		ArrayList <Lechuga> al_lechuga = new ArrayList <Lechuga>();

		//***leer distibuidores***
		FileReader fr = new FileReader("distribuidores.txt");
		BufferedReader br = new BufferedReader(fr); 
		String [] campos = null;
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
		}//leer distribuidores

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
				case 1: {// ***lectura de distribuidores***	
				System.out.println("\nLista de distribuidores:");				
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
				}//case 1 lectura de distribuidores
				case 2: {
					//***introduccion de productos***		
					System.out.println("Introduce la informacion de los productos");
					String cadena = "";
					
					//manzana
					//ArrayList <Manzana> al_manza = new ArrayList <Manzana>();
					int cont = 0;
					System.out.println("¿Cuantos variedades de manzana?");
					int manzanas=sc.nextInt();
					for (int m=0; m<manzanas; m++)	{
						cont=m+1;
						System.out.println("\n	manzana "+cont+":");
						/*
						String tipoManzana, procedencia, color, 
						Double eurosKilo;
						Distribuidor distribuidor;
						*/
						Manzana manza = new Manzana();
						System.out.println("		tipo de manzana:");
						manza.setTipoManzana(sc.next());
						System.out.println("		procedencia:");
						manza.setProcedencia(sc.next());
						System.out.println("		color:");
						manza.setColor(sc.next());
						System.out.println("		euro/kilo:");
						manza.setEurosKilo(sc.nextDouble());			
						System.out.println("	Introduce el nombre del distribuidor:");
						//cadena = sc.next();
						cadena = "FastFood";
						System.out.println("	Introduce el codigo de barras:");
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
					//ArrayList <Lechuga> al_lechuga = new ArrayList <Lechuga>();
					System.out.println("\n	lechuga:");
					/*
					String tipoLechuga, procedencia, color;
					Double eurosUnidad;
					Distribuidor distribuidor;
					*/
					System.out.println("¿Cuantos variedades de leche?");
					int lechugas=sc.nextInt();
					for (int l=0; l<lechugas; l++)
					{					
						Lechuga lechu = new Lechuga();
						cont=l+1;
						System.out.println("\n	Lechuga "+cont+":");						
						System.out.println("		tipo de lechuga:");
						lechu.setTipoLechuga(sc.next());
						System.out.println("		procedencia:");
						lechu.setProcedencia(sc.next());
						System.out.println("		color:");
						lechu.setColor(sc.next());
						System.out.println("		euro/unidad:");
						lechu.setEurosUnidad(sc.nextDouble());	
						System.out.println("	Introduce el nombre del distribuidor:");
						//cadena = sc.next();
						cadena = "FastFood";
						System.out.println("	Introduce el codigo de barras:");
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
					}
					//leche
					//ArrayList <Leche> al_leche = new ArrayList <Leche>();
					cont=0;
					System.out.println("¿Cuantos variedades de leche?");
					int leches=sc.nextInt();
					for (int l=0; l<leches; l++)
					{
						cont=l+1;
						System.out.println("\n	leche "+cont+":");
						/*
			    		String tipo, procedencia;
						Double eurosLitro;
						Distribuidor distribuidor;
						*/
						Leche lec = new Leche();
						//lec.setTipo(sc.next());
						System.out.println("		tipo de leche:");
						lec.setTipo(sc.next());
						System.out.println("		procedencia:");
						lec.setProcedencia(sc.next());
						System.out.println("		euro/litro:");
						lec.setEurosLitro(sc.nextDouble());
						System.out.println("	Introduce el nombre del distribuidor:");
						//cadena = sc.next();
						cadena = "FastFood";
						System.out.println("	Introduce el codigo de barras:");
						lec.setCod_barras(sc.nextInt());			
						//recorremos el ArrayList de distribuidores para buscar el introducido
						for(int j=0; j<al_distri.size(); j++)
						{
							//si lo encontramos
							if (cadena.equalsIgnoreCase(al_distri.get(j).getNombre())){
								//le asignamos el valor del distribuidor al objeto leche
								lec.setDistribuidor(al_distri.get(j));
								break;//una vez encontrado salimos del bucle
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

					/*
					// ***escritura de productos***
					FileWriter escritor = new FileWriter("productos.txt");
					String linea="";
					
					for(int w = 0;w<al_leche.size();w++)	{
						//escritor.append(al_leche.get(w));
						linea="*"+al_leche.get(w).getCod_barras()+","+al_leche.get(w).getEurosLitro()+"*";
						escritor.append(linea);
					}
					if (al_leche.size()>0;)
						escritor.append(";");
					for(int w = 0;w<al_lechuga.size();w++)	{
						//escritor.append(al_lechuga.get(w));
						linea="*"+al_lechuga.get(w).getCod_barras()+","+al_lechuga.get(w).getEurosUnidad()+"*";						
						escritor.append(linea);
					}
					if (al_lechuga.size()>0;)
						escritor.append(";");
					for(int w = 0;w<al_manza.size();w++)	{
						//escritor.append(al_manza.get(w));
						linea="*"+al_manza.get(w).getCod_barras()+","+al_manza.get(w).getEurosKilo()+"*";						
						escritor.append(linea);
					}
					
					System.out.println("productos guardados");
					escritor.close();
					//escritura de productos
			    	*/
					// Vaciar los ArrayList
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
						Direccion dire2 = new Direccion();
			
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
					System.out.println("\n	Introduce el numero de productos a comprar:");
					int num_compras = sc.nextInt();
					for (int k = 0; k<num_compras; k++){
						// ***lectura de productos***
						FileReader fr3 = new FileReader("clientes.txt");
						BufferedReader br3 = new BufferedReader(fr3); 
						String [] campos3 = null;
						String [] campos4 = null;
						String [] campos5 = null;
						System.out.println("Los productos:");
						String s3;
						while((s3 = br3.readLine()) != null) {
							campos3 = s3.split(";");
							for (int o = 0; o<campos3.size();o++){
								campos4 = campos4.split("*");
								for (int p = 0; p<campos3.size();p++){
									campos5 = campos5.split(",");
									if(campos5[0]=="manzana"){
									/*
									String tipoManzana, procedencia, color, 
									Double eurosKilo;
									Distribuidor distribuidor;
									int cod_barras;
									*/
										System.out.println("Producto :"+campos5[0]);
										System.out.println("Prcedencia :"+campos5[1]);
										System.out.println("Color :"+campos5[2]);
										System.out.println("Euros/kilo :"+campos5[3]);
										System.out.println("Distribuidor :"+campos5[4]);
										System.out.println("Codigo de barras :"+campos5[5]);
									}	
									else if(campos5[0]=="lechuga"){
									/*
									String tipoLechuga, procedencia, color;
									Double eurosUnidad;
									Distribuidor distribuidor;
									int cod_barras;
									*/
										System.out.println("Producto :"+campos5[0]);
										System.out.println("Prcedencia :"+campos5[1]);
										System.out.println("Color :"+campos5[2]);
										System.out.println("Euros/unidad :"+campos5[3]);
										System.out.println("Distribuidor :"+campos5[4]);
										System.out.println("Codigo de barras :"+campos5[5]);
									}
									else if(campos5[0]=="leche"){
									/*
			    					String tipo, procedencia;
									Double eurosLitro;
									Distribuidor distribuidor;
									int cod_barras;
									*/
										System.out.println("Producto :"+campos5[0]);
										System.out.println("Euros/litro :"+campos5[1]);
										System.out.println("Distribuidor :"+campos5[2]);
										System.out.println("Codigo de barras :"+campos5[3]);
										
									}//else if
								}//for	
							} //for
							
						}
						// lectura de productos
						System.out.println("\n	Introduce el codigo de barras del producto:");
					}
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