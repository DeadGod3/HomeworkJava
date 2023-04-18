package pustovit.homework.homework_25.service;

import pustovit.homework.homework_25.dao.ClientDao;
import pustovit.homework.homework_25.dao.ClientDaoImpl;
import pustovit.homework.homework_25.dao.StatusDao;
import pustovit.homework.homework_25.dao.StatusDaoImpl;
import pustovit.homework.homework_25.model.Client;
import pustovit.homework.homework_25.model.Status;

public class StatusService {
    public void save(Status status) {
        if (status == null) {
            System.out.println("Status in null.");
        }
        // any other validation..
        StatusDao statusDao = new StatusDaoImpl();
        statusDao.save(status);
    }

    public void update(Status status) {
        if (status == null) {
            System.out.println("Status in null.");
        }
        StatusDao statusDao = new StatusDaoImpl();
        statusDao.update(status);
    }

    public Status getById(int id) {
        StatusDao statusDao = new StatusDaoImpl();
        // some validation...
        return statusDao.getById(id);
    }

    public void delete(Status status) {
        if (status == null) {
            System.out.println("Status in null.");
        }
        StatusDao statusDao = new StatusDaoImpl();
        statusDao.delete(status);
    }
}
