package es2;

import java.util.*;

public class Es2 {
    public static void main(String[] args) {

        int n = 10;

        List<Integer> rdmList = generateRdmList(n);
        System.out.println("Random number list: " + rdmList);

        System.out.println("Ordered list: " + orderRdmList(rdmList));

        List<Integer> invertedList = invertList(rdmList);
        System.out.println("Inverted list: " + invertedList);


        Scanner sc = new Scanner(System.in);
        System.out.println("Do want to know the numbers in the evens positions (e) or odds positions (o) ?");
        String handleEvenOdd = sc.nextLine();

        boolean printEven = switch (handleEvenOdd) {
            case "e" -> true;
            case "o" -> false;
            default -> throw new IllegalArgumentException(handleEvenOdd + " is a invalid input");
        };

        printEvenOrOdd(rdmList, printEven);


        sc.close();
    }

    public static List<Integer> generateRdmList(int n) {
        List<Integer> rdmLIst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Random rdm = new Random();
            rdmLIst.add(rdm.nextInt(0, 100));
        }
        return rdmLIst;
    }

    public static List<Integer> orderRdmList(List<Integer> rdmLIst) {
        Collections.sort(rdmLIst);
        return rdmLIst;
    }

    public static List<Integer> invertList(List<Integer> originalList) {
        List<Integer> invertedList = new ArrayList<>(originalList);
        Collections.reverse(invertedList);
        return invertedList;
    }

    public static void printEvenOrOdd(List<Integer> list, boolean printEven) {
        if (printEven) {
            System.out.println("Numbers in evens positions:");
            for (int i = 1; i < list.size(); i += 2) {
                System.out.println(list.get(i));
            }
        } else {
            System.out.println("Numbers in odds positions:");
            for (int i = 0; i < list.size(); i += 2) {
                System.out.println(list.get(i));
            }
        }
    }
}
