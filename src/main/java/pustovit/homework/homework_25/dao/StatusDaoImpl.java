package pustovit.homework.homework_25.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import pustovit.homework.homework_25.model.Status;
import pustovit.homework.homework_25.util.HibernateConfiguration;

public class StatusDaoImpl implements StatusDao {
    Logger logger = Logger.getLogger(StatusDaoImpl.class);

    //    CAN USE WITHOUT INTERFACE METHOD(INTERFACES) , CAN CREATE ONLY CLASS WITHOUT CONTRACTS!!!
    //    CAN USE WITHOUT INTERFACE METHOD(INTERFACES) , CAN CREATE ONLY CLASS WITHOUT CONTRACTS!!!
    //    CAN USE WITHOUT INTERFACE METHOD(INTERFACES) , CAN CREATE ONLY CLASS WITHOUT CONTRACTS!!!
    @Override
    public void save(Status status) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        if (sessionFactory == null) {
            logger.error("StatusDaoImpl.save . SessionFactory == null!");
        }

        Session session = sessionFactory.openSession();
        if (session == null) {
            logger.error("StatusDaoImpl.save . session == null!");
        }

        Transaction transaction = session.beginTransaction();
        if (transaction == null) {
            logger.error("StatusDaoImpl.save . transaction == null!");
        }

        session.save(status);

        transaction.commit();
        session.close();
    }

    @Override
    public void update(Status status) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(status);

        transaction.commit();
        session.close();
    }

    @Override
    public Status getById(int id) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Query query = session.createNativeQuery(
                "SELECT * FROM statuses WHERE id = :id",
                Status.class
        );
        query.setParameter("id", id);
        Status statusById = (Status) query.getSingleResult();

        transaction.commit();
        session.close();

        return statusById;
    }

    @Override
    public void delete(Status status) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(status);

        transaction.commit();
        session.close();
    }
}