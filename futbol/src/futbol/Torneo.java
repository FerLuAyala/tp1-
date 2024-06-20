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
					JOptionPane.showMessageDialog(null, "No Jugadores en este equipo para mostrar" + "\nIngrese jugadores","Jugadores del equipo", 0);
				
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

	// -------------------------RECORRIDO DEL
	// PARTIDO---------------------------------------------------------
	public void PartidoClasico(Equipo equipo1, Equipo equipo2) {

		/*
		 * para realizar el juego genero 10 numeros random , cada uno cumple una funcion
		 * num 1 = gol de boca num 2 = roja para boca num 3 = gol de river num 4 =
		 * amarilla river num 5 = amarilla para boca num 6 = roja para river
		 */

		// ----ESTOY JUGANDO CON 2 EQUIPO --
		JOptionPane.showMessageDialog(null, equipo1.getPlantel().size() + "  Jugadores  " + equipo1.getNombre() + "\n"
				+ equipo2.getPlantel().size() + "  Jugadores " + equipo2.getNombre());

		JOptionPane.showMessageDialog(null, "Formación " + equipo1.getNombre() + equipo1.getPlantel());
		JOptionPane.showMessageDialog(null, "Formación " + equipo2.getNombre() + equipo2.getPlantel());

//------PRIMER TIEMPO--
		JOptionPane.showMessageDialog(null, " Comenzamos este Primer tiempo de 45 minutos ");

		int marca1 = 0;
		int amarilla1 = 0;
		int marca2 = 0;
		int amarilla2 = 0;
		int rojas1 = 0;
		int rojas2 = 0;

		for (int i = 0; i <= 3; i++) {

			int goles = (int) (Math.random() * 10);
			if (goles == 1) {
				marca1++;
				JOptionPane.showMessageDialog(null, "Gol de:  " + equipo1.getNombre());
			} else if (goles == 3) {
				marca2++;
				JOptionPane.showMessageDialog(null, "Gol de:  " + equipo2.getNombre());
			} else if (goles == 5) {
				amarilla1++;
				JOptionPane.showMessageDialog(null, "Amarilla para:  " + equipo1.getNombre());
			} else if (goles == 4) {
				amarilla2++;
				JOptionPane.showMessageDialog(null, "Amarilla para:  " + equipo2.getNombre());
			} else if (goles == 2) {
				rojas1++;
				JOptionPane.showMessageDialog(null, "Roja para  " + equipo1.getNombre() + "\nJugador  "
						+ equipo1.getPlantel().remove(4).getNombre());
			} else if (goles == 6) {
				rojas2++;
				JOptionPane.showMessageDialog(null, "Roja para " + equipo2.getNombre() + "\nJugador  "
						+ equipo2.getPlantel().remove(3).getNombre());
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
						+ "Jugadores");

		/// SEGUNDO TIEMPO
		JOptionPane.showMessageDialog(null, "Comenzamos los ultimos 45min de este segundo tiempo");

		for (int i = 0; i <= 3; i++) {
			int goles = (int) (Math.random() * 10);
			if (goles == 1) {
				marca1++;
				JOptionPane.showMessageDialog(null, "Goooooooool de:  " + equipo1.getNombre());
			} else if (goles == 3) {
				marca2++;
				JOptionPane.showMessageDialog(null, "Goooooooool de:  " + equipo2.getNombre());

			} else if (goles == 5) {
				amarilla1++;
				JOptionPane.showMessageDialog(null, "Amarilla para  " + equipo1.getNombre());
			} else if (goles == 4) {
				amarilla2++;
				JOptionPane.showMessageDialog(null, "Amarilla para  " + equipo2.getNombre());
			} else if (goles == 2) {
				rojas1++;
				JOptionPane.showMessageDialog(null,
						"Roja para  " + equipo1.getNombre() + "\nJugador" + equipo1.getPlantel().remove(2).getNombre());
			} else if (goles == 6) {
				rojas2++;
				JOptionPane.showMessageDialog(null,
						"Roja para  " + equipo2.getNombre() + "\nJugador" + equipo2.getPlantel().remove(6).getNombre());
			}
		}

////Resultado segundo tiempo-------------------------------------------------------------------------	

		// GANA BOCA------
		if (marca1 > marca2) {
			JOptionPane.showMessageDialog(null,
					"Finalizó el partido ganoooo " + equipo1.getNombre() + "\n " + equipo1.getNombre() + " : " + marca1
							+ " - " + equipo2.getNombre() + " : " + marca2 + "\nAmarillas de: " + equipo1.getNombre()
							+ " : " + amarilla1 + "\nAmarillas de: " + equipo2.getNombre() + " : " + amarilla2 + "\n"
							+ "Roja de: " + equipo1.getNombre() + " : " + rojas1 + " Jugadores "
							+ equipo1.getPlantel().size() + "\n" + "Roja de: " + equipo2.getNombre() + " : " + rojas2
							+ " jugadores " + equipo2.getPlantel().size());

			// GANA RIVER------
		} else if (marca1 < marca2) {
			JOptionPane.showMessageDialog(null,
					"Finalizó el partido ganoooo " + equipo2.getNombre() + "\n " + equipo2.getNombre() + marca2 + " - "
							+ equipo1.getNombre() + " : " + marca1 + "\nAmarillas de: " + equipo1.getNombre() + " : "
							+ amarilla1 + "\nAmarillas de: " + equipo2.getNombre() + " : " + amarilla2 + "\n"
							+ "Roja de: " + equipo1.getNombre() + " : " + rojas1 + " Jugadores "
							+ equipo1.getPlantel().size() + "\n" + "Roja de: " + equipo2.getNombre() + " : " + rojas2
							+ " Jugadores " + equipo2.getPlantel().size());

//// DEFINICION POR PENALES--------------------------------------------------------------------------------------------------
			/**/
		} else if (marca1 == marca2) {
			JOptionPane.showMessageDialog(null, "Se jugarán los penales");
			int gol1 = 0;
			int gol2 = 0;
			for (int i = 0; i <= 4; i++) {
				int penales = (int) (Math.random() * 2);
				if (penales == 1) {
					gol1++;
					JOptionPane.showMessageDialog(null, "Anotó " + equipo1.getNombre());

				} else {
					JOptionPane.showMessageDialog(null, "Erró " + equipo1.getNombre());
				}
				int penales1 = (int) (Math.random() * 2);
				if (penales1 == 1) {
					gol2++;
					JOptionPane.showMessageDialog(null, "Anotó " + equipo2.getNombre());
				} else {
					JOptionPane.showMessageDialog(null, "Erró " + equipo2.getNombre());
				}
			}
////-----RESULTADO DE PENALES------------------------------------------------------			

			if (gol1 > gol2) {
				JOptionPane.showMessageDialog(null, gol1 + " " + equipo1.getNombre() + " / " + gol2 + " "
						+ equipo2.getNombre() + "\nGanoooooooo " + equipo1.getNombre() + "\nSe queda con el Clásico");
			} else if (gol1 < gol2) {
				JOptionPane.showMessageDialog(null, gol1 + " " + equipo1.getNombre() + " / " + gol2 + " "
						+ equipo2.getNombre() + "\nGanoooooooo " + equipo2.getNombre() + "\nSe queda con el Clásico");

////-----DESEMPATE DE PENALES gol gana-----------------------------------------------------					
			} else {
				JOptionPane.showMessageDialog(null, "Empate deficion Gol gana");
				int desempate = (int) (Math.random() * 2);
				if (desempate == 1) {
					JOptionPane.showMessageDialog(null, "Gooool  " + equipo1.getNombre() + "  Ganooooooooooo "
							+ equipo1.getNombre() + "\nSe queda con el Clásico" , "Futbol en ascenso",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/final.png")));
				} else {
					JOptionPane.showMessageDialog(null, "Gooool  " + equipo2.getNombre() + "  Ganooooooooooo "
							+ equipo2.getNombre() + "\nSe queda con el Clásico");
				}
			}
		}

		//JOptionPane.showMessageDialog(null,
				//"Finaliza otro superclásico emocionante!!" + "\nGracias por vivirlo y sentirlo con nosotros");
		
		JOptionPane.showMessageDialog(null, "Finaliza otro superclásico emocionante!!" + "\nGracias por vivirlo y sentirlo con nosotros", "Futbol en ascenso",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/final.png")));
	}

	// -------------------------------------JUGAR
	// PARTIDO-----------------------------------------------------------------------
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
				
				JOptionPane.showMessageDialog(null, "Bienvenidos a un nuevo clasico en el Oeste" + "\n"
						+ equipo1.getNombre() + " vs " + equipo2.getNombre() + "\nEste dia: " + LocalDate.now() + "\n" + "En: " + estadios[opc]);

				PartidoClasico(equipo1, equipo2);
			} else {

				JOptionPane.showMessageDialog(null,
						"No hay jugadores suficiente" + "\nElija su Equipo desde Seleccione equipo");

			}
		}

		return null;

	}

	//// -------------Seleccion de equipos-------------------------------------------------

	public Partidos JugarFase(Equipo equipo1, Equipo equipo2) {
		
		equipo1.AgregarEquipoJugador(equipo1);
		equipo2.AgregarEquipoJugador(equipo2);
		

				int gol1=0;
				int gol2=0;
				do {
					gol1 = (int)(Math.random()*5);
					gol2 = (int)(Math.random()*5);
					if (gol1==gol2) {
						JOptionPane.showMessageDialog(null, "Hay penales");
					}
				} while (gol1==gol2);
				
			
		
		
		return new Partidos(equipo1, equipo2, gol1 , gol2);
		
	}
	
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
	
	

public Equipo seleccionarEquipo(LinkedList<Equipo> equipos) {
	
	String[] equiposarray = new String[equipos.size()];
	
	for (int i = 0; i <equipos.size(); i++) {
		equiposarray[i] =  equipos.get(i).getNombre();
		
	}
	
	int opcion = JOptionPane.showOptionDialog(null, "Seleccione equipos para enfrentarse", "Equipos en competencia", 0, 
			JOptionPane.DEFAULT_OPTION, 
			new ImageIcon(MainJuego.class.getResource("/img/tres.jpg")),equiposarray, equiposarray[0]);
	
	

	Equipo seleccionado= equipos.get(opcion);
	return equipos.remove(opcion);


}
}	
	
