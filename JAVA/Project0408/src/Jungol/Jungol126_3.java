package Jungol;

import java.util.*;

public class Jungol126_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int even = 0, odd = 0;
        for (;;) {
            int num = sc.nextInt();
            if (num == 0) {
            	sc.close();
                break;
            } else if (num % 2 == 1) {
                odd++;
            } else {
                even++;
            }
        }
        System.out.println("odd : " + odd);
        System.out.println("even : " + even);
        
    }
}
