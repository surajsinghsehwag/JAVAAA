public class SumSub {
    public static void main(String x[]) {
        int a[] = {1, 2, 3, 7, 5};
        int sum = 12;
        int currentSum;

        for (int i = 0; i < a.length; i++) {
            currentSum = a[i];
            if (currentSum == sum) {
                System.out.println("Found at index " + i);
            } else {
                for (int j = i + 1; j < a.length; j++) {
                    currentSum += a[j];
                    if (currentSum == sum) {
                        System.out.println("Found from index " + i + " to " + j);
                    }
                }
            }
        }
    }
}
