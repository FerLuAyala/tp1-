package futbol;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MainJuego {

	public static void main(String[] args) {
		Torneo clasico = new Torneo();

		clasico.recargarEquipos(clasico);

		JOptionPane.showMessageDialog(null, "BIENVENIDOS" + "\nA Futbol en ascenso", "Futbol en ascenso",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/logo.png")));

		int opc;

		do {
			String[] menuPrincipal = { "Equipos", "Jugar Cuartos", "Partidos Jugados", "Jugar penales", "salir" };

			opc = JOptionPane.showOptionDialog(null, null, "Primera Nacional", 0, JOptionPane.DEFAULT_OPTION,
					new ImageIcon(MainJuego.class.getResource("/img/uno.jpg")), menuPrincipal, menuPrincipal[0]);
			switch (opc) {
			case 0:
				clasico.menu(clasico);

				break;

			case 1:

				JOptionPane.showMessageDialog(null, "", "Futbol en ascenso llaves del REDUCIDO",
						JOptionPane.DEFAULT_OPTION, new ImageIcon(MainJuego.class.getResource("/img/comienzo.jpg")));

				int elegir;

				do {

					String[] menu = { "Con apuesta", "Sin apuesta", "Salir" };

					elegir = JOptionPane.showOptionDialog(null, null, "Primera Nacional", 0, JOptionPane.DEFAULT_OPTION,
							new ImageIcon(MainJuego.class.getResource("/img/uno.jpg")), menu, menu[0]);
					switch (elegir) {

					case 0:

						clasico.dineroApuesta(clasico);

						clasico.conApuesta(clasico);

						clasico.finalApuesta(clasico);

						break;

					case 1:

						clasico.sinApuesta(clasico);

						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Saliendo..");

						break;
					default:
						break;
					}
				} while (elegir != 2);

				break;
			case 2:
				if (clasico.getPartidos().isEmpty()) {
					JOptionPane.showMessageDialog(null, "No hay partidos jugados en Cuartos de final",
							"PARTIDOS JUGADOS", 0);
				} else {
					JOptionPane.showMessageDialog(null, "Reducido completo" + clasico.getPartidos(), "PARTIDOS JUGADOS",
							0);
				}

				break;
			case 3:
				clasico.jugarPenales();
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Saliendo..");
				break;
			default:
				break;
			}
		} while (opc != 4);
	}

}
