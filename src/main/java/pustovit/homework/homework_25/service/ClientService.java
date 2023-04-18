package pustovit.homework.homework_25.service;

import pustovit.homework.homework_25.dao.ClientDao;
import pustovit.homework.homework_25.dao.ClientDaoImpl;
import pustovit.homework.homework_25.model.Client;

public class ClientService {
    public void save(Client client) {
        if (client == null) {
            System.out.println("Client in null.");
        }
        // any other validation..
        ClientDao clientDao = new ClientDaoImpl();
        clientDao.save(client);
    }

    public void update(Client client) {
        if (client == null) {
            System.out.println("Client in null.");
        }
        ClientDao clientDao = new ClientDaoImpl();
        clientDao.update(client);
    }

    public Client getById(int id) {
        ClientDao clientDao = new ClientDaoImpl();
        // some validation...
        return clientDao.getById(id);
    }

    public void delete(Client client) {
        if (client == null) {
            System.out.println("Client in null.");
        }
        ClientDao clientDao = new ClientDaoImpl();
        clientDao.delete(client);
    }

    public Client getByPhone(int phone) {
        ClientDao clientDao = new ClientDaoImpl();
        return clientDao.getByPhone(phone);
    }

}
