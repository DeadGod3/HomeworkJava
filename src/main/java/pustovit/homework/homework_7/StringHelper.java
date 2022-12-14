package pustovit.homework.homework_7;

import java.util.Arrays;

public class StringHelper {

    public static String stringMethode(String string, char[] array) {
        String chars = new String(array);

        if (array.length > 0) {
            new String(array);
        } else {
            System.out.println("Your char array = null");
            System.exit(0);
        }
        if (string.isEmpty()) {
            System.out.println("Your string is = null");
            System.exit(0);
            if (chars == null) {
                System.out.println("Your string array = null");

            }
        }
        String stringM = string.toUpperCase().trim().concat(" ").concat(chars.toLowerCase().trim());
        System.out.println(stringM);
        return stringM;
    }


}





