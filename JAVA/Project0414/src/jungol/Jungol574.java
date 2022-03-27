package jungol;

import java.util.*;

public class Jungol574 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();


        System.out.print(Max(a,b,c));
    }

    static int Max(int a, int b, int c)
    {
        int max = a;
        if(max<b)
        {
            max=b;
        }
        if(max<c)
        {
            max=c;
        }
        return max;
    }
}


//°­»ç´ÔÄÚµå Åë°ú¾ÈµÊ

//import java.util.*;
//
//public class Jungol574 {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        sc.close();
//
//
//        System.out.print(Max(a,b,c));
//    }
//
//    static int Max(int a, int b, int c)
//    {
//        int max = a;
//        if(max<b)
//        {
//            max=b;
//        }
//        if(max<c)
//        {
//            max=c;
//        }
//        return max;
//    }
//}