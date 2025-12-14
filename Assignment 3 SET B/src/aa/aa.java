package aa;

import java.util.Scanner;
 abstract class Order{
    protected int id;              
    protected String description;   

    
    public abstract void accept();
    public abstract void display();
}

class PurchaseOrder extends Order {
    private String customerName;   

   
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Purchase Order ID: ");
        id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Description: ");
        description = sc.nextLine();

        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();
    }

  
    public void display() {
        System.out.println("\nPurchase Order Details:");
        System.out.println("ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Customer Name: " + customerName);
    }
}


class SalesOrder extends Order {
    private String vendorName;   

 
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sales Order ID: ");
        id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Description: ");
        description = sc.nextLine();

        System.out.print("Enter Vendor Name: ");
        vendorName = sc.nextLine();
    }

    public void display() {
        System.out.println("\nSales Order Details:");
        System.out.println("ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Vendor Name: " + vendorName);
    }
}

// Main Class
class aa{
    public static void main(String[] args) {
       
        PurchaseOrder[] po = new PurchaseOrder[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Enter details for Purchase Order " + (i + 1) + " ---");
            po[i] = new PurchaseOrder();
            po[i].accept();
        }

     
        SalesOrder[] so = new SalesOrder[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Enter details for Sales Order " + (i + 1) + " ---");
            so[i] = new SalesOrder();
            so[i].accept();
        }

        // Display all Purchase Orders
        System.out.println("\n Purchase Orders");
        for (PurchaseOrder purchase : po) {
            purchase.display();
        }

        // Display all Sales Orders
        System.out.println("\n===== Sales Orders =====");
        for (SalesOrder sales : so) {
            sales.display();
        }
    }
}


