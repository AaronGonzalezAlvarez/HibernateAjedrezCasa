package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import AjedrezCasa.HibernateAjedrezCasa.Hibernateconexion;
import models.Apertura;
import models.Jugador;
import models.Pais;
import models.Partida;
import models.Resultado;

public class Service {

	private SessionFactory sf = Hibernateconexion.getSessionFactory();
	
	
	public void HQL1() {
		Session session = sf.openSession();
		String hql = "SELECT p,COALESCE(COUNT(j), 0) as total from Pais p left join p.jugadores j GROUP BY p.id order by total desc";
	    List<Object[]> resultados = session.createQuery(hql, Object[].class).list();
	    for (Object[] resultado : resultados) {
	    	Pais pais = (Pais) resultado[0];
	        long total = (long) resultado[1];
	        System.out.println("Pais: " + pais.getNombre() + ", total jugadores: " + total);
	    }
		session.close();
	}
	
	public void HQL2() {
		Session session = sf.openSession();
		String hql = "SELECT j,p from Jugador j inner join j.PaisOrigen p order by j.Nombre asc";
	    List<Object[]> resultados = session.createQuery(hql, Object[].class).list();
	    for (Object[] resultado : resultados) {
	    	Pais pais = (Pais) resultado[1];
	    	Jugador jugador = (Jugador) resultado[0];
	        System.out.println("Jugador: " + jugador.getNombre() + ", Pais: " + pais.getNombre());
	    }
		session.close();
	}
	
	public void HQL3() {
		Session session = sf.openSession();
		String hql = "SELECT j,COALESCE(COUNT(pb), 0),COALESCE(COUNT(pn), 0),po from Jugador j JOIN j.partidasBlancas pb join j.partidasNegras pn join j.PaisOrigen po GROUP BY j.Id";
	    List<Object[]> resultados = session.createQuery(hql, Object[].class).list();
	    for (Object[] resultado : resultados) {
	    	Jugador jugador = (Jugador) resultado[0];
	    	long blancas = (long) resultado[1];
	    	long negras = (long) resultado[2];
	    	Pais pais = (Pais) resultado[3];
	        System.out.println("Jugador: " + jugador.getNombre() + " , PAIS= " + pais.getNombre()+", partidasConNEgras: " + negras + ", partidasConBlancas: " + blancas);
	    }
		session.close();
	}
	
	public void HQL4() {
		Session session = sf.openSession();
		String hql = "SELECT j,pb,po,re,ap from Jugador j JOIN j.partidasBlancas pb join j.PaisOrigen po JOIN pb.resultado re join pb.apertura ap";
	    List<Object[]> resultados = session.createQuery(hql, Object[].class).list();
	    for (Object[] resultado : resultados) {
	    	Jugador jugador = (Jugador) resultado[0];
	    	Partida partida = (Partida) resultado[1];
	    	Pais pais = (Pais) resultado[2];
	    	Resultado resultadoJuego = (Resultado) resultado[3];
	    	Apertura apertura = (Apertura) resultado[4];
	        System.out.println("Jugador: " + jugador.getNombre() + " , PAIS= " + pais.getNombre()+", apertura: " + apertura.getNombre() + ", resultado: " + resultadoJuego.getNombre());
	    }
		session.close();
	}
	
