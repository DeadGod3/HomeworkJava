package pustovit.homework.homework_25.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import pustovit.homework.homework_25.model.Client;
import pustovit.homework.homework_25.util.HibernateConfiguration;

import java.util.List;

public class ClientDaoImpl implements ClientDao {
    //    CAN USE WITHOUT INTERFACE METHOD(INTERFACES) , CAN CREATE ONLY CLASS WITHOUT CONTRACTS!!!
    //    CAN USE WITHOUT INTERFACE METHOD(INTERFACES) , CAN CREATE ONLY CLASS WITHOUT CONTRACTS!!!
    //    CAN USE WITHOUT INTERFACE METHOD(INTERFACES) , CAN CREATE ONLY CLASS WITHOUT CONTRACTS!!!
    @Override
    public void save(Client client) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(client);

        transaction.commit();
        session.close();

    }

    @Override
    public void update(Client client) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.update(client);

        transaction.commit();
        session.close();

    }

    @Override
    public Client getById(int id) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Query query = session.createNativeQuery(
                "SELECT * FROM clients WHERE id = :id",
                Client.class
        );
        query.setParameter("id", id);
        Client clientById = (Client) query.getSingleResult();

        transaction.commit();
        session.close();

        return clientById;

    }

    @Override
    public void delete(Client client) {
        SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(client);

        transaction.commit();
        session.close();
    }

    @Override
    public Client getByPhone(int phone) {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Query query = session.createNativeQuery(
                "SELECT * FROM clients WHERE phone = :phone",
                Client.class
        );
        query.setParameter("phone", phone);
        Client clientByPhone = (Client) query.getSingleResult();

        transaction.commit();
        session.close();

        return clientByPhone;
    }
    public List<Client> getAll() {
        final SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
        final Session session = sessionFactory.openSession();
        final Transaction transaction = session.beginTransaction();

        final Query query = session.createNamedQuery("getAll"); // USAGE OF NAMED QUERIES FROM ENTITY CLASS
        List<Client> clients = query.getResultList(); // COULD PLACE LIST TO GET ALL PROPERTIES

        transaction.commit();
        session.close();

        return clients;
    }

}
