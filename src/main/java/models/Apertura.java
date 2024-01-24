package models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Apertura  implements Serializable{
	
	String Id;
	String Nombre;
	private Set<Partida> partidas = new HashSet<Partida>(0);
	
	
	public String getId() {
		return Id;
	}
	
	
	public void setId(String id) {
		Id = id;
	}
	
	
	public String getNombre() {
		return Nombre;
	}
	
	
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
	
	public Set<Partida> getPartidas() {
		return partidas;
	}


	public void setPartidas(Set<Partida> partidas) {
		this.partidas = partidas;
	}


	@Override
	public String toString() {
		return "id = "+Id+", Nombre= "+Nombre + " , total partidas =" +getPartidas().size();
	}
}
