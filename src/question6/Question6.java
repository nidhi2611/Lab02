package question6;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch1 = sc.nextLine().charAt(0);
        char ch2 = sc.nextLine().charAt(0);
        if ((int) ch1 > (int) ch2)
            System.out.println(ch1 + " " + ch2);
        else
            System.out.println(ch2 + " " + ch1);

    }
