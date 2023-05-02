package pustovit.homework.homework_25.util;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import pustovit.homework.homework_25.model.Account;
import pustovit.homework.homework_25.model.Client;

public class HibernateConfiguration {
    private static SessionFactory sessionFactory;
    private final static Logger logger = Logger.getLogger(HibernateConfiguration.class);

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
//                Properties properties = new Properties(); // for file hibernate.properties
//                Configuration configuration = new Configuration().addProperties(properties); // for file hibernate.properties
                Configuration configuration = new Configuration().configure(); // Для файла hibernate.cfg.xml
                configuration.addAnnotatedClass(Client.class);
                configuration.addAnnotatedClass(Account.class);

                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            } catch (Exception e) {
                logger.error("HibernateConfiguration.getSessionFactory. Error in connection to DB, error is: "
                        + e);
            }
        }
        return sessionFactory;
    }


}
