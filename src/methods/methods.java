package methods;

import java.time.LocalDate;

public class methods {
    public static void main(String[] args){
        task1();
        task2();
        task3();
    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - год високосный.");
        } else {
            System.out.println(year + " - год не високосный.");
        }
    }

    public static void giveLightVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
    }
    public static int calculateDays(int deliveryDistance) {
        int totalDeliveryDays = 0;
        if (deliveryDistance < 20) {
            totalDeliveryDays = 1;
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            totalDeliveryDays = 2;
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            totalDeliveryDays = 3;
        }
        return totalDeliveryDays;

    }
        public static void task1() {
            System.out.println("Задание 1");
            int year = 100;
            checkYear(year);
        }
        public static void task2() {
            System.out.println("Задание 2");
            int clientOS = 1;
            int clientDeviceYear = 2023;
            int currentYear = LocalDate.now().getYear();
            if (clientOS == 0 && clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
            if (clientOS == 1 && clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
            giveLightVersion(clientOS, clientDeviceYear);
        }

        public static void task3() {
            System.out.println("Задание 3");
            int deliveryDistance = 300;
            int deliveryDays = calculateDays(deliveryDistance);
            if (deliveryDays == 0) {
                System.out.println("Доставки нет");
            } else {
                System.out.println("Потребуется дней: " + deliveryDays);
            }
        }
}
