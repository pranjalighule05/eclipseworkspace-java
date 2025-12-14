
	import java.util.Scanner;

	public abstract class Staff {
	    protected int id;        
	    protected String name;   

	    Staff(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    abstract void display();
	}


	class OfficeStaff extends Staff {
	    private String department;

	    public OfficeStaff(int id, String name, String department) {
	        super(id, name);
	        this.department = department;
	    }

	    void display() {
	        System.out.println("ID: " + id + "\nName: " + name + "\nDepartment: " + department);
	    }
	}

	// class name corrected
	class staff {
	    public static void main(String arg[]) {
	        Scanner input = new Scanner(System.in);

	        System.out.println("Enter number of staff members");
	        int n = input.nextInt();
	        input.nextLine(); // consume newline

	        OfficeStaff[] stafflist = new OfficeStaff[n];   // fixed typo

	        for (int i = 0; i < n; i++) {
	            System.out.println("Enter details for member " + (i + 1));

	            System.out.print("Enter id: ");
	            int id = input.nextInt();
	            input.nextLine(); // consume newline

	            System.out.print("Enter name: ");
	            String name = input.nextLine();

	            System.out.print("Enter department: ");
	            String department = input.nextLine();

	            stafflist[i] = new OfficeStaff(id, name, department);
	        }

	        System.out.println("\n--- Staff Details ---");
	        for (OfficeStaff s : stafflist) {
	            s.display();
	        }

	        input.close();
	    }
	}

