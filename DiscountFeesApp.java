/*/WAP to create the pojo class name as Student class with a following methods and data orvariable/state
//Create the class name as DiscountFees and this class is depend on Student class means in this class
we need to write a method setStudent() and accept the reference of Student class in it
As well as we need to define two another method in this class name as checkDiscountEligibility(int
per) -> this function accept the per of student if per greater than 60 then student is eligible for
discout and give the 30% discount on fees and update in student object
And we need to write one more function in DiscountFees class show() and in this function contain
the logics for display the all details of Students with discounted fees*/
class Student {
    private String name;
    private int age;
    private double fees;

    public calstudent(String name, int age, double fees) {
        this.name = name;
        this.age = age;
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    // Other methods if needed
}

class DiscountFees {
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public void checkDiscountEligibility(int percentage) {
        if (percentage > 60) {
            double discountedFees = 0.7 * student.getFees(); // 30% discount
            student.setFees(discountedFees);
        }
  

    public void show() {
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Fees: " + student.getFees());
    }
}

public class DiscountFeesApp {
    public static void main(String[] args) {
        // Creating a Student object
        Student student1 = new Student();
		student1."John", 20, 1000.0

        // Creating a DiscountFees object and setting the Student reference
        DiscountFees discountFees = new DiscountFees();
        discountFees.setStudent(student1);

        // Checking and applying discount
        discountFees.checkDiscountEligibility(70);

        // Displaying student details with discounted fees
        discountFees.show();
    }
}
