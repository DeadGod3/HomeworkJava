package pustovit.homework.homework_3;

public class CreateUserModel {
    public User createDefaultUser() {
        return new User("Ihor", "Pustovit", "ihor@gmail.com", "12324", true, "Uk");
    }

    public Support createDefaultSupport() {
        return new Support("Oleksandr", "Shevchenko", "sergey@meil.ru", "12324", true, "Uk");
    }

    public Admin createDefaultAdmin() {
        return new Admin("Admin", "Admin", "admin@gmail.com", "12324", false, "Uk");
    }
}
