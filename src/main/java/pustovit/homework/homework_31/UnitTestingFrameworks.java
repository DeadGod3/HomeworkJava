package pustovit.homework.homework_31;

import pustovit.homework.homework_31.exception.WrongEmailException;
import pustovit.homework.homework_31.service.EmailService;

public class UnitTestingFrameworks {
    public static void main(String[] args) throws WrongEmailException {
        EmailService emailService = new EmailService();

        System.out.println(emailService.validate("ihor"));
        System.out.println(emailService.validate("ihor@gmail.com"));


    }
}
