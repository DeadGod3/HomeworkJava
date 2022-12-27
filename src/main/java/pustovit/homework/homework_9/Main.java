package pustovit.homework.homework_9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        write();
        read();
        System.out.println();
        login();

    }

    private static void write() throws IOException {
        final String path = createFolder();
        try (final FileWriter fileWriter = new FileWriter(path)) {
            fileWriter.write("Autumn is yellow,\nWinter is white,\nSpring is green, \nSummer is bright!");
            System.out.println("File with text was created successfully in resources/folder.");
        } catch (IOException e) {
            System.err.println("Error with FileWriter");
        }

    }

    private static String createFolder() throws IOException {
        final String path = "src/main/resources/folder/file-quatrain.txt";
        final Path pathToFile = Paths.get(path);
        if (!Files.exists(pathToFile.getParent())) {
            Files.createDirectories(pathToFile.getParent());
        }
        return path;
    }

    private static void read() throws IOException {
        try (final FileReader fileReader = new FileReader("src/main/resources/folder/file-quatrain.txt");
             final Scanner scanner = new Scanner(fileReader)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }

    }


    private static void registration() {
        String login;
        String password;
        try (final FileWriter fileWriter = new FileWriter("src/main/resources/folder/user.txt")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, put your login :");
            login = scanner.next();
            System.out.println("Put you password :");
            password = scanner.next();
            System.out.println("Type your password again :");
            if (password.equals(scanner.next())) {
                fileWriter.write(login + "\n");
                fileWriter.write(password);
            } else {
                System.out.println("Your password is incorrect, try again later");
                System.exit(0);
            }
        } catch (IOException exception) {
            System.err.println("Error with FileWriter");
        }

    }

    private static void login() {
        Scanner sc = new Scanner(System.in);
        registration();
        String login;
        String password;
        System.out.println();
        System.out.println("Please, put your login :");
        login = sc.next();
        System.out.println("Put you password :");
        password = sc.next();
        try (final FileReader fileReader = new FileReader("src/main/resources/folder/user.txt")) {
            Scanner scanner = new Scanner(fileReader);
            if (scanner.hasNext(login) && scanner.hasNext(password)) {
                System.out.println("Greetings , user.");
                scanner.close();
            } else {
                for (int i = 0; i < 4; i++) {
                    if (!(scanner.hasNext(login) && scanner.hasNext(password))) {
                        i--;
                        System.out.println("Try again (3 attempts left: ");
                    } else if (!(scanner.hasNext(login) && scanner.hasNext(password))) {
                        i--;
                        System.out.println("Try again (2 attempts left: ");
                    } else if (!(scanner.hasNext(login) && scanner.hasNext(password))) {
                        i--;
                        System.out.println("Try again (1 attempt left: ");
                    } else if (!(scanner.hasNext(login) && scanner.hasNext(password))) {
                        i--;
                        System.out.println("Your limit of attempts has ended! Try again later.");
                        System.exit(0);
                        scanner.close();
                    }

                }
            }


        } catch (IOException e) {
            System.err.println("Error with FileWriter");
        }
    }

}
