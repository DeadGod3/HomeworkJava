package pustovit.homework.homework_16;

import java.util.List;
import java.util.Map;
//import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class WhatIsNewInJavaVersions {
    public static void main(String[] args) {
//        Java 9 updates
        List<String> stringList = List.of("1", "2", "3", "4", "5");
        System.out.println(stringList);
        Set<String> stringSet = Set.of("1", "2", "3"); //set (no duplicates)
        System.out.println(stringSet);
        Map<String, Integer> stringMap = Map.of("1", 1, "2", 2, "3", 3);
        System.out.println(stringMap);
//        Java 9 (Элвис оператор):

//        String elvis = "elvis";
//        final String checkedElvis = Objects.requireNonNullElse(elvis, "default elvis");
//        System.out.println(checkedElvis);

//        Java 10 updates
//        int intValue = 1;
//        var intValue = 1; вар сразу подставляет примитив присваемоего значения
//          String string = "String";
//          var string = "String";

//       Java 11 update -> var - для лямбда параметров: (var a) -> a++;

        final Function<String, String> stringStringFunction = (var) -> var.concat("prefix");
        System.out.println("lesson19".repeat(10));
        final Optional<String> optional = "optionalString".describeConstable();
        System.out.println(stringStringFunction);
        System.out.println(optional);

//        Java 12 update
//        switch-case new:
//        switch (str) { case "one" -> System.out.println(str);}
//        чистильщик научился изменять размер хип памяти, если не используется

//        Example \/
//        String variable = "one";
//        switch (variable) {
//            case "one" -> System.out.println("case one");
//            case "two" -> System.out.println("case two");
//        }

//        Java 13 update

//        switch with yield:
//        String result = switch (str) {case 1: yield "one";};
//        String result = switch (str) {case 1 -> "one";};

//        text blocks(preview до v15):
//        String result = """example""";

        int digit = 1;
        String result = switch (digit) {
            case 1:
                yield "one";
            case 2:
                yield "two";
            default:
                throw new IllegalStateException("Unexpected value: " + digit);
        };
        System.out.println(result);

//      Текстовые блоки ....
        String text = """
                text block
                next line
                """;
        System.out.println(text);

//        Java 14 update
//        Records (preview до v16) - замена класса-сущности:
//        public record Person(String name, int age) { }

//        text blocks расширили

//        instanceof (preview до 15):
//        if (object instanceof Person person) {}

        final Record connectionPool = new Record("connection pool", 10);
        System.out.println(connectionPool);

//        Java 15 update
//        sealed классы/интерфейсы (preview до 17):  Силд класс это закрытый класс но разрешает 1 наследника.
//        public sealed class Human permits Woman { }
//        public non-sealed class Woman extends Human { }
//        public class Police extends Woman { }

//        Java 16 и 17 (LTS) update LTS - будет обновлятся и поддерживатся до 2028 +-

//        Все что было в превью заработало.








    }
}
