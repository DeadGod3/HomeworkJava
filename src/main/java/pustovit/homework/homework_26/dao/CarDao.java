package pustovit.homework.homework_26.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pustovit.homework.homework_26.entity.Car;
import pustovit.homework.homework_26.util.HibernateConfig;

public class CarDao {
    public void save(Car car) {
        final SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.save(car);

        transaction.commit();
        session.close();
    }
}
