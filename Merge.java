import java.util.Scanner;

public class Merge {
    public static void main(String x[]) {
        Scanner xyz = new Scanner(System.in);
        int a1[] = new int[5];
        int a2[] = new int[5];
        int a3[] = new int[10];
        int j = 0;

        System.out.println("Enter the 1st array");
        for (int i = 0; i < 5; i++) {
            a1[i] = xyz.nextInt();
        }

        System.out.println("1st Array:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d\t", a1[i]);
        }

        System.out.println("\nEnter the 2nd array");
        for (int i = 0; i < 5; i++) {
            a2[i] = xyz.nextInt();
        }

        System.out.println("2nd Array:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d\t", a2[i]);
        }

        // Copy elements of a1[] to a3[]
        for (int i = 0; i < 5; i++) {
            a3[j] = a1[i];
            j++;
        }

        // Copy elements of a2[] to a3[]
        for (int i = 0; i < 5; i++) {
            a3[j] = a2[i];
            j++;
        }

        System.out.println("\nArray after merging:");
        for (int i = 0; i < a3.length; i++) {
            System.out.printf("%d\t", a3[i]);
        }
    }
}
