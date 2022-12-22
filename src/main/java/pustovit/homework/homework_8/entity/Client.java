package pustovit.homework.homework_8.entity;

public class Client {
    public static String clientId;
    public static String surname;
    public static String clientAccId;
    public static float sum;

    public static String getClientId() {
        return clientId;
    }

    public static String getSurname() {
        return surname;
    }

    public static String getClientAccId() {
        return clientAccId;
    }

    public static float getSum() {
        return sum;
    }

    public static void setClientId(String clientId) {
        Client.clientId = clientId;
    }

    public static void setSurname(String surname) {
        Client.surname = surname;
    }

    public static void setClientAccId(String clientAccId) {
        Client.clientAccId = clientAccId;
    }

    public static void setSum(float sum) {
        Client.sum = sum;
    }
}
