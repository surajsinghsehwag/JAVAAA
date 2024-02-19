class ConvertToUpper {
    char c[] = new char[10];

    void setCharArray(char ch[]) {
        // here accept the character array and store in instance variable in character array
        for (int i = 0; i< ch.length; i++) {
            c[i] = ch[i];
        }
    }

    void convertToUpperCase() {
        for (int i = 0; i <c.length ; i++) {
            if (c[i] >= 'a' && c[i] <= 'z') {
                
                c[i] = (char) (c[i] - 32);
            }
        }
        System.out.print("Uppercase equivalent: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println();
    }
}

public class Upper {
    public static void main(String x[]) {
        char chh[] = new char[] { 'g', 'o', 'o', 'd' };
        ConvertToUpper c1 = new ConvertToUpper();
        c1.setCharArray(chh);
        c1.convertToUpperCase();
    }
}
