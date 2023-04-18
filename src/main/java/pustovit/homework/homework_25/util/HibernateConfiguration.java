package pustovit.homework.homework_25.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import pustovit.homework.homework_25.model.Account;
import pustovit.homework.homework_25.model.Client;

import java.util.Properties;

public class HibernateConfiguration {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
//                Properties properties = new Properties(); // для файла hibernate.properties
//                Configuration configuration = new Configuration().addProperties(properties); // для файла hibernate.properties
                Configuration configuration = new Configuration().configure(); // Для файла hibernate.cfg.xml
                configuration.addAnnotatedClass(Client.class);
                configuration.addAnnotatedClass(Account.class);

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
