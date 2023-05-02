package pustovit.homework.homework_25.service;

import org.apache.log4j.Logger;
import pustovit.homework.homework_25.dao.ClientDao;
import pustovit.homework.homework_25.dao.ClientDaoImpl;
import pustovit.homework.homework_25.model.Client;

import java.util.List;

public class ClientService {
    Logger logger = Logger.getLogger(ClientService.class);
    ClientDao clientDao = new ClientDaoImpl();

    public void save(Client client) {
        logger.debug(String.format("ClientService.save . Inserting account name = %d with id = {%d}", client.getName(),
                client.getId()));
        if (client.getName() == null) {
            logger.error(String.format("ClientService.save . Account name is null for account with id = {%d}",
                    client.getId()));
        } else {
            clientDao.save(client);
        }
    }

    public void update(Client client) {
        logger.debug(String.format("ClientService.update . Updating account name = %d with id = {%d}", client.getName(),
                client.getId()));
        if (client.getName() == null) {
            logger.error(String.format("ClientService.update . Account name is null for account with id = {%d}",
                    client.getId()));
        } else {
            clientDao.update(client);
        }
    }

    public Client getById(final int id) {
        System.out.println("ClientService.getById. getting client id is : " + id);
        logger.debug(String.format("ClientService.getById. Searching client with id = {%d}", id));
        if (id == 0) {
            logger.error("ClientService.getById. Getting client by id can't be zero!");
        }
        return clientDao.getById(id);
    }


    public void delete(Client client) {
        logger.debug(String.format("ClientService.delete . Deleting account name = %d with id = {%d}", client.getName(),
                client.getId()));
        if (client.getId() == 0) {
            logger.error("ClientService.delete. Client's deleting id can not be 0");
            clientDao.delete(client);
        } else {
            clientDao.delete(client);
        }
    }

    public Client getByPhone(int phone) {
        System.out.println("ClientService.getByPhone. getting client phone is : " + phone);
        logger.debug(String.format("ClientService.getByPhone. Searching client with phone = {%d}", phone));
        if (phone == 0) {
            logger.error("ClientService.getByPhone. Getting client by phone can't be zero!");
        }
        return clientDao.getByPhone(phone);
    }

    public List<Client> getAll() {
        System.out.println("ClientService.getAll. getting all clients");
        logger.debug("ClientService.getAll. Getting all clients");
        if (getAll() == null) {
            logger.error("ClientService.getAll. List of clients can't be null!");
        }
        return clientDao.getAll();
    }

}
