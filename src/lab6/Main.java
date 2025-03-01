package lab6;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    //Завдання 1. Створити масив непарних чисел від 1 до 99 та вивести його елементи стовпчик. Перед початком створення масиву
//необхідно врахувати якого він буде розміру.
    public static void task1() {
        int[] array = new int[50];
        for (int i = 1, j = 0; i <= 99; i = i + 2, j++) {
            array[j] = i;
        }
        System.out.println("\nTASK 1:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
//Завдання 2. Створити масив з 20 випадкових цілих чисел з відрізку [0; 9] та вивести його у консоль. Замінити кожен елемент з
//непарним індексом на нуль. Оновлений масив також вивести у консоль.
    public static void task2() {
        System.out.println("\nTASK 2:");

        int[] randomNumbers = new int[20];
        for (int i = 0; i < 20; i++) {
            randomNumbers[i] = (int) Math.round(Math.random() * 9);
        }
        System.out.println("old array:");

        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] % 2 != 0) {
                randomNumbers[i] = 0;
            }
        }
        System.out.println("\nnew array:");

        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
    }
//Завдання 3. Створити 3 масиви та наповнити їх 5 випадковими цілочисельними значеннями з відрізку [0; 5]. Вивести масиви у
//консоль в окремих стрічках. Підрахувати середнє арифметичне елементів кожного із поданих масивів та вивеcти повідомлення для
//якого масиву середнє значення є більшим (або значення середніх арифметичних є рівними).
public static void task3() {
    System.out.println("\nTASK 3:");
    System.out.println("\narray1");
    int[] array1 = new int[5];
    for (int i = 0; i < 5; i++) {
        array1[i] = (int) Math.round(Math.random() * 5);
    }
    for (int num : array1) {
        System.out.print(num + " ");
    }
    double avg1 = calculateAverage(array1);
    System.out.println("Average of 1: " + calculateAverage(array1));

//
    System.out.println("\narray 2:");
    int[] array2 = new int[5];
    for (int i = 0; i < 5; i++) {
        array2[i] = (int) Math.round(Math.random() * 5);
    }
    for (int num : array2) {
        System.out.print(num + " ");
    }
    double avg2 = calculateAverage(array2);
    System.out.println("Average of 2: " + calculateAverage(array2));

//
    System.out.println("\narray 3:");
    int[] array3 = new int[5];
    for (int i = 0; i < 5; i++) {
        array3[i] = (int) Math.round(Math.random() * 5);
    }
    for (int num : array3) {
        System.out.print(num + " ");
    }
    double avg3 = calculateAverage(array3);
    System.out.println("Average of 3: " + avg3);

//
    if (avg1 > avg2 && avg1 > avg3) {
        System.out.println("Array 1 has the highest average.");
    }
    else if (avg2 > avg1 && avg2 > avg3) {
        System.out.println("Array 2 has the highest average.");
    }
    else if (avg3 > avg1 && avg3 > avg2) {
        System.out.println("Array 3 has the highest average.");
    }
    else {
        System.out.println("The averages are equal.");
    }
}
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / (double) array.length;
    }

//Завдання 4. Створіть 2 масиви та наповніть їх 10 випадковими цілими числами з відрізку [0; 10]. Створіть третій пустий
//цілочисельний масив на 10 елементів. Кожен елемент з i-тим індексом в третьому масиві має містити значення суми елементів
//першого та другого масиву з і-тими індексами. Вивести усі масиви у консоль окремими стрічками.
public static void task4() {
    System.out.println("\nTASK 4:");
    System.out.println("\narray1");
    int[] array1 = new int[10];
    for (int i = 0; i < 10; i++) {
        array1[i] = (int) Math.round(Math.random() * 9);
    }
    for (int num : array1) {
        System.out.print(num + " ");
    }

//
    System.out.println("\narray2");
    int[] array2 = new int[10];
    for (int i = 0; i < 10; i++) {
        array2[i] = (int) Math.round(Math.random() * 9);
    }
    for (int num : array2) {
        System.out.print(num + " ");
    }
    System.out.println("\nsum array");
    int[] sumArray = new int[10];

    for (int i = 0; i < 10; i++) {
        sumArray[i] = array1[i] + array2[i];
    }

    for (int num : sumArray) {
        System.out.print(num + " ");
    }
}
//Завдання 5. Створити масив  з 15 випадкових елементів з відрізку [0; 10]. Вивести масив на екран. Підрахувати
//скільки в масиві парних елементів та сповістити про це користувача.
public static void task5() {
    System.out.println("\nTASK 5:");
    int[] array5 = new int[15];
    int evenCount = 0;

    for (int i = 0; i < array5.length; i++) {
        array5[i] = (int) Math.round(Math.random() * 11);
        if (array5[i] % 2 == 0) {
            evenCount++;
        }
    }

    System.out.println("Generated array:");
    for (int num : array5) {
        System.out.print(num + " ");
    }

    System.out.println("Number of even elements: " + evenCount);
}

//Завдання 6. Створити двовимірний масив з 15 стрічок у яких 1-4 стрічки мають по 5 стовбців, 5-8 стрічки мають по 8
//стовбців, 9-12 стрічки мають по 3 стовбці, 13-15 стрічки мають по 9 стовбців. Наповнити масив випадковими значеннями цілих
//чисел з відрізку [0; 15]
public static void task6() {
    System.out.println("\nTASK 6:");
    int[][] array = new int[15][];
    for (int i = 0; i < 15; i++) {
        if (i < 4) {
            array[i] = new int[5];
        } else if (i < 8) {
            array[i] = new int[8];
        } else if (i < 12) {
            array[i] = new int[3];
        } else {
            array[i] = new int[9];
        }
    }

    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            array[i][j] = (int) Math.round(Math.random() * 15); // [0; 15]
        }
    }

    for (int i = 0; i < array.length; i++) {
        System.out.print("Row " + (i + 1) + ": ");
        for (int num : array[i]) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    }
}
