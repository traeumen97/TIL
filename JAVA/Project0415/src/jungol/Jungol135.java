package jungol;

import java.util.Scanner;

public class Jungol135 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        int count = 0, sum = 0;

        if (num1 > num2) {
            for (int i = num2; i <= num1; i++) {
                if (i % 3 == 0 ||  i % 5 == 0) {
                    sum += i;
                    count++;
                }
            }
        } else {
            for (int i = num1; i <= num2; i++) {
                if (i % 3 == 0 ||  i % 5 == 0) {
                    sum += i;
                    count++;
                }
            }
        }
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", (double) sum / count);
    }
}
