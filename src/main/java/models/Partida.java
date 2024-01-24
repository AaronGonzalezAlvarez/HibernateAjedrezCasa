package models;

import java.io.Serializable;

public class Partida implements Serializable{
	
	int Id;
	int Movimientos;
	int Ano;
	Jugador JugadorBlancas;
	Jugador JugadorNegras;
	Resultado resultado;
	Apertura apertura;
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	public int getMovimientos() {
		return Movimientos;
	}
	
	public void setMovimientos(int movimientos) {
		Movimientos = movimientos;
	}
	
	public int getAno() {
		return Ano;
	}
	
	public void setAno(int ano) {
		Ano = ano;
	}
	
	
	
	public Jugador getJugadorBlancas() {
		return JugadorBlancas;
	}

	public void setJugadorBlancas(Jugador jugadorBlancas) {
		JugadorBlancas = jugadorBlancas;
	}

	public Jugador getJugadorNegras() {
		return JugadorNegras;
	}

	public void setJugadorNegras(Jugador jugadorNegras) {
		JugadorNegras = jugadorNegras;
	}

	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}
	
	

	public Apertura getApertura() {
		return apertura;
	}

	public void setApertura(Apertura apertura) {
		this.apertura = apertura;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id= " + Id + " ,Movimientos= " + Movimientos + " ,año= " + Ano + " Jugador blancas = "
				+ JugadorBlancas.getId() + " Jugador negras= " + JugadorNegras.getId() + " , resultado = "
				+ resultado.getNombre() + " , apertura= " + apertura.getNombre();
	}

}
