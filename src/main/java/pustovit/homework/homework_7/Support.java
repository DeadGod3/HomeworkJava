package pustovit.homework.homework_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Support {

    public static void numberCheck(String number) {
        Pattern pattern = Pattern.compile("^((\\+380)([0-9]{9}))$");
        Matcher matcher = pattern.matcher(number);

        if (matcher.matches()) {
            System.out.println("Phone number " + number + " is correct.");
        } else {
            System.out.println("Phone number " + number + " is incorrect.");
        }


    }

    public static void emailCheck(String email) {
        Pattern pattern = Pattern.compile("^((\\w| [-+])+(\\.[\\w-]+)*@[\\w-]+((\\.[\\d\\p{Alpha}]+)*"
                + "(\\.\\p{Alpha}{2,})*)*)$");
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println();
            System.out.println("Your email " + email + " is correct");
        } else {
            System.out.println();
            System.out.println("Your email " + email + " is incorrect");
        }
    }
    public static void dateCheck(String date){
        Pattern pattern = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d");
            Matcher matcher = pattern.matcher(date);
        if (matcher.matches()) {
            System.out.println();
            System.out.println("Your birthday date " + date + " is correct");
        } else {
            System.out.println();
            System.out.println("Your birthday date " + date + " is incorrect");
        }
    }

}
