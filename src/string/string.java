package string;

public class string {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задание 1");
        String firstName = " Ivan ";
        String middleName = "Ivanov ";
        String lastName = " Ivanovich";
        String fullName = middleName + firstName + lastName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    public static void task2() {
        System.out.println("Задание 2");
        String firstName = " Ivan ";
        String middleName = "Ivanov ";
        String lastName = " Ivanovich";
        String fullName = middleName + firstName + lastName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }
    public static void task3() {
        System.out.println("Задание 3");
        String fullName = " Иванов Семён Семёнович ";
        fullName = fullName.replace("ё", "е");
        System.out.println("ФИО сотрудника - " + fullName);
    }
}