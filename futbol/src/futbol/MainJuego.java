package futbol;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MainJuego {

	public static void main(String[] args) {
		Torneo clasico = new Torneo();
		
	
		
		Equipo morón = new Equipo("Morón","Morón" ,"n1 Prom 40pts Partidos: 10 ganados - 10 empates - 3  derrotas" , 2);
		Equipo chicago = new Equipo("Chicago","Mataderos" , "n2° Prom 36pts. Partidos: 8  ganados , 12 empates , 3  derrotas" , 2 );
		Equipo quilmes = new Equipo("Quilmes","Quilmes" , "n3° Prom 34pts. Partidos: 8  ganados , 10 empates , 5  derrotas" , 2);
		Equipo smartin = new Equipo("SanMartin","San Juan" , "n4° Prom 31pts. Partidos: 7  ganados , 10 empates , 6  derrotas" ,0 );
		Equipo gimnasia = new Equipo("Gimnasia","Mendoza" , "n5° Prom 30pts. Partidos: 8  ganados , 6  empates , 9  derrotas",0);
		Equipo chacarita = new Equipo("Chacarita","San Martin","n6° Prom 27pts. Partidos: 9  ganados , 0  empates , 14 derrotas" , 0);
		Equipo temperley = new Equipo("Temperley","temperley" , "n7° Prom 27pts. Partidos: 8  ganados , 3  empates , 12 derrotas" , 0);
		Equipo agropecuario = new Equipo("Agropecuario","Carlos Casares" , "n8° Prom 27pts. Partidos: 7  ganados , 4  empates , 12 derrotas" ,0);
		
		
		clasico.getEquipos().add(morón);
		clasico.getEquipos().add(chicago);
		clasico.getEquipos().add(quilmes);
		clasico.getEquipos().add(smartin);
		clasico.getEquipos().add(gimnasia);
		clasico.getEquipos().add(chacarita);
		clasico.getEquipos().add(temperley);
		clasico.getEquipos().add(agropecuario);
	
		//clasico.seleccionarduo(clasico.getEquipos());

		
		JOptionPane.showMessageDialog(null, "BIENVENIDOS" + "\nA Futbol en ascenso", "Futbol en ascenso",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/logo.png")));
	    
int opc;
		
		do {	
		String[] menuPrincipal = {  "Equipos", "Jugar Partido", "Jugar Cuartos", "Partidos Jugados" ,"Jugar penales" ,"salir" };
		
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
			clasico.rankingPuntos();

			JOptionPane.showMessageDialog(null, "", "Futbol en ascenso llaves del REDUCIDO",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/comienzo.jpg")));
			
			
			for (int i = 0; i <= 3; i++) {

			JOptionPane.showMessageDialog(null, "" ,"Cuartos de final",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/cuartos.jpg")));
			
			Partidos nuevo =clasico.JugarFase(clasico.seleccionarEquipo(clasico.getEquipos()),
					clasico.seleccionarEquipo(clasico.getEquipos()));

	
			JOptionPane.showMessageDialog(null, "Final de  " + nuevo+"\nPaso a Semifinales:  " + "\n"+ nuevo.ganadorFase().getNombre(),"Cuartos de final",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/final.png")));;
			clasico.getGanadores().add(nuevo.ganadorFase());
			clasico.getPartidos().add(nuevo);
			}
	////////SEMIFINALES----------------------------------------
					JOptionPane.showMessageDialog(null, "","Primera SEMIFinal",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/semi.jpg")));
					Partidos nuevo = clasico.JugarFase(clasico.seleccionarEquipo(clasico.getGanadores()),
							clasico.seleccionarEquipo(clasico.getGanadores()));
			
					JOptionPane.showMessageDialog(null, "Finalizo la Primera SEMIFinal  " + nuevo+"Paso a la Final:  " + "\n"+ nuevo.ganadorFase().getNombre(),
							"Semifinal",JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/final.png")));;
					clasico.getFinalistas().add(nuevo.ganadorFase());
					clasico.getPartidos().add(nuevo);
					
					JOptionPane.showMessageDialog(null, "","Segunda SEMIFinal ",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/semi.jpg")));
					nuevo = clasico.JugarFase(clasico.seleccionarEquipo(clasico.getGanadores()),
							clasico.seleccionarEquipo(clasico.getGanadores()));
					
					JOptionPane.showMessageDialog(null, "Finalizo la Segunda SEMIFinal " + nuevo+"Paso a la Final:  " + "\n"+ nuevo.ganadorFase().getNombre(),"Semifinal",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/final.png")));;
					clasico.getFinalistas().add(nuevo.ganadorFase());
					clasico.getPartidos().add(nuevo);

	////////FINAL----------------------------------------------
					JOptionPane.showMessageDialog(null, "","Final",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/final.jpg")));
					nuevo = clasico.JugarFase(clasico.seleccionarEquipo(clasico.getFinalistas()),
							clasico.seleccionarEquipo(clasico.getFinalistas()));
			
					JOptionPane.showMessageDialog(null, "Finalizo la Final  " + nuevo+"\nEl ganador De este Reducido fue:  " +"\n" +  nuevo.ganadorFase().getNombre(), 
					" Ganador ", JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/gana.png")));
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
			clasico.jugarPenales();
		case 5:
			JOptionPane.showMessageDialog(null, "Saliendo..");
			break;
		default:
			break;
		}
		} while (opc!=5);
	}
	
	
}



	


