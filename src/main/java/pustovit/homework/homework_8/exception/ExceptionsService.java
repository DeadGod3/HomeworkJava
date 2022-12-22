package pustovit.homework.homework_8.exception;

import java.io.IOException;

public class ExceptionsService {

    public static void UserExpectedError(){
        throw new NullPointerException();
    }

    public static void WrongFieldException() throws IOException {
        throw new IOException();
    }

    public static void WrongSumException() throws Exception {
        throw new Exception();
    }

}
