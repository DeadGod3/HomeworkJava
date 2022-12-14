package pustovit.homework.homework_7;

public class Main {
    public static void main(String[] args) {
        StringHelper stringHelper = new StringHelper();
        String string = "hello every";
        char[] chars = {'H', 'I', 'I', 'I', 'H'};
        StringHelper.stringMethode(string, chars);
        System.out.println();

        Support support = new Support();
        String phoneNumber = "+380671252139";
        String email = "itexample@gmail.com";
        String date = "12.08.2002";
        Support.numberCheck(phoneNumber);
        Support.emailCheck(email);
        Support.dateCheck(date);


    }
}
