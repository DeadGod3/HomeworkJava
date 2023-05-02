package pustovit.homework.homework_25.service;

import org.apache.log4j.Logger;
import pustovit.homework.homework_25.dao.AccountDao;
import pustovit.homework.homework_25.dao.AccountDaoImpl;
import pustovit.homework.homework_25.model.Account;


public class AccountService {
    private final Logger logger = Logger.getLogger(AccountService.class);

    public void save(Account account) {
        logger.debug(String.format("Account.save . Inserting account with id = '%d'", account.getId()));
        if (account.getValue() == 0) {
            logger.error(String.format("Account.save . Account value null for account with id = {%d}",
                    account.getId()));
        } else {
            AccountDao accountDao = new AccountDaoImpl();
            accountDao.save(account);

        }

    }

    public void update(Account account) {
        logger.debug(String.format("Account.update . Inserting account with id = '%d'", account.getId()));
        if (account.getNumber() == null) {
            logger.error(String.format("Account.update . Account number null for account with id = {%d}",
                    account.getId()));

        } else {
            AccountDao accountDao = new AccountDaoImpl();
            accountDao.update(account);
        }
    }

    public Account getById(Integer id) {
        logger.debug(String.format("Account.getById . Getting id = '%d' ", id));

        AccountDao accountDao = new AccountDaoImpl();
        return accountDao.getById(id);
    }

    public void delete(Account account) {
        logger.debug(String.format("Account.delete . Checking account with id = '%d'", account.getId()));
        if (account.toString() == null) {
            logger.error(String.format("Account.delete . Account  is null for account with id = {%d}",
                    account.getId()));
        }
        AccountDao accountDao = new AccountDaoImpl();
        accountDao.delete(account);
    }
}

