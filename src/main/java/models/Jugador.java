package models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Jugador implements Serializable{
	
	int Id;
	String Nombre;
	String Fecha_Nacimiento;
	Pais PaisOrigen;
	Set<Partida> partidasBlancas = new HashSet<Partida>(0);
	Set<Partida> partidasNegras = new HashSet<Partida>(0);
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
	public String getFecha_Nacimiento() {
		return Fecha_Nacimiento;
	}
	public void setFecha_Nacimiento(String fecha_Nacimiento) {
		Fecha_Nacimiento = fecha_Nacimiento;
	}
	
	public Pais getPaisOrigen() {
		return PaisOrigen;
	}
	public void setPaisOrigen(Pais paisOrigen) {
		PaisOrigen = paisOrigen;
	}
	
	public Set<Partida> getPartidasBlancas() {
		return partidasBlancas;
	}
	public void setPartidasBlancas(Set<Partida> partidasBlancas) {
		this.partidasBlancas = partidasBlancas;
	}
	public Set<Partida> getPartidasNegras() {
		return partidasNegras;
	}
	public void setPartidasNegras(Set<Partida> partidasNegras) {
		this.partidasNegras = partidasNegras;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id= " + Id + " ,Nombre=" + Nombre + " ,nacimiento= " + Fecha_Nacimiento + " Pais= "
				+ PaisOrigen.getNombre() + " , total partidas blancas= " + getPartidasBlancas().size()
				+ " , total partidas negras = " + getPartidasNegras().size();
	}
	

}
