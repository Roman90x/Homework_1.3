import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Массивы. Часть 1");

        Задание_1();
        Задание_2();
        Задание_3();
        Задание_4();
    }
    public static void Задание_1() {
        System.out.println("Задание 1");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        double[] arrSecond = {1.57, 7.654, 9.986};

        String[] arrThird = {"a", "b", "c"};
        System.out.println();
    }

    public static void Задание_2() {
        System.out.println("Задание 2");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.print(arr[0] + ", " + arr[1] + ", " + arr[2]);
        System.out.println();

        double[] arrSecond = {1.57, 7.654, 9.986};
        System.out.print(arrSecond[0] + ", " + arrSecond[1] + ", " + arrSecond[2]);
        System.out.println();

        String[] arrThird = {"a", "b", "c"};
        System.out.print(arrThird[0] + ", " + arrThird[1] + ", " + arrThird[2]);
        System.out.println();
        System.out.println();
    }

    public static void Задание_3() {
        System.out.println("Задание 3");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = arr.length-1; i>=0; i--) {
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] arrSecond = {1.57, 7.654, 9.986};
        for (int i = arrSecond.length-1; i>=0; i--) {
            System.out.print(arrSecond[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        String[] arrThird = {"a", "b", "c"};
        for (int i = arrThird.length-1; i>=0; i--) {
            System.out.print(arrThird[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
    }
    public static void Задание_4() {
        System.out.println("Задание 4");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 !=0) {
                arr[i] += 1;
            }
            System.out.print(arr[i]);
        }
        System.out.println();
        }
    }