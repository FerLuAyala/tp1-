package futbol;

public class Jugador {
	private String nombre;
	private String posicion;
	private int nroCamiseta;
	private static int num;
	private int edad;
	public Jugador(String nombre, String posicion, int edad) {
		num++;
		this.nombre = nombre;
		this.posicion = posicion;
		this.nroCamiseta = num;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public int getNroCamiseta() {
		return nroCamiseta;
	}
	public void setNroCamiseta(int nroCamiseta) {
		this.nroCamiseta = nroCamiseta;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "\n" + nombre + " " + edad +  " Años "+ posicion + " Nro " + nroCamiseta ;
	}

}
