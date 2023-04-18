package pustovit.homework.homework_25.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pustovit.homework.homework_25.model.Account;
import pustovit.homework.homework_25.model.Client;
import pustovit.homework.homework_25.model.Status;
import pustovit.homework.homework_25.util.HibernateConfiguration;

public class StatusDaoImpl implements StatusDao {
    @Override
    public void save(Status status) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

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

        final Status status = session.get(Status.class, id);

        transaction.commit();
        session.close();

        return status;
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