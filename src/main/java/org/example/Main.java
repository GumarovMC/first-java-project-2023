package org.example;

public class Main {
    public static void main(String[] args) {
        // примитивные типы данных
        int a = 6;
        long e = 3_000_000_000l;
        float d = 1.2f;
        double c = 1.1;
        boolean bool = true;
        char b = 'a';
        String line = "Число: ";

//        System.out.println(1 + 1 + " - сумма" + 2 + 2);
        // && & - И
        // || | - ИЛИ
//        if ((a > 5) && (c > 0)) {
//            // если условия true
//            System.out.println("a > 5");
//        } else {
//            // если условия false
//            System.out.println("a <= 5");
//        }
//        (инциализируем локальные переменные; условия остановки
//        ;инкремент)
//        for (int i = 0; i < 10; i++){
//            System.out.print(i);
//        }
//        int i = 100;
//        while (i > 50) {
//            if (i % 2 == 0) {
//                System.out.print(i);
//            }
//            i--;
//        }

//        System.out.println(calculate(5, 5));
//        printAll(5, 5, 10f);
        int prefixIndex = 0;
        int postfixIndex = 0;
        while (prefixIndex<10){
            System.out.println(++prefixIndex);
            System.out.println(postfixIndex++);
            System.out.println("=========");
        }
    }

    // void - если метод ничего не возвращает
    public static int calculate(int a, int b) {
        int c = (a + b) / 5;
        return c;
    }

    public static void printAll(int a, int b, double c) {
        System.out.println("a : " + a + " b: " + b + " c: " + c);
    }
}