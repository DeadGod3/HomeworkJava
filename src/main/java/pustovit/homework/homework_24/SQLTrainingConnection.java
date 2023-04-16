package pustovit.homework.homework_24;

import pustovit.homework.homework_24.entity.Accounts;
import pustovit.homework.homework_24.entity.Clients;
import pustovit.homework.homework_24.service.AccountService;
import pustovit.homework.homework_24.service.ClientService;


import java.util.List;

public class SQLTrainingConnection {
    public static void main(String[] args) {

//        4. Добавить метод для поиска Client по номеру телефона в соответствующий сервис;
//
//        5. Добавить метод для получения number из Account, где value > переданного значения;
//
//        6. Добавить метод для получения всех Clients где id клиент = client_id таблицы сущности Accounts;
//
//        7. Добавить метод для получения значений clients.name, clients.email, statuses.alias из таблицы клиентов(Clients) и из таблицы статусов(Statuses) используя join 3х таблиц и где возраст пользователей старше 18 лет. (Если возраста нет, надо что-то сделать чтобы был)
//          ???????????????????????
//          ??????????????????????

        ClientService clientService = new ClientService();

        //Prepared statement example :

        //CREATE function(SAVE) ex. :
//        Clients clients1 = new Clients();
//        clients1.setName("Aleksey");
//        clients1.setEmail("aleksey@mail.ua");
//        clients1.setPhone(+12345678);
//        clients1.setAbout("aleksey");
//        clientService.save(clients1);

        //UPDATE function (UPDATE) ex. :
//        Clients clients3 = new Clients();
//        clients3.setName("Aleksey");
//        clients3.setEmail("aleksey@mail.ua");
//        clients3.setPhone(380111881);
//        clients3.setAbout("old aleksey");
//        clients3.setId(15);
//        clientService.update(clients3);

        //DELETE function(DELETE) ex. :
//        Clients clients2 = new Clients();
//        clients2.setId(14);
//        clientService.delete(clients2);

        //Statement example :
        //READ function(READ) ex. :
//        List<Clients> clients = clientService.ReadAll();
//        clients.forEach(System.out::println);

        // READ function (READ) by phone ex. :
        Clients clients4 = new Clients();
        clients4.setPhone(380959651);
        List<Clients> clientsListByPhone = clientService.readByPhone(clients4);
        clientsListByPhone.forEach(System.out::println);

//        List<Clients> readClientsAccounts = clientService.readClientsAccounts();
//        readClientsAccounts.forEach(System.out::println);


//        The same for Accounts example :
//        AccountService accountService = new AccountService();
//        Accounts accounts = new Accounts();
//        accounts.setValue(1000);
//        List<Accounts> accountsNumber = accountService.getNumberOfValue(accounts);
//        accountsNumber.forEach(System.out::println);

//
//        System.out.println();
//        Last added SQL connected service example :
//        StatusService statusService = new StatusService();
//        List<Statuses> statuses = statusService.ReadAll();
//        statuses.forEach(System.out::println);


    }
}
