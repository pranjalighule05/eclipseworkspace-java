import java.util.Scanner;

// Abstract class
abstract class Staff {
    protected int id;
    protected String name;

    Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract void display();  // abstract method
}

// Subclass
class OfficeStaff extends Staff {
    private String department;

    OfficeStaff(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
    }
}

public class StaffMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of office staff: ");
        int n = sc.nextInt();
        sc.nextLine();  // consume newline

        OfficeStaff[] staffArray = new OfficeStaff[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for staff " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Department: ");
            String dept = sc.nextLine();

            staffArray[i] = new OfficeStaff(id, name, dept);
        }

        System.out.println("\n--- Staff Details ---");
        for (OfficeStaff staff : staffArray) {
            staff.display();
        }
    }
}
