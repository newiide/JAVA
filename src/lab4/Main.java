package lab4;
//1. В кожному із 3-х існуючих класів програми (крім головного класу) необхід-но:
//        1.1. Перевизначити щонайменше однин метод, що прийматиме в якості пара-метрів дані іншого типу
//із збереженням загальної логіки методу (напри-клад: якщо дочірній метод працює з даними типу int то
//        перевизначений метод має приймати в якості параметра та працювати з даними типу double);
//1.2. Написати один метод з статичним ім’ям та динамічною логікою (назва, тип даних та параметри однакові, зміст різний)
//і перевизначити його таким чи-ном, щоб за умови виклику цього методу до екземплярів різних класів в main()-методі
//результат виконання був унікальним (різним).
//        1.3. Усі модифікатори доступу public перевести у модифікатори по замовчу-ванню (package або без модифікатора);
//1.4. Ісі змінні екземплярів класів (3-х класів) оголосити із модифікаторами дос-тупу private та написати або
//згенерувати до кожної змінної методи get() i set().
//        1.5. Написати метод із довільною логікою, який в якості параметрів або внут-рішніх змінних буде
//використовувати мінімум одну змінну екземплярів інших двох класів (наприклад для метода class Two
//        необхідно використа-ти змінні екземплярів класів class One та class Three тощо.)
//2. В головному класі з main()-методом (4-й клас) викликати по одному новос-твореному методу до
//відповідних екземплярів класів.
//        3. В головному класі з main()-методом (4-й клас) викликати усі перевизначені методи
//до відповідних екземплярів класів.
//        4. В одному із існуючих класів перевизначити конструктор 4-ма довільними
//варіантами таким чином, щоб в main()-методі, при створенні екземплярів цього кла-су,
//користувачеві надавалась можливість обирати 4 варіанти ініціалізації змінних. В головному
//класі з main()-методом ініціалізувати змінні усіма можливими варіантами при створенні екземплярів відповідних класів.

class One {
    private int a;
    private double b;
    private String c;

    One(int a, double b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    One(int a, String c) {
        this(a, 1.0, c);
    }

    One(double b, String c) {
        this(0, b, c);
    }

    One() {
        this(0, 0.0, "Default");
    }

    int getA() {
        return a;
    }
    void setA(int a) {
        this.a = a;
    }
    double getB() {
        return b;
    }
    void setB(double b) {
        this.b = b;
    }
    String getC() {
        return c;
    }
    void setC(String c) {
        this.c = c;
    }

    void display() {
        System.out.println("One: " + a + ", " + b + ", " + c);
    }

    double multiply() { return a * b; }
    double multiply(double value) { return value * b; }

    static void sum(int a, int b) {
        System.out.println("One.sum(): " + (a + b));
    }
}

class Two {
    private int x;
    private int y;
    private String z;

    Two(int x, int y, String z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    int getX() {
        return x;
    }
    void setX(int x) {
        this.x = x;
    }
    int getY() {
        return y;
    }
    void setY(int y) {
        this.y = y;
    }
    String getZ() {
        return z;
    }
    void setZ(String z) {
        this.z = z;
    }

    void show() {
        System.out.println("Two: " + x + ", " + y + ", " + z);
    }

    int sum() { return x + y; }
    double sum(double value) { return x + y + value; }

    void uniqueMethod() {
        System.out.println("Unique method in Two");
    }

    static void sum(double a, double b) {
        System.out.println("Two.sum(): " + (a * b));
    }
}

class Three {
    private double p;
    private double q;
    private String r;

    Three(double p, double q, String r) {
        this.p = p;
        this.q = q;
        this.r = r;
    }

    double getP() {
        return p;
    }
    void setP(double p) {
        this.p = p;
    }
    double getQ() {
        return q;
    }
    void setQ(double q) {
        this.q = q;
    }
    String getR() {
        return r;
    }
    void setR(String r) {
        this.r = r;
    }

    void printInfo() {
        System.out.println("Three: " + p + ", " + q + ", " + r);
    }

    void processTwo(Two obj) {
        System.out.println("Processing Two: " + obj.sum());
    }

    void processOne(One obj) {
        System.out.println("Processing One: " + (obj.getA() + obj.getB()));
    }

    void uniqueMethod() {
        System.out.println("Unique method in Three");
    }

    static void sum(double a, double b) {
        System.out.println("Three.sum(): " + (a - b));
    }
}

public class Main {
    public static void main(String[] args) {
        One obj1 = new One(5, 3.5, "Chocolate");
        Two obj2 = new Two(10, 20, "Ice cream");
        Three obj3 = new Three(2.5, 4.5, "Cookie");

        obj1.display();
        obj2.show();
        obj3.printInfo();

        obj2.uniqueMethod();
        obj3.uniqueMethod();

        One.sum(1, 1);
        Two.sum(1.5, 5.5);
        Three.sum(10, 4);
    }
}



