package pustovit.homework.homework_31.exception;

import java.io.IOException;

public class WrongEmailException extends IOException {
    public WrongEmailException(final String message) {
        super(message);
    }
}
