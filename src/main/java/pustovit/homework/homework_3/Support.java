package pustovit.homework.homework_3;

public class Support extends User {
    protected static String verse = "Хокку \nПодобен лучу самурайский клинок \nИ тот затупился \nПроклятая килька в томате!!";

    public Support(String name, String surname, String email, String password, boolean sex, String country) {
        super(name, surname, email, password, sex, country);
    }

    public boolean checkString(String inputText) {
        boolean value = false;
        try {
            if (verse.contains(inputText)) {
                value = true;
            }
        } catch (NullPointerException e) {
            System.out.println("Обработка ошибки: " + e);
        }
        return value;
    }

//    public boolean checkString(String text) throws Exception {
//        writeToFile();
//        boolean value = false;
//        FileReader fileReader = new FileReader(FilePath.FILE_PATH.getFilePath());
//        Scanner scan = new Scanner(fileReader);
//        while (scan.hasNextLine()) {
//            if (scan.nextLine().contains(text)) {
//                value = true;
//                System.out.println("Фаил содержит переданную строку : " + text);
//                break;
//            }
//        }
//        if (!value) {
//            System.out.println("Фаил не содержит переданную строку :" + text);
//        }
//        fileReader.close();
//        return value;
//    }
//
//    private void writeToFile() throws Exception {
//        FileWriter fileWriter = new FileWriter(FilePath.FILE_PATH.getFilePath(), false);
//        fileWriter.write(verse);
//        fileWriter.close();
//        System.out.println("Стих добавлен в файл");
//    }
}
