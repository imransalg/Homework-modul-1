package cycles_part2;

public class cycles_part2 {
    public static void  main (String[] args){
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int weHave = 0;
        int month = 0;
        while (weHave < 2459000) {
            weHave += 15000;
            month++;
            System.out.println("Месяц " + month + ", сумма накопления равна " + weHave + " рублей.");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int population = 12000000;
        int birthRatePer1000 = 17;
        int mortalityPer1000 = 8;
        int year = 0;
        int growthPerYear = 0;
        while (year < 10) {
            year++;
            growthPerYear = population / 1000 * (birthRatePer1000 - mortalityPer1000);
            population += growthPerYear;
            System.out.println("Год " + year + ", численность населения составляет " + population + " человек.");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deposit = 15000;
        int total = 0;
        int month = 0;
        while (total < 12000000) {
            month++;
            total += deposit;
            total += total * 7 / 100;
            System.out.println("Месяц " + month + ", сумма накопления " + total + " рублей.");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int deposit = 15000;
        int total = 0;
        int month = 0;
        while (total < 12000000) {
            month++;
            total += deposit;
            total += total * 7 / 100;
            if (month % 6 == 0) {
            System.out.println("Месяц " + month + ", сумма накопления " + total + " рублей.");}
        }
        System.out.println(total);
    }
    public static void task6() {
        System.out.println("Задача 6");
        int deposit = 15000;
        int total = 0;
        int month = 0;
        while (month <= 9 * 12) {
            month++;
            total += deposit;
            total += total * 7 / 100;
            if (month % 6 == 0) {
            System.out.println("Месяц " + month + ", сумма накопления " + total + " рублей.");}
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int friday = 2;
        for (; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
    int cometFrequency = 79;
    for (; cometFrequency <= 2123; cometFrequency += 79) {
        if (cometFrequency>= 1823 && cometFrequency <= 2123){
        System.out.println(cometFrequency);}
    }
    }
}
