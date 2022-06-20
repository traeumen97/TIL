package jungol;

import java.util.Scanner;

public class Jungol1856 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

//        System.out.println(n + " " + m);

        int num = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print(num++ + " ");
                }
                System.out.println();
            } else {
                for (int j = 0; j < m; j++) {
                    System.out.print(--num + " ");
                }
                System.out.println();
            }
            num += m;
        }
    }
}