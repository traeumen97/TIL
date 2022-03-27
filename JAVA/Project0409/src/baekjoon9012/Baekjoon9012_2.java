package baekjoon9012;

import java.util.Scanner;

public class Baekjoon9012_2 {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String result = ""; // ���� ����� ����
            int size = scanner.nextInt(); // �������� ���� ��Ÿ���� ����

            String[] list = new String[size]; // �Էµ� ��ȣ �迭

            for(int i = 0; i < list.length; i++) {  // ��ȣ �迭 ä���
                list[i] = scanner.next();
            }

            scanner.close();

            for(int i = 0; i < list.length; i++) { // ��ȣ �迭 ó������ ������ VPS �����ϴ��� �˻��ϴ� �ݺ���
                String sample = list[i];
                result = "YES";  // �˻� ������ �ϴ� YES�� ����
                size = sample.length();

                int[] check = new int[size]; //check�迭�� �˻縦 ���� ���� int �迭 , ��ȣ ���̿� �Ȱ��� ����

                for(int j = 0; j < check.length; j++) { // �켱 1�� ä���.
                    check[j] = 1;
                }

                for(int j = 0; j < size; j++) {
                    if(sample.charAt(j) == '(') { // '(' ��ȣ ������ �ε����� ')' �� �ִ��� ã�� , ã���� �ش� '('�� ')' �ε����� �ش��ϴ� check �迭�� ���� 0���� �����Ѵ�.
                        for(int k = j + 1; k < size; k++) {
                            if(sample.charAt(k) == ')' && check[k] == 1) {
                                check[j] = 0;
                                check[k] = 0;
                                break;
                            }
                        }
                    }
                }


                // ���� check �迭 �� �� �Ѱ��� 1�� �����Ѵٸ� , �� ��ȣ�迭�� ¦�� ���� ��ȣ�� �ּ��� �� ���� �����Ѵٴ� ���̹Ƿ� NO�� ���
                for(int p = 0; p < check.length; p++) {
                    if(check[p] == 1) {
                        result = "NO";
                        break;
                    }
                }

                System.out.println(result);

            }

    }
}