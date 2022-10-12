package pustovit.homework.homework_3;

public class UserService {
    public void actionWithUser(User user) {
        if (user instanceof Admin) {
            user.write();
            ((Admin) user).deleteFile(((Admin) user).checkString(user.getInputText()));
            return;
        }
        if (user instanceof Support) {
            user.write();
            ((Support) user).checkString(user.getInputText());
            return;
        }
        user.write();
    }
}
