package pustovit.homework.homework_8.util;

import pustovit.homework.homework_8.entity.Client;
import pustovit.homework.homework_8.exception.ExceptionsService;

import java.io.IOException;
import java.util.Objects;

public class Helper extends Client {


    public static void accountIdCheck(String accIdCheck) throws IOException {
        if (accIdCheck.length() != 10){
            ExceptionsService.WrongFieldException();
        }

    }
    public static void sumCheck(float sum) throws Exception {
        if (sum > 1000){
            ExceptionsService.WrongSumException();
        }
    }

    public static void whoGets(String senderClientId, String getterClientId){
        if (!Objects.equals(senderClientId, getterClientId)){
            ExceptionsService.UserExpectedError();
        }
    }

}
