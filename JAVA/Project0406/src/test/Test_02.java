package test;

import java.util.Scanner;
 
public class Test_02 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(;;) {
            System.out.print("number? ");
            int inp = sc.nextInt();
  
            if(inp > 0) {
                System.out.println("positive integer");
            }else if(inp < 0) {
                System.out.println("negetive number");
            }else {
                break;
            }
        }
        sc.close();
    } 
}