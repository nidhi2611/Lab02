package question1;

import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine().trim();
        System.out.println("Welcome, " + userName + "!");



        sc.close();

    }
}
