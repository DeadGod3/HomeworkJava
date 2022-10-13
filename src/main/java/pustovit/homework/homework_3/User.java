package pustovit.homework.homework_3;

import java.util.Scanner;

public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private boolean sex;
    private String country;
    private String inputText;

    public User(String name, String surname, String email, String password, boolean sex, String country) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.sex = sex;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getInputText() {
        return inputText;
    }

    public void read(String text) {
        System.out.println("Переданное сообщение : " + text);
    }

    public void write() {
        Scanner scanner = new Scanner(System.in);
        this.inputText = scanner.nextLine();
        System.out.println("Введенный текст с клавиатуры: " + inputText);
    }


}
