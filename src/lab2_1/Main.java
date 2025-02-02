package lab2_1;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
//        Завдання 1. Створити програму з двома змінними типу int таким чином, щоб
//        вона виводила у консоль результат їх ділення та залишку від ділення.
        int number1 = 11;
        int number2 = 5;

        float divisionResult = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("Результат ділення: " + divisionResult);
        System.out.println("Залишок від ділення: " + remainder);
    }

    public static void task2() {
//        Завдання 2. Створити програму, яка виводитиме у консоль суму цифр двозначного
//        числа записаного до змінної типу int

        int twoDigitNumber = 33;
        if (twoDigitNumber >= 10 && twoDigitNumber <= 99) {
            int tens = twoDigitNumber / 10;
            int units = twoDigitNumber % 10;
            System.out.println("Сума цифр числа " + twoDigitNumber + ": " + (tens + units));
        } else {
            System.out.println("Значення повинно бути двозначним числом.");
        }
    }

    public static void task3() {
//        Завдання 3. Створити програму, яка виводитиме у консоль округлене число,
//        записане до змінної типу double, до найближчого цілого.

        double numberToRound = 33.6;
        long roundedNumber = Math.round(numberToRound);
        System.out.println("Округлене значення числа " + numberToRound + ": " + roundedNumber);
    }

}

