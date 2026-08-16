import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];

        System.out.println("Enter 5 names:");

        for (int i = 0; i < 5; i++) {
            names[i] = sc.nextLine();
        }

        System.out.println("The 5 names are:");

        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }

        sc.close();
    }
}