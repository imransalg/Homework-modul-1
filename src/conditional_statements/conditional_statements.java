package conditional_statements;

public class conditional_statements {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подпждать.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        short temperature = 5;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        }
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 75;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 22;
        if (age > 2 && age < 6) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в детский сад.");
        }
        if (age > 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в школу.");
        }
        if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить в университет.");
        }else {
            System.out.println("Если возраст человека равен " + age + " лет, то ему нужно ходить на работу.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 20;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
        }
        if (age > 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении.");
        }else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе.");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int passengers = 101;
        int capacity = 102;
        int seatingPlaces = 60;
        int standingPlaces = 42;
        if (passengers < 102) {
            System.out.println("В вагоне есть место.");
        }else {
            System.out.println("В вагоне мест нет.");
        }
        if (passengers <= 60) {
            System.out.println("Есть сидячее место.");
        }else {
            System.out.println("Сидячих мест нет.");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 0;
        int two = 6;
        int three = 2;
        if (one >= two && one >= three) {
            System.out.println("Число " + one + " большее.");
        }
        if (two >= one && two >= three) {
            System.out.println("Число " + two + " большее.");
        }
        if (three >= one && three >= two) {
            System.out.println("Число " + three + " большее.");
        }
    }
}


