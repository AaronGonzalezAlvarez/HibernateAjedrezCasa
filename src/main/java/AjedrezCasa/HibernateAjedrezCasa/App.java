package AjedrezCasa.HibernateAjedrezCasa;

import dao.Service;
import models.Apertura;
import models.Jugador;
import models.Pais;
import models.Partida;
import models.Resultado;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

	var sf=Hibernateconexion.getSessionFactory();
	
	/*var pais = sf.openSession().get(Pais.class, "3");
	System.out.println(pais);*/
	
	/*var jugador = sf.openSession().get(Jugador.class, "10126");
	System.out.println(jugador);*/
	
	/*var partida = sf.openSession().get(Partida.class, "1209549");
	System.out.println(partida);*/
	
	/*var resultado = sf.openSession().get(Resultado.class, "X");
	System.out.println(resultado);*/
	
//	var apertura = sf.openSession().get(Apertura.class, "C42");
//	System.out.println(apertura);
	
	Service service = new Service();
	//service.HQL1();
	//service.HQL2();
	//service.HQL3();
	//service.HQL4();
	//service.HQL5();
	//service.HQL6();
	//service.HQL7();
	
	service.update1(1290232, "N");
	
    }
}
