package arrays;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        float[] floats = {1.57f, 7.654f, 9.998f};
        long[] longs = new long[2];
        longs[0] = 55555555L;
        longs[1] = 100000000000L;
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
            if (i != ints.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        float[] floats = {1.57f, 7.654f, 9.998f};
        for (int i = 0; i < floats.length; i++) {
            System.out.print(floats[i]);
            if (i != floats.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        long[] longs = new long[2];
        longs[0] = 55555555L;
        longs[1] = 100000000000L;
        for (int i = 0; i < longs.length; i++) {
            System.out.print(longs[i]);
            if (i != longs.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.print(ints[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        float[] floats = {1.57f, 7.654f, 9.998f};
        for (int i = floats.length - 1; i >= 0; i--) {
            System.out.print(floats[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        long[] longs = new long[2];
        longs[0] = 55555555L;
        longs[1] = 100000000000L;
        for (int i = longs.length - 1; i >= 0; i--) {
            System.out.print(longs[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                ints[i] += 1;
            }
        }
        System.out.print(Arrays.toString(ints));
    }
}
