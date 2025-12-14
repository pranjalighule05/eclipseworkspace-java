package student;

import sybcs.SYmarks;   // user-defined package
import tybcs.TYmarks;   // user-defined package
import java.util.Scanner; // predefined package

public class Student1 {
    int rollno;
    String studname;
    SYmarks sym;
    TYmarks tym;

    Student1(int r, String name, SYmarks s, TYmarks t) {
        rollno = r;
        studname = name;
        sym = s;
        tym = t;
    }

    public String toString() {
        // Display marks neatly
        return rollno + "\t" + studname + "\t" 
               + sym.ComputerTotal + "\t" + sym.MathsTotal + "\t" + sym.ElectronicsTotal + "\t"
               + tym.Theory + "\t" + tym.Practical + "\t";
    }

    void calculategrade() {
        int total = sym.ComputerTotal + tym.Theory; // Computer marks + Theory marks
        double per = total / 2.0; // Average percentage

        if (per >= 75)
            System.out.println("A");
        else if (per >= 60)
            System.out.println("B");
        else if (per >= 50)
            System.out.println("C");
        else if (per >= 40)
            System.out.println("\tPass");
        else
            System.out.println("\tFail");
    }

    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many student details: ");
        int n = input.nextInt();
        input.nextLine(); // clear newline

        Student1[] stud = new Student1[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Enter roll number: ");
            int r = input.nextInt();
            input.nextLine(); // clear newline

            System.out.print("Enter student name: ");
            String name = input.nextLine();

            System.out.println("Enter SY marks (Computer total, Maths total, Electronics total):");
            int ct = input.nextInt();
            int mt = input.nextInt();
            int et = input.nextInt();
            SYmarks sym = new SYmarks(ct, mt, et);

            System.out.println("Enter TY marks (Theory, Practical):");
            int th = input.nextInt();
            int pr = input.nextInt();
            TYmarks tym = new TYmarks(th, pr);

            stud[i] = new Student1(r, name, sym, tym);
        }

        System.out.println("\n****** STUDENT DETAILS ******");
        System.out.println("ROLLNO\tNAME\tCOMPTOT\tMATHTOT\tELECTOT\tTHEORY\tPRACTICAL\tGRADE");

        for (int i = 0; i < n; i++) {
            System.out.print(stud[i]);
            stud[i].calculategrade();
        }

        input.close();
    }
}
