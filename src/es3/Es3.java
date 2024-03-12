package es3;

import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {

        Phonebook rubric = new Phonebook();

        rubric.addContact("James", "342414412455");
        rubric.addContact("Joe", "39684930584");
        rubric.addContact("Lexi", "3595911353");
        rubric.addContact("Anna", "36404893001");

        System.out.println("Phonebook:");
        rubric.printContact();

        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------");

        int handleAction;
        do {

            System.out.println("What do you want to do?");
            System.out.println("1 - Find a number with the name.");
            System.out.println("2 - Find a name with the phone number.");
            System.out.println("3 - Delete a contact.");
            System.out.println("0 - To terminate the program.");

            handleAction = sc.nextInt();
            sc.nextLine();

            switch (handleAction) {
                case 1:
                    System.out.println("-------------------------------");
                    System.out.println("Find a number with the name:");
                    String nameQuery = sc.nextLine();

                    String phoneNumber = rubric.findNumByName(nameQuery);
                    if (phoneNumber != null) {
                        System.out.println("The phone phone number of " + nameQuery + " is: " + phoneNumber);
                        System.out.println("-------------------------------");
                    } else {
                        System.out.println(nameQuery + " Is not found in the phonebook.");
                        System.out.println("-------------------------------");
                    }
                    break;

                case 2:
                    System.out.println("-------------------------------");
                    System.out.println("Find a name with a number:");
                    String numQuery = sc.nextLine();

                    String nameFound = rubric.searchNameByNum(numQuery);
                    if (nameFound != null) {
                        System.out.println(numQuery + " is the number of " + "'" + nameFound + "'");
                        System.out.println("-------------------------------");
                    } else {
                        System.out.println("'" + numQuery + "'" + " number doesn't belong to any of your contacts.");
                        System.out.println("-------------------------------");
                    }
                    break;

                case 3:
                    System.out.println("-------------------------------");
                    System.out.println("Insert the name of the contact that you want to delete:");

                    String contactToDelete = sc.nextLine();
                    rubric.deleteContact(contactToDelete);

                    System.out.println("Phonebook updated:");
                    rubric.printContact();
                    System.out.println("-------------------------------");
                    break;

                case 0:
                    System.out.println("Terminating the program...");
                    break;

                default:
                    System.out.println("Invalid type of action, try again.");

            }
        } while (handleAction != 0);


        sc.close();
    }
}
