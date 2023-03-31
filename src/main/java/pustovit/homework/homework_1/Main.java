package pustovit.homework.homework_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte byteValue = 1;
        short shortValue = 2;
        long longValue = 4;
        float piNumber = 3.14f;
        char dotChar = '.';
        boolean check = true;
        String name = "Ihor";
        String surname =  new String("Pustovit");

        int intA = 10, intB = 20, intC = 30;
        double doubleA = 11.1, doubleB = 12.2 , doubleC = 13.3;


        System.out.println("My name is " + name + ", and my surname is " + surname + " " + check + dotChar);
        System.out.println();
        int integerSum1 = byteValue - shortValue;
        int integerSum2 = (int) (longValue / shortValue);
        int integerSum3 = intA * intB;
        int integerSum4 = intC % intB;
        int integerSum5 = intC + intA;
        double frictionalSum1 = (doubleA * doubleC);
        double frictionalSum2 = (doubleB + intC);
        double frictionalSum3 = piNumber - shortValue;
        double frictionalSum4 = longValue / piNumber;
        double frictionalSum5 = doubleC % doubleA;
        System.out.println("Результаты расчёта целочисленных операций: ");
        System.out.println("первой = " + integerSum1 + ", второй = " + integerSum2
                + ", третьей = " + integerSum3 + ", четвёртой = " + integerSum4 + ", пятой = " + integerSum5);
        System.out.println();
        System.out.println("Результаты расчёта дробных операций: ");
        System.out.println("первой = " + frictionalSum1 + ", второй = " + frictionalSum2
                + ", третьей = " + frictionalSum3 + ", четвёртой = "
                + frictionalSum4 + ", пятой = " + frictionalSum5);
        System.out.println();


        System.out.println("Операторы присвоения : ");
        intA += intB;
        System.out.println(intA);
        doubleA -= doubleC;
        intC *= doubleC;
        System.out.println(intC);
        intB /= doubleA;
        System.out.println(intB);
        intC %= intA;
        doubleB = doubleC;
        intA |= intC;
        System.out.println(intA);
        intA <<= 4;
        intB >>= 2;
        System.out.println(intA);
        System.out.println(doubleA);
        System.out.println(intC);
        System.out.println(doubleB);
        System.out.println(intB);
        System.out.println();


        System.out.println("Логические операции :");
        int a = 6;
        int b = 3;
        int c = 4;
        boolean d = (a > b) && (a > c);
        System.out.println(d);
        a = 4;
        b = 5;
        c = 6;
        boolean j = (a > b) && (a > c);
        System.out.println(j);
        a = 5;
        b = 6;
        c = 7;
        boolean e = (b > a) ^ (c > a);
        System.out.println(e);
        a = 10;
        b = 9;
        boolean h = !(a > b);
        System.out.println(h);
        a = 4;
        b = 6;
        c = 3;
        boolean q = (a > b) || (a > c);
        System.out.println(q);
        System.out.println();


        System.out.println("Задание на инкремент декремент:");
        int variable = 1;
        System.out.println(variable);
        System.out.println(--variable);
        System.out.println(++variable);
        System.out.println(variable);
        System.out.println(variable);
        System.out.println(++variable);
        System.out.println(--variable);
        System.out.println(variable);
        System.out.println();

        System.out.println("Матрица на 10 элементов с 10 примитивами:");
        int[] array;
        array = new int[10];
        array[0] = byteValue;
        array[1] = shortValue;
        array[2] = (int) longValue;
        array[3] = (int) piNumber;
        array[4] = dotChar;
        array[5] = intA;
        array[6] = intB;
        array[7] = intC;
        array[8] = (int) doubleA;
        array[9] = (int) doubleB;
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println();


    }

}
