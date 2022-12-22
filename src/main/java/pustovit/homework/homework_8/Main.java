package pustovit.homework.homework_8;

//import pustovit.homework.homework_8.entity.Client;
//import pustovit.homework.homework_8.service.TransactionService;
import pustovit.homework.homework_8.util.Helper;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        TransactionService transactionService = new TransactionService();
        Scanner scanner = new Scanner(System.in);
//        Client client1 = new Client();

        boolean flag = false;
        while (!flag) {
            System.out.print("Please enter your account Id : ");
            String accountCheck = scanner.next();
            try {
                Helper.accountIdCheck(accountCheck);
                flag = true;
            } catch (IOException e) {
                System.out.println("Wrong input, try again, it should be length = 10 !");
            }
        }
        System.out.println("Correct input.");

        boolean flag3 = false;
        while (!flag3) {
            System.out.print("Please enter your sender account Id : ");
            String accountCheck = scanner.next();
            try {
                Helper.accountIdCheck(accountCheck);
                flag3 = true;
            } catch (IOException e) {
                System.out.println("Wrong input, try again, it should be length = 10 !");
            }
        }

        boolean flag1 = false;
        while (!flag1) {
            System.out.print("Please enter your sum : ");
            float accountCheckSend = scanner.nextInt();
            try {
                Helper.sumCheck(accountCheckSend);
                flag1 = true;
            } catch (Exception e) {
                System.out.println("Wrong input, try again, it should be less than 1000");
            }
        }
        System.out.println("Correct input.");


//        transactionService.moneyTransaction(client1, );


    }
}




