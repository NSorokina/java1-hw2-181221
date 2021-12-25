package com.geekbrains;

public class Main {
    public static void main(String[] args) {
        System.out.println(inInterval(4, 8));
        printIsPositive(5);
        System.out.println(isNegative(10));
        printWord("Hello!!!", 3);

    }

    /*  1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
      в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/

    public static boolean inInterval (int a, int b){
        return  a+b>10 && a+b<20;
    }
     /* 2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать
        в консоль, положительное ли число передали или отрицательное.
        Замечание: ноль считаем положительным числом.*/

    public static void printIsPositive (int n){
        if(n>=0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отрицательное");
        }

    }

    /* 3. Написать метод, которому в качестве параметра передается целое число.
     Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.*/
    public static boolean isNegative (int n){
        return n<0;
    }


    /*4. Написать метод, которому в качестве аргументов передается строка и число,
            метод должен отпечатать в консоль указанную строку, указанное количество раз;*/
    public static void printWord (String word, int count){
        for (int i=0; i<count; i++){
            System.out.println(word);
        }
    }
}
