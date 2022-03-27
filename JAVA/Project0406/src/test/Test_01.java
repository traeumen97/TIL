package test;

import java.util.*;
 
public class Test_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
        int num1, num2, num3;
          
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
  
        sc.close();
          
        int sum = num1 + num2 + num3;
        int avg = (num1 + num2 + num3)/3;
          
        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);
    }
 
}