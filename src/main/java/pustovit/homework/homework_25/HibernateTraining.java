package pustovit.homework.homework_25;

import pustovit.homework.homework_25.model.Account;
import pustovit.homework.homework_25.model.Client;
import pustovit.homework.homework_25.service.AccountService;
import pustovit.homework.homework_25.service.ClientService;

import java.util.List;

public class HibernateTraining {
    public static void main(String[] args) {

        final Client client = new Client();
        ClientService clientService = new ClientService();
        Account account = new Account();
        AccountService accountService = new AccountService();

//        SAVE(INSERT) example Hibernate:
//        client.setName("Evgeniy");
//        client.setEmail("evgeniy322@mail.ua");
//        client.setPhone(38055778);
//        client.setAbout("just DJ Evgeniy");
//        clientService.save(client);

//        Update example Hibernate:
//        client.setId(16);
//        client.setName("Jenya");
//        client.setEmail("jenya@mail.ua");
//        client.setPhone(380551778);
//        client.setAbout("DJ Jenya");
//        clientService.update(client);

//       Delete example Hibernate:
//        client.setId(17);
//        clientService.delete(client);

//        Get by ID method :
//       Client clientServiceById = clientService.getById(1);
//        System.out.println(clientServiceById);

//        Get by PHONE method :
//        Client clientServiceByPhone = clientService.getByPhone(380941226);
//        System.out.println(clientServiceByPhone);

//        Get ALL CLIENTS method :
        List<Client> allClients = clientService.getAll();
        System.out.println(allClients);


    }
}
