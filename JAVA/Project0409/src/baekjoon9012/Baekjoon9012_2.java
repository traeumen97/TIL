package baekjoon9012;

import java.util.Scanner;

public class Baekjoon9012_2 {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String result = ""; // 정답 저장된 변수
            int size = scanner.nextInt(); // 데이터의 수를 나타내는 정수

            String[] list = new String[size]; // 입력된 괄호 배열

            for(int i = 0; i < list.length; i++) {  // 괄호 배열 채우기
                list[i] = scanner.next();
            }

            scanner.close();

            for(int i = 0; i < list.length; i++) { // 괄호 배열 처음부터 끝가지 VPS 충족하는지 검사하는 반복문
                String sample = list[i];
                result = "YES";  // 검사 전에는 일단 YES로 놓기
                size = sample.length();

                int[] check = new int[size]; //check배열은 검사를 위해 만든 int 배열 , 괄호 길이와 똑같은 길이

                for(int j = 0; j < check.length; j++) { // 우선 1로 채운다.
                    check[j] = 1;
                }

                for(int j = 0; j < size; j++) {
                    if(sample.charAt(j) == '(') { // '(' 괄호 오른쪽 인덱스에 ')' 이 있는지 찾고 , 찾으면 해당 '('와 ')' 인덱스에 해당하는 check 배열의 값을 0으로 지정한다.
                        for(int k = j + 1; k < size; k++) {
                            if(sample.charAt(k) == ')' && check[k] == 1) {
                                check[j] = 0;
                                check[k] = 0;
                                break;
                            }
                        }
                    }
                }


                // 만약 check 배열 중 단 한개의 1이 존재한다면 , 그 괄호배열은 짝이 없는 괄호가 최소한 한 개는 존재한다는 뜻이므로 NO를 출력
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