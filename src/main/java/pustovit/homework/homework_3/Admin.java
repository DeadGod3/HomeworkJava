package pustovit.homework.homework_3;

public class Admin extends Support {

    public Admin(String name, String surname, String email, String password, boolean sex, String country) {
        super(name, surname, email, password, sex, country);
    }

    public void deleteFile(boolean booleanValue) {
        if (booleanValue) {
            verse = null;
            System.out.println("Константа была удалена");
//            Path file = Paths.get(FilePath.FILE_PATH.getFilePath());
//            Files.deleteIfExists(file);
//            System.out.println("Файл был удален");
        } else System.out.println("Константа не была удален");
    }
}
