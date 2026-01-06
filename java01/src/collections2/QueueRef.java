package collections2;


import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

class Customer {
    private String name;
    private int accountNumber;

    public Customer(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

public class QueueRef {
    public static void main(String[] args) {
        Queue<Customer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add customer to queue");
            System.out.println("2. Serve customer");
            System.out.println("3. Display queue");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter account number: ");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    Customer customer = new Customer(name, accountNumber);
                    queue.add(customer);
                    System.out.println("Customer added to queue.");
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        Customer servedCustomer = queue.poll();
                        System.out.println("Serving customer: " + servedCustomer.getName());
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 3:
                    System.out.println("Current queue:");
                    for (Customer customerInQueue : queue) {
                        System.out.println(customerInQueue.getName() + " - " + customerInQueue.getAccountNumber());
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            scanner.close();
        }
    }
}