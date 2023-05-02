package pustovit.homework.homework_25.dao;

import pustovit.homework.homework_25.model.Status;

public interface StatusDao {
    void save(Status status);

    void update(Status status);

    Status getById(int id);

    void delete(Status status);
}
