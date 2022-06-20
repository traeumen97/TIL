import java.util.*;

class Data {
    String name1, name2;
    int k_grade1, k_grade2;
    int e_grade1, e_grade2;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data d = new Data();
        d.name1 = sc.next();
        d.k_grade1 = sc.nextInt();
        d.e_grade1 = sc.nextInt();
        d.name2 = sc.next();
        d.k_grade2 = sc.nextInt();
        d.e_grade2 = sc.nextInt();
        sc.close();
        System.out.printf("%s %d %d\n", d.name1, d.k_grade1, d.e_grade1);
        System.out.printf("%s %d %d\n", d.name2, d.k_grade2, d.e_grade2);
        System.out.printf("avg %d %d", (d.k_grade1 + d.k_grade2) / 2, (d.e_grade1 + d.e_grade2) / 2);
    }
}