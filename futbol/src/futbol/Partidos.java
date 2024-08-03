package futbol;

import java.time.LocalDate;

public class Partidos {
	private Equipo equipo1;
	private Equipo equipo2;
	private int marca1;
	private int marca2;
	private String fase;
	private LocalDate fecha;
	private static int cantPartidos=0;
	
	
	public Partidos (Equipo equipo1, Equipo equipo2 , int marca1, int marca2) {
		
		cantPartidos++;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.marca1 = marca1;
		this.marca2 = marca2;
		this.fase = GenerarFase();
		this.fecha = Fecha();
	
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

	
	public int getMarca1() {
		return marca1;
	}


	public void setMarca1(int marca1) {
		this.marca1 = marca1;
	}


	public int getMarca2() {
		return marca2;
	}


	public void setMarca2(int marca2) {
		this.marca2 = marca2;
	}


@Override
	public String toString() {
		return "\nFase: " + fase  + "\n" + equipo1.getNombre() + " : " + marca1   +" VS " + equipo2.getNombre() + " : " + marca2   + "\nFecha: " + fecha;
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
		
		if (marca1>marca2) {
		return equipo1;
	} else {
		return equipo2;
	}
		
		
	}



	

	

}
