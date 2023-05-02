package pustovit.homework.homework_25.service;

import org.apache.log4j.Logger;
import pustovit.homework.homework_25.dao.StatusDao;
import pustovit.homework.homework_25.dao.StatusDaoImpl;
import pustovit.homework.homework_25.model.Status;

public class StatusService {
    Logger logger = Logger.getLogger(StatusService.class);

    public void save(Status status) {
        logger.debug(String.format("StatusService.save . Inserting status alias = %d with id = {%d}", status.getAlias(),
                status.getId()));
        if (status.getAlias() == null) {
            logger.error(String.format("StatusService.save . Status alias is null for status with id = {%d}",
                    status.getId()));
        } else {
            StatusDao statusDao = new StatusDaoImpl();
            statusDao.save(status);
        }
    }

    public void update(Status status) {
        logger.debug(String.format("StatusService.update . Updating status alias = %d with id = {%d}", status.getAlias(),
                status.getId()));
        if (status.getAlias() == null) {
            logger.error(String.format("StatusService.update . Status alias is null for status with id = {%d}",
                    status.getId()));
        }
        StatusDao statusDao = new StatusDaoImpl();
        statusDao.update(status);
    }

    public Status getById(int id) {
        System.out.println("StatusService.getById. getting status id is : " + id);
        logger.debug(String.format("StatusService.getById. Searching status with id = {%d}", id));
        if (id == 0) {
            logger.error("StatusService.getById. Getting status by id can't be zero!");
        }
        StatusDao statusDao = new StatusDaoImpl();
        return statusDao.getById(id);
    }

    public void delete(Status status) {
        logger.debug(String.format("StatusService.delete . Deleting status by alias = %d with id = {%d}",
                status.getAlias(),
                status.getId()));
        if (status.getId() == 0) {
            logger.error("StatusService.delete. Status's deleting id can not be 0");
        } else {
            StatusDao statusDao = new StatusDaoImpl();
            statusDao.delete(status);
        }

    }
}
