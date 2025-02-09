package lab3_1;

//  1. Створити три класи в межах одного пакету (Package) (наприклад: class One, class Two, class Three).
//    Створення класів реалізується з допомогою меню File/New/Class в середовищі розробки IntellijIdea/Eclipse.
//    При створенні класів не по-трібно проводити автоматичне генерування main()-методу.
//  2. В кожному із створених класів оголосити по три змінні екземплярів класу із довільним типом даних без
//    їх ініціалізації (рекомендовано використовувати типи double або int). Приклади оголошення змінних
//    екземплярів класу наведено в мето-дичній розробці, а також в лекції.
//  3. В кожному із трьох класів написати або згенерувати конструктор для спро-щення процедури ініціалізації
//    усіх змінних екземплярів класу.
//  4. Створити головний клас із main()-методом (4-й клас). В головному класі в межах main()-методу створити
//    екземпляри (об’єкти) оголошених раніше класів (class One, class Two, class Three) з довільними іменами
//    та довільною ініціаліза-цією змінних. Приклади створення екземплярів класу наведено в методичній розроб-ці,
//    а також в лекції.

class One {
    int a;
    double b;
    int c;

    public One(int a, double b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

class Two {
    int x;
    int y;
    double z;

    public Two(int x, int y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

class Three {
    double p;
    double q;
    int r;

    public Three(double p, double q, int r) {
        this.p = p;
        this.q = q;
        this.r = r;
    }
}

public class Main {
    public static void main(String[] args) {
        One obj1 = new One(5, 3.5, 10);
        Two obj2 = new Two(10, 20, 4.7);
        Three obj3 = new Three(2.5, 4.5, 30);

        System.out.println("One: " + obj1.a + ", " + obj1.b + ", " + obj1.c);
        System.out.println("Two: " + obj2.x + ", " + obj2.y + ", " + obj2.z);
        System.out.println("Three: " + obj3.p + ", " + obj3.q + ", " + obj3.r);
    }
}
