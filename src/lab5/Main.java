package lab5;
//1. Основи наслідування (Animal – Dog, Cat)
//Завдання: Створити ієрархію класів для тварин.
//Створити базовий клас Animal
//Оголосити змінну name (тип String) для імені тварини
//        Створити конструктор, який приймає name
//Додати метод makeSound(), який виводить "Some sound"
//Створити підкласи Dog і Cat, які успадковують Animal та перевизначають метод makeSound().
//запустити все у main()-методі та переглянути результат.

class Animal{
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Sound grgr");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof woof ");

    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: meow meow ");

    }
}

//2. Використання super та наслідування (Vehicle – Car)
//Завдання: Створити клас Vehicle (транспорт) і клас Car, який успадковує Vehicle.
//Створити клас Vehicle з полем brand (тип String)
//        Створити конструктор, який приймає brand
//Додати метод displayInfo(), який виводить "Vehicle brand: [brand]"
//Створити клас Car, який успадковує Vehicle
//запустити все у main()-методі та переглянути результат.
class Vehicle{
    String brand;
    Vehicle(String brand){
        this.brand = brand;
    }

    public void displayInfo(){
        System.out.println("Vehicle brand: " + brand);
    }
}

class Car extends Vehicle{
    Car(String brand){
        super(brand);
    }
}

//3. Використання toString(), equals(), hashCode() (Person)
//Завдання: Створити клас Person, який містить методи toString(), equals(), hashCode().
//Створити клас Person з полями name і age
//Перевизначити метод toString()
//Реалізувати equals() і hashCode() для порівняння об'єктів
//запустити все у main()-методі та переглянути результат.

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}

//4. Абстрактний клас Shape (Circle, Rectangle)
//Завдання: Створити абстрактний клас Shape з методом calculateArea().
//Оголосити метод calculateArea() без реалізації
//Створити класи Circle і Rectangle, які успадковують Shape
//запустити все у main()-методі та переглянути результат.
abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea(){
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape{
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea(){
        return width * height;
    }
}

//5. Інтерфейси (Movable – Car, Bike)
//Завдання: Створити інтерфейс Movable та реалізувати його в Car і Bike.
//Створити інтерфейс Movable з методом move()
//Реалізувати move() в класах Car і Bike
//запустити все у main()-методі та переглянути результат.
interface Movable {
    void move();
}

class Car1 implements Movable {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
class Bike implements Movable {
    @Override
    public void move() {
        System.out.println("Bike is moving");
    }
}
//6. Продовжити виконання попередньої практичної роботи. Зокрема, у створених класах:
//реалізувати наслідування. Свторити батьківський/дочірній клас та перевизначити методи бальківського класу в дочірньому
//        (клас може бути абстрактний);
//створити мінімум два інтерфейси, де прописати контракт (метод(и)), який
//мають реалізовувати класи, які імплементовують інтерфейси.
//запустити все у main()-методі та переглянути результат.
// Абстрактний базовий клас для спільних властивостей і методів
abstract class Base {
    String name;

    Base(String name) {
        this.name = name;
    }

    abstract void showInfo();
    abstract void uniqueMethod();
    static void sum(int a, int b) {
        System.out.println("Base.sum(): " + (a + b));
    }
}

interface Sumable {
    double sum(double value);
}

interface Displayable {
    void display();
}

class One extends Base implements Sumable, Displayable {
    private int a;
    private double b;

    One(int a, double b, String name) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    void showInfo() {
        System.out.println("One: " + a + ", " + b + ", " + name);
    }

    @Override
    public void display() {
        System.out.println("Displaying One: " + name);
    }

    @Override
    public double sum(double value) {
        return a + b + value;
    }

    @Override
    void uniqueMethod() {
        System.out.println("Unique method in One");
    }
}

class Two extends Base implements Sumable, Displayable {
    private int x, y;

    Two(int x, int y, String name) {
        super(name);
        this.x = x;
        this.y = y;
    }

    @Override
    void showInfo() {
        System.out.println("Two: " + x + ", " + y + ", " + name);
    }

    @Override
    public double sum(double value) {
        return x + y + value;
    }

    @Override
    public void display() {
        System.out.println("Displaying One: " + name);
    }

    @Override
    void uniqueMethod() {
        System.out.println("Unique method in Two");
    }
}

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog("Vovchik");
        Cat cat = new Cat("Barsik");
        dog.makeSound();
        cat.makeSound();

        Vehicle vehicle = new Car("Porshe 911");
        vehicle.displayInfo();

        Person person1 = new Person("Muhammad", 100);
        Person person2 = new Person("Aljyr", 4);

        System.out.println(person1.toString());
        System.out.println(person1.hashCode());
        System.out.println(person1.equals(person2));

        Rectangle biba = new Rectangle(50, 73);
        Circle boba = new Circle(23 );
        System.out.println(biba.calculateArea());
        System.out.println(boba.calculateArea());

        Car1 car = new Car1();
        car.move();
        Car1 bike = new Car1();
        bike.move();

        One obj1 = new One(5, 3.5, "Chocolate");
        Two obj2 = new Two(10, 20, "Ice cream");

        obj1.showInfo();
        obj2.showInfo();

        obj1.uniqueMethod();
        obj2.uniqueMethod();

        obj1.display();
        obj2.display();

        Base.sum(1, 1);
        System.out.println("Sum for One: " + obj1.sum(2.5));
        System.out.println("Sum for Two: " + obj2.sum(2.5));
    }
}
