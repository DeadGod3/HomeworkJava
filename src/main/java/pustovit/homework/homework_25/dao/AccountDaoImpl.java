package pustovit.homework.homework_25.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import pustovit.homework.homework_25.model.Account;
import pustovit.homework.homework_25.util.HibernateConfiguration;

public class AccountDaoImpl implements AccountDao {

//    CAN USE WITHOUT INTERFACE METHOD(INTERFACES) , CAN CREATE ONLY CLASS WITHOUT CONTRACTS!!!
//    CAN USE WITHOUT INTERFACE METHOD(INTERFACES) , CAN CREATE ONLY CLASS WITHOUT CONTRACTS!!!
//    CAN USE WITHOUT INTERFACE METHOD(INTERFACES) , CAN CREATE ONLY CLASS WITHOUT CONTRACTS!!!

    @Override
    public void save(Account account) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(account);

        transaction.commit();
        session.close();
    }

    @Override
    public void update(Account account) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(account);

        transaction.commit();
        session.close();

    }

    @Override
    public Account getById(int id) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Query query = session.createNativeQuery(
                "SELECT * FROM accounts WHERE id = :id",
                Account.class
        );
        query.setParameter("id", id);
        Account accountById = (Account) query.getSingleResult();

        transaction.commit();
        session.close();

        return accountById;
    }

    @Override
    public void delete(Account account) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(account);

        transaction.commit();
        session.close();

    }
}
