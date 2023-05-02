package pustovit.homework.homework_25.dao;

import pustovit.homework.homework_25.model.Account;

public interface AccountDao {
    void save(Account account);

    void update(Account account);

    Account getById(int id);

    void delete(Account account);

}
