package futbol;

import java.time.LocalDate;

public class Partidos {
	private Equipo equipo1;
	private Equipo equipo2;
	private int gol1;
	private int gol2;
	private String fase;
	private LocalDate fecha;
	private static int cantPartidos=0;
	
	
	public Partidos (Equipo equipo1, Equipo equipo2 , int gol1, int gol2) {
		super();
		cantPartidos++;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.gol1 = gol1;
		this.gol2 = gol2;
		this.fase = GenerarFase();
		this.fecha = Fecha();
	
	}


	public Partidos(Equipo equipo, Equipo equipo3) {
		// TODO Auto-generated constructor stub
	}


	public Equipo getEquipo1() {
		return equipo1;
	}


	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}


	public Equipo getEquipo2() {
		return equipo2;
	}


	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}


	public String getFase() {
		return fase;
	}

	public void setFase(String fase) {
		this.fase = fase;
	}

	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public static int getCantPartidos() {
		return cantPartidos;
	}

	public static void setCantPartidos(int cantPartidos) {
		Partidos.cantPartidos = cantPartidos;
	}

	
	public int getGol1() {
		return gol1;
	}


	public void setGol1(int gol1) {
		this.gol1 = gol1;
	}


	public int getGol2() {
		return gol2;
	}


	public void setGol2(int gol2) {
		this.gol2 = gol2;
	}


@Override
	public String toString() {
		return "\nFase: " + fase  + "\n" + equipo1.getNombre() + " : " + gol1   +" VS " + equipo2.getNombre() + " : " + gol2   + "\nFecha: " + fecha;
	}



public String GenerarFase() {
	if (cantPartidos<=4) {
		return "Cuartos";
	} else if (cantPartidos>4 && cantPartidos<=6){
		return "Semifinal";
	}else {
		return "Final";
	}
}
public LocalDate Fecha() {
	
	if (cantPartidos<=4) {
		return LocalDate.now();
	} else if (cantPartidos>4 && cantPartidos<=6 ){
		return LocalDate .now().plusDays(7);
	}else {
		return LocalDate .now().plusDays(21);
	}
	
	
}

public Equipo ganadorFase() {
		
		if (gol1>gol2) {
		return equipo1;
	} else {
		return equipo2;
	}
		
		
	}



	

	

}
