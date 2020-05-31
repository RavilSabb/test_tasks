package task_2;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println("нечетное число: ");

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            if (m % 2 != 0) {
                arr[i] = m;
                System.out.print(arr[i] + " ");
            }

        }

    }
}