	public void HQL5() {
		Session session = sf.openSession();
		String hql = "SELECT j,pn,po,re,ap from Jugador j JOIN j.partidasNegras pn join j.PaisOrigen po JOIN pn.resultado re join pn.apertura ap";
	    List<Object[]> resultados = session.createQuery(hql, Object[].class).list();
	    for (Object[] resultado : resultados) {
	    	Jugador jugador = (Jugador) resultado[0];
	    	Partida partida = (Partida) resultado[1];
	    	Pais pais = (Pais) resultado[2];
	    	Resultado resultadoJuego = (Resultado) resultado[3];
	    	Apertura apertura = (Apertura) resultado[4];
	        System.out.println("Jugador: " + jugador.getNombre() + " , PAIS= " + pais.getNombre()+", apertura: " + apertura.getNombre() + ", resultado: " + resultadoJuego.getNombre());
	    }
		session.close();
	}
	//con su oponente
	public void HQL6() {
		Session session = sf.openSession();
		String hql = "SELECT j,pn,po,re,ap from Jugador j JOIN j.partidasNegras pn join j.PaisOrigen po JOIN pn.resultado re join pn.apertura ap";
	    List<Object[]> resultados = session.createQuery(hql, Object[].class).list();
	    for (Object[] resultado : resultados) {
	    	Jugador jugador = (Jugador) resultado[0];
	    	Partida partida = (Partida) resultado[1];
	    	Pais pais = (Pais) resultado[2];
	    	Resultado resultadoJuego = (Resultado) resultado[3];
	    	Apertura apertura = (Apertura) resultado[4];
	        System.out.println("Jugador: " + jugador.getNombre() + " , PAIS= " + pais.getNombre()+", apertura: " + apertura.getNombre() + ", resultado: " + resultadoJuego.getNombre() + " , oponente: "+ partida.getJugadorBlancas().getNombre());
	    }
		session.close();
	}
	
	public void HQL7() {
		Session session = sf.openSession();
		String hql = "SELECT p,jb,jn,pon,pob from Partida p join p.JugadorBlancas jb join p.JugadorNegras jn join jn.PaisOrigen pon join jb.PaisOrigen pob";
	    List<Object[]> resultados = session.createQuery(hql, Object[].class).list();
	    for (Object[] resultado : resultados) {
	    	Partida partida = (Partida) resultado[0];
	    	Jugador jugadorBlancas = (Jugador) resultado[1];
	    	Jugador jugadorNEgras = (Jugador) resultado[2];
	    	Pais paisBlanca = (Pais) resultado[3];
	    	Pais paisNEgra = (Pais) resultado[4];
	        System.out.println("partida: " + partida.getId() + " , Blancas: " + jugadorBlancas.getNombre() + " , negras : "+ jugadorNEgras.getNombre() + " , pais blancas " +paisBlanca.getNombre() + " , pais negras: " + paisNEgra.getNombre() + " , ganador: " +partida.getResultado().getNombre());
	    }
		session.close();
	}
	
	public void HQL8() {
		
	}
	
	public void HQL9() {
		
	}
	
	public void HQL10() {
		
	}
	
	public void HQL11() {
		
	}
	
	public void HQL12() {
		
	}
	
	public void HQL13() {
		
	}
	
	public void HQL14() {
		
	}
	
	public void HQL15() {
		
	}

	
	public void update1(int idPartida, String idResultado) {
		Session session = sf.openSession();
		Transaction tx1 = session.beginTransaction();
		Partida partida = session.get(Partida.class, idPartida);
		Resultado resultado = new Resultado();
		resultado.setId(idResultado);
		partida.setResultado(resultado);
		session.merge(partida);
		tx1.commit();
		session.close();
	}

	
//	public void totalAlumnosPorAsignaturaEnConcreto(String asignatura) {
//		Session session = sf.openSession();
//		String hql = "SELECT a,COALESCE(COUNT(as), 0) FROM Asignatura a LEFT JOIN a.alumnos as where a.nombre = :asignatura GROUP BY a.id";
//		Query<Object[]> query = session.createQuery(hql,Object[].class);
//		query.setParameter("asignatura",asignatura);
//		List<Object[]> results = query.list();
//	    for (Object[] resultado : results) {
//	    	Asignatura a = (Asignatura) resultado[0];
//	    	long nif = (long) resultado[1];
//	        System.out.println("Asignatura: " + a.getNombre() + ", total asignatura: " + nif);
//	    }
//		session.close();
//	}

}
