package pustovit.homework.homework_25.dao;

import pustovit.homework.homework_25.model.Client;

public interface ClientDao {
    void save(Client client);

    void update(Client client);

    Client getById(int id);

    void delete(Client client);

    Client getByPhone(int phone);

}
