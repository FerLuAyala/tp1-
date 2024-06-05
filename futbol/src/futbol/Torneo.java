package futbol;

import java.time.LocalDate;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Torneo {
	private LinkedList<Equipo> equipos = new LinkedList<Equipo>();

	public Torneo() {

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

	
	public int menuEquipo(Equipo equipo1, Equipo equipo2, Equipo equipo3 , Equipo equipo4) {
		equipo1.CargarMoron(equipo1);
		equipo2.CargarChicago(equipo2);
		equipo3.AgregarEquipoJugador(equipo3);
		equipo4.AgregarEquipoJugador(equipo4);
		
		String[] equipos = { equipo1.getNombre(), equipo2.getNombre(), equipo3.getNombre() , equipo4.getNombre(),"salir" };

		int equi = 0;
		do {
			equi = 0;
			equi = JOptionPane.showOptionDialog(null, "Seleccione un Equipo", "Cargar Jugadores al Equipos", 0, 0, null, equipos,equipos[0]);

			switch (equi) {

					case 0:

							String[] accionar = { "Agregar Jugador", "Agregar Jugador Aleatorio", "Ver Lista de jugadores", "Salir" };
			
							int accion = 0;
							do {
			
								accion = JOptionPane.showOptionDialog(null, "Usted eligió el quipo" + equipo1.getNombre() + "Desea Realizar otra accion antes de iniciar", "Menu de equipo", 0, 0, null,
										accionar, accionar[0]);
			
								if (accion == 0) {
									equipo1.agregarJugador();
									JOptionPane.showMessageDialog(null, equipo1);
								} else if (accion == 1) {
									equipo1.AgregarJugadoresAleatorio(equipo1);
									JOptionPane.showMessageDialog(null, equipo1);
								} else if (accion == 2) {
			
									JOptionPane.showMessageDialog(null, equipo1);
								}
							} while (accion != 3);
					break;

// -----------------------------------------------------------------------------------------------------------------------------------------------------------

					case 1:
			
							int accion2 = 0;
							do {
			
								String[] accionar2 = { "Agregar Jugador", "Agregar Jugador Aleatorio", "Ver Lista de jugadores", "Salir" };
			
								accion2 = JOptionPane.showOptionDialog(null, "Usted eligió el quipo" + equipo2.getNombre() + "Desea Realizar otra accion antes de iniciar", "Menu de equipo", 0, 0, null, accionar2,
										accionar2[0]);
			
								if (accion2 == 0) {
									equipo2.agregarJugador();
									JOptionPane.showMessageDialog(null, equipo2);
								} else if (accion2 == 1) {
									equipo2.AgregarJugadoresAleatorio(equipo2);
									JOptionPane.showMessageDialog(null, equipo2);
								} else if (accion2 == 2) {
			
									JOptionPane.showMessageDialog(null, equipo2);
								}
							} while (accion2 != 3);
			
							break;
					case 2:
						
						int accion3 = 0;
						do {
		
							String[] accionar3 = { "Agregar Jugador", "Agregar Jugador Aleatorio", "Ver Lista de jugadores", "Salir" };
		
							accion3 = JOptionPane.showOptionDialog(null, "Usted eligió el quipo" + equipo3.getNombre() + "Desea Realizar otra accion antes de iniciar", "Menu de equipo", 0, 0, null, accionar3,
									accionar3[0]);
		
							if (accion3 == 0) {
								equipo3.agregarJugador();
								JOptionPane.showMessageDialog(null, equipo3);
							} else if (accion3 == 1) {
								equipo3.AgregarJugadoresAleatorio(equipo3);
								JOptionPane.showMessageDialog(null, equipo3);
							} else if (accion3 == 2) {
		
								JOptionPane.showMessageDialog(null, equipo3);
							}
						} while (accion3 != 3);
		
						break;
					case 3:
						
						int accion4 = 0;
						do {
		
							String[] accionar4 = { "Agregar Jugador", "Agregar Jugador Aleatorio", "Ver Lista de jugadores", "Salir" };
		
							accion4 = JOptionPane.showOptionDialog(null, "Usted eligió el quipo" + equipo4.getNombre() + "Desea Realizar otra accion antes de iniciar", "Menu de equipo", 0, 0, null, accionar4,
									accionar4[0]);
		
							if (accion4 == 0) {
								equipo4.agregarJugador();
								JOptionPane.showMessageDialog(null, equipo4);
							} else if (accion4 == 1) {
								equipo4.AgregarJugadoresAleatorio(equipo4);
								JOptionPane.showMessageDialog(null, equipo4);
							} else if (accion4 == 2) {
		
								JOptionPane.showMessageDialog(null, equipo4);
							}
						} while (accion4 != 3);
						break;	
						default:
							break;
					}

		} while (equi != 4);
		return equi;
	}
	
	
	
	//-------------------------RECORRIDO DEL PARTIDO---------------------------------------------------------
 	public void PartidoClasico(Equipo equipo1, Equipo equipo2) {
 		
 	/*para realizar el juego genero 10 numeros random , cada uno cumple una funcion
 	 * num 1 = gol de boca
 	 * num 2 = roja para boca
 	 * num 3 = gol de river
 	 * num 4 = amarilla river
 	 * num 5 = amarilla para boca
 	 * num 6 = roja para river*/	
 		
 //----ESTOY JUGANDO CON 2 EQUIPO --
		JOptionPane.showMessageDialog(null, equipo1.getPlantel().size() + "  Jugadores  " + equipo1.getNombre() + 
				"\n"+equipo2.getPlantel().size() + "  Jugadores " + equipo2.getNombre());
		
		JOptionPane.showMessageDialog(null, "Formación " + equipo1.getNombre() + equipo1.getPlantel() );
		JOptionPane.showMessageDialog(null, "Formación " + equipo2.getNombre() +  equipo2.getPlantel() );
		
//------PRIMER TIEMPO--
		JOptionPane.showMessageDialog(null, " Comenzamos este Primer tiempo de 45 minutos ");
		
		int marca1 = 0;
		int amarilla1 = 0;
		int marca2 = 0;
		int amarilla2 = 0;
		int rojas1=0;
		int rojas2=0;

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
			}else if(goles==2) {
				rojas1++;
				JOptionPane.showMessageDialog(null, "Roja para  " + equipo1.getNombre() + "\nJugador  "+ equipo1.getPlantel().remove(4).getNombre());
			}else if(goles==6) {
				rojas2++;
				JOptionPane.showMessageDialog(null, "Roja para " + equipo2.getNombre() + "\nJugador  "+ equipo2.getPlantel().remove(3).getNombre());
			}
		}

		
		//// Resultado primer tiempo-------------------------------------------------------------------------

		JOptionPane.showMessageDialog(null,
				"Termino el primer tiempo" + "\n " + equipo1.getNombre()+ " : " + marca1 + " / " + equipo2.getNombre() + " : "
						+ marca2 + "\nAmarillas de: " + equipo1.getNombre() + " : " + amarilla1 +
						"\nAmarillas de " + equipo2.getNombre() + " : " + amarilla2 + 
						"\n" + "Roja de " + equipo1.getNombre()+ " : "+rojas1 + " / " + equipo1.getPlantel().size() + "Jugadores" +
						"\n" + "Roja de " +equipo2.getNombre()+ " : "+ rojas2 + " / " + equipo2.getPlantel().size()  + "Jugadores"
						);
		
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
			}else if(goles==2) {
				rojas1++;
				JOptionPane.showMessageDialog(null, "Roja para  " + equipo1.getNombre() + "\nJugador"+  equipo1.getPlantel().remove(2).getNombre());
			}else if(goles==6) {
				rojas2++;
				JOptionPane.showMessageDialog(null, "Roja para  " + equipo2.getNombre()+ "\nJugador"+ equipo2.getPlantel().remove(6).getNombre());
			}
		}

