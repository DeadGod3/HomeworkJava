package pustovit.homework.homework_31.service;

import pustovit.homework.homework_31.entity.Order;
import pustovit.homework.homework_31.exception.WrongEmailException;

public class OrderService {
    private final EmailService emailService;

    public OrderService(final EmailService emailService) {
        this.emailService = emailService;
    }

    public Order create(final String email, final String name) throws WrongEmailException {
        emailService.validate(email);
        return new Order(1, name, email);
    }

}
