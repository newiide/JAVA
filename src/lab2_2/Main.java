package lab2_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1(){
        //Завдання 1. Створити програму для здійснення перевірки, чи потрапило задане
        //ціле число (у вигляді змінної n) до проміжку (50; 100) із виводом наступного результату у консоль:
        //«Число 120 не міститься в проміжку (25; 100)», або «Число 60 міститься в проміжку (25; 100)»
        int number = 120;
        if (number > 50 && number < 100) {
            System.out.println("Число " + number + " в діапазоні 50:100 ");}
        else {
            System.out.println("Число " + number + " не в діапазоні 50:100 ");}
    }

    public static void task2(){
        //Завдання 2. Створити програму яка виводитиме у консоль найбільшу цифру
        //заданого (у вигляді змінної n) цілого тризначного числа.
        int n = 193;
        int hundreds = n / 100;
        int tens = (n / 10) % 10;
        int ones = n % 10;
        int maxDigit = Math.max(hundreds, Math.max(tens, ones));

        System.out.println("максимальна цифра: " + maxDigit);
    }

    public static void task3(){
//        Завдання 3 (обов’язково оператор if ). Створити програму, яка відтворюватиме
//        принцип роботи пульта керування ліфтом 9-ти поверхового будинку та здійснюватиме підйом
//        або спуск із виводом результату у консоль «Ви піднялись на 6 поверх»,
//        або «Ви спустились на 1 поверх». Для ускладнення завдання ))) кнопка 2-го поверху
//        не працює! При її натисканні під час підйому ліфт здійснюватиме доставку на 3-й
//        поверх, і навпаки, під час спуску – на 1-й.

        String direction = "До низу";
        int floor = 2;
        if (direction == "До гори") {
            if (floor == 1) {
                System.out.println("Ви піднялись на 1 поверх");
            } else if (floor == 2) {
                System.out.println("Ви піднялись на 3 поверх");
            } else if (floor == 3) {
                System.out.println("Ви піднялись на 3 поверх");
            } else if (floor == 4) {
                System.out.println("Ви піднялись на 4 поверх");
            } else if (floor == 5) {
                System.out.println("Ви піднялись на 5 поверх");
            } else if (floor == 6) {
                System.out.println("Ви піднялись на 6 поверх");
            } else if (floor == 7) {
                System.out.println("Ви піднялись на 7 поверх");
            } else if (floor == 8) {
                System.out.println("Ви піднялись на 8 поверх");
            } else if (floor == 9) {
                System.out.println("Ви піднялись на 9 поверх");
            } else {
                System.out.println("Ви вибрали неіснуючий поверх");
            }
        } else {
            if (floor == 1) {
                System.out.println("Ви спустилися на 1 поверх");
            } else if (floor == 2) {
                System.out.println("Ви спустилися на 1 поверх");
            } else if (floor == 3) {
                System.out.println("Ви спустилися на 3 поверх");
            } else if (floor == 4) {
                System.out.println("Ви спустилися на 4 поверх");
            } else if (floor == 5) {
                System.out.println("Ви спустилися на 5 поверх");
            } else if (floor == 6) {
                System.out.println("Ви спустилися на 6 поверх");
            } else if (floor == 7) {
                System.out.println("Ви спустилися на 7 поверх");
            } else if (floor == 8) {
                System.out.println("Ви спустилися на 8 поверх");
            } else if (floor == 9) {
                System.out.println("Ви спустилися на 9 поверх");
            } else {
                System.out.println("Ви вибрали неіснуючий поверх");
            }
        }
    }

    public static void task4(){
        Scanner scanner = new Scanner(System.in);
//        Завдання 4 (обов’язково оператор Switch ). З використання оператора вибору
//        Switch створити умовне контекстне меню з двома опціями: «Погодитись» та «Відмовитись».
//        Опція «Погодитись» має спрацьовувати із подальшим виведенням у консоль
//        стрічки «Я погоджуюсь!» при таких значеннях case: Так, ОК, Yes, Y, +, Ok. Опція
//        «Відмовитись» має спрацьовувати із подальшим виведенням у консоль стрічки «Я
//        відмовляють!» при таких значеннях case: Ні, NO, N, -, No.
        System.out.print("Введіть свій вибір: Так, ОК, Yes, Y, + або Ні, NO, N, - : ");
        String input = scanner.nextLine().toLowerCase();

        switch (input) {
            case "так":
            case "ок":
            case "yes":
            case "y":
            case "+":
            case "ok":
                System.out.println("Я погоджуюсь");
                break;

            case "ні":
            case "no":
            case "n":
            case "-":
                System.out.println("Я відмовляюся");
                break;

        }
    }

    public static void task5(){
//        Завдання 5* (не обов’язкове, проте дуже корисне).
//        Оголосити та ініціалізувати три не рівних між собою цілочисельні змінні. Створити програму для сортування
//        заданих чисел в порядку зростання.
        int a = 5, b = 2, c = 8;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println(a + ", " + b + ", " + c);
    }
}





