public class Main {
    public static void main(String[] args) {
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
        byte one = 100;
        System.out.println("Значение переменной one с типом byte равно " + one);
        short two = 25000;
        System.out.println("Значение переменной two с типом short равно " + two);
        int three = 50000000;
        System.out.println("Значение переменной tree с типом int равно " + three);
        long four = 10000000000000000L;
        System.out.println("Значение переменной four с типом long равно " + four);
        float five = 10000000.555f;
        System.out.println("Значение переменной five с типом float равно " + five);
        double six = 1000000.5555555;
        System.out.println("Значение переменной six с типом double равно " + six);
    }
    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        System.out.println(a);
        long b = 98767896554L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short i = -159;
        System.out.println(i);
        int f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        short totalSheets = 480;
        int sheetsPerStudent = totalSheets / (studentsLP + studentsAS + studentsEA);
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги.");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte bottlesIn2Min = 16;
        System.out.println("За 2 минуты машина произвела " + bottlesIn2Min + " штук бутылок.");
        short bottlesIn20Min = 20 / 2 * 16;
        System.out.println("За 20 минут машина произвела " + bottlesIn20Min + " штук бутылок.");
        short bottlesInDay = (24 * 60) / 2 * 16;
        System.out.println("За 1 день машина произвела " + bottlesInDay + " штук бутылок.");
        int bottlesIn3day = bottlesInDay * 3;
        System.out.println("За 3 дня машина произвела " + bottlesIn3day + " штук бутылок.");
        int bottlesInMonth = bottlesInDay * 30;
        System.out.println("За месяц машина произвела " + bottlesInMonth + " штук бутылок.");
    }
    public static void task5() {
        System.out.println("Задание 5");
        byte totalCans = 120;
        byte cansPerClass = 2 + 4;
        int totalClasses = totalCans / cansPerClass;
        int totalCansOfWhitePaint = totalClasses * 2;
        int totalCansOfBrownPaint = totalClasses * 4;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalCansOfWhitePaint +
        " банок белой краски и " + totalCansOfBrownPaint + " банок коричневой краски.");
    }
    public static void task6() {
        System.out.println("Задание 6");
        short grBananas = 5 * 80;
        short grMilk = 105 * 2;
        short grIceCream = 2 * 100;
        short grEggs = 4 * 70;
        int weightGr = grBananas + grMilk + grIceCream + grEggs;
        int grPerKg = 1000;
        float weightKg = weightGr / (float)grPerKg;
        System.out.println("Вес спортзавтрака в граммах " + weightGr + ", а в киллограммах " + weightKg);
    }
    public static void task7() {
        System.out.println("Задача 7");
        short needResetGr = 7 * 1000;
        int perDay250gr = needResetGr / 250;
        int perDay500gr = needResetGr / 500;
        float daysOnAverage = needResetGr / (float)((250 + 500) / 2);
        System.out.println("Если спортсмен каждый день будет худеть на 250 грамм, то уйдет " + perDay250gr +
        " дней, если каждый день будет худеть на 500 грамм, то уйдет " + perDay500gr +
        " дней, чтобы добиться результата, в среднем уйдет " + daysOnAverage + " дней.");
    }
    public static void task8() {
        System.out.println("Задание 8");
        int incomeMasha = 67760;
        int incomeDenis = 83690;
        int incomeKristina = 76230;
        int incomeMashaAfter = incomeMasha + (incomeMasha * 10 / 100);
        int incomeDenisAfter = incomeDenis + (incomeDenis * 10 / 100);
        int incomeKristinaAfter = incomeKristina + (incomeKristina * 10 / 100);
        int differenceInAnnualIncomeMasha = (incomeMashaAfter * 12) - (incomeMasha * 12);
        System.out.println("Мвша теперь получает " + incomeMashaAfter + " рублей. Годовой доход вырос на " + differenceInAnnualIncomeMasha + " рублей.");
        int differenceInAnnualIncomeDenis = (incomeDenisAfter * 12) - (incomeDenis * 12);
        System.out.println("Денис теперь получает " + incomeDenisAfter + " рублей. Годовой доход вырос на " + differenceInAnnualIncomeDenis + " рублей.");
        int differenceInAnnualIncomeKristina = (incomeKristinaAfter * 12) - (incomeKristina * 12);
        System.out.println("Кристина теперь получает " + incomeKristinaAfter + " рублей. Годовой доход вырос на " + differenceInAnnualIncomeKristina + " рублей.");
    }
}
