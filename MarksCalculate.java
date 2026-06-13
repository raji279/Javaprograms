import java.util.*;

class Marks {

    // Method for 2 subjects
    int total(int eng, int tamil) {
        return eng + tamil;
    }

    // Method for 3 subjects (Overloading)
    int total(int eng, int tamil, int french) {
        return eng + tamil + french;
    }
}

public class MarksCalculate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Marks m1 = new Marks();

        // Taking input
        System.out.print("Enter English marks: ");
        int eng = sc.nextInt();

        System.out.print("Enter Tamil marks: ");
        int tamil = sc.nextInt();

        System.out.print("Enter French marks: ");
        int french = sc.nextInt();

        // Calling overloaded methods
        System.out.println("Total (2 subjects): " + m1.total(eng, tamil));
        System.out.println("Total (3 subjects): " + m1.total(eng, tamil, french));

        sc.close();
    }
}