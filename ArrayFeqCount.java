class ArrayFeqCount {
    int c[];

    void setIntArray(int ch[]) {
        c = ch;
    }

    void countFeqCount() {
        for (int i = 0; i < c.length; i++) {
            int count = 0;
            int flag = 0;

            for (int j = 0; j < i; j++) {
                if (c[i] == c[j]) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                for (int j = 0; j < c.length; j++) {
                    if (c[i] == c[j]) {
                        count++;
                    }
                }
                System.out.println("Frequency of " + c[i] + ": " + count);
            }
        }
    }
}

public class Occurrence {
    public static void main(String x[]) {
        int a[] = {10, 20, 10, 60, 50, 60, 40, 50, 40, 40};
        ArrayFeqCount arrayFeqCount = new ArrayFeqCount();
        arrayFeqCount.setIntArray(a);
        arrayFeqCount.countFeqCount();
    }
}
