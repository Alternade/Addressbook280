
import java.util.HashMap;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        displayMenu();
        HashMap<Integer, Person> addressBook1 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        Main m1 = new Main();
        int option = sc.nextInt();
        do {
            if(option == 1) {
                Person p = m1.create();
                addressBook1.put(p.mobileNo, p);
            } else if (option == 2) {
                System.out.println(addressBook1);
            } else if (option == 3) {
                System.out.println("Update");
            }else if (option == 4) {
                System.out.println("Delete");
            }else{
                System.out.println("invalid");
            }
            displayMenu();
            option = sc.nextInt();
        }while (option != 0);
    }



    public Person create() {
        System.out.println("Enter name");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        System.out.println("Enter last name");
        String lastName = sc.next();
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter phone number");
        int phoneNumber = sc.nextInt();
        System.out.println("Enter address");
        String address = sc.next();
        Person p1 =new Person(firstName,lastName,age,address,phoneNumber);
        return p1;
    }

    public static void displayMenu() {

        System.out.println("Enter 1 to create");
        System.out.println("Enter 2 to display");
        System.out.println("Enter 3 to update");
        System.out.println("Enter 4 to delete");
    }

    private static void update() {

    }

    private static void delete() {

    }
}