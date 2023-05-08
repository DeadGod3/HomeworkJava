package pustovit.homework.homework_31.service;

import pustovit.homework.homework_31.exception.WrongEmailException;

public class EmailService {
    public boolean validate(final String email) throws WrongEmailException {
        if (email == null || email.isBlank()) {
            throw new WrongEmailException("email is null or empty");
        }
        return email.contains("@");
    }

    public String format(final String string) {
        return null;
    }
}
