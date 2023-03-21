package pustovit.homework.homework_13.classes;

import java.util.Objects;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassHelper {
    public Optional<Object> optional(final String string) {
        if (string == null | Objects.equals(string, "")) {
            System.out.println(Optional.empty() + " = " + true);
            return Optional.empty();


        } else {
            System.out.println("String is not null or empty");
        }
        Pattern pattern = Pattern.compile("^((\\w| [-+])+(\\.[\\w-]+)*@[\\w-]+((\\.[\\d\\p{Alpha}]+)*(\\.\\p{Alpha}{2,})*)*)$");
        Matcher matcher = pattern.matcher(string);
        if (matcher.matches()) {
            System.out.println(Optional.of(string));
            return Optional.of(string);
        } else {
            System.out.println("U put wrong value");
            return Optional.empty();
        }

    }

}
