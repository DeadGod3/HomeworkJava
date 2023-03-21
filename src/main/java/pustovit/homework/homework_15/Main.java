package pustovit.homework.homework_15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<String> stringList = List.of("1", "2", "3", "4", "5");
//        Set<Integer> hashOp = new HashSet<>();
//        hashOp.add(1);
//        hashOp.add(2);
//        hashOp.add(3);
//        hashOp.add(4);
//        hashOp.add(5);

        Stream<String> stringStream = stringList.stream();

        Stream<String> stringStream1 = stringStream
                .distinct()
                .skip(1);

//        final Optional<String> first = stringStream1.findFirst();
//        System.out.println("first.get(): " + first.get());

        final List<String> collect = stringStream1.toList();
        System.out.println(collect);

//        final Map<Object, Object> map = new HashMap<>();
//        map.put(stringList, hashSet);


        final IntStream stringStream2 = stringList.stream()
                .mapToInt(Integer::valueOf);

        final int[] collect2 = stringStream2.toArray();
        System.out.println(Arrays.toString(collect2));
        Methode methode = new Methode();


        List<String> stringList10 = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        List<Integer> integerStream = stringList10.stream()
                .skip(1)
                .limit(8)
                .map(methode::checkIntAndConvertToString)
                .filter(e -> e % 2 == 0)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("\nStream" + Arrays.toString(integerStream.toArray()) + "" + "\n");

//                .collect(Collectors.Arrays.toString(integerStream.toArray())); не знаю как собрать стрим в коллекцию


        Stream<String> stream = Stream.of("fir", "second", "1");

        Stream<String> parallelStream = stream.parallel()
                .sorted()
                .filter(e -> e.length() > 3);

        final Optional<String> first = parallelStream.findFirst();
        System.out.println("first.get(): " + first.get());


        final LocalTime localTime = LocalTime.now();
        final LocalDate localDate = LocalDate.now();
        final LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(localDateTime);


//        Создать поток, в котором показать применения всех 4х возможных вызовов Ссылочных методов.
//        На свое усмотрение, но должны быть примеры вызовов всех методов в одном потоке.
//        Можно создавать свои классы и методы для примера вызова, можно использовать представленные уже в Java
//        ??????

    }
}
