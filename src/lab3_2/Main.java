package lab3_2;
//1. Створити три класи в межах одного пакету (наприклад: class One, class Two, class Three).
//Створення класів реалізується з допомогою меню File/New/Class в середовищі розробки IntellijIdea/Eclipse.
//При створенні класів не потрібно проводити автоматичне генерування main()-методу.
//2. В кожному із створених класів оголосити по три змінні екземплярів класу із довільним типом даних
//без їх ініціалізації. Приклади оголошення змінних екземпля-рів класу наведено в методичній розробці, а також в лекції.
//3. В кожному із трьох класів написати або згенерувати конструктор для спрощення процедури
//ініціалізації усіх змінних екземплярів класу.
//4. В кожному із попередньо створених класів (наприклад: class One, class Two, class Three) написати:
//        4.1. void-метод з довільною логікою, який в процесі свого виконання використовуватиме
//значення змінних екземпляра класу;135880
//4.2. Типізований метод (рекомендовано double або int) з довільною ло-гікою, який в процесі
//свого виконання використовуватиме значення змінних екземпляра класу;
//4.3. Обов’язкова умова: в одному із написаних класів створити метод, що приймає в якості
//параметру екземпляр іншого класу.
//        5. В головному класі з main()-методом (4-й клас) до кожного екземпляра класу
//викликати відповідні (усі написані в класі) методи на виконання.

class One {
    int a;
    double b;
    String c;

    public One(int a, double b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void display() {
        System.out.println("One: " + a + ", " + b + ", " + c);
    }

    double multiply() {
        return a * b;
    }
}

class Two {
    int x;
    int y;
    String z;

    public Two(int x, int y, String z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void show() {
        System.out.println("Two: " + x + ", " + y + ", " + z);
    }

    int sum() {
        return x + y;
    }
}

class Three {
    double p;
    double q;
    String r;

    public Three(double p, double q, String r) {
        this.p = p;
        this.q = q;
        this.r = r;
    }

    void printInfo() {
        System.out.println("Three: " + p + ", " + q + ", " + r);
    }

    void processTwo(Two obj) {
        System.out.println("Processing Two: " + obj.sum());
    }
}

public class Main {
    public static void main(String[] args) {
        One obj1 = new One(5, 3.5, "Chocolate");
        Two obj2 = new Two(10, 20, "Ice cream");
        Three obj3 = new Three(2.5, 4.5, "Cookie");

        obj1.display();
        System.out.println("Multiply result: " + obj1.multiply());

        obj2.show();
        System.out.println("Sum result: " + obj2.sum());

        obj3.printInfo();
        obj3.processTwo(obj2);
    }
}
