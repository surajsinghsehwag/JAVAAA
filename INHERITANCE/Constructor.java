// Superclass
class Percentage {
    // Method to calculate percentage
    public void calPer(int s[]) {
        int total = 0;
        for (int subjectMark : s) {
            total += subjectMark;
        }
        double percentage = (double) total / s.length;
        System.out.println("Percentage: " + percentage + "%");
    }
}

// Subclass CSE
class CSE extends Percentage {
    // Parameterized constructor
    public CSE(int cseMarks[]) {
        calPer(cseMarks);
    }

    // Method to display CSE percentage
    public void showCsePer() {
        System.out.println("CSE Percentage Calculated");
    }
}

// Subclass ETC
class ETC extends Percentage {
    // Parameterized constructor
    public ETC(int etcMarks[]) {
        calPer(etcMarks);
    }

    // Method to display ETC percentage
    public void showETCPer() {
        System.out.println("ETC Percentage Calculated");
    }
}

// Driver class ResultApp
public class Constructor {
    public static void main(String[] args) {
        // Sample marks array for CSE and ETC
        int cseMarks[] = { 80, 85, 90, 75, 88 };
        int etcMarks[] = { 78, 82, 88, 92, 79 };

        // Creating objects of CSE and ETC classes
        CSE cseResult = new CSE(cseMarks);
        ETC etcResult = new ETC(etcMarks);

        // Displaying results
        cseResult.showCsePer();
        etcResult.showETCPer();
    }
}
