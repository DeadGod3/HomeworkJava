package pustovit.homework.homework_26.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pustovit.homework.homework_26.entity.Owner;
import pustovit.homework.homework_26.util.HibernateConfig;

public class OwnerDao {
    public void save(Owner owner) {
        final SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        session.save(owner);

        transaction.commit();
        session.close();
    }

}
