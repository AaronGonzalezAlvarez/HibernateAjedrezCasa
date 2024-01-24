package AjedrezCasa.HibernateAjedrezCasa;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import models.Apertura;
import models.Jugador;
import models.Pais;
import models.Partida;
import models.Resultado;

public class Hibernateconexion {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration().configure();

				addClasses(configuration); // Cambia en cada proyecto

				StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties());
				sessionFactory = configuration.buildSessionFactory(builder.build());

			} catch (Exception e) {
				System.out.println("Error" + e);
			}
		}
		return sessionFactory;
	}

	private static void addClasses(Configuration configuration) {
		configuration.addClass(Pais.class);
		configuration.addClass(Jugador.class);
		configuration.addClass(Partida.class);
		configuration.addClass(Resultado.class);
		configuration.addClass(Apertura.class);

	}
}