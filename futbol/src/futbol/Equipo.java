package futbol;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Equipo {
	private String nombre;
	private String ciudad;
	private LinkedList<Jugador> plantel = new LinkedList<Jugador>();
	public Equipo(String nombre, String ciudad) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
	}
	public Equipo() {
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public LinkedList<Jugador> getPlantel() {
		return plantel;
	}
	public void setPlantel(LinkedList<Jugador> plantel) {
		this.plantel = plantel;
	}
	@Override
	public String toString() {
		return "Equipo  " + nombre + "\nCiudad: " + ciudad + "\nplantel: " + plantel + "\n";
	}
///NUMERO DE CAMISETA SE PASA POR private int nroCamiseta;private static int num; EN TODOS LOS CASOS
	
////---------------------------funciones lista de equipos------------------------------------------/////	
	public void CargarMoron(Equipo equipo) {
		equipo.getPlantel().add(new Jugador("Rojas", "Arquero", 24));
		equipo.getPlantel().add(new Jugador("Arciero", "Defensor", 28));
		equipo.getPlantel().add(new Jugador("Machuca", "Defensor", 33));
		equipo.getPlantel().add(new Jugador("Gómez", "Defensor", 22));
		equipo.getPlantel().add(new Jugador("Henry", "Defensor", 29));
		equipo.getPlantel().add(new Jugador("González", "MedioCampampista", 27));
		equipo.getPlantel().add(new Jugador("Vitale", "MedioCampampista", 28));
		equipo.getPlantel().add(new Jugador("Olivares", "MedioCampampista", 22));
		equipo.getPlantel().add(new Jugador("Nuñez", "Delantero", 24));
		equipo.getPlantel().add(new Jugador("Berterame", "Delantero", 25));
		equipo.getPlantel().add(new Jugador("Rescaldani", "Delantero", 33));
	}
	public void CargarChicago(Equipo equipo) {
		equipo.getPlantel().add(new Jugador("Ferrero", "Arquero", 26));
		equipo.getPlantel().add(new Jugador("Martinez", "Defensor", 24));
		equipo.getPlantel().add(new Jugador("Callegari", "Defensor", 25));
		equipo.getPlantel().add(new Jugador("Rossi", "Defensor", 22));
		equipo.getPlantel().add(new Jugador("Arroyo", "Defensor", 29));
		equipo.getPlantel().add(new Jugador("Bottari", "MedioCampampista", 27));
		equipo.getPlantel().add(new Jugador("Vega", "MedioCampampista", 28));
		equipo.getPlantel().add(new Jugador("Amarfil", "MedioCampampista", 22));
		equipo.getPlantel().add(new Jugador("Cardozo", "Delantero", 34));
		equipo.getPlantel().add(new Jugador("Maggi", "Delantero", 33));
		equipo.getPlantel().add(new Jugador("Paz", "Delantero", 26));
	}
////---------------------------funcion Agregar jugador------------------------------------------/////			
	public void agregarJugador() {
		//AGREGAR JUGADOR INGRESANDO APELLIDO Y EDAD , POSICION ALEATORIA
		String nombre = JOptionPane.showInputDialog("Ingrese apellido del jugador:");
		// validacion de nombre que no este el campo vacio
		
		
		while (nombre.isEmpty()) {
			nombre = JOptionPane.showInputDialog("El nombre no puede estar vacío , debe ingresar usando letras"
					+ "\nPor favor, ingrese un nombre válido.");
		}
		String edadd;
		do {
			edadd = JOptionPane.showInputDialog("Ingrese la edad del Nuevo Jugador");
			if (edadd == null) {
			}
			
			
			
		//verificar que no escriba letras
			
			
		} while (edadd.isEmpty() || !edadd.matches("\\d+"));
		int edad = Integer.parseInt(edadd);
		if (edad >= 18 && edad <= 36) {
			String[] posiciones = { "arquero", "delantero", "defensor", "medio campista" };
			int numero = (int) (Math.random() * 4);
			this.getPlantel().add(new Jugador(nombre, posiciones[numero], edad));
		} else {
			JOptionPane.showMessageDialog(null, "No cumple con la edad requerida para participar");
		}
	}
////---------------------------funcion Agregar jugador aleatorio------------------------------------------/////			
	public void AgregarJugadoresAleatorio(Equipo equipo) {
		//--AGREGAR CANTIDAD DE JUGADORES ALEATORIO INGRESADO POR EL USUARIO	
		String cant;
		do {
			cant = JOptionPane.showInputDialog("Ingrese la Cantidad de Jugadores que desea ingresar");
			if (cant == null) {
			}
			// verificar que no escriba letras y que no este vacio el input
		} while (cant.isEmpty() || !cant.matches("\\d+"));
		int cantidad = Integer.parseInt(cant);
		for (int i = 0; i < cantidad; i++) {
			String[] nombres = { "Diaz", "Perez", "Galarza", "Rodriguez", "Iguain", "Gallardo", "Ponzio", "Garcia",
					"Mansilla", "Lombino", "Segado" };
			int num = (int) (Math.random() * 11);
			String[] posiciones = { "arquero", "delantero", "defensor", "medio campista" };
			int numero = (int) (Math.random() * 4);
			// SOLO SALE NUMEROS DE 18 A 36 AÑOS
			int edad = (int) (Math.random() * 18) + 18;
			equipo.getPlantel().add(new Jugador(nombres[num], posiciones[numero], edad));
		}
	}
	
	public void AgregarEquipoJugador (Equipo equipo) {
	//--AGREGAR EQUIPO COMPLETO ALEATORIO	
		for (int i = 0; i <=11; i++) {
			String[] nombres = { "Diaz", "Perez", "Galarza", "Rodriguez", "Iguain", "Gallardo", "Ponzio", "Garcia",
					"Mansilla", "Lombino", "Segado" };
			int num = (int) (Math.random() * 11);
			String[] posiciones = { "arquero", "delantero", "defensor", "medio campista" };
			int numero = (int) (Math.random() * 4);
			int edad = (int) (Math.random() * 18) + 18;
			equipo.getPlantel().add(new Jugador(nombres[num], posiciones[numero], edad));
		}
		
	}
	
}

