package pustovit.homework.homework_25.service;

import pustovit.homework.homework_25.dao.AccountDao;
import pustovit.homework.homework_25.dao.AccountDaoImpl;
import pustovit.homework.homework_25.model.Account;

public class AccountService {
    public void save(Account account) {
        if (account == null) {
            System.out.println("Account in null.");
        }
        // any other validation..
        AccountDao accountDao = new AccountDaoImpl();
        accountDao.save(account);
    }

    public void update(Account account) {
        if (account == null) {
            System.out.println("Account in null.");
        }
        // any other validation..
        AccountDao accountDao = new AccountDaoImpl();
        accountDao.update(account);
    }

    public Account getById(int id) {
        AccountDao accountDao = new AccountDaoImpl();
        // some validation...
        return accountDao.getById(id);
    }

    public void delete(Account account) {
        if (account == null) {
            System.out.println("Account in null.");
        }
        AccountDao accountDao = new AccountDaoImpl();
        accountDao.delete(account);
    }
}