////Resultado segundo tiempo-------------------------------------------------------------------------	
		
		// GANA BOCA------
		if (marca1 > marca2) {
			JOptionPane.showMessageDialog(null,
					"Finalizó el partido ganoooo " + equipo1.getNombre() + "\n " + equipo1.getNombre() + " : " + marca1 + " - " + equipo2.getNombre()
							+ " : " + marca2 + 
							"\nAmarillas de: " + equipo1.getNombre() + " : " + amarilla1 + 
							"\nAmarillas de: " + equipo2.getNombre() + " : " + amarilla2 +
							"\n" + "Roja de: " + equipo1.getNombre() + " : " + rojas1 + " Jugadores " +  equipo1.getPlantel().size() +
							"\n" + "Roja de: " + equipo2.getNombre() + " : " + rojas2 + " jugadores " + equipo2.getPlantel().size());
	
				
		// GANA RIVER------
		} else if (marca1 < marca2) {
			JOptionPane.showMessageDialog(null, 
					"Finalizó el partido ganoooo " + equipo2.getNombre() + "\n " + equipo2.getNombre() + marca2 + " - " + equipo1.getNombre()
							+ " : " + marca1 + 
							"\nAmarillas de: " + equipo1.getNombre() + " : " + amarilla1 + 
							"\nAmarillas de: " + equipo2.getNombre() + " : " + amarilla2 +
							"\n" + "Roja de: " + equipo1.getNombre() + " : " + rojas1 + " Jugadores " + equipo1.getPlantel().size() +
							"\n" + "Roja de: " + equipo2.getNombre() + " : " + rojas2 + " Jugadores " + equipo2.getPlantel().size());
	
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
				JOptionPane.showMessageDialog(null, gol1 +" "+ equipo1.getNombre() + " / " + gol2 +" "+ equipo2.getNombre()+"\nGanoooooooo " + equipo1.getNombre()    +"\nSe queda con el Clásico");
			} else if (gol1 < gol2) {
				JOptionPane.showMessageDialog(null, gol1 +" "+ equipo1.getNombre() + " / " + gol2 +" "+ equipo2.getNombre()+"\nGanoooooooo " + equipo2.getNombre()  + "\nSe queda con el Clásico"   );

////-----DESEMPATE DE PENALES gol gana-----------------------------------------------------					
			} else {
				JOptionPane.showMessageDialog(null, "Empate deficion Gol gana");
				int desempate = (int) (Math.random() * 2);
				if (desempate == 1) {
					JOptionPane.showMessageDialog(null, "Gooool  " + equipo1.getNombre()+ "  Ganooooooooooo " + equipo1.getNombre() + "\nSe queda con el Clásico");
				} else {
					JOptionPane.showMessageDialog(null,"Gooool  " + equipo2.getNombre()+ "  Ganooooooooooo " + equipo2.getNombre() + "\nSe queda con el Clásico");
				}
			}
		}

		JOptionPane.showMessageDialog(null,
		"Finaliza otro superclásico emocionante!!" + "\nGracias por vivirlo y sentirlo con nosotros");
	}

 	
 //-------------------------------------JUGAR PARTIDO-----------------------------------------------------------------------
	public Equipo JugarPartido(Equipo equipo1, Equipo equipo2) {
		equipo1.CargarMoron(equipo1);
		equipo2.CargarChicago(equipo2);
		if (equipo1==equipo2) {
			JOptionPane.showMessageDialog(null, "No se puede jugar entre el mismo equipo");
			return null;
		} else {
			if (equipo1.getPlantel().size() >= 8 && equipo1.getPlantel().size() <= 11 && equipo2.getPlantel().size() >= 8
					&& equipo2.getPlantel().size() <= 11) {
				JOptionPane.showMessageDialog(null, "Bienvenidos a un nuevo clasico en el Oeste" + "\n"
						+ equipo1.getNombre() + " vs " + equipo2.getNombre() + "\nEste dia: " + LocalDate.now());
				
				PartidoClasico(equipo1, equipo2);
			} else {

				JOptionPane.showMessageDialog(null,
						"No hay jugadores suficiente" + "\nElija su Equipo desde Seleccione equipo");
		
			
			}}
		return null;
		
	}

	////-------------Seleccion de equipos-------------------------------------------------
	
	public  int seleccionarEquipo(LinkedList<Equipo> equipos) {
		String[] equiposarray = new String[equipos.size()];
		for (int i = 0; i < equipos.size(); i++) {
			equiposarray[i] = equipos.get(i).getNombre();
		}
		int opcion = JOptionPane.showOptionDialog(null, 
				"Seleccione equipo", "Equipos en competencia", 0, 0, null, equiposarray, equiposarray[0]);
		
		return opcion;
		

	}

	
	
}