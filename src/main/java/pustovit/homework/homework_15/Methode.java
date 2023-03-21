package pustovit.homework.homework_15;

public class Methode {
    public int checkIntAndConvertToString(final String string) {
        if (string.length() == 1){
            return Integer.parseInt (string);

        }
        throw new RuntimeException("integer is < 0");
    }

}
