package arrays_part2;

public class arrays_part2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray () {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int totalCosts = 0;
        for (int i = 0; i < arr.length; i++) {
            totalCosts += arr[i];
            }
        System.out.println("Сумма затрат за месяц составила " + totalCosts + " рублей.");
    }
    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxSpendPerDay = -1;
        int minSpendPerDay = 1000000000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSpendPerDay) {
                minSpendPerDay = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSpendPerDay) {
                maxSpendPerDay = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpendPerDay + " рублей. " +
                "Максимальная сумма трат за день составила " + maxSpendPerDay + " рублей.");
    }
    public static void task3() {
        System.out.println("Задача 3");
    int [] arr = generateRandomArray();
    int totalCosts = 0;
    for (int i = 0; i < arr.length; i++) {
        totalCosts += arr[i];
    }
    double averageCost =(float) totalCosts / 30;
    System.out.println("Средняя сумма трат за месяц составила " + averageCost + " рублей.");
    }
    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}

