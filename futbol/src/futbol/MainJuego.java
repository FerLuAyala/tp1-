package futbol;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MainJuego {

	public static void main(String[] args) {
		Torneo clasico = new Torneo();
		
		Equipo morón = new Equipo("Morón","Morón");
		Equipo chicago = new Equipo("Chicago","Mataderos");
		Equipo quilmes = new Equipo("Quilmes","Quilmes");
		Equipo smartin = new Equipo("SanMartin","San Juan");
		Equipo gimnasia = new Equipo("Gimnasia","Mendoza");
		Equipo chacarita = new Equipo("Chacarita","San Martin");
		Equipo temperley = new Equipo("Temperley","temperley");
		Equipo agropecuario = new Equipo("Agropecuario","Carlos Casares");
		
		
		clasico.getEquipos().add(morón);
		clasico.getEquipos().add(chicago);
		clasico.getEquipos().add(quilmes);
		clasico.getEquipos().add(smartin);
		clasico.getEquipos().add(gimnasia);
		clasico.getEquipos().add(chacarita);
		clasico.getEquipos().add(temperley);
		clasico.getEquipos().add(agropecuario);
	
	
		JOptionPane.showMessageDialog(null, "Bienvenidos a Futbol en ascenso", "Futbol en ascenso",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/pelota.png")));
	    
int opc;
		
		do {	
		String[] menuPrincipal = {  "Equipos", "Jugar Partido", "Jugar Cuartos", "Partidos Jugados" ,"salir" };
		
		opc = JOptionPane.showOptionDialog(null, null ,"Primera Nacional" , 0,
				JOptionPane.DEFAULT_OPTION, 
				new ImageIcon(MainJuego.class.getResource("/img/uno.jpg")), menuPrincipal,menuPrincipal[0]);
		switch (opc) {
		case 0:
			clasico.menuEquipo();
			
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Jugaremos un lindo clasico", "Futbol en ascenso",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/clasico.png")));
			
			clasico.JugarPartido( clasico.getEquipos().get(clasico.elegiEquipos(clasico.getEquipos()))
				    ,clasico.getEquipos().get(clasico.elegiEquipos(clasico.getEquipos())));
			
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "", "Futbol en ascenso llaves del REDUCIDO",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/comienzo.jpg")));
			
			for (int i = 0; i <= 3; i++) {

			JOptionPane.showMessageDialog(null, "" ,"Cuartos de final",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/cuartos.jpg")));
			
			Partidos nuevo =clasico.JugarFase(clasico.seleccionarEquipo(clasico.getEquipos()),
					clasico.seleccionarEquipo(clasico.getEquipos()));

			JOptionPane.showMessageDialog(null, "Final de:  " + nuevo);
			JOptionPane.showMessageDialog(null, "Paso a Semifinales:  " + "\n"+ nuevo.ganadorFase().getNombre(),"Cuartos de final",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/final.png")));;
			clasico.getGanadores().add(nuevo.ganadorFase());
			clasico.getPartidos().add(nuevo);
			}
	////////SEMIFINALES----------------------------------------
					JOptionPane.showMessageDialog(null, "","Primera SEMIFinal",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/semi.jpg")));
					Partidos nuevo = clasico.JugarFase(clasico.seleccionarEquipo(clasico.getGanadores()),
							clasico.seleccionarEquipo(clasico.getGanadores()));
					JOptionPane.showMessageDialog(null, "Finalizo la Primera SEMIFinal  " + nuevo);
					JOptionPane.showMessageDialog(null, "Paso a la Final:  " + "\n"+ nuevo.ganadorFase().getNombre(),
							"Semifinal",JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/final.png")));;
					clasico.getFinalistas().add(nuevo.ganadorFase());
					clasico.getPartidos().add(nuevo);
					
					JOptionPane.showMessageDialog(null, "","Segunda SEMIFinal ",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/semi.jpg")));
					nuevo = clasico.JugarFase(clasico.seleccionarEquipo(clasico.getGanadores()),
							clasico.seleccionarEquipo(clasico.getGanadores()));
					JOptionPane.showMessageDialog(null, "Finalizo la Segunda SEMIFinal " + nuevo);
					JOptionPane.showMessageDialog(null, "Paso a la Final:  " + "\n"+ nuevo.ganadorFase().getNombre(),"Semifinal",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/final.png")));;
					clasico.getFinalistas().add(nuevo.ganadorFase());
					clasico.getPartidos().add(nuevo);

	////////FINAL----------------------------------------------
					JOptionPane.showMessageDialog(null, "","Final",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/final.jpg")));
					nuevo = clasico.JugarFase(clasico.seleccionarEquipo(clasico.getFinalistas()),
							clasico.seleccionarEquipo(clasico.getFinalistas()));
					JOptionPane.showMessageDialog(null, "Finalizo la Final  " + nuevo);
					JOptionPane.showMessageDialog(null, "El ganador De este Reducido fue:  " +"\n" +  nuevo.ganadorFase().getNombre(), 
					"Ganador", JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/gana.png")));
					clasico.getPartidos().add(nuevo);		
			

			break;
			
		case 3:
			if (clasico.getPartidos().isEmpty()) {
				JOptionPane.showMessageDialog(null, "No hay partidos jugados en Cuartos de final","PARTIDOS JUGADOS", 0);
			} else {
				JOptionPane.showMessageDialog(null,"Reducido completo" +  clasico.getPartidos(), "PARTIDOS JUGADOS", 0);
			}
			
			break;
		
		case 4:
			JOptionPane.showMessageDialog(null, "Saliendo..");
			break;
		default:
			break;
		}
		} while (opc!=4);
	}
	
	
}



	


