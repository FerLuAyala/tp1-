package futbol;

import java.time.LocalDate;

import java.util.LinkedList;


import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Torneo {
	private LinkedList<Equipo> equipos = new LinkedList<Equipo>();
	private LinkedList<Partidos> partidos = new LinkedList<Partidos>();
	private LinkedList<Equipo> ganadores = new LinkedList<Equipo>();
	private LinkedList<Equipo> finalistas = new LinkedList<Equipo>();
	
	public Torneo() {

	}
	


	public LinkedList<Partidos> getPartidos() {
		return partidos;
	}


	public void setPartidos(LinkedList<Partidos> partidos) {
		this.partidos = partidos;
	}


	public LinkedList<Equipo> getGanadores() {
		return ganadores;
	}


	public void setGanadores(LinkedList<Equipo> ganadores) {
		this.ganadores = ganadores;
	}


	public LinkedList<Equipo> getFinalistas() {
		return finalistas;
	}


	public void setFinalistas(LinkedList<Equipo> finalistas) {
		this.finalistas = finalistas;
	}


	public LinkedList<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(LinkedList<Equipo> equipos) {
		this.equipos = equipos;
	}

	@Override
	public String toString() {
		return "GestorEquipo [equipos=" + equipos + "]";
	}

	// --------------------------EQUIPOS Y CARGA DE
	// JUGADORES-----------------------------------------------------
	public void menuEquipo() {
		
		String[] equiposarray = new String[equipos.size()];
		for (int i = 0; i < equipos.size(); i++) {
			equiposarray[i] = equipos.get(i).getNombre();
		}
		int opcion = JOptionPane.showOptionDialog(null, "Selecciona un equipo", "Elegir equipo",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon(MainJuego.class.getResource("/img/dos.jpg")), 
				equiposarray, equiposarray[0]);

		if (opcion >= 0 && opcion < equipos.size()) {
			String[] opciones = { "Agregar Jugador", "Agregar Jugador Aleatorio", "Ver Lista de jugadores", "Salir" };
			
			int elige = JOptionPane.showOptionDialog(null,
					"Selecciona una acción para el equipo " + equipos.get(opcion).getNombre(),
					"Equipo " + equipos.get(opcion).getNombre(), JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
					new ImageIcon(MainJuego.class.getResource("/img/tres.jpg")), opciones, opciones[0]);

			switch (elige) {
			case 0:
				equipos.get(opcion).agregarJugador();
				JOptionPane.showMessageDialog(null, "Jugador agregado a " + equipos.get(opcion).getNombre());
				break;

			case 1:
				equipos.get(opcion).AgregarJugadoresAleatorio(equipos.get(opcion));

				JOptionPane.showMessageDialog(null, "Equipo aleatorio agregado a " + equipos.get(opcion).getNombre());
				break;

			case 2:
				
				if (equipos.get(opcion).getPlantel().isEmpty()) {
					JOptionPane.showMessageDialog(null, "No hay Jugadores en este equipo para mostrar" + "\nIngrese jugadores","Jugadores del equipo", 0);
				
				}else {
					JOptionPane.showMessageDialog(null, "Lista de jugadores de " + equipos.get(opcion).getNombre() + ": "
							+ equipos.get(opcion).getPlantel());
				}
				break;
			
			case 3:
				JOptionPane.showMessageDialog(null, "Saliendo...");
				break;

			default:

				break;
			}
		} else {
			JOptionPane.showMessageDialog(null, "Saliendo...");
		}

	}
	public void goluno(Equipo equipo1) {
		
		JOptionPane.showMessageDialog(null, "Gooooll" + "\n"+ equipo1.getNombre() , "Futbol en ascenso",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/goal-gol.gif")));
	}
	public void goldos(Equipo equipo2) {
		
		JOptionPane.showMessageDialog(null, "Gooooll" + "\n"+ equipo2.getNombre() , "Futbol en ascenso",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/goal-gol.gif")));
	
	}
	public void amarillauno(Equipo equipo1) {
		JOptionPane.showMessageDialog(null, "Amarilla para: "+ "\n"+ equipo1.getNombre() , "Futbol en ascenso",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/amarilla.png")));
		
	}
	public void amarillados(Equipo equipo2) {
		JOptionPane.showMessageDialog(null, "Amarilla para: "+ "\n"+ equipo2.getNombre() , "Futbol en ascenso",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/amarilla.png")));
		
	}
	public void rojados(Equipo equipo2) {
		JOptionPane.showMessageDialog(null, "Roja para  " + equipo2.getNombre() + "\nJugador  "
				+ equipo2.getPlantel().remove(4).getNombre(), "Futbol en ascenso",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/roja.png")));
		
		
	}
	public void rojauno(Equipo equipo1) {
		JOptionPane.showMessageDialog(null, "Roja para  " + equipo1.getNombre() + "\nJugador  "
				+ equipo1.getPlantel().remove(4).getNombre(), "Futbol en ascenso",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/roja.png")));
		
			}
	public void erraruno(Equipo equipo1) {
		
		JOptionPane.showMessageDialog(null, "Erró: "+ "\n"+ equipo1.getNombre() , "Futbol en ascenso",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/error.png")));
		
	}
	public void errardos(Equipo equipo2) {
		
		JOptionPane.showMessageDialog(null, "Erró: "+ "\n"+ equipo2.getNombre() , "Futbol en ascenso",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/error.png")));
		
	}
	public void anotouno(Equipo equipo1) {
		
		JOptionPane.showMessageDialog(null, "Anotó: "+ "\n"+ equipo1.getNombre() , "Futbol en ascenso",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/bien.png")));
		
	}
	public void anotodos(Equipo equipo2) {
		
		JOptionPane.showMessageDialog(null, "Anotó: "+ "\n"+ equipo2.getNombre() , "Futbol en ascenso",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/bien.png")));
		
	}
	// -------------------------RECORRIDO DEL
	// PARTIDO---------------------------------------------------------
	public void desarrolloPartido(Equipo equipo1, Equipo equipo2) {
	
		int marca1 = 0;
		int amarilla1 = 0;
		int marca2 = 0;
		int amarilla2 = 0;
		int rojas1 = 0;
		int rojas2 = 0;
			
		
		/*
		 * para realizar el juego genero 10 numeros random , cada uno cumple una funcion
		 * num 1 = gol  equipo1 
		 * num 2 = roja equipo1 
		 * num 3 = gol equipo2 
		 * num 4 = amarilla equipo2 
		 * num 5 = amarilla equipo1
		 * num 6 = roja equipo2
		 */

		// ----ESTOY JUGANDO CON 2 EQUIPO --
		JOptionPane.showMessageDialog(null, equipo1.getPlantel().size() + "  Jugadores  " + equipo1.getNombre() + "\n"
				+ equipo2.getPlantel().size() + "  Jugadores " + equipo2.getNombre());

		JOptionPane.showMessageDialog(null, "Formación " + equipo1.getNombre() + equipo1.getPlantel());
		JOptionPane.showMessageDialog(null, "Formación " + equipo2.getNombre() + equipo2.getPlantel());

//------PRIMER TIEMPO--
		JOptionPane.showMessageDialog(null, "Comenzamos este Primer tiempo de 45 minutos", "Futbol en ascenso",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/pelota.png")));

		
		for (int i = 0; i <= 3; i++) {

			int num = (int) (Math.random() * 10);
			
		switch (num) {
		case 1: 
			marca1++;
			goluno(equipo1);
			break;
		case 2:
			rojas1++;
			rojauno(equipo1);

			break;
		case 3: 
			marca2++;
			goldos(equipo2);

			break;	
		case 4:
			amarilla2++;
			amarillados(equipo2);


			break;
		case 5:
			amarilla1++;
			 amarillauno(equipo1);


			break;	
		case 6:
			rojas2++;
			rojados(equipo2);
			break;
		default:
			break;
		}
		}
		//// Resultado primer
		//// tiempo-------------------------------------------------------------------------

		JOptionPane.showMessageDialog(null,
				"Termino el primer tiempo" + "\n " + equipo1.getNombre() + " : " + marca1 + " / " + equipo2.getNombre()
						+ " : " + marca2 + "\nAmarillas de: " + equipo1.getNombre() + " : " + amarilla1
						+ "\nAmarillas de " + equipo2.getNombre() + " : " + amarilla2 + "\n" + "Roja de "
						+ equipo1.getNombre() + " : " + rojas1 + " / " + equipo1.getPlantel().size() + "Jugadores"
						+ "\n" + "Roja de " + equipo2.getNombre() + " : " + rojas2 + " / " + equipo2.getPlantel().size()
						+ "Jugadores", "Futbol en ascenso",
						JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/gol.png")));

		/// SEGUNDO TIEMPO
		JOptionPane.showMessageDialog(null, "Comenzamos los ultimos 45 minutos , de este segundo tiempo", "Futbol en ascenso",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/gol.png")));
		
		for (int i = 0; i <= 3; i++) {

			int num = (int) (Math.random() * 10);

			switch (num) {
			case 1:
				marca1++;
				goluno(equipo1);
				break;
			case 2:
				rojas1++;
				rojauno(equipo1);

				break;
			case 3:
				marca2++;
				goldos(equipo2);

				break;
			case 4:
				amarilla2++;
				amarillados(equipo2);

				break;
			case 5:
				amarilla1++;
				amarillauno(equipo1);

				break;
			case 6:
				rojas2++;
				rojados(equipo2);
				break;
			default:
				break;
			}
		}
////Resultado segundo tiempo-------------------------------------------------------------------------	

		// GANA equipo1------
		if (marca1 > marca2) {
			JOptionPane.showMessageDialog(null,
					"Finalizó el partido ganoooo " + equipo1.getNombre() + "\n " + equipo1.getNombre() + " : " + marca1
							+ " - " + equipo2.getNombre() + " : " + marca2 + "\nAmarillas de: " + equipo1.getNombre()
							+ " : " + amarilla1 + "\nAmarillas de: " + equipo2.getNombre() + " : " + amarilla2 + "\n"
							+ "Roja de: " + equipo1.getNombre() + " : " + rojas1 + " Jugadores "
							+ equipo1.getPlantel().size() + "\n" + "Roja de: " + equipo2.getNombre() + " : " + rojas2
							+ " jugadores " + equipo2.getPlantel().size(),
					"Futbol en ascenso", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(MainJuego.class.getResource("/img/gol.png")));

			// GANA equipo2------
		} else if (marca1 < marca2) {
			JOptionPane.showMessageDialog(null,
					"Finalizó el partido ganoooo " + equipo2.getNombre() + "\n " + equipo2.getNombre() + marca2 + " - "
							+ equipo1.getNombre() + " : " + marca1 + "\nAmarillas de: " + equipo1.getNombre() + " : "
							+ amarilla1 + "\nAmarillas de: " + equipo2.getNombre() + " : " + amarilla2 + "\n"
							+ "Roja de: " + equipo1.getNombre() + " : " + rojas1 + " Jugadores "
							+ equipo1.getPlantel().size() + "\n" + "Roja de: " + equipo2.getNombre() + " : " + rojas2
							+ " Jugadores " + equipo2.getPlantel().size(),
					"Futbol en ascenso", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(MainJuego.class.getResource("/img/gol.png")));

//// DEFINICION POR PENALES--------------------------------------------------------------------------------------------------
			/**/
		} else if (marca1 == marca2) {
			JOptionPane.showMessageDialog(null, "Se jugarán los penales","Futbol en ascenso", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(MainJuego.class.getResource("/img/penal.png")));
			marca1 = 0;
			marca2 = 0;
			for (int i = 0; i <= 4; i++) {
				int penales = (int) (Math.random() * 2);
				if (penales == 1) {
					marca1++;
					anotouno(equipo1);

				} else {
					erraruno(equipo1);
				}
				int penales1 = (int) (Math.random() * 2);
				if (penales1 == 1) {
					marca2++;
					anotodos(equipo2);
				} else {
					erraruno(equipo2);
				}
			}
////-----RESULTADO DE PENALES------------------------------------------------------			

			if (marca1 > marca2) {
				JOptionPane.showMessageDialog(null, marca1 + " " + equipo1.getNombre() + " / " + marca2 + " "
						+ equipo2.getNombre() + "\nGanoooooooo " + equipo1.getNombre() + "\nSe queda con el Clásico");
			} else if (marca1 < marca2) {
				JOptionPane.showMessageDialog(null, marca1 + " " + equipo1.getNombre() + " / " + marca2 + " "
						+ equipo2.getNombre() + "\nGanoooooooo " + equipo2.getNombre() + "\nSe queda con el Clásico");

////-----DESEMPATE DE PENALES gol gana-----------------------------------------------------					
			} else {
				JOptionPane.showMessageDialog(null, "Empate deficion Gol gana","Futbol en ascenso", JOptionPane.DEFAULT_OPTION,
						new ImageIcon(MainJuego.class.getResource("/img/penal.png")));
				int desempate = (int) (Math.random() * 2);
				if (desempate == 1) {
					marca1++;
					JOptionPane.showMessageDialog(null, "Gooool  " + equipo1.getNombre() + "  Ganooooooooooo "
							+ equipo1.getNombre() + "\nSe queda con el Clásico" , "Futbol en ascenso",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/final.png")));
				} else {
					JOptionPane.showMessageDialog(null, "Gooool  " + equipo2.getNombre() + "  Ganooooooooooo "
							+ equipo2.getNombre() + "\nSe queda con el Clásico");
				}
			}
		}

		
		JOptionPane.showMessageDialog(null, "Finaliza otro superclásico emocionante!!" + "\nGracias por vivirlo y sentirlo con nosotros", "Futbol en ascenso",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/final.png")));
	}

///---funcion jugar partido lo uso para jugar un versus eligiendo dos equipos
	public Partidos JugarPartido(Equipo equipo1, Equipo equipo2) {

		equipo1.CargarMoron(equipo1);
		equipo2.CargarChicago(equipo2);

		if (equipo1 == equipo2) {
			JOptionPane.showMessageDialog(null, "No se puede jugar entre el mismo equipo");
			return null;
		} else {
			if (equipo1.getPlantel().size() >= 8 && equipo1.getPlantel().size() <= 11
					&& equipo2.getPlantel().size() >= 8 && equipo2.getPlantel().size() <= 11) {
				
				String [] estadios= {
						
						"Francisco Urbano Morón" , "Estadio Alfredo Beranger Tempeley" ,"Estadio Víctor Antonio Legrotaglie Mendoza"
				};
				int opc= (int)(Math.random()*3);
				
				
				JOptionPane.showMessageDialog(null, "Bienvenidos a un nuevo encuentro" + "\n"
						+ equipo1.getNombre() + " vs " + equipo2.getNombre() +  "\nEste dia: " + LocalDate.now()  + estadios[opc],"Futbol en ascenso",
						JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/pelota.png")));
				desarrolloPartido(equipo1, equipo2);
			} else {

				JOptionPane.showMessageDialog(null,
						"No hay jugadores suficiente" + "\nElija su Equipo desde Seleccione equipo");

			}
		}

		return null;

	}

///---Elegir equipos para jugar versus	
		public int elegiEquipos(LinkedList<Equipo> equipos) {
			String[] equiposarray = new String[equipos.size()];
			for (int i = 0; i < equipos.size(); i++) {
				equiposarray[i] = equipos.get(i).getNombre();
			}
			int opcion = JOptionPane.showOptionDialog(null, "Seleccione equipo", "Equipos en competencia", 0, 
					JOptionPane.DEFAULT_OPTION, 
					new ImageIcon(MainJuego.class.getResource("/img/tres.jpg")),equiposarray, equiposarray[0]);
			
			
			
			return opcion;
			
			

			
			

		}
		
			
///---funcion para jugar cuartos de fase
	
	public Partidos JugarFase(Equipo equipo1, Equipo equipo2) {

		equipo1.getPlantel().clear();
		equipo2.getPlantel().clear();
		
		
		equipo1.AgregarEquipoJugador(equipo1);
		equipo2.AgregarEquipoJugador(equipo2);
		
		///--- los 3 primeros puestos tienen una ventaja de marca1/2=+2
		
		
		
		String [] estadios= {
				
				"Francisco Urbano Morón" , "Estadio Alfredo Beranger Tempeley" ,"Estadio Víctor Antonio Legrotaglie Mendoza"
		};
		int opc= (int)(Math.random()*3);
		
		JOptionPane.showMessageDialog(null, "Bienvenidos a un nuevo encuentro" + "\n"
				+ equipo1.getNombre() + " vs " + equipo2.getNombre() + "\nEn: " + estadios[opc],"Futbol en ascenso",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/pelota.png")));

				
			/*Desarrollo del juego
			 * para realizar el juego genero 10 numeros random , cada uno cumple una funcion
			 * num 1 = gol  equipo1 
			 * num 2 = roja equipo1 
			 * num 3 = gol equipo2 
			 * num 4 = amarilla equipo2 
			 * num 5 = amarilla equipo1
			 * num 6 = roja equipo2
			 * num 0= penal equipo1;
			 * num 7 = penal equipo2 */

	
			JOptionPane.showMessageDialog(null, equipo1.getPlantel().size() + "  Jugadores  " + equipo1.getNombre() + "\n"
					+ equipo2.getPlantel().size() + "  Jugadores " + equipo2.getNombre(),"Futbol en ascenso",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/gol.png")));

			JOptionPane.showMessageDialog(null, "Formación " + equipo1.getNombre() + equipo1.getPlantel(),"Futbol en ascenso",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/jugador.png")));
			JOptionPane.showMessageDialog(null, "Formación " + equipo2.getNombre() + equipo2.getPlantel(),"Futbol en ascenso",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/jugador.png")));

	//------PRIMER TIEMPO--
		
			JOptionPane.showMessageDialog(null, "Comenzamos este Primer tiempo de 45 minutos", "Futbol en ascenso",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/pelota.png")));
			int marca1 = 0;
			int amarilla1 = 0;
			int marca2 = 0;
			int amarilla2 = 0;
			int rojas1 = 0;
			int rojas2 = 0;
			int total1=0;
			int total2=0;
			//no me agrega goles a los promedios mas alto
			
			int gol1 = equipo1.getProm();
			int gol2 = equipo2.getProm();
			
			
			for (int i = 0; i <= 3; i++) {

				int num = (int) (Math.random() * 10);
				
			switch (num) {
			case 0: 
				JOptionPane.showMessageDialog(null, "Penal" + equipo1.getNombre(),"Futbol en ascenso",
						JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/penaal.png")));
				
				int nume = (int) (Math.random() *2);
				
				if (nume==1) {
					marca1++;
				
					
					goluno(equipo1);
				} else {
					erraruno(equipo1);
				}
				
				break;
			case 1: 
				marca1++;
			
			
				goluno(equipo1);
				break;
			case 2:
				rojas1++;
				rojauno(equipo1);

				break;
			case 3: 
				marca2++;
				
				goldos(equipo2);

				break;	
			case 4:
				amarilla2++;
				amarillados(equipo2);


				break;
			case 5:
				amarilla1++;
				 amarillauno(equipo1);


				break;	
			case 6:
				rojas2++;
				rojados(equipo2);
				break;
				
			case 7: 
				JOptionPane.showMessageDialog(null, "Penal " + equipo2.getNombre(),"Futbol en ascenso",
						JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/penaal.png")));
				int nume2 = (int) (Math.random() *2);
				
				if (nume2==1) {
					marca2++;
					
					goldos(equipo2);
				} else {
					errardos(equipo2);
				}
			default:
				break;
			}
			}
			//// Resultado primer
			//// tiempo-------------------------------------------------------------------------
			
			JOptionPane.showMessageDialog(null,
					"Termino el primer tiempo" + "\n " + equipo1.getNombre() + " : " + marca1 + " / " + equipo2.getNombre()
							+ " : " + marca2 + "\nAmarillas de: " + equipo1.getNombre() + " : " + amarilla1
							+ "\nAmarillas de " + equipo2.getNombre() + " : " + amarilla2 + "\n" + "Roja de "
							+ equipo1.getNombre() + " : " + rojas1 + " / " + equipo1.getPlantel().size() + "Jugadores"
							+ "\n" + "Roja de " + equipo2.getNombre() + " : " + rojas2 + " / " + equipo2.getPlantel().size()
							+ "Jugadores", "Futbol en ascenso",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/gol.png")));

			/// SEGUNDO TIEMPO
			JOptionPane.showMessageDialog(null, "Comenzamos los ultimos 45 minutos , de este segundo tiempo", "Futbol en ascenso",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/gol.png")));

			for (int i = 0; i <= 3; i++) {

				int num = (int) (Math.random() * 10);
				
			switch (num) {
			case 1: 
				marca1++;
				
				
				goluno(equipo1);
				break;
			case 2:
				rojas1++;
				rojauno(equipo1);

				break;
			case 3: 
				marca2++;
				
				goldos(equipo2);

				break;	
			case 4:
				amarilla2++;
				amarillados(equipo2);


				break;
			case 5:
				amarilla1++;
				 amarillauno(equipo1);


				break;	
			case 6:
				rojas2++;
				rojados(equipo2);
				break;
			default:
				break;
			}
			}

	////Resultado segundo tiempo-------------------------------------------------------------------------	
			total1 =marca1+gol1;
			marca1=total1;
			total2 =marca2+gol2;
			marca2=total2;
			// GANA equipo1------
			if (marca1 > marca2) {
				JOptionPane.showMessageDialog(null,
						"Finalizó el partido ganoooo " + equipo1.getNombre() + "\n " + equipo1.getNombre() + " : " + marca1
								+ " - " + equipo2.getNombre() + " : " + marca2 + "\nAmarillas de: " + equipo1.getNombre()
								+ " : " + amarilla1 + "\nAmarillas de: " + equipo2.getNombre() + " : " + amarilla2 + "\n"
								+ "Roja de: " + equipo1.getNombre() + " : " + rojas1 + " Jugadores "
								+ equipo1.getPlantel().size() + "\n" + "Roja de: " + equipo2.getNombre() + " : " + rojas2
								+ " jugadores " + equipo2.getPlantel().size(), "Futbol en ascenso",
								JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/gol.png")));

				// GANA equipo2------
			} else if (marca1 < marca2) {
				JOptionPane.showMessageDialog(null,
						"Finalizó el partido ganoooo " + equipo2.getNombre() + "\n " + equipo2.getNombre() + marca2 + " - "
								+ equipo1.getNombre() + " : " + marca1 + "\nAmarillas de: " + equipo1.getNombre() + " : "
								+ amarilla1 + "\nAmarillas de: " + equipo2.getNombre() + " : " + amarilla2 + "\n"
								+ "Roja de: " + equipo1.getNombre() + " : " + rojas1 + " Jugadores "
								+ equipo1.getPlantel().size() + "\n" + "Roja de: " + equipo2.getNombre() + " : " + rojas2
								+ " Jugadores " + equipo2.getPlantel().size(), "Futbol en ascenso",
								JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/gol.png")));

	//// DEFINICION POR PENALES--------------------------------------------------------------------------------------------------
				/**/
			} else if (marca1 == marca2) {
				JOptionPane.showMessageDialog(null, "Se jugarán los penales" ,"Futbol en ascenso",
						JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/penaal.png")));
				marca1 = 0;
				marca2 = 0;
				for (int i = 0; i <= 4; i++) {
					int penales = (int) (Math.random() * 2);
					if (penales == 1) {
						marca1++;
						anotouno(equipo1);
			

					} else {
						erraruno(equipo1);
					}
					int penales1 = (int) (Math.random() * 2);
					if (penales1 == 1) {
						marca2++;
						anotouno(equipo1);
					} else {
						errardos(equipo2);
					}
				}
	////-----RESULTADO DE PENALES------------------------------------------------------			

				if (marca1 > marca2) {
					JOptionPane.showMessageDialog(null, marca1 + " " + equipo1.getNombre() + " / " + marca2 + " "
							+ equipo2.getNombre() + "\nGanoooooooo " + equipo1.getNombre());
				} else if (marca1 < marca2) {
					JOptionPane.showMessageDialog(null, marca1 + " " + equipo1.getNombre() + " / " + marca2 + " "
							+ equipo2.getNombre() + "\nGanoooooooo " + equipo2.getNombre());

	////-----DESEMPATE DE PENALES gol gana-----------------------------------------------------					
				} else {
					JOptionPane.showMessageDialog(null, "Empate deficion Gol gana","Futbol en ascenso",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/penaal.png")));
					int desempate = (int) (Math.random() * 2);
					if (desempate == 1) {
						marca1++;
						JOptionPane.showMessageDialog(null, "Gooool  " + equipo1.getNombre() + "  Ganooooooooooo "
								+ equipo1.getNombre() , "Futbol en ascenso",
								JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/final.png")));
					} else {
						JOptionPane.showMessageDialog(null, "Gooool  " + equipo2.getNombre() + "  Ganooooooooooo "
								+ equipo2.getNombre() , "Futbol en ascenso",
								JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/final.png")));
					}
				}
			}

				
		
		
		return new Partidos(equipo1, equipo2, marca1 , marca2);
		
		
	
	}

///--- funcion para seleccionar 2 equipos para jugar fase de grupos
	public Equipo seleccionarEquipo(LinkedList<Equipo> equipos) {


	String[] equiposarray = new String[equipos.size()];
	
	for (int i = 0; i <equipos.size(); i++) {
		equiposarray[i] =  equipos.get(i).getNombre();
		
	}
	
		int opcion = JOptionPane.showOptionDialog(null, "Seleccione equipo", "Equipos en competencia" , 0,
			JOptionPane.DEFAULT_OPTION, 
			new ImageIcon(MainJuego.class.getResource("/img/uno.jpg")), equiposarray, equiposarray[0]);

	
	return equipos.remove(opcion);


}

////----ranking de los puestos
	public void rankingPuntos() {
		String[] equiposarray = new String[equipos.size()];
		for (int i = 0; i <equipos.size(); i++) {
			equiposarray[i] =  equipos.get(i).getNombre();
			
		}
		
		JOptionPane.showMessageDialog(null, "Clasificacion y puntos" +"\n" +
				
				equiposarray[0] + " : " + equipos.get(0).getPromedio()
				+"\n"+ equiposarray[1] + " : " + equipos.get(1).getPromedio()
				+"\n"+ equiposarray[2] + " : " + equipos.get(2).getPromedio()
				+"\n"+ equiposarray[3] + " : " + equipos.get(3).getPromedio()
				+"\n"+ equiposarray[4] + " : " + equipos.get(4).getPromedio()
				+"\n"+ equiposarray[5] + " : " + equipos.get(5).getPromedio()
				+"\n"+ equiposarray[6] + " : " + equipos.get(6).getPromedio()
				+"\n"+ equiposarray[7] + " : " + equipos.get(7).getPromedio(),"Rankin",
				JOptionPane.DEFAULT_OPTION, 
				new ImageIcon(MainJuego.class.getResource("/img/logo.png")));
			
		
		
		
}
	
	
	
	public void jugarPenales() {
		String[] juego = {
				"Ser arquero" , "Ser jugador" , "salir"
		};
		
		int opcion = JOptionPane.showOptionDialog(null, "¿como quiere jugar?", "Elegir opcion",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon(MainJuego.class.getResource("/img/jugarpenal.png")), 
				juego, juego[0]);
		
		switch (opcion) {
		case 0:
			JOptionPane.showMessageDialog(null, "jugas como arquero");
			String[] arqueros = {
					"Dibu martinez" , "Franco Armani" , "Chiquito romero"
			} ;
			int opn = JOptionPane.showOptionDialog(null, "¿que arquero sos?", "Elegir opcion",
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon(MainJuego.class.getResource("/img/arqueros.png")), 
					arqueros, arqueros[0]);
			JOptionPane.showMessageDialog(null, "jugas como arquero" + arqueros[opn]);
			
			int jug=0;
			int afuera=0;
			int total=0;
			int pc=0;
			for (int i = 0; i <3; i++) {
			
			
			int pateador=(int)(Math.random()*9+1);
			String usuario;
			int elegido;
			
			usuario = (String) JOptionPane.showInputDialog(null, "Ingrese numero donde se tira su arquero", "Juego penales",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/atajar.png")), null,
					null);
			elegido = Integer.parseInt(usuario);
					
			if (pateador==elegido) {
				jug++;
				JOptionPane.showMessageDialog(null, "atajo  " + arqueros[opn]);
			} else if (pateador==7  || pateador==8 || pateador==9){
				afuera++;
				JOptionPane.showMessageDialog(null, "afuera");
			}else if (pateador!=elegido) {
				pc++;
				JOptionPane.showMessageDialog(null, "Gol");
			}
			
			}
			JOptionPane.showMessageDialog(null, "Jugador " + arqueros[opn] + "  \natajo:  " + jug + "\n" + "afuera; " + afuera) ;
			
			total=jug + afuera;
			if (total>pc) {
				JOptionPane.showMessageDialog(null, "ganaste el juego");
			} else {
				JOptionPane.showMessageDialog(null, "Perdiste el juego");
			}
			
			
			break;
		case 1: 
			String[] jugador = {
					"Lautaro martinez" , "Julian Alvarez" , "Lionel Messi"
			} ;
			int open = JOptionPane.showOptionDialog(null, "Selecciona un equipo", "Elegir opcion",
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, new ImageIcon(MainJuego.class.getResource("/img/jugador.jpg")), 
					jugador, jugador[0]);
			JOptionPane.showMessageDialog(null, "jugas como jugador " + jugador[open]);
			
			int jug2=0;
			int afuera2=0;
			int total2=0;
			int pc2=0;
			for (int i = 0; i <3; i++) {
			
			
			int pateador=(int)(Math.random()*9+1);
			String usuario;
			int elegido;
			
			usuario = (String) JOptionPane.showInputDialog(null, "Ingrese numero donde se tira su arquero", "Juego penales",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/atajar.png")), null,
					null);
			elegido = Integer.parseInt(usuario);
					
			if (pateador==elegido) {
				
				JOptionPane.showMessageDialog(null, "Atajo el arquero Dibu Martinez");
			} else if (pateador==7  || pateador==8 || pateador==9){
				
				JOptionPane.showMessageDialog(null, "afuera");
			}else if (pateador!=elegido) {
				jug2++;
				JOptionPane.showMessageDialog(null, "Gol " + jugador[open] );
			}
			
			}
			JOptionPane.showMessageDialog(null, "Jugador " + jugador[open] + "  \nMetió:  " + jug2 + " gol " + "\nErro: " + afuera2) ;
			
			total2=jug2 + afuera2;
			if (total2>pc2) {
				JOptionPane.showMessageDialog(null, "ganaste el juego");
			} else {
				JOptionPane.showMessageDialog(null, "Perdiste el juego");
			}
			
			
			
			
			break;
		
		case 2:
			JOptionPane.showMessageDialog(null, "Saliendo...");
			break;
		default:
			break;
		}

		
		
	}
}
		


	

	
