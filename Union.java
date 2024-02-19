public class Union {
    public static void main(String x[]) {
        int[] a1 = new int[]{5, 4, 4, 5, 1, 1};
        int[] a2 = new int[]{5, 4, 7, 5, 2};
        int[] a3 = new int[12];
        int flag;
        int j = 0;

        System.out.println("Union of the two arrays:");

        for (int i = 0; i < a1.length; i++) {
            flag = 0;
            for (int k = 0; k < j; k++) {
                if (a1[i] == a3[k]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                a3[j] = a1[i];
                j++;
            }
        }

        for (int i = 0; i < a2.length; i++) {
            flag = 0;
            for (int k = 0; k < j; k++) {
                if (a2[i] == a3[k]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                a3[j] = a2[i];
                j++;
            }
        }

        // Print the union array
        for (int i = 0; i < j; i++) {
            System.out.printf("%d\t", a3[i]);
        }
    }
}
