package futbol;

import javax.swing.JOptionPane;

public class MainJuego {

	public static void main(String[] args) {
Torneo clasico = new Torneo();
		
		Equipo morón = new Equipo("Morón","Morón");
		Equipo chicago = new Equipo("Chicago","Mataderos");
		Equipo talleres = new Equipo("Talleres","Cordoba");
		Equipo belgrano = new Equipo("Belgrano","Cordoba");
		
		clasico.getEquipos().add(morón);
		clasico.getEquipos().add(chicago);
		
		
		int opc;
		
		do {	
		String[] menuPrincipal = { "Jugar", "Seleccione Equipos" ,"salir" };
		
		opc = JOptionPane.showOptionDialog(null, "Bienvenido , Seleccione una opción","Menu", 0, 0, null, menuPrincipal,menuPrincipal[0]);
		switch (opc) {
		case 0:
			clasico.JugarPartido( clasico.getEquipos().get(clasico.seleccionarEquipo(clasico.getEquipos()))
				    ,clasico.getEquipos().get(clasico.seleccionarEquipo(clasico.getEquipos())));
				
			break;
		case 1:
			clasico.menuEquipo(morón, chicago , talleres , belgrano);
			
			break;
		default:
			break;
		}
		} while (opc!=2);
	}



	}


