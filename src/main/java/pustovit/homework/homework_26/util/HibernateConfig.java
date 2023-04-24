package pustovit.homework.homework_26.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import pustovit.homework.homework_26.entity.Car;
import pustovit.homework.homework_26.entity.Key;
import pustovit.homework.homework_26.entity.Owner;
import pustovit.homework.homework_26.entity.SecondOwner;

public class HibernateConfig {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure(); // Для файла hibernate.cfg.xml
                configuration.addAnnotatedClass(Owner.class);
                configuration.addAnnotatedClass(Key.class);
                configuration.addAnnotatedClass(SecondOwner.class);
                configuration.addAnnotatedClass(Car.class);


                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            } catch (Exception e) {
                System.out.println("Session factory Error: " + e);
            }
        }
        return sessionFactory;
    }
}
