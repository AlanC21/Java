package modulo;

import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private int creacion;
	private ArrayList<Jugador> jugadores= new ArrayList<Jugador>();
	public Equipo(String nombre, int creacion) {
		super();
		this.nombre = nombre;
		this.creacion = creacion;
	}
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public String getNombre() {
		return nombre;
	}
	public int getCreacion() {
		return creacion;
	}
	
	public void agregarJugador(Jugador jugador) {
		this.jugadores.add(jugador);
	}
	public void sacarJugador(Jugador jugador) {
		this.jugadores.remove(jugador);
	}
	public int getCantidad() {
		return this.jugadores.size();
	}
	public int cantidadJugadores() {
		return this.jugadores.size();
	}
	public double promedioEdad() {
		double suma = 0;
		double promedio = 0;
		for(int i = 0; i < this.jugadores.size(); i++) {
			Jugador j = this.jugadores.get(i);
			suma += j.getEdad();
		}
		return promedio = suma / this.jugadores.size();
	}
	public double promedioEdadMayores() {
		double suma = 0;
		double promedio = 0;
		for(int i = 0; i < this.jugadores.size();i++) {
			Jugador j = this.jugadores.get(i);
			if(j.getEdad() >= 18) {
				suma += j.getEdad();
			}
		}
		return promedio = suma / this.jugadores.size();
	}
	public double promedioEdadMenores() {
		double suma = 0;
		double promedio = 0;
		for(int i = 0; i < this.jugadores.size();i++) {
			Jugador j = this.jugadores.get(i);
			if(j.getEdad() <= 18) {
				suma += j.getEdad();
			}
		}
		return promedio = suma / this.jugadores.size();
	}
	public double promedioEfectividad() {
		double suma = 0;
		double promedio = 0;
		for(int i = 0; i < this.jugadores.size(); i++) {
			Jugador j = this.jugadores.get(i);
			suma += j.getEfectividad();
		}
		return promedio = suma / this.jugadores.size();
	}
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", creacion=" + creacion + ", jugadores=" + jugadores + "]";
	}
	
}
