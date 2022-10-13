package pustovit.homework.homework_3;

public class Main {
    public static void main(String[] args) {
        CreateUserModel createUserModel = new CreateUserModel();
        UserService userService = new UserService();

        final User user = createUserModel.createDefaultUser();
        final Support support = createUserModel.createDefaultSupport();
        final Admin admin = createUserModel.createDefaultAdmin();

        userService.actionWithUser(user);
        userService.actionWithUser(support);
        userService.actionWithUser(admin);
    }

}
