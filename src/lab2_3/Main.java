package lab2_3;

public class Main {
    public static void main(String[] args){
        task1_for();
        task1_while();
        task1_do_while();
        task2();
        task3();
        task4_for();
        task4_while();
        task5();

    }
//    Завдання 1. Створити програму виводу у консоль усіх значень від 500 до 650 з
//    кроком 10 використовуючи усі оператори циклів for, while та do-while.

    public static void task1_for(){
        System.out.println("TASK 1 CYCLE FOR");
        for (int i = 500; i <=650; i +=10)
            System.out.print(i + " ");
        System.out.println("\n");
    }

    public static void task1_while(){
        System.out.println("TASK 1 CYCLE WHILE");
        int i = 500;
        while(i <= 650){
            System.out.print(i+ " ");
            i += 10;
        }
        System.out.println("\n");
    }

    public static void task1_do_while(){
        System.out.println("TASK 1 CYCLE DO-WHILE");
        int i = 500;
        do {
            System.out.print(i + " ");
            i += 10;
        }
        while (i <= 650);
        System.out.println("\n");
    }

//    Завдання 2. Створити програму виводу у консоль усіх значень менше 5000
//    послідовності 2а-1, за умови що перше значення а=2.

    public static void task2(){
        System.out.println("TASK 2");
        int a = 2;
        do {
            System.out.print(a + " ");
            a = 2*a-1;
        }
        while (a <= 5000);
        System.out.println("\n");
    }
//    Завдання 3. Створити програму виводу у консоль усіх додатних дільників числа
//10 (дільники – цілі числа, які ділять число 10 без залишку).
    public static void task3() {
        System.out.println("TASK 3");
        int a = 10;
        for (int b = 1; b <= a; b++) {
            if (a % b == 0) {
                System.out.print(b + " ");
            }
    }
    System.out.println();
}
//    Завдання 4. Створити циклічну програму визначення факторіалу числа 10
//    використовуючи оператори циклів for та while.
    public static void task4_for(){
        System.out.println("TASK 4 CYCLE FOR");
        int fact = 1;
        for (int i = 1; i <= 10; i++) {
            fact *= i;
        }
        System.out.println("Factorial of 10: " + fact + "\n");
    }

    public static void task4_while(){
        System.out.println("TASK 4 CYCLE WHILE");
        int fact = 1;
        int i = 1;
        while (i <= 10) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial of 10: " + fact + "\n");
    }
//    Завдання 5. Створити циклічну програму підрахунку кількості співпадінь
//    симетричних комбінацій цифр на електронному годиннику (наприклад 03:30).
    public static void task5(){
        System.out.println("TASK 5 ");

        System.out.println("\n");
    }

}
