import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int summa = 0;
        System.out.println(Arrays.toString(arr));
        for (int j : arr) {
            summa = summa + j;
        }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей");

    }

    public static void task2() {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int maxSumma = -1;
        for (final int current : arr) {
            if (current > maxSumma) {
                maxSumma = current;
            }
        }
        int minSumma = maxSumma;
        for (final int current1 : arr) {
            if (current1 < minSumma) {
                minSumma = current1;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSumma + " рублей. Максимальная сумма трат за день составила " + maxSumma + " рублей");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int summa = 0;
        int dnej = 30;
        System.out.println(Arrays.toString(arr));
        for (int j : arr) {
            summa = summa + j;
        }
        System.out.println(summa);// чтобы можно было проверить
        double srednieTraty = (double) summa / dnej;
        System.out.println("Средняя сумма трат за месяц составила " + srednieTraty + " рублей");
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int index = reverseFullName.length - 1; index >= 0; index--) {
            System.out.print(reverseFullName[index] + " ");
        }

    }
}