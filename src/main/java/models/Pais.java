package models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Pais implements Serializable{
	
	int Id;
	String Nombre;
	private Set<Jugador> jugadores = new HashSet<Jugador>(0);
	
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
	
	public Set<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(Set<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		return "[ id = "+Id+" ,Nombre ="+Nombre+" , total jugadores= " + jugadores.size()+" ]";
	}

}
