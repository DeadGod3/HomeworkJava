package pustovit.homework.homework_25.service;

import pustovit.homework.homework_25.dao.ClientDao;
import pustovit.homework.homework_25.dao.ClientDaoImpl;
import pustovit.homework.homework_25.model.Client;

import java.util.List;

public class ClientService {
    ClientDao clientDao = new ClientDaoImpl();
    public void save(Client client) {
        if (client == null) {
            System.out.println("Client in null.");
        }
        // any other validation..
        clientDao.save(client);
    }

    public void update(Client client) {
        if (client == null) {
            System.out.println("Client in null.");
        }
        clientDao.update(client);
    }

    public Client getById(final int id) {
        System.out.println("id of the client " + id);
        return clientDao.getById(id);
    }


    public void delete(Client client) {
        if (client == null) {
            System.out.println("Client in null.");
        }
        clientDao.delete(client);
    }

    public Client getByPhone(int phone) {
        System.out.println("phone of the client " + phone);
        return clientDao.getByPhone(phone);
    }
    public List<Client> getAll(){
        System.out.println("getting all clients");
        return clientDao.getAll();
    }

}
